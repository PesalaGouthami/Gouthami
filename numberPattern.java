package gouthami;

public class numberPattern {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int a = 1; a <= i; a++){
                System.out.print(a);
            }
            for(int b = i-1; b >= 1; b--){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
