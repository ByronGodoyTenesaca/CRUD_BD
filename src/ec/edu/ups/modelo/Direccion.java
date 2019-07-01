package ec.edu.ups.modelo;

public class Direccion {

    private int codigo;
    private String callePrincipal;
    private String calleSecundaria;
    private int numero;
    private String cedula;
   

    public Direccion() {
    }

    public Direccion(int codigo, String callePrincipal, String calleSecundaria, int numero) {
        this.codigo = codigo;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numero = numero;
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Direccion{" + "codigo=" + codigo + ", callePrincipal=" + callePrincipal + ", calleSecundaria=" + calleSecundaria + ", numero=" + numero + '}';
    }
    
    
}
