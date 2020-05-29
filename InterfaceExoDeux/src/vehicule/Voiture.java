package vehicule;

/**
 * Classe définissant une voiture qui hérite de vehicule
 * @author Marc Baribaud
 * @version 0.01
 */
public class Voiture extends Vehicule {

    public Voiture(){
        super();
    }

    @Override
    public void demarrer(){
        System.out.println("La Voiture "+super.getModele()+" démarre");
    }

    @Override
    public void accelerer() {
        System.out.println("La Voiture "+super.getModele()+" accélère");
    }
}
