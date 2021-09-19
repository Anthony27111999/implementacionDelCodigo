package FrontEnd;

import FrontEnd.Cliente;
import Informacion.proxyReal;

import java.net.MalformedURLException;

public class AlasPum {
    public static void main(String[] args) throws MalformedURLException {
        Cliente primerCliente = new Cliente();
        primerCliente.VerAnuncio();
        proxyReal proxyAUtilizar= new proxyReal();
        System.out.println(proxyAUtilizar.LlamadaURL(1));
        proxyAUtilizar.LlamadaURL(1);
        proxyAUtilizar.LlamadaURL(1);

    }
}
