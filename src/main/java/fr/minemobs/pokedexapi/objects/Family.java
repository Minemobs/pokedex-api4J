package fr.minemobs.pokedexapi.objects;

public class Family {

    private final int id, evolutionStage;
    private final String[] evolutionLine;

    public Family(int id, int evolutionStage, String[] evolutionLine) {
        this.id = id;
        this.evolutionStage = evolutionStage;
        this.evolutionLine = evolutionLine;
    }

    public int getId() {
        return id;
    }

    public int getEvolutionStage() {
        return evolutionStage;
    }

    public String[] getEvolutionLine() {
        return evolutionLine;
    }
}
