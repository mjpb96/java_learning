package personne;

/**
 * Classe définissant un profil
 *
 * @author Marc Baribaud
 * @version 0.02
 */
public class Profil {

    private int id;
    private String code;
    private String libelle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
