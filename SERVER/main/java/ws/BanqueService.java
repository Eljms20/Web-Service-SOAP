package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService; // jaxws librairy

import java.util.Date;
import java.util.List;

//pOJO : plain  OLD java object : simple class java sans exigence on peut appler les methodes comme on veut
// il faut ajouter les depences du JXWS pour qu'on peut utiliser les annotations
 @WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt)
    {
        return mt*11.3;
    }

    public Compte getCompte(@WebParam(name = "code") int code){
        return  new Compte(code,Math.random()*6000,new Date());
        // rappel au parametre avec para pour initialier lobjet compte
    }
    @WebMethod
    public List<Compte> lisComptes(){
        return  List.of(
        new Compte(1,Math.random()*6000,new Date()),
        new Compte(2,Math.random()*6000,new Date()),
        new Compte(3,Math.random()*6000,new Date())

        );
    }
}
