package go;


import bo.Pokemon;
import bo.Tournoi;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Tournoi
        Tournoi tournoi = new Tournoi(20);
        Pokemon pokemon1 = new Pokemon("Pikachu", 50, 50, "Chuuuu", "Pikaaaa", "kapi");
        Pokemon pokemon2 = new Pokemon("Smogogo", 30, 20, "Smogo", "ouai", "oooh");
        Pokemon pokemon3 = new Pokemon("bulbizar", 45, 50, "bulbi", "trop cool", "zaaar");
        Pokemon pokemon4 = new Pokemon("carapuce", 60, 65, "caraaaa", "ouai ouai ouai", "puce");

        tournoi.addPokemon(pokemon1);
        tournoi.addPokemon(pokemon2);
        tournoi.addPokemon(pokemon3);
        tournoi.addPokemon(pokemon4);



        tournoi.Combat(pokemon1, pokemon2);


        tournoi.DeroulementTournoi(tournoi);

    }
}
