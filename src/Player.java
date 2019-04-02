public class Player implements IPlayer{

    private String name;
    private int health;
    private int xp;
    private int level;
    private int strength;
    private int toughness;
    private int gold;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.xp = 0;
        this.level = 1;
        this.strength = 10;
        this.toughness = 0;
        this.gold = 0;
    }
    public void getGold(int goldGained){
        gold += goldGained;
    }

    public int attack(){
        System.out.println("You hit the monster.");
        return (strength+ level + RandomHelper.randNr1to10());
    }

    public void takeDamage(int damage){
        health -= damage;
        if(health <= 0){
            isDead();
        }
    }

    public void showDetails(){
        System.out.println("***************");
        System.out.println("* Name: "+name);
        System.out.println("* Level: "+level);
        System.out.println("* Health: "+health+"/100");
        System.out.println("* Strength: "+strength);
        System.out.println("* Toughness: "+toughness);
        System.out.println("* XP: "+xp+ "/100");
        System.out.println("* Gold: "+gold);
        System.out.println("***************");
    }

    public void isDead(){
        System.out.println("You died, what a pity.");
    }

    public void giveXP(int xpGained) {
        xp += xpGained;
        if(xp >= 100){
            level++;
            xp -=100;
            health = 100;
            System.out.println("You gained a level, Congratulations.");
            System.out.println("You are now level: "+level);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
