package dop5_9;

import java.util.Scanner;

public class Dop5_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array, size shift and nubers in array.");
        int n = in.nextInt();
        int [] X = new int[n];
        int k = in.nextInt();
        for (int i=0; i<n; i++){
            X[i] = in.nextInt();
        }
        int temp;
        for(int i=0; i<k; i++){
            for (int j=n-1; j>0; j--){
                temp = X[j];
                X[j]=X[j-1];
                X[j-1]=temp;
            }
        }
        for (int i=0; i<n; i++) System.out.print(X[i] + " ");
    }
    
}
