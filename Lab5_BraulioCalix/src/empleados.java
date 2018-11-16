
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

    public empleados() {
    }

    public empleados(String nombre, Date fecha, String correo, String salario, String desempe) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.correo = correo;
        this.salario = salario;
        this.desempe = desempe;
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

    public void pago() {
        if (desempe.equals("ingeniero")) {
            salario = "22,000";
        } else if (desempe.equals("medico")) {
            salario = "18,000";
        } else if (desempe.equals("estudiante")) {
            salario = "7600";
        } else if (desempe.equals("licenciado")) {
            salario = "12,000";
        } else if (desempe.equals("maestro")) {
            salario = "2000";
        }
    }

}
