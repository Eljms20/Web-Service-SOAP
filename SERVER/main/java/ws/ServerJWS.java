package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        // cette methode pour creer un server JWS
        //permet de demmarer un server
        String url ="http://0.0.0.0:8787/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service deployé sur "+url);

    }
}
