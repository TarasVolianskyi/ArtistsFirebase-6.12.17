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
    Button btnArtist;
    Button btnProd;
    Button btnDeliver;

    DatabaseReference databaseArtists;
    DatabaseReference databaseProd;
    DatabaseReference databaseDeliver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseArtists = FirebaseDatabase.getInstance().getReference("artists");
        databaseProd = FirebaseDatabase.getInstance().getReference("products");
        databaseDeliver = FirebaseDatabase.getInstance().getReference("delivers");

        etName = (EditText) findViewById(R.id.etNameMainActivity);
        spinner = (Spinner) findViewById(R.id.spCategorMainActivity);
        btnArtist = (Button) findViewById(R.id.btnUserMainActivity);
        btnProd = (Button) findViewById(R.id.btnProdMainActivity);
        btnDeliver = (Button) findViewById(R.id.btnDeliverMainActivity);

        btnArtist.setOnClickListener(this);
        btnProd.setOnClickListener(this);
        btnDeliver.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

   /*     addArList();
    }

    private void addArList() {*/


        String name = etName.getText().toString().trim();
        String name2 = etName.getText().toString().trim() + " second";
        String name3 = etName.getText().toString().trim() + " third";
        String name4 = etName.getText().toString().trim() + " fourth";
        String name5 = etName.getText().toString().trim() + " fifth";


        if (!TextUtils.isEmpty(name)) {
            String id = databaseArtists.push().getKey();

            switch (view.getId()) {
                case R.id.btnUserMainActivity:

                    Artist artist = new Artist(id, name, name2);
                    databaseArtists.child(id).setValue(artist);
                    break;
                case R.id.btnProdMainActivity:
                    Prod prod = new Prod(name, name2, name3, name4, name5);
                    databaseProd.child(id).setValue(prod);
                    break;
                case R.id.btnDeliverMainActivity:
                    Delivers deliv = new Delivers(name, name2, name3, name, name5);
                    databaseDeliver.child(id).setValue(deliv);
                    break;
            }


            Toast.makeText(this, "item added", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "You should enter the name", Toast.LENGTH_SHORT).show();
        }


    }
}
