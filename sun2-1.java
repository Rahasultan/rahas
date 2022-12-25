import java.util.Arrays;

public class sun2 {
    public static void main(String[] args) {
        int x[]={11,12,13,14,15,16};
        System.out.println(Arrays.toString(x));
        //rotleft(x);
        //shiftright(x);
        rotright(x);
        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.toString(x));
//        shifleft(x);
//        System.out.println(Arrays.toString(x));
    }

    public static void shifleft(int a[])
    {
        for (int i = 0; i < a.length-1; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=Integer.MIN_VALUE;
    }
    public static void rotleft(int a[])
    {
        int t=a[0];
        for (int i = 0; i < a.length-1; i++) {
            a[i]=a[i+1];

        }
        a[a.length-1]=t;
    }
    public static void shiftright(int a[])
    {
        for (int i = a.length-1; i >0 ; i--) {
            a[i]=a[i-1];
        }
        a[0]=Integer.MIN_VALUE;
    }
    public static void rotright(int a[])
    {
        int t=a[a.length-1];
        for (int i = a.length-1; i >0 ; i--) {
            a[i]=a[i-1];
        }
        a[0]=t;
    }
}
