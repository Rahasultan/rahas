import java.util.Arrays;
import java.util.Scanner;

public class sun3 {
    static int numofelement;

    public static void main(String[] args) {
        int x[]= new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println(Arrays.toString(x));
        for (int i = 0; i < 7; i++) {
            if (input(x,in.nextInt()))
                System.out.println(Arrays.toString(x));
            else
                System.out.println("array is full");
        }
    }
    public static boolean input(int a[],int newelment)
    {
        if (numofelement<a.length)
        {
            a[numofelement]=newelment;
            numofelement++;
            return true;
        }
        return false;}
}
