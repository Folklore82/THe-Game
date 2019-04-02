import static java.lang.Math.*;

public class RandomHelper {

    public static int randNr1to10(){
        int rand = (int)(random()*10 +1);
        return rand;
    }

    public static boolean chance10percent(){
        int n = randNr1to10();
        return (n==1);
    }
    public static boolean chance50percent(){
        int n = randNr1to10();
        System.out.println(n);
        return (n <= 5);
    }
}
