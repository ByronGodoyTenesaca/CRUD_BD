package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersona {
    
    private RandomAccessFile archivo;
    private int tamaño;
    private int posicion;
    private Set<Persona> lista;
    
    public ControladorPersona() {
        try {
            archivo=new RandomAccessFile("personas.ups", "rw");
            tamaño=152;
            posicion();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lista= new HashSet<>();
    }

    public int getPosicion() {
        return posicion;
    }

  
    public void posicion(){
        try {
            if(archivo.length()==0){
                posicion=0;
            }else{
                posicion=(int) (archivo.length()/tamaño)+1;
            }
                
        } catch (IOException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearPersona(Persona persona){
        try {
            archivo.seek(posicion*tamaño);
            archivo.writeUTF(persona.getCedula());
            archivo.writeUTF(persona.getNombre());
            archivo.writeUTF(persona.getApellido());
            archivo.writeInt(persona.getEdad());
           // archivo.writeUTF(persona.getFechaNacimiento());
            archivo.writeUTF(persona.getCelular());
            archivo.writeDouble(persona.getSalario());
            
            posicion++;
            
        } catch (IOException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Persona leerPersona(int posicion){
        
        try {
            archivo.seek(posicion*tamaño);
            String cedula=archivo.readUTF();
            String nombre=archivo.readUTF();
            String apellido=archivo.readUTF();
            int edad=archivo.readInt();
            String fechaNacimiento=archivo.readUTF();
            String celular=archivo.readUTF();
            double salario=archivo.readDouble();
            
          //  Persona p1=new Persona(cedula, nombre, apellido, edad, fechaNacimiento, celular, salario);
           // return p1;
        } catch (IOException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void eliminarPersona(int posicion){
  //      Persona p1=new Persona("", "", "", 0, "", "", 0.0);
        //actualizarPersona(p1, posicion);
    }
   
    
     public void actualizarPersona(Persona persona,int posicion){
        try {
            archivo.seek(posicion*tamaño);
            archivo.writeUTF(persona.getCedula());
            archivo.writeUTF(persona.getNombre());
            archivo.writeUTF(persona.getApellido());
            archivo.writeInt(persona.getEdad());
            //archivo.writeUTF(persona.getFechaNacimiento());
            archivo.writeUTF(persona.getCelular());
            archivo.writeDouble(persona.getSalario());
             
        } catch (IOException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public void tabla(){
     
        try {
            long n=archivo.length()/tamaño;
            
            for(int i=0;i<=n;i++){
                lista.add(leerPersona(i));
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
}
