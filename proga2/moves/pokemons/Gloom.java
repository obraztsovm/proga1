package pakemons;

import moves.gloom.Sweet_Scent;
import moves.odish.Facade;
import moves.odish.Sludge_Bomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Gloom extends Pokemon {
    public Gloom (String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(60, 65, 70, 85, 75, 40);

        Sweet_Scent sweetScent = new Sweet_Scent(0,100);
        Facade facade = new Facade(70, 100);
        Sludge_Bomb sludgeBomb= new Sludge_Bomb(90, 100);

        super.setMove(sweetScent, facade, sludgeBomb);

    }
}
