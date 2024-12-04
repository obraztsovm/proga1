package pakemons;


import moves.odish.Facade;
import moves.odish.Sludge_Bomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Odish extends Pokemon {
    public Odish(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(45, 50, 55, 75, 65, 30);

        Facade facade = new Facade(70, 100);
        Sludge_Bomb sludgeBomb = new Sludge_Bomb(90, 100);


        super.setMove(facade, sludgeBomb);
    }
}
