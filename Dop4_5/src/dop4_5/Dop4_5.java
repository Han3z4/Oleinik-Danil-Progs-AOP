package dop4_5;

import java.util.Scanner;

public class Dop4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []A = new int[n];
        for (int i=0; i<n; i++) A[i]=in.nextInt();
        int temp=1, max=0;
        for (int i=0; i<n-1; i++){
            if ((A[i+1]%A[i])==0) temp++;
            else{
                if (temp>max) max = temp;
                temp=1;
            }
        }
        if (temp>max) max = temp;
        System.out.println("Maximum: " + max);
    }
    
}
