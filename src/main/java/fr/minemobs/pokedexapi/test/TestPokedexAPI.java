package fr.minemobs.pokedexapi.test;

import static fr.minemobs.pokedexapi.PokedexAPI.*;

import java.io.IOException;
import java.util.Arrays;

public class TestPokedexAPI {

    private TestPokedexAPI(){}

    public static void main(String[] args) throws IOException {
        System.out.println("Pokemon count : " + pokemonCount());
        System.out.println("Pokemon : " + getPokemon(658)[1].getName());
        System.out.println(Arrays.toString(getLeagues()));
        System.out.println(Arrays.toString(getTypes()));
    }
}
