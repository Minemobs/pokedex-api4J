package fr.minemobs.pokedexapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.minemobs.pokedexapi.objects.EvolutionStone;
import fr.minemobs.pokedexapi.objects.League;
import fr.minemobs.pokedexapi.objects.Pokemon;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;
import java.util.Map;

public class PokedexAPI {

    public static final String baseURL = "https://pokeapi.glitch.me/v1/";
    public static final OkHttpClient client = new OkHttpClient.Builder().build();
    public static final Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public static int pokemonCount() throws IOException {
        return pokemonCount(0);
    }

    public static int pokemonCount(int gen) throws IOException {
        Request request = new Request.Builder()
                .url(baseURL + "/pokemon/counts")
                .build();
        String generation;
        if(gen == 0) generation = "total";
        else generation = "gen" + gen;
        return ((Double) gson.fromJson(client.newCall(request).execute().body().string(), Map.class).get(generation)).intValue();
    }

    public static Pokemon[] getPokemon(int id) throws IOException, NullPointerException {
        return getPokemon(String.valueOf(id));
    }

    public static Pokemon[] getPokemon(String slug) throws IOException, NullPointerException {
        Request request = new Request.Builder()
                .url(baseURL + "/pokemon/" + slug)
                .build();
        String req = client.newCall(request).execute().body().string();
        if(req.contains("\"error: 404,\"")) throw new NullPointerException("ERROR 404 !\n This pokemon does not exist !");
        return gson.fromJson(req, Pokemon[].class);
    }

    public static String[] getEvolutionStones() {
        Request request = new Request.Builder()
                .url(baseURL + "/evolution-stone")
                .build();
        try {
            return gson.fromJson(client.newCall(request).execute().body().string(), String[].class);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return new String[]{};
    }

    public static EvolutionStone getEvolutionStone(String slug) throws IOException, NullPointerException {
        Request request = new Request.Builder()
                .url(baseURL + "/evolution-stone/" + slug)
                .build();
        String req = client.newCall(request).execute().body().string();
        if(req.contains("\"error: 404,\"")) throw new NullPointerException("ERROR 404 !\n This pokemon does not exist !");
        return gson.fromJson(req, EvolutionStone.class);
    }

    public static String[] getLeagues() {
        Request request = new Request.Builder()
                .url(baseURL + "/league")
                .build();
        try {
            return gson.fromJson(client.newCall(request).execute().body().string(), String[].class);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return new String[]{};
    }

    public static League getLeague(String slug) throws IOException, NullPointerException {
        Request request = new Request.Builder()
                .url(baseURL + "/league/" + slug)
                .build();
        String req = client.newCall(request).execute().body().string();
        if(req.contains("\"error: 404,\"")) throw new NullPointerException("ERROR 404 !\n This pokemon does not exist !");
        return gson.fromJson(req, League.class);
    }

    public static String[] getTypes() {
        Request request = new Request.Builder()
                .url(baseURL + "/types")
                .build();
        try {
            return gson.fromJson(client.newCall(request).execute().body().string(), String[].class);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return new String[]{};
    }

}
