package archivos1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conexion cn = new Conexion();
        cn.getConexion();




        while (true) {
            System.out.println("1- [Crear una nueva carrera] ");
            System.out.println("2- [Cargar nuevo alumno] ");
            System.out.println("3- [Eliminar un alumno]");
            System.out.println("4- [Saber si es alumno regular]");
            System.out.println("0- [Salir");
            int o = sc.nextInt();

            if (o==1) {
                int idC = 0;
                String materia = "";
                String nombrecarrera = "";
                int a = 0;
                int d = 0;

                
                
                
                idC += 1;
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
                    materia += "'" + b + "'  ";
                        as.close();
                    }

                carrera carrera1 = new carrera(idC, nombrecarrera, a, d, materia);
                try {
                    cn.insertarCarrera(carrera1);
                    } catch (Exception e) {
                    e.printStackTrace();
                    }
                } 
            
            
            if (o == 2) {
                int id = 0;
                String nombre= "";
                String apellido= "";
                int dni=0;
                String provincia = "";
                String carrera = "";
                System.out.println("Crea un id para el alumno ");
                id = sc.nextInt();
                System.out.println("Ingrese el nombre del alumno: ");
                nombre = sc.next();
                System.out.println("Ingrese el apellido");
                apellido = sc.next();
                System.out.println("Ingrese el documento");
                dni= sc.nextInt();
                System.out.println("Ingrese la provincia de nacimiento");
                provincia = sc.next();
                System.out.println("Ingrese la carrera del alumno");
                carrera = sc.next();

                usuario usuario1 = new usuario(id, nombre, apellido, dni, provincia, carrera);
                try {
                    cn.insertarUsuario(usuario1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (o == 3) {
                int d;
                System.out.println("Ingrese el documento del alumno que desea eliminar: ");
                d=sc.nextInt();
                
                try {
                    cn.eliminaralumno(d);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (o == 4) {
                try {
                    cn.alumnoregular(121212);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else{
                break;
            }
        }
        sc.close();

            }
        }
        


        




        
        


