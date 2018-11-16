/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Empresas {
    private String nombre;
    private String tipo;
    private String capital;
    private String fundacion;
    private String ubicacion;
    private int id;//tiene que ser unico
    private String PIN;

    public Empresas() {
    }

    public Empresas(String nombre, String capital, String fundacion, String ubicacion, int id, String PIN) {
        this.nombre = nombre;
        this.capital = capital;
        this.fundacion = fundacion;
        this.ubicacion = ubicacion;
        this.id = id;
        this.PIN = PIN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public String getCapital() {
        return capital;
    }
    
    
}
