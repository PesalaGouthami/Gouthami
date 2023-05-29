package gouthami;

public class trianglePattern2 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int a = rows-1; a >= i; a--){
                System.out.print(" ");
            }
            for(int b = 1; b <= i; b++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
