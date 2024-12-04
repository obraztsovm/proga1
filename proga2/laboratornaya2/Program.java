package laboratornaya2;

import pakemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {
    //https://pokemondb.net/pokedex/chatot
    //https://pokemondb.net/pokedex/zorua
    //https://pokemondb.net/pokedex/zoroark
    //https://pokemondb.net/pokedex/oddish
    //https://pokemondb.net/pokedex/gloom
    //https://pokemondb.net/pokedex/vileplume

    public static void main(String[] args) {
        Battle b = new Battle();
        Zorua zorua = new Zorua("Чужой", 1);
        Chatot chatot = new Chatot("Хищник", 1);
        Odish odish = new Odish("Охотник", 1);
        Zoroark zoroark = new Zoroark("Медведь", 1);
        Gloom gloom = new Gloom("Заяц", 1);
        Vileplume vileplume = new Vileplume("Лиса", 1);


        b.addAlly(zorua);
        b.addAlly(chatot);
        b.addAlly(gloom);

        b.addFoe(odish);
        b.addFoe(zoroark);
        b.addFoe(vileplume);

        b.go();
    }
}
