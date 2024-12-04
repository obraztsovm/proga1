package moves.chatot;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class Aerial_Ace extends PhysicalMove {
    public Aerial_Ace(double pow, double acc){
        super(Type.FLYING, pow, acc);
    }


    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "сделал " + pieces[pieces.length - 1];
    }
}
