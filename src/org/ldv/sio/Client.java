package org.ldv.sio;

public class Client {
  private String nom;
  private String prenom;
  private Adresse domicile;
  private Adresse livraison;


  public Client(String nom, String prenom,Adresse domicile, Adresse livraison) {
    this.nom = nom;
    this.prenom = prenom;
    this.domicile=domicile;
    this.livraison=livraison;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Adresse getDomicile() { return domicile; }

  public void setDomicile(Adresse domicile) { this.domicile = domicile; }

  public Adresse getLivraison() { return livraison; }

  public void setLivraison(Adresse livraison) { this.livraison = livraison; }

  @Override
  public String toString() {//B)
    return "Client {" +
            "nom='" + nom + '\'' +
            " adresse de domicile: rue='"+getDomicile().rue+ ", ville='"+getDomicile().ville+", code Postal = "
            +getDomicile().codePostal+'\n'+
            "adresse de livraison: rue='"+getLivraison().rue+ ", ville='"+getLivraison().ville+
            ", code Postal = "+getLivraison().codePostal;
  }
  public String livraison() {
    return "Client {" +
            "nom='" + nom + '\'' +
            "livraison='"+livraison+
            '}';
  }
  public String domicile() {//C)a)
    return
            "nom='" + nom + ',' +
            " rue='"+getDomicile().rue+ ", ville='"+getDomicile().ville+", code Postal = "+getDomicile().codePostal;
  }
}
