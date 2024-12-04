package moves.zoroark;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class Night_Slash extends PhysicalMove {
    public Night_Slash(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if(att.getStat(Stat.SPEED) / 8.0D > Math.random()) {
            System.out.println("Critical hit!");
            return 2.0D;
        } else {
            return 1.0D;
        }
    }

    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "сделал " + pieces[pieces.length - 1];
    }

}
