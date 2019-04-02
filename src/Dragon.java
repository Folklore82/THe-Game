public class Dragon extends Monster {
    public Dragon() {
        super(150, 100, 15, 100);
    }

    @Override
    public void monsterAppears(){
        System.out.println("A huge dragon lands before you. Tremble mortal!");
    }

    @Override
    public void monsterDeath(){
        System.out.println("The legendary beast roars and dies.");
    }
    @Override
    public int monsterAttack(){
        System.out.println("The dragon lights you up. Literally!");
        return super.monsterAttack();
    }
}
