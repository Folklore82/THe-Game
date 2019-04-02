
import java.util.Scanner;

public class Game {


    Shop shop = new Shop();
    Scanner sc = new Scanner(System.in);
    Player p1 = new Player(sc.nextLine());

    public void runGame(){
        boolean exit = false;

            while (!exit) {
                System.out.println("1. Go Adventuring");
                System.out.println("2. Show details about your character");
                System.out.println("3. Enter shop");
                System.out.println("4. Exit game");
                Scanner sc = new Scanner(System.in);
                int selected = 0;
                try {
                    selected = sc.nextInt();
                }
                catch(Exception e){
                    System.out.println("Please enter a valid number");
                }
                if (selected == 1) {
                    goAdveturing();
                } else if (selected == 2) {
                    p1.showDetails();
                } else if (selected == 3) {
                    shopMenu();
                } else if (selected == 4) {
                    exit = true;
                } else {
                    System.out.println("Please enter a valid number.");
                }
                if (p1.getLevel() >= 10) {
                    System.out.println("***********************************************************");
                    System.out.println("* Congratulations, you reached level 10 and won the game! *");
                    System.out.println("***********************************************************");
                    exit = true;
                }
                if (p1.getHealth() <= 0) {
                    System.out.println("What a tragedy! Better luck next time.");
                    exit = true;
                }

            }


    }
    public void shopMenu(){
        boolean exitShop = false;
        while(!exitShop) {
            System.out.println("What do you want?");
            System.out.println("1. +2 Strength for 30 gold");
            System.out.println("2. +1 Toughness for 50 gold");
            System.out.println("3. Exit");

            Scanner sc = new Scanner(System.in);
            int selector = 0;
            try {
                selector = sc.nextInt();
            }
            catch (Exception e) {
                System.out.println("Please enter a valid number.");
            }
            if (selector == 1) {
                shop.buyStrenght(p1);
            }
            else if (selector == 2) {
                shop.buyToughness(p1);
            }
            else if(selector == 3){
                System.out.println("Please come again.");
                System.out.println();
                exitShop = true;
            }
            else{
                System.out.println("Please enter a valid number.");
            }
        }

    }

    public void goAdveturing(){
        if(RandomHelper.chance10percent()){
            System.out.println("You stroll the countryside. What a lovely day!");
        }
        else {
            int difficulty = (p1.getLevel()+RandomHelper.randNr1to10());
            if(difficulty <=6) {
                Kobold k1 = new Kobold();
                fight(p1, k1);
            }
            else if(difficulty > 6 && difficulty <=9){
                Ogre o1 = new Ogre();
                fight(p1, o1);
            }
            else if(difficulty > 9 && difficulty <=12){
                Hydra h1 = new Hydra();
                fight(p1,h1);
            }
            else if(difficulty > 12){
                Dragon d1 = new Dragon();
                fight(p1, d1);
            }
        }

    }



    public void fight(Player player, Monster monster){
        monster.monsterAppears();
        while (player.getHealth() > 0 && monster.getHealth() > 0){

            monster.monsterTakeDamage(player.attack());
            System.out.println("Monsterhealth: "+ monster.getHealth());
            if(monster.getHealth()<= 0){
                System.out.println("With its final death throws the monster strikes again.");
            }
            int damage = (monster.monsterAttack()-player.getToughness());
            if(damage < 0){
                damage =0;
            }
            player.takeDamage(damage);
            System.out.println("Playerhealth: "+player.getHealth());

            System.out.println();
            System.out.println("Press [Enter] to continue.");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        }
        if(player.getHealth() > 0){
            player.getGold(monster.goldGiven());
            System.out.println("You gained "+monster.goldGiven()+" gold.");
            player.giveXP(monster.getXpGiven());
            System.out.println("you gained "+monster.getXpGiven()+" XP.");
            System.out.println("Player level: "+player.getLevel());
            System.out.println("Player XP: " + player.getXp());
            System.out.println();
        }
    }
}
