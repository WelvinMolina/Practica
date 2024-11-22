package Modelo;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/** @author welvi*/
public class DAORevista {
     public Revista Insertar(int NumeroRev,String TituloRev,int AyoRev,String IssRev,
             double PrecioRev,java.sql. Time HoraventaRev){
         String transaccion = "INSERT INTO Revista (NumeroRev,TituloRev,AyoRev,IssRev,PrecioRev,HoraventaRev) VALUES('"
                 + NumeroRev + "', '"
                 + TituloRev + "', '"    
                 + AyoRev    + "', '"  
                 + IssRev    + "', '"   
                 + PrecioRev + "', '"    
                 + HoraventaRev + "')";
         if(new DataBase().Actualizar(transaccion) < 0){
             return new Revista(NumeroRev, TituloRev,IssRev, AyoRev, PrecioRev, 
                     HoraventaRev);
      }
       return  null;
    }


public int Actualizar (int NumeroRev, String TituloRev, String IssRev, String AyoRev, String PrecioRev, Date HoraventaRev){
    
            String transaccion = "UPDATE Revista SET NumeroRev='"
            +   NumeroRev  + "', TituloRev='"
            + TituloRev + "', AyoRev='"
            + AyoRev    + "', IssRev='"
            + IssRev    + "', PrecioRev='"
            + PrecioRev +  "', HoraventaRev='"      
            + HoraventaRev;
           return new DataBase().Actualizar(transaccion);
            
    
    }

public List ObtenerDatos(){
 String transaccion = "SELECT * FROM Revista";
List<Map> registros = new DataBase().Listart(transaccion);
List<Revista>  Revistas = new ArrayList();

for (Map registro : registros){
  Revista Revi = new Revista ((int) registro.get("NumeroRev"),
            (String) registro.get("TituloRev"),
            (String) registro.get("AyoRev"),
            (int) registro.get("IssRev"),
            (double) registro.get("PrecioRev"),
             (java.sql.Time) registro.get("HoraventaRev"));
          Revistas.add(Revi);
     }
   return Revistas;
  }

public int Eliminar (int NumeroRev) {
 String transaccion = "DALETE FROM Revista WHARE NumeroRev='"+NumeroRev +"'";

 return new DataBase().Actualizar(transaccion);
}
}