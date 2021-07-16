package fr.minemobs.pokedexapi.objects;

import java.util.Map;

public class Pokemon {

    private final int number, gen;
    private final String name, species, height, weight, sprite, description;
    private final String[] types;
    private final Map<String, String[]> abilities;
    private final Family family;
    private final boolean starter, legendary, mythical, ultraBeast, mega;

    public Pokemon(int number, int gen, String name, String species, String height, String weight, String sprite, String description,
                   String[] types, Map<String, String[]> abilities, Family family, boolean starter, boolean legendary, boolean mythical,
                   boolean ultraBeast, boolean mega) {
        this.number = number;
        this.gen = gen;
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.sprite = sprite;
        this.description = description;
        this.types = types;
        this.abilities = abilities;
        this.family = family;
        this.starter = starter;
        this.legendary = legendary;
        this.mythical = mythical;
        this.ultraBeast = ultraBeast;
        this.mega = mega;
    }

    public int getNumber() {
        return number;
    }

    public int getGen() {
        return gen;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getSprite() {
        return sprite;
    }

    public String getDescription() {
        return description;
    }

    public String[] getTypes() {
        return types;
    }

    public Map<String, String[]> getAbilities() {
        return abilities;
    }

    public Family getFamily() {
        return family;
    }

    public boolean isStarter() {
        return starter;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public boolean isMythical() {
        return mythical;
    }

    public boolean isUltraBeast() {
        return ultraBeast;
    }

    public boolean isMega() {
        return mega;
    }
}
