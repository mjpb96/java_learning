package vehicule;

/**
 * Classe définissant un véhicule
 *
 * @author Marc Baribaud
 * @version 0.02
 */
public abstract class Vehicule {

    // Ceci est une variable de class
    private static int matricule = 0;

    // Ce sont des variables d'instance
    private int annee;
    private String modele;
    private double prix;

    public Vehicule() {
        matricule ++;
        System.out.println("Je construis un véhicule");
    }

    /**
     * Retourne le matricule du véhicule
     *
     * @return le matricule du véhicule
     */
    public int getMatricule() {
        return matricule;
    }

    /**
     * Définit le matricule du véhicule
     *
     * @param matricule matricule du véhicule
     */
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
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
        return "Matricule : IS XC2 " + matricule
                + " | Annee : " + annee
                + " | Modèle : " + modele
                + " | Prix : " + prix;
    }
}
