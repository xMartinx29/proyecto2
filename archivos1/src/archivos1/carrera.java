package archivos1;



public class carrera {
    private int idcarrera;
    private String nombre;
    private int cantidadmaterias;
    private int duracion;
    private String materia;

    public carrera(){}

    public carrera(int idcarrera,String nombre,int cantidadmaterias,int duracion, String materia){
        super();
        this.idcarrera=idcarrera;
        this.nombre=nombre;
        this.cantidadmaterias=cantidadmaterias;
        this.duracion=duracion;
        this.materia=materia;
    }

    public int getIdcarrera(){return idcarrera;}
    public String getNombre(){return nombre;}
    public int getCantidadMaterias(){return cantidadmaterias;}
    public int getDuracion(){return duracion;}
    public String getMaterias(){return materia;}

    public void setIdcarrera(int idcarrera){this.idcarrera=idcarrera;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setCantidadMaterias(int cantidadmaterias){this.cantidadmaterias=cantidadmaterias;}
    public void setDuracion(int duracion){this.duracion=duracion;}
    public void setMaterias(String materia){this.materia=materia;}



}   
