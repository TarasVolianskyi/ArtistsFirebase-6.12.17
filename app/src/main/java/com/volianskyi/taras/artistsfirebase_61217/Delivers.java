package com.volianskyi.taras.artistsfirebase_61217;

/**
 * Created by tarasvolianskyi on 07.12.17.
 */

public class Delivers {

    private String idDeliver;
    private String nameDeliv;
    private String adressDeliv;
    private String emailDeliv;
    private String phoneDeliv;

    public Delivers(){

    }

    public Delivers(String idDeliver, String nameDeliv, String adressDeliv, String emailDeliv, String phoneDeliv) {
        this.idDeliver = idDeliver;
        this.nameDeliv = nameDeliv;
        this.adressDeliv = adressDeliv;
        this.emailDeliv = emailDeliv;
        this.phoneDeliv = phoneDeliv;
    }

    public String getIdDeliver() {
        return idDeliver;
    }

    public void setIdDeliver(String idDeliver) {
        this.idDeliver = idDeliver;
    }

    public String getNameDeliv() {
        return nameDeliv;
    }

    public void setNameDeliv(String nameDeliv) {
        this.nameDeliv = nameDeliv;
    }

    public String getAdressDeliv() {
        return adressDeliv;
    }

    public void setAdressDeliv(String adressDeliv) {
        this.adressDeliv = adressDeliv;
    }

    public String getEmailDeliv() {
        return emailDeliv;
    }

    public void setEmailDeliv(String emailDeliv) {
        this.emailDeliv = emailDeliv;
    }

    public String getPhoneDeliv() {
        return phoneDeliv;
    }

    public void setPhoneDeliv(String phoneDeliv) {
        this.phoneDeliv = phoneDeliv;
    }
}
