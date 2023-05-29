package gouthami;

public class sumofarray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum=0;
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        for ( int i = 0; i <5; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
    }


}
