public class Ogre extends Monster {
    public Ogre() {
        super(30, 40, 5, 20);
    }

    @Override
    public int monsterAttack(){
        System.out.println("The Ogre whacks you with it´s massive club.");
        return super.monsterAttack();
    }
    @Override
    public void monsterDeath(){
        System.out.println("The massive Ogre falls to the ground.");
    }

    @Override
    public void monsterAppears(){
        System.out.println("A brutish looking Ogre crosses your path.");
    }

}
