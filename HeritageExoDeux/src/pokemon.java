public class Pokemon {
    protected int hp;
    protected String nom;
    protected int atk;

    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    public String getNom() {
        return nom;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setNom(String nom) {
        Pokemon.nom = nom;
    }

    public void setHp(int hp) {
        Pokemon.hp = hp;
    }

    public void setAtk(int atk) {
        Pokemon.atk = atk;
    }

    public boolean isDead(){
        if (hp == 0){
            return true;
        } else{
            return false;
        }
    }

    public void attaquer(Pokemon p){
        p.setHp((p.getHp()) - (this.getAtk()));
    }

    public String toString(){
        return "Le nom du pokemon est :" + this.getNom() + "\n PV :" + this.getHp() + "\n Point d'attaque : " + this.getAtk();
    }
}
