package gouthami;

public class order {
    public static void main(String[] args) {
        int arr[]={1,24,54,2,43,20,13};
        int temp;
        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length-1; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
}
