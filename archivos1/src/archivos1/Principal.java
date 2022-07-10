package archivos1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conexion cn = new Conexion();
        cn.getConexion();

        try {
            cn.alumnoregular(121212);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            cn.eliminaralumno(22);
        } catch (Exception e) {
            e.printStackTrace();
        }


        /*int idC = 0;
        //int idU = 0;
        String materia = "";
        String nombrecarrera = "";
        int a=0;
        int d=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quiere crear una nueva carrera? Si-[1] No-[2]");
        int option = sc.nextInt();
        if (option==1) {
            idC+=1;
            System.out.println("Ingrese el nombre de la carrera: ");
            nombrecarrera = sc.next();
            
            System.out.println("Ingrese la duracion de la carrera: ");
            d = sc.nextInt();
            System.out.println("Ingrese la cantidad de materias a agregar: ");
            a = sc.nextInt();
            System.out.println("Ingrese las materias para la carrera");
            for (int i = 0; i < a; i++) {
                System.out.println("==> ");
                Scanner as = new Scanner(System.in);
                String b = sc.next();

                materia +=  "'"+b+"'  ";
                as.close();

            }
            sc.close();
            carrera carrera1 = new carrera(idC, nombrecarrera, a, d, materia);
            try {
                cn.insertarCarrera(carrera1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        /*usuario usuario1= new usuario(idC+1,"Martin","Guaymas",121212,"Salta","Analisis de sistemas");
        
        try {
            cn.insertarUsuario(usuario1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
}
