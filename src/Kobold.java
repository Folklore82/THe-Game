public class Kobold extends Monster {
    public Kobold() {
        super(15, 20, 0, 10);
    }

    @Override
    public int monsterAttack() {
        System.out.println("The Kobold strikes you with it´s spear.");
        return super.monsterAttack();
    }

    @Override
    public void monsterDeath(){
        System.out.println("The Kobold whimpers and dies.");
    }

    @Override
    public void monsterAppears(){
        System.out.println("A measly little Kobold stands before you.");
    }
}
