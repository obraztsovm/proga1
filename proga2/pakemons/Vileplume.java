package pakemons;

import moves.chatot.Double_Team;
import moves.gloom.Sweet_Scent;
import moves.odish.Facade;
import moves.odish.Sludge_Bomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Vileplume extends Pokemon {
    public Vileplume (String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(75, 80, 85, 110, 90, 50);
        Sludge_Bomb sludgeBomb = new Sludge_Bomb(90, 100);
        Facade facade = new Facade(70, 100);
        Sweet_Scent sweetScent = new Sweet_Scent(0, 100);
        Double_Team doubleTeam = new Double_Team(0,0);

        super.setMove(sludgeBomb,facade, sweetScent, doubleTeam);

    }
}
