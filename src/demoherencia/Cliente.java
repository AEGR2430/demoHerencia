package demoherencia;

public class Cliente {
    private String nombreDelCliente;
    private String apellidosDelCliente;
    private String fechaDeNacimiento;
    private String direccionDelCliente;
    private String ocupacionDelCliente;
    private String numeroDeTelefono;
    private String emailDelCliente;
    
    
    public Cliente(String nombreDelCliente, String apellidosDelCliente){
        this.nombreDelCliente = nombreDelCliente;
        this.apellidosDelCliente = apellidosDelCliente;
        this.fechaDeNacimiento = "DD/MM/AA";
        this.direccionDelCliente = "Desconocida";
        this.ocupacionDelCliente = "Desconocida";
        this.numeroDeTelefono = "(LADA)-***-***)";
        this.emailDelCliente = "ejemplo@dominio.com";
    } 
    public String getNombreDelCliente(){
        return nombreDelCliente;
    }
    public String getApellidosDelCliente(){
        return apellidosDelCliente;
    }
    public String getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public String getDireccionDelCliente(){
        return direccionDelCliente;
    }
    public String getOcupacionDelCliente(){
        return ocupacionDelCliente;
    }
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    public String getEmailDelCliente(){
        return emailDelCliente;
    }
    
    public void setNombreDelCliente(String nombreDelCliente){
        this.nombreDelCliente = nombreDelCliente;
    }
    public void setApellidosDelCliente(String apellidosDelCliente){
        this.apellidosDelCliente = apellidosDelCliente;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setDireccionDelCliente(String direccionDelCliente){
        this.direccionDelCliente = direccionDelCliente;
    }
    public void setOcupacionDelCliente (String ocupacionDelCliente){
        this.ocupacionDelCliente = ocupacionDelCliente;
    }
    public void setNumeroDeTelefono (String numeroDeTelefono){
        this.numeroDeTelefono = numeroDeTelefono;
    }
    public void setEmailDelCliente (String emailDelCliente){
        this.emailDelCliente = emailDelCliente;
    }
}
