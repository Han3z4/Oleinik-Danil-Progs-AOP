package dop3_14;

import java.util.Scanner;

public class Dop3_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int []A = new int [n];
        for (int i=0; i<n; i++)
            A[i] = in.nextInt();
        int temp=0, index=0;
        for (int i=0; i<n-1; i++){
            if (A[i]<A[i+1]) A[i]=A[i+1];
            else if (i<index && A[i]<temp) A[i]=temp;
            else{
                int j=i;
                while (j!=n-1){
                    j++;
                    if (A[j]>A[i]){
                        A[i]=A[j];
                        temp = A[j];
                        index = j;
                        break;
                    }
                }
                if (A[j]!=A[i]) A[i]=0;
            }
        }
        for (int i=0; i<n-1; i++) System.out.print(A[i] + " ");
        System.out.println('0');
    }
}
