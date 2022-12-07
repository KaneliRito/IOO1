package Week_3.Werkcollege;

public class GevechtLeider {
    Pokemon pokemonEen;
    Pokemon pokemonTwee;
    boolean pokemonEenAanDeBeurt = true;

    public GevechtLeider(Pokemon pokemonEen, Pokemon pokemonTwee) {
        this.pokemonEen = pokemonEen;
        this.pokemonTwee = pokemonTwee;
    }

    public void printDeelnemers() {
        System.out.println(pokemonEen.getPokemonNaam() + " vecht tegen " + pokemonTwee.getPokemonNaam());
    }
    public void startGevecht() {
        String verloren = null;
        String gewonnen = null;
        while (pokemonEen.getLevensPunten() != 0 || pokemonTwee.getLevensPunten() != 0) {
            if (pokemonEenAanDeBeurt) {
                pokemonEen.ontvangSchade(pokemonTwee.getAanvalsKracht());
            }
            if (!pokemonEenAanDeBeurt) {
                pokemonTwee.ontvangSchade(pokemonEen.getAanvalsKracht());
            }

            pokemonEenAanDeBeurt = !pokemonEenAanDeBeurt;

            if (pokemonEen.getLevensPunten() == 0) {
                verloren = pokemonEen.getPokemonNaam();
                gewonnen = pokemonTwee.getPokemonNaam();
                break;
            } else if (pokemonTwee.getLevensPunten() == 0){
                verloren = pokemonTwee.getPokemonNaam();
                gewonnen = pokemonEen.getPokemonNaam();
                break;
            } else{
                continue;
            }

        }
        System.out.println(verloren + " is verslagen door " + gewonnen);
    }

}
