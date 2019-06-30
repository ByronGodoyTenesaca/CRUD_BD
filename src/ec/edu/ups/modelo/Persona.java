package ec.edu.ups.modelo;

import java.util.Date;

public class Persona {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private Date fechaNacimiento;
    private String celular;
    private double salario;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, int edad, Date fechaNacimiento, String celular, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.salario = salario;
    }

    
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        if(nombre.length()>50){
        this.nombre = nombre.substring(0, 50);
        }else {
            System.out.println("llegue nombre");
            for(int i=nombre.length();i<=50;i++){
              
                this.nombre=nombre+ " ";
            }
        }
       
    }

    public String getApellido() {
        
        return apellido;
    }

    public void setApellido(String apellido) {
        
        if(apellido.length()>50){
        this.apellido = apellido.substring(0, 50);
        }else {
            
            for(int i=apellido.length();i<=50;i++){
                this.apellido = apellido+ " ";
            }
        }
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

   

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        if(celular.length()>10){
            this.celular = celular.substring(0, 10);
        }else{
            for(int i=celular.length();i<10;i++){
                this.celular = celular+" ";
            }
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", celular=" + celular + ", salario=" + salario + '}';
    }
    
    
    
}
