package fr.minemobs.pokedexapi.objects;

public class League {

    private final String name, slug, region;
    private final int badgesRequired;
    private final String[] badges;

    public League(String name, String slug, String region, int badgesRequired, String[] badges) {
        this.name = name;
        this.slug = slug;
        this.region = region;
        this.badgesRequired = badgesRequired;
        this.badges = badges;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getRegion() {
        return region;
    }

    public int getBadgesRequired() {
        return badgesRequired;
    }

    public String[] getBadges() {
        return badges;
    }
}
