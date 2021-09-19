package Informacion;

import java.net.MalformedURLException;
import java.net.URL;

public interface Proxy {
    URL LlamadaURL(int nroAeronave) throws MalformedURLException;
}
