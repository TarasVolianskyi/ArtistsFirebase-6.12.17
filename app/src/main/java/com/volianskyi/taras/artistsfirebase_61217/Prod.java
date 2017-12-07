package com.volianskyi.taras.artistsfirebase_61217;

/**
 * Created by tarasvolianskyi on 07.12.17.
 */

public class Prod {
    private String idProd;
    private String nameProd;
    private String priceProd;
    private String prevPriceProd;
    private String categorProd;

    public Prod(){

    }

    public Prod(String idProd, String nameProd, String priceProd, String prevPriceProd, String categorProd) {
        this.idProd = idProd;
        this.nameProd = nameProd;
        this.priceProd = priceProd;
        this.prevPriceProd = prevPriceProd;
        this.categorProd = categorProd;
    }

    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public String getPriceProd() {
        return priceProd;
    }

    public void setPriceProd(String priceProd) {
        this.priceProd = priceProd;
    }

    public String getPrevPriceProd() {
        return prevPriceProd;
    }

    public void setPrevPriceProd(String prevPriceProd) {
        this.prevPriceProd = prevPriceProd;
    }

    public String getCategorProd() {
        return categorProd;
    }

    public void setCategorProd(String categorProd) {
        this.categorProd = categorProd;
    }
}
