import java.util.Calendar;
import java.util.Date;

public class Application {

    public static void main(String[] args){
        Profil p = new Profil();
        p.setId(1);
        p.setCode("DIR");
        p.setLibelle("Directeur");

        Profil p2 = new Profil();
        p2.setId(2);
        p2.setCode("CHA");
        p2.setLibelle("Chauffeur");

        Personne pers = new Personne();
        pers.setNom("Dupont");
        pers.setPrenom("Bob");
        pers.setId(1);
        Calendar cal = Calendar.getInstance();
        cal.set(1992, 4, 27);
        pers.setDateNais(cal.getTime());
        pers.setProfil(p);
        pers.setSalaire(42000);

        pers.affiche();

    }
}
