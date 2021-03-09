/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Drosselmeyer
 */
public class EmpeladoDAO {
    
    public int registrarEmpleado(Empleado empleado) throws ClassNotFoundException{
        //Genera el Statement para insertar en la base de datos
        String INSERTAR_EMPLEADO_SQL = "INSERT INTO empleado"
                + "(nombres,apellidos,usuario,pass,direccion,contacto) VALUES"
                + "(?,?,?,?,?,?)";
        
        int result=0;
        
        //Llama el driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //Prueba hacer la conexion y revisa si esta da algun error
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleado?useSSL=false","root","123456");
            PreparedStatement preparedStatement = conn.prepareStatement(INSERTAR_EMPLEADO_SQL)){
            //Sentencias preparadas
            preparedStatement.setString(1,empleado.getNombres());
            preparedStatement.setString(2,empleado.getApellidos());
            preparedStatement.setString(3,empleado.getUsuario());
            preparedStatement.setString(4,empleado.getPassword());
            preparedStatement.setString(5,empleado.getDireccion());
            preparedStatement.setString(6,empleado.getContacto());
            
            //Ejecutando la sentencia
            result = preparedStatement.executeUpdate();
            
        }
        catch(SQLException e){
            //Procesas la SQL Exception
            printSQLException(e);
        }
        return result;
    }
    
    //Imprime todos los datos del error
    private void printSQLException(SQLException ex){
        for(Throwable e: ex){
            if(e instanceof SQLException){
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: "+ ((SQLException) e).getErrorCode());
                System.err.println("Mensaje: "+ e.getMessage());
                Throwable t = ex.getCause();
                while (t != null){
                    System.out.println("Causa: "+t);
                    t = t.getCause();
                }
            }
        }
    }
}
