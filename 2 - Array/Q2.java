import java.util.Scanner;

public class Q2 {
    // For getting array values
    public static int[] getArray(Scanner sc){
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }
    
    // For printing array values
    public static void PrintArray(int arr[]){
        for(int i:arr){
            System.out.println(i + " ");
        }
    }
    
    // For linear search
    public static int linearSearchInArray(Scanner sc, int arr[]){
        int Key = sc.nextInt();
        int counter = 0;
        for(int i:arr){
            if(Key == i)
                return counter;
            counter++; 
        }
        
        return -1;
        
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int result[] = new int[testCases];
        
        for(int k=0; k<testCases; k++){
            int ar1[] = getArray(sc);
            result[k] = linearSearchInArray(sc, ar1);
        }
        
         for(int k=0; k<testCases; k++){
             
            System.out.println("Output = " + result[k]);
        }
        
	}
}
