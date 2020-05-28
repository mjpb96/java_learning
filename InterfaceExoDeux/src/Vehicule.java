/**
 * Classe définissant un véhicule
 * @author Marc Baribaud
 * @version 0.01
 */

public abstract class Vehicule {

    private int matricule, annee;
    private int count = 0;
    private String modele;
    private double prix;

    public Vehicule(){
        count++;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public abstract void demarrer();
    public abstract void accelerer();

    @Override
    public String toString() {
        return "Matricule : " + matricule
                + " | Annee : " + annee
                + " | Modèle : " + modele
                + " | Prix : " + prix;
    }
}
