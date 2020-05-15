public class PokemonFeu extends pokemon  {

    public PokemonFeu(String nom0, int hp0, int atk0) {
        super(nom0, hp0, atk0);
    }


    @Override
    public void attaquer(pokemon p){
        double efficace = 2;
        double inefficace = 0.5;

        if ((p.getClass().getName()) == "PokemonPlante"){

        }

    }

}
