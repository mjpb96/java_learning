package personne;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe définissant une personne qui implémente l'interface IPersonne
 *
 * @author Marc Baribaud
 * @version 0.02
 */
public class Personne implements IPersonne {

    private int id;
    private String nom, prenom;
    private Date dateNais;
    private double salaire;
    private Profil profil;


    @Override
    public void affiche() {
        System.out.print("Je suis le " + profil.getLibelle()
                            + " " + this.nom.toUpperCase()
                            + " " + this.prenom
                            + " né le " + getDateFrench(this.dateNais)
                            + " et mon salaire est " + calculerSalaire() + " €");
    }

    @Override
    public double calculerSalaire() {
        if(profil.getLibelle().equals("Directeur")){
            return salaire + salaire*0.15;
        }else{
            return salaire + salaire*0.07;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDateNais() {
        return dateNais;
    }

    public void setDateNais(Date dateNais) {
        this.dateNais = dateNais;
    }

    public String getDateFrench(Date d){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat spdf = new SimpleDateFormat(pattern);
        String date_result = spdf.format(d);
        return date_result;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }
}
