public class Application {
    public static void main(String[] args){
        Camion c = new Camion();
        c.setModele("camion A");
        c.demarrer();
        c.accelerer();
        System.out.println(c.getCount());

        Voiture v = new Voiture();
        v.setModele("voiture A");
        v.setPrix(2000);
        v.setAnnee(2012);
        v.setMatricule(321324656);
        v.demarrer();
        v.accelerer();

        System.out.println(v);

        System.out.println(v.getCount());
    }
}
