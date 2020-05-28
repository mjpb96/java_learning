/**
 * Classe définissant un camion qui hérite de vehicule
 * @author Marc Baribaud
 * @version 0.01
 */

public class Camion extends Vehicule {

    public Camion(){
        super();
    }

    @Override
    public void demarrer() {
        System.out.println("Le Camion "+super.getModele()+" démarre");
    }

    @Override
    public void accelerer() {
        System.out.println("Le Camion "+super.getModele()+" accélère");
    }
}
