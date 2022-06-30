package model;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    private static final String bbdd="jdbc:mysql://localhost:3308/Disquera_Java";
    private static final String usuario="root";
    private static final String clave="";
    private static Connection con;

    public static Connection conectar(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(bbdd,usuario,clave);
            System.out.println("Conexion Exitosa");
        }catch(Exception e){
            System.out.println("Error de conexion a la base de datos" +e.getMessage().toString());
         }
         return con;
    }
    public static void main(String[] args) {
        conexion.conectar();
    }
}