package archivos1;

public class usuario {
    private int idUsuario;
    protected String nombre;
    private String apellido;
    private long dni;
    private String provincia;
    private String carrera;

    public usuario(){}

    public usuario(int idUsuario, String nombre, String apellido, long dni,String provincia, String carrera){
        super();
        this.idUsuario=idUsuario;
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.provincia=provincia;
        this.carrera=carrera;
    }

    public int getIdusuario(){return idUsuario;}
    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public long getDni(){return dni;}
    public String getProvincia(){return provincia;}
    public String getCarrera(){return carrera;}

    public void setIdusuario(int idUsuario){this.idUsuario= idUsuario;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellido(String apellido){this.apellido=apellido;}
    public void setDni(long dni){this.dni=dni;}
    public void setProvincia(String provincia){this.provincia=provincia;}
    public void setCarrera(String carrera){this.carrera=carrera;}
    

}
