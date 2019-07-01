package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Usuario
 */
public class ControladorPersonasBD {
    
    private ControladorConexionBD miBaseDatos;

    public ControladorPersonasBD() {
    
        miBaseDatos=new ControladorConexionBD();
    }
    
    
    
    public void create(Persona persona){
         Format formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(persona.getFechaNacimiento());
        String sql= "INSERT INTO \"PERSONAS\" VALUES ("+"'"+persona.getCedula()+"','"
                +persona.getNombre()+"','"
                +persona.getApellido()
                +"',"+persona.getEdad()
                +",'"+fecha
                +"','"+persona.getCelular()
                +"',"+persona.getSalario()+");";
   
        miBaseDatos.conectar();
        try{
        Statement sta=miBaseDatos.getConexionBD().createStatement();
        sta.execute(sql);
        miBaseDatos.desconectar();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void delete(String cedula){
        try {
            String sql= "DELETE FROM \"PERSONAS\" WHERE \"PER_CEDULA\"='"+cedula+"';";
            
            miBaseDatos.conectar();
            
            Statement sta= miBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void update(Persona persona){
        Format formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(persona.getFechaNacimiento());
        String sql="UPDATE \"PERSONAS\" SET \"PER_NOMBRES\" = '" + persona.getNombre() + "',"
                 + "\"PER_APELLIDOS\" = '" + persona.getApellido() + "',"
                + "\"PER_EDAD\" = " + persona.getEdad() + ","
                + "\"PER_FECHA_NACIMIENTO\" = '" + fecha + "',"
                + "\"PER_CELULAR\" = '" + persona.getCelular() + "',"
                + "\"PER_SALARIO\" = " + persona.getSalario()
                + "WHERE \"PER_CEDULA\" = '" + persona.getCedula() + "';";
        miBaseDatos.conectar();
        System.out.println(sql);
        try{
        Statement sta=miBaseDatos.getConexionBD().createStatement();
        sta.execute(sql);
        miBaseDatos.desconectar();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    
    public java.util.List<Persona> listar() {
        java.util.List<Persona> listadoPersona = new ArrayList<Persona>();
        miBaseDatos.conectar();
        try {
            Statement sta = miBaseDatos.getConexionBD().createStatement();
            String sql = "SELECT * FROM \"PERSONAS\";";
            ResultSet respuesta = sta.executeQuery(sql);
            while(respuesta.next()){
                Persona p = new Persona();
                p.setCedula(respuesta.getString(1));
                p.setNombre(respuesta.getString(2));
                p.setApellido(respuesta.getString(3));
                p.setEdad(respuesta.getInt(4));
                p.setFechaNacimiento(respuesta.getDate(5));
                p.setCelular(respuesta.getString(6));
                p.setSalario(respuesta.getDouble(7));
                listadoPersona.add(p);
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
        return listadoPersona;
    }
    
    public Persona buscar(String cedula) {
        Persona p = new Persona();
        miBaseDatos.conectar();
        try {
            Statement sta = miBaseDatos.getConexionBD().createStatement();
            String sql = "SELECT * FROM \"PERSONAS\" WHERE \"PER_CEDULA\"='"+cedula+"';";
            ResultSet respuesta = sta.executeQuery(sql);
            while(respuesta.next()){
                p.setCedula(respuesta.getString(1));
                p.setNombre(respuesta.getString(2));
                p.setApellido(respuesta.getString(3));
                p.setEdad(respuesta.getInt(4));
                p.setFechaNacimiento(respuesta.getDate(5));
                p.setCelular(respuesta.getString(6));
                p.setSalario(respuesta.getDouble(7));
                
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }
    
    public void llenarCedulas(JComboBox cedulas){
       
        try {
            String sql="SELECT * FROM \"PERSONAS\";";
            
            miBaseDatos.conectar();
            Statement sta=miBaseDatos.getConexionBD().createStatement();
            ResultSet respuesta =sta.executeQuery(sql);
            
            cedulas.addItem("Elija una opcion");
            
            while(respuesta.next()){
                cedulas.addItem(respuesta.getString("PER_CEDULA"));
            }
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
    }
}
