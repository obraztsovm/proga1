package moves.zorua;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.sleep(p);
        Effect.sleep(p);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "сделал " + pieces[pieces.length - 1];
    }

}
