
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){//clase que nos hace la conexion con la base de datos
        Connection conection = null; //OBJETO DE TIPO CONECTION 
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            if(conection != null){
                
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return conection;
        
    }
}
