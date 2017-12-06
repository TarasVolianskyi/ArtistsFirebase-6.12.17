package com.volianskyi.taras.artistsfirebase_61217;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName;
    Spinner spinner;
    Button btn;

    DatabaseReference databaseArtists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseArtists = FirebaseDatabase.getInstance().getReference("artists");

        etName = (EditText) findViewById(R.id.etNameMainActivity);
        spinner = (Spinner) findViewById(R.id.spCategorMainActivity);
        btn = (Button) findViewById(R.id.btnMainActivity);

btn.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        addArList();
    }

    private void addArList() {
String name = etName.getText().toString().trim();
        String name2 = etName.getText().toString().trim()+" second";

if(!TextUtils.isEmpty(name)){
String id =    databaseArtists.push().getKey();
    Artist artist = new Artist(id, name,name2);
    databaseArtists.child(id).setValue(artist);
    Toast.makeText(this, "Artist added", Toast.LENGTH_SHORT).show();

}else {
    Toast.makeText(this, "You should enter the name", Toast.LENGTH_SHORT).show();
}


    }
}
