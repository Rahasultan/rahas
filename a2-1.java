public class a2 {
    public static void main(String[] args) {
        int x[]={11,12,13,14,15,16,17,9};
        int y[]=new int[8];
        System.arraycopy(x,0,y,0,8);
        System.out.print("y = ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]+",");
        }}
}
