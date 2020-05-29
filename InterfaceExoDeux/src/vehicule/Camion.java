package vehicule;

/**
 * Classe définissant un camion qui hérite de vehicule
 * @author Marc Baribaud
 * @version 0.02
 */
public class Camion extends Vehicule {

    private static int matricule = 0;

    /**
     * Constructeur principal
     */
    public Camion(){
        //super(); //utile si nous avons plusieurs constructeurs
        this.matricule ++;

    }

    /**
     * Constructeur secondaire
     * @param modele modèle du camion
     * @param annee année du modèle du camion
     * @param prix prix du camion
     */
    public Camion(String modele, int annee, double prix){
        this(); // Incrémentation du matricule via le premier constructeur
        setModele(modele);
        setAnnee(annee);
        setPrix(prix);
    }



    @Override
    public void demarrer() {
        System.out.println("Le Camion "+super.getModele()+" démarre");
    }

    @Override
    public void accelerer() {
        System.out.println("Le Camion "+super.getModele()+" accélère");
    }

    @Override
    public String toString() {
        return "Matricule : IS XC2 " + matricule
                + " | Annee : " + getAnnee()
                + " | Modèle : " + getModele()
                + " | Prix : " + getPrix();
    }
}
