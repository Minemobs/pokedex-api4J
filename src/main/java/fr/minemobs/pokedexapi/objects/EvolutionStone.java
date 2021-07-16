package fr.minemobs.pokedexapi.objects;

public class EvolutionStone {

    private final String name, aka, slug, sprite;
    private final String[] effects;

    public EvolutionStone(String name, String aka, String slug, String sprite, String[] effects) {
        this.name = name;
        this.aka = aka;
        this.slug = slug;
        this.sprite = sprite;
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public String getAka() {
        return aka;
    }

    public String getSlug() {
        return slug;
    }

    public String getSprite() {
        return sprite;
    }

    public String[] getEffects() {
        return effects;
    }
}
