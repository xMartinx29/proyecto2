package archivos1;

public class HistorialAcademico extends usuario{
    private int idhistorial;
    
    public HistorialAcademico(int idhistorial, String nombre, String apellido,String carrera,float promedio,int idUsuario){
        this.idhistorial=idhistorial;
        this.setNombre(nombre);
        this.setApellido(apellido);
    }
}
