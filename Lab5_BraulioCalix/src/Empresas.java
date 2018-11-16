
import java.util.ArrayList;
import java.util.Date;

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
    private Date fundacion;
    private String ubicacion;
    private int id;//tiene que ser unico
    private String PIN;
    private ArrayList<empleados> empleados;

    public Empresas() {
    }

    public Empresas(String nombre, String tipo, String capital, Date fundacion, String ubicacion, int id, String PIN, ArrayList<empleados> empleados) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capital = capital;
        this.fundacion = fundacion;
        this.ubicacion = ubicacion;
        this.id = id;
        this.PIN = PIN;
        this.empleados = empleados;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

   

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
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

    public ArrayList<empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<empleados> empleados) {
        this.empleados = empleados;
    }

    public void valida(){
        if (tipo.equals("pequeña")) {
            capital="80,00";
        }else if(tipo.equals("mediana")){
        capital="120,000";
        
        }else if(tipo.equals("grande")){
        capital="169,000";
        }
    }
    @Override
    public String toString() {
        return  nombre ;
    }

    
    
    
}
