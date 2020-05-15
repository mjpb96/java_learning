public class pokemon {
    public static String nom;
    public static int hp;
    public static int atk;

    public pokemon(String nom0, int hp0, int atk0) {
        nom = nom0;
        hp = hp0;
        atk = atk0;
    }

    public static String getNom() {
        return nom;
    }

    public static int getHp() {
        return hp;
    }

    public static int getAtk() {
        return atk;
    }

    public static void setNom(String nom) {
        pokemon.nom = nom;
    }

    public static void setHp(int hp) {
        pokemon.hp = hp;
    }

    public static void setAtk(int atk) {
        pokemon.atk = atk;
    }

    public static boolean isDead(){
        if (hp == 0){
            return true;
        } else{
            return false;
        }
    }

    public void attaquer(pokemon p){
        p.setHp((p.getHp()) - (this.getAtk()));
    }

    public String toString(){
        return "Le nom du pokemon est :" + this.getNom() + "\n PV :" + this.getHp() + "\n Point d'attaque : " + this.getAtk();
    }
}
