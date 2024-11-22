package Modelo;

import java.sql.*;
import java.util.*;

public class DataBase {
 //Cadena de conexión de la base de la BD publicación MYSQL
    private final String URL="jbdc:mysql://localhost:3306/Publicacion2";
    private final String user="root";
    private final String password="Welvin";
    
    private Connection conexion;//para conexiÓn de la BD
    
    public DataBase(){//Constructor de la clase
    try{
    conexion=DriverManager.getConnection(URL, user, password);
    System.out.println("Conexion Establecida");
    
    }catch(SQLException e){
    System.out.println("Error de conexion");
    e.printStackTrace();
    }
}
public int Actualizar (String consulta){
    try{Statement st=conexion.createStatement();
    return st.executeUpdate(consulta);
    }catch (SQLException e){
     e.printStackTrace();   
   }
    return 1;
}


private List OrganizarDatos(ResultSet rs){
     List filas=new ArrayList();
     try{
         int numColumnas=rs.getMetaData().getColumnCount();
         while(rs.next()){
          Map<String, Object> renglon=new HashMap(); 
           for(int i=1; 1<numColumnas; i++){

         String nombreCampo=rs.getMetaData().getTableName(i);
         Object valor=rs.getObject(nombreCampo);
          
          renglon.put(nombreCampo, valor);
         } 
         filas.add(renglon);
     }
}catch(SQLException e){
    e.printStackTrace();
}
 return filas;
}


public List Listar(String consulta){
     ResultSet rs=null;
     List resultado=new ArrayList();
     try{
        Statement st=conexion.createStatement();
        rs=st.executeQuery(consulta);
        resultado=OrganizarDatos(rs);

    }catch(SQLException e){
           System.out.println("No se realizó la consulta");
           e.printStackTrace();
    }
  return  resultado;
}

public void cerrarconexion(){
try{
conexion.close();
}catch (SQLException e){
 e.printStackTrace();
}
}

    List<Map> Listart(String transaccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}