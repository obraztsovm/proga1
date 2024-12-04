package pakemons;

import moves.Sample;
import moves.chatot.Aerial_Ace;
import moves.chatot.Double_Team;
import moves.chatot.Fury_Attack;
import moves.chatot.Work_Up;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Chatot extends Pokemon {
    public Chatot(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(76, 65, 45, 92, 42, 91);

        Fury_Attack furyAttack = new Fury_Attack(15, 85);
        Aerial_Ace aerialAce = new Aerial_Ace(60, 10000000);// на счет асс- написано, что у этого пакемона она бесконечность
        Double_Team doubleTeam = new Double_Team(0,0);// вообще не указано, просто прочерк
        Work_Up workUp = new Work_Up(0,0);// тоже ничего не указано может связано с тем, что это статус мувы

        super.setMove(furyAttack, aerialAce, doubleTeam, workUp);
    }
    
}
