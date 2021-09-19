package Informacion;

import transporte.Aeronave;

import java.net.MalformedURLException;
import java.net.URL;

public class proxyReal implements Proxy{
    private Cache cacheDondeGuardo ;

    public URL LlamadaURL(int nroAeronave) throws MalformedURLException {
        if(cacheDondeGuardo == null){
            Aeronave avion = new Aeronave();
            cacheDondeGuardo = new Cache(avion.Geturl());
            return cacheDondeGuardo.LlamadaURL(nroAeronave);
        }else{
            return cacheDondeGuardo.LlamadaURL(nroAeronave);
        }

    }

}
