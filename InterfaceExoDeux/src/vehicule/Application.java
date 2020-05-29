package vehicule;

/**
 * Classe définissant l'application
 *
 * @author Marc Baribaud
 * @version 0.02
 */
public class Application {
    public static void main(String[] args){
        Voiture v = new Voiture();
        v.setModele("voiture A");
        v.setPrix(2000);
        v.setAnnee(2012);
        //v.setMatricule(321324656);
        v.demarrer();
        v.accelerer();
        System.out.println(v);
        System.out.println(v.getMatricule());

        Voiture v2 = new Voiture();
        v2.setModele("voiture B");
        v2.setPrix(2000);
        v2.setAnnee(2012);
        //v2.setMatricule(000000002);
        v2.demarrer();
        v2.accelerer();
        System.out.println(v2);
        System.out.println(v2.getMatricule());

        Camion c = new Camion();
        c.setModele("camion A");
        c.demarrer();
        c.accelerer();
        System.out.println(c);
        System.out.println(c.getMatricule());

        Camion c2 = new Camion("camion B", 2020, 78000);
        c2.setModele("camion B");
        c2.demarrer();
        c2.accelerer();
        System.out.println(c2);
        System.out.println(c2.getMatricule());

    }
}
