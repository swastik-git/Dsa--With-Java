import java.util.Scanner;

public class Q1 {

    // For getting array values
    public static int[] getArray(Scanner sc){
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }

    // For getting sum of array values
    public static int sumOfArray(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        } 
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int result[] = new int[testCases];
        for(int i = 0; i<testCases; i++){
            int ar1[] = getArray(sc);
            result[i] = sumOfArray(ar1);
        }
        
        for(int i = 0; i<testCases; i++){
            System.out.println(result[i]);
        }
        sc.close();
    }
}