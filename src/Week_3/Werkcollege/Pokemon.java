package Week_3.Werkcollege;

public class Pokemon {
    private String pokemonNaam;
    private int levensPunten;
    private int aanvalsKracht;

    public Pokemon(String pokemonNaam, int levensPunten, int aanvalsKracht){
        this.pokemonNaam = pokemonNaam;
        this.levensPunten = levensPunten;
        this.aanvalsKracht = aanvalsKracht;

    }

    public void ontvangSchade(){


    }

    public String getPokemonNaam() {
        return pokemonNaam;
    }

    public int getLevensPunten() {
        return levensPunten;
    }

    public int getAanvalsKracht() {
        return aanvalsKracht;
    }
}
