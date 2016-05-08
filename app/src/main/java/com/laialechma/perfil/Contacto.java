package com.laialechma.perfil;

/**
 * Created by Laia Lechma on 06/05/2016.
 */
public class Contacto {
    private String txtname;
    private String txttelephone;
    private String txtmail;
    private String descripcion;

    public Contacto(String txtname, String txtmail, String txttelephone) {
        this.txtname = txtname;
        this.txtmail = txtmail;
        this.txttelephone = txttelephone;
    }

    public String getTxtname() {
        return txtname;
    }

    public void setTxtname(String txtname) {
        this.txtname = txtname;
    }

    public String getTxttelephone() {
        return txttelephone;
    }

    public void setTxttelephone(String txttelephone) {
        this.txttelephone = txttelephone;
    }

    public String getTxtmail() {
        return txtmail;
    }

    public void setTxtmail(String txtmail) {
        this.txtmail = txtmail;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
