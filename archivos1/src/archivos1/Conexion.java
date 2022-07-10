package archivos1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    Connection connection;

    public Connection getConexion() {
        
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            JOptionPane.showMessageDialog(null,"Conexion exitosa","Conexion",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;

    }
    
    public void alumnoregular(int dni) {
        Connection connection = this.getConexion();
        PreparedStatement as = null;
        ResultSet rs=null;
        try {
            as=connection.prepareStatement("SELECT * FROM usuarios WHERE Documento=" + "'"+dni+"'");
            rs= as.executeQuery();
            if (rs.next()) {
                System.out.println("Es alumno regular");
                as.close();
                connection.close();
            }
            else{
                System.out.println("No es alumno regular");
            }
            
        } catch (SQLException sqle) {
            System.out.println("Sqlstate: " + sqle.getSQLState());
            System.out.println("SlqError: " + sqle.getErrorCode());
            sqle.printStackTrace();
        }

    }

    public void eliminaralumno(int dni){
        Connection connection = this.getConexion();
        PreparedStatement as = null;
        try {
            as = connection.prepareStatement("DELETE FROM usuarios WHERE Documento=" + "'" + dni + "'");
            int response = as.executeUpdate();
            if (response > 0) {
                System.out.println( "Borrado correctamente");

                as.close();
                connection.close();
            }

        } catch (SQLException sqle) {
            System.out.println("Sqlstate: " + sqle.getSQLState());
            System.out.println("SlqError: " + sqle.getErrorCode());
            sqle.printStackTrace();
        }
    }

    public void insertarCarrera(carrera carrera1)throws SQLException{
        Connection connection = this.getConexion();
        PreparedStatement as=null;
        try {
            as=connection.prepareStatement("INSERT INTO carreras VALUES (?,?,?,?,?)");
            as.setInt(1,carrera1.getIdcarrera());
            as.setString(2,carrera1.getNombre());
            as.setInt(3,carrera1.getCantidadMaterias());
            as.setInt(4,carrera1.getDuracion());
            as.setString(5,carrera1.getMaterias());

            int response = as.executeUpdate();
            if (response>0) {
                System.out.println("Insertado correctamente");
                
            as.close();
            connection.close();
            }
        } catch (SQLException sqle) {
            System.out.println("Sqlstate: "+ sqle.getSQLState());
            System.out.println("SlqError: "+ sqle.getErrorCode());
            sqle.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if (connection != null) {
                try {
                    as.close();
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void insertarUsuario(usuario usuario1){
        Connection connection = this.getConexion();
        PreparedStatement as=null;
        try {
            as=connection.prepareStatement("INSERT INTO usuarios VALUES (?,?,?,?,?,?)");
            as.setInt(1,usuario1.getIdusuario());
            as.setString(2,usuario1.getNombre());
            as.setString(3,usuario1.getApellido());
            as.setLong(4,usuario1.getDni());
            as.setString(5,usuario1.getProvincia());
            as.setString(6,usuario1.getCarrera());

            int response = as.executeUpdate();
            if (response>0) {
                System.out.println("Ingreso exitoso");
                as.close();
                connection.close();  
            }
        } catch (SQLException sqle) {
            System.out.println("Sqlstate: " + sqle.getSQLState());
            System.out.println("SlqError: " + sqle.getErrorCode());
            sqle.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    as.close();
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


       
}
