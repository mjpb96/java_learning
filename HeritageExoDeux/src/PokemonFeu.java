/**
 * Classe définissant un Pokemon de type Feu
 * @author Marc Baribaud
 * @version 0.03
 *
 */


public class PokemonFeu extends Pokemon  {

    public PokemonFeu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }


    @Override
    public void attaquer(Pokemon p){

        String typeCible = p.getClass().getSimpleName();
        if (typeCible == "PokemonPlante"){
            p.setHp((p.getHp()) - (this.getAtk()*2));
        }
        else if (typeCible == "PokemonEau" || typeCible == "PokemonFeu"){
            p.setHp((p.getHp()) - (this.getAtk()/2));
        }
        else {
            p.setHp((p.getHp()) - (this.getAtk()));
        }

    }

    public String ToString(){
        return "Le nom du pokemon est :" + this.getNom() + "de type feu" + "\n PV :" + this.getHp() + "\n Point d'attaque : " + this.getAtk();
    }

}
