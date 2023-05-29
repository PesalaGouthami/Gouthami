package gouthami;

public class jaggedmatrix {
    public static void main(String[] args) {
        int[][] jaggedmatrix={{1,2,3},{4,5},{6,7,8,9}};
        System.out.println("jagged matrix");
        for(int i=0;i<jaggedmatrix.length;i++){
            for (int j=0;j<jaggedmatrix[i].length;j++) {
                System.out.print(jaggedmatrix[i][j] + "");
            }
            System.out.println();
        }
    }
}
