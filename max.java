package gouthami;

public class max {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=5;
        a[3]=52;
        a[4]=100;
        int max=0;
        for(int i=0;i<5;i++)
        {
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
