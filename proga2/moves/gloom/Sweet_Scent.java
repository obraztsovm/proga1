package moves.gloom;

import ru.ifmo.se.pokemon.*;

public final class Sweet_Scent extends StatusMove {
    public Sweet_Scent(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.EVASION, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "сделал " + pieces[pieces.length - 1];
    }
}
