package pakemons;

import moves.chatot.Aerial_Ace;
import moves.zoroark.Night_Slash;
import moves.zorua.Rest;
import moves.zorua.Scratch;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Zoroark extends Pokemon {
    public Zoroark(String name, int level) {
        super(name, level);

        super.setType(Type.DARK);
        super.setStats(60, 105, 60, 120, 60, 105);

        Aerial_Ace aerialAce = new Aerial_Ace(60, 100000);
        Night_Slash nightSlash = new Night_Slash(70, 100);
        Rest rest = new Rest(0,0);
        Scratch scratch = new Scratch(40, 100);

        super.setMove(nightSlash, aerialAce, rest, scratch);
    }
}
