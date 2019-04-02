

public class Shop {



    public void buyStrenght(Player p1){
        if(p1.getGold() >= 30) {
            p1.setStrength(p1.getStrength()+2);
            p1.setGold(p1.getGold() - 30);
            System.out.println("You bought a strength potion.");
        }
        else{
            System.out.println("Not enough gold.");
        }
    }

    public void buyToughness(Player p1){
        if(p1.getGold() >= 50){
            p1.setToughness(p1.getToughness()+1);
            p1.setGold(p1.getGold()-50);
            System.out.println("You bought some armour");
        }
        else{
            System.out.println("Not enough gold");
        }
    }
}
