/**
 * Classe définissant un Pokemon
 * @author Marc Baribaud
 * @version 0.03
 *
 */

public class Pokemon {
    private String nom;
    private int hp;
    private int atk;

    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    public String getNom() { return nom;}

    public int getHp() { return hp;}

    public int getAtk() { return atk;}

    public void setNom(String nom) { this.nom = nom;}

    public void setHp(int hp) { this.hp = hp;}

    public void setAtk(int atk) { this.atk = atk;}

    public boolean isDead(){
        return this.hp == 0;
    }

    /**
     * Méthode servant à attaquer un Pokemon
     * @param p : p à attaquer.
     */
    public void attaquer(Pokemon p){
        p.setHp((p.getHp()) - (this.getAtk()));
    }

    public String toString(){
        return "Le nom du pokemon est :" + this.getNom() + "\n PV :" + this.getHp() + "\n Point d'attaque : " + this.getAtk();
    }
}
