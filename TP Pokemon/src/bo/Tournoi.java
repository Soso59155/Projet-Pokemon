package bo;

import java.util.ArrayList;
import java.util.Random;

public class Tournoi {
    int nbPokemon;
    protected ArrayList<Pokemon> tabPokemon;

    public Tournoi(int nbPokemon) {
        this.nbPokemon = nbPokemon;
        this.tabPokemon = new ArrayList<Pokemon>();
    }


    public boolean addPokemon(Pokemon pokemon) {
        boolean retour = false;
        if (tabPokemon.size() >= nbPokemon) {
            retour = false;
        }
        else {
            tabPokemon.add(pokemon);
            retour=true;
            System.out.println(pokemon.getName() + " a été rajouté au tournoi" )
            ;
        }
        return retour;
    }

    public void Combat(Pokemon pokemon1,Pokemon pokemon2){
        if (pokemon1.getPP()>pokemon2.getPP()){
            tabPokemon.remove(pokemon2);
            System.out.println(pokemon2.getName() +" a été éliminé du tournoi par " + pokemon1.getName());
            System.out.println(pokemon2.getName() +" : " + pokemon2.getCrisDeDefaite());
            System.out.println(pokemon1.getName() +" a vaincu " + pokemon2.getName());
            System.out.println(pokemon1.getName() +" : " + pokemon1.getCrisDeVictoire());


        }
        else {

            tabPokemon.remove(pokemon1);
            System.out.println(pokemon1.getName() +" a été éliminé du tournoi par  " + pokemon2.getName());
            System.out.println(pokemon1.getName() +" : " + pokemon1.getCrisDeDefaite());
            System.out.println(pokemon2.getName() +" a vaincu " + pokemon1.getName());
            System.out.println(pokemon2.getName() +" : " + pokemon2.getCrisDeVictoire());
        }

    }

    public void DeroulementTournoi (Tournoi T1){

        while (tabPokemon.size() > 1){
            Random r1 = new Random();

            System.out.println(tabPokemon.size());
            int  aleatoire1 = r1.nextInt(tabPokemon.size());


            Random r2 = new Random();
            int  aleatoire2 = r2.nextInt(tabPokemon.size());
            System.out.println("                    ");
            System.out.println("                    ");
            System.out.println("                    ");
            System.out.println("                    ");
            System.out.println((tabPokemon.get(aleatoire1).getName() + " Versus " + (tabPokemon.get(aleatoire2).getName() )));
            System.out.println((tabPokemon.get(aleatoire1).getName() + " : " + (tabPokemon.get(aleatoire1).getCrisDeCombat())));
            System.out.println((tabPokemon.get(aleatoire2).getName() + " : " + (tabPokemon.get(aleatoire2).getCrisDeCombat())));
            T1.Combat(tabPokemon.get(aleatoire1),tabPokemon.get(aleatoire2));
        }






    }



}
