package moves.chatot;

import ru.ifmo.se.pokemon.*;

public final class Work_Up extends StatusMove{
    public Work_Up(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect e1 = new Effect().stat(Stat.ATTACK,1);
        Effect e2 = new Effect().stat(Stat.SPECIAL_ATTACK,1);

        p.addEffect(e1);
        p.addEffect(e2);
    }


    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "сделал " + pieces[pieces.length - 1];
    }

}
