package pakemons;

import moves.chatot.Aerial_Ace;
import moves.zorua.Rest;
import moves.zorua.Scratch;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Zorua extends Pokemon {
    public Zorua(String name, int level) {
        super(name, level);

        super.setType(Type.DARK);
        super.setStats(45, 65, 40, 80, 40, 65);
        Aerial_Ace arialAce = new Aerial_Ace(0, 0);
        Rest rest = new Rest(0,0);
        Scratch scratch = new Scratch(40, 100);

        super.setMove(arialAce, rest, scratch);

    }
}
