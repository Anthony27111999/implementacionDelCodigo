package transporte;

import Informacion.Cache;
import sun.util.calendar.BaseCalendar;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import Informacion.Proxy;

public class Aeronave {
    private int numero;
    private Date anioIngreso;
    private  double millasRecorridas;
    private String modelo;
    private List<Asiento> listaDeAsientos;
    private URL url;

    public Aeronave(int _numero, Date _anioIngreso, double millasRecorridas, String _modelo, List<Asiento> _listaDeAsientos, URL _url )
    {
        this.numero = _numero;
        this.anioIngreso = _anioIngreso;
        this.millasRecorridas = millasRecorridas;
        this.modelo = _modelo;
        this.listaDeAsientos = _listaDeAsientos;
        this.url = _url;
    }

    public Aeronave() throws MalformedURLException {
        this.numero =1;
        this.url = new URL("https://refactoring.guru/es/design-patterns/proxy");
    }
//url
    public void Seturl(URL _url){
        this.url =_url;
    }

    public URL Geturl()
    {
        return this.url;
    }
    //asientos
    public void SetlistaDeAsientos(List<Asiento> _listaDeAsientos){
        this.listaDeAsientos =_listaDeAsientos;
    }

    public List<Asiento> GetlistaDeAsientos()
    {
        return this.listaDeAsientos;
    }
//modelo
    public void Setmodelo(String _modelo){
        this.modelo =_modelo;
    }

    public String Getmodelo()
    {
        return this.modelo;
    }
//millas
    public void SetmillasRecorridas(double _millasRecorridas){
        this.millasRecorridas =_millasRecorridas;
    }

    public double GetmillasRecorridas()
    {
        return this.millasRecorridas;
    }
//anio
    public void SetanioIngreso(Date _anioIngreso){
        this.anioIngreso =_anioIngreso;
    }

    public Date GetanioIngreso()
    {
        return this.anioIngreso;
    }
//num
    public void SetNumero(int _numero){
        this.numero =_numero;
    }

    public  int GetNumero()
    {
        return this.numero;
    }





}
