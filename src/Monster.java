public class Monster implements IMonster{

    private int health;
    private int xpGiven;
    private int strength;
    private int goldCarried;

    public Monster(int health, int xpGiven, int strength, int goldCarried) {
        this.health = health;
        this.xpGiven = xpGiven;
        this.strength = strength;
        this.goldCarried = goldCarried;
    }

    public void monsterAppears() {
        System.out.println("A generic monster appears.");
    }

    @Override
    public int monsterAttack() {
        return strength + RandomHelper.randNr1to10();
    }

    @Override
    public void monsterTakeDamage(int damage) {
        health -= damage;
        if(health <= 0){
            monsterDeath();
        }
    }

    @Override
    public void monsterDeath() {
        System.out.println("The generic monster died");

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getXpGiven() {
        return xpGiven;
    }
    public int goldGiven(){
        return goldCarried;
    }

    public void setXpGiven(int xpGiven) {
        this.xpGiven = xpGiven;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
