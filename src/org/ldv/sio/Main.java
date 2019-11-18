package org.ldv.sio;

public class Main {

  public static void main(String[] args) {
    /*Adresse domicile = new Adresse("3 rue du clocher","Melun", 77000);//B)
    Adresse livraison= new Adresse("2 rue du cimetière","Paris",75001);//B)
    Client un = new Client("Djikstra","Edsger",domicile,livraison);//B)
    System.out.println(un.toString());*/

    /*Adresse dom2 = new Adresse("14 rue du Port","Nanterre", 92000);//C)a)
    Adresse domicile = new Adresse("3 rue du clocher","Melun", 77000);
    Client deux = new Client("Kernighan","Brian ",domicile,null);//C)a)
    if(deux.getLivraison() != null){
      System.out.println(deux.toString());//C)a)
    }
    else{
      System.out.println(deux.domicile());//C)a)
    }*/
    Adresse domicile = new Adresse("3 rue du clocher","Melun", 77000);//B)
    Adresse livraison= new Adresse("2 rue du cimetière","Paris",75001);//B)
    Client un = new Client("Djikstra","Edsger",domicile,livraison);//B)
    AdresseEtendue E= new AdresseEtendue("edsger@dijstra.org","https://fr.wikipedia.org/wiki/Edsger_Dijkstra");
      System.out.println(un.domicile()+" "+E.getEmail()+" "+E.getUrl());

  }
}
