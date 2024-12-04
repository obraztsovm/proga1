package moves.chatot;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Fury_Attack extends PhysicalMove {
    public Fury_Attack(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }




    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "сделал " + pieces[pieces.length - 1];
    }
}
