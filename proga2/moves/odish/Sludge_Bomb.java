package moves.odish;

import laboratornaya2.Program;
import moves.Sample;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Sludge_Bomb extends SpecialMove {
    public Sludge_Bomb(double pow, double acc){
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(Sample.chance(0.3)){
            Effect.poison(p);
        }
    }

    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "сделал " + pieces[pieces.length - 1];
    }
}
