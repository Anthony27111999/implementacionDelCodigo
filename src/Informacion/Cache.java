package Informacion;

import transporte.Aeronave;

import java.net.MalformedURLException;
import java.net.URL;

public class Cache implements Proxy {
    private URL url;
    public Cache()
    {

    }
    public Cache(URL url)
    {
        this.url = url;
    }

    @Override
    public URL LlamadaURL(int nroAeronave) throws MalformedURLException {
        URL url = new URL("https://refactoring.guru/es/design-patterns/proxy");
        return url;
    }
}
