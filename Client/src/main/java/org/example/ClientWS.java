package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    // creation d'un proxy
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(800));
        Compte  cp=proxy.getCompte(5);
        System.out.println("le code="+cp.getCode());
        System.out.println("le solde="+cp.getSolde());
        System.out.println("date de creation="+cp.getDateCreation());
        List<Compte> compteList=proxy.lisComptes();
        for (Compte c:compteList)
        {
            System.out.println("**********************");
            System.out.println("le code="+c.getCode());
            System.out.println("le solde="+c.getSolde());
            System.out.println("date de creation="+c.getDateCreation());
        }
    }
}
