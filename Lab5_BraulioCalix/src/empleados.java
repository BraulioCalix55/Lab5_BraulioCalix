
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
public class empleados {

    private String nombre;
    private Date fecha;
    private String correo;
    private String salario;
    private String desempe;
    private String cargo;

    public empleados() {
    }

    public empleados(String nombre, Date fecha, String correo, String salario, String desempe, String cargo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.correo = correo;
        this.salario = salario;
        this.desempe = desempe;
        this.cargo = cargo;
        
    }

    public String getDesempe() {
        return desempe;
    }

    public void setDesempe(String desempe) {
        this.desempe = desempe;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    

    @Override
    public String toString() {
        return nombre;
    }

    public String detalles() {
        return "nombre: "+nombre+" \nfecha: "+fecha+"\ncorreo: "+correo+"\nsalario: "+salario+"\ncargo: "+cargo+"\ntipo de empleado: "+desempe;
    }
}
