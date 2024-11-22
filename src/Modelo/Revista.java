package Modelo;
import java.sql.Time;


/*@author welvin*/
public class  Revista {
    private  int id_Revista;
    private int NumeroRev;
    private String TituloRev;
    private String AyoRev;
    private int IssRev;
    private double PrecioRev;
    private Time HoraventaRev;

    public int getId_Revista() {
        return id_Revista;
    }

    public void setId_Revista(int id_Revista) {
        this.id_Revista = id_Revista;
    }

    public int getNumeroRev() {
        return NumeroRev;
    }

    public void setNumeroRev(int NumeroRev) {
        this.NumeroRev = NumeroRev;
    }

    public String getTituloRev() {
        return TituloRev;
    }

    public void setTituloRev(String TituloRev) {
        this.TituloRev = TituloRev;
    }

    public String getAyoRev() {
        return AyoRev;
    }

    public void setAyoRev(String AyoRev) {
        this.AyoRev = AyoRev;
    }

    public int getIssRev() {
        return IssRev;
    }

    public void setIssRev(int IssRev) {
        this.IssRev = IssRev;
    }

    public double getPrecioRev() {
        return PrecioRev;
    }

    public void setPrecioRev(double PrecioRev) {
        this.PrecioRev = PrecioRev;
    }

    public Time getHoraventaRev() {
        return HoraventaRev;
    }

    public void setHoraventaRev(Time HoraventaRev) {
        this.HoraventaRev = HoraventaRev;
    }

    public Revista(int NumeroRev, String TituloRev, String AyoRev, int IssRev, double PrecioRev, Time HoraventaRev) {
        this.NumeroRev = NumeroRev;
        this.TituloRev = TituloRev;
        this.AyoRev = AyoRev;
        this.IssRev = IssRev;
        this.PrecioRev = PrecioRev;
        this.HoraventaRev = HoraventaRev;
    }

    public Revista(int id_Revista, int NumeroRev, String TituloRev, String AyoRev, int IssRev, double PrecioRev, Time HoraventaRev) {
        this.id_Revista = id_Revista;
        this.NumeroRev = NumeroRev;
        this.TituloRev = TituloRev;
        this.AyoRev = AyoRev;
        this.IssRev = IssRev;
        this.PrecioRev = PrecioRev;
        this.HoraventaRev = HoraventaRev;
    }


}