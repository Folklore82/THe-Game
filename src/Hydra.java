public class Hydra extends Monster {
    public Hydra() {
        super(70, 90, 10, 40);
    }

    @Override
    public int monsterAttack(){
        System.out.println("The Hydra rears and lounges at you.");
        return super.monsterAttack();
    }

    @Override
    public void monsterAppears(){
        System.out.println("A mighty Hydra charges you");
    }

    @Override
    public void monsterDeath(){
        System.out.println("You chop off the last of the Hydras heads.");
    }
}
