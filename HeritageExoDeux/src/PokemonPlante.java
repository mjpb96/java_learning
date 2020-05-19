/**
 * Classe définissant un Pokemon de type Plante
 * @author Marc Baribaud
 * @version 0.03
 *
 */

public class PokemonPlante extends Pokemon  {

    public PokemonPlante(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }


    @Override
    public void attaquer(Pokemon p){

        String typeCible = p.getClass().getSimpleName();
        if (typeCible == "PokemonEau"){
            p.setHp((p.getHp()) - (this.getAtk()*2));
        }
        else if (typeCible == "PokemonPlante" || typeCible == "PokemonFeu"){
            p.setHp((p.getHp()) - (this.getAtk()/2));
        }
        else {
            p.setHp((p.getHp()) - (this.getAtk()));
        }

    }

    public String ToString(){
        return "Le nom du pokemon est :" + this.getNom() + "de type plante" + "\n PV :" + this.getHp() + "\n Point d'attaque : " + this.getAtk();
    }

}
