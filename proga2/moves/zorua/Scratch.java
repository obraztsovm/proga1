package moves.zorua;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class Scratch extends PhysicalMove {
    public Scratch(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    //нет эффектов

    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "сделал " + pieces[pieces.length - 1];
    }
}
