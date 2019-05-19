package dop2_19;

import java.util.Scanner;

public class Dop2_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        int A[] = new int [6];
        if (s.length()==6){
            for (int i=0; i<s.length(); i++){
                A[i] = s.toCharArray()[i];
            }     
        }
        else System.out.println("Too many numbers");
        if ((A[0]+A[1]+A[2])==(A[3]+A[4]+A[5])) System.out.println("This ticket is happy");
        else System.out.println("This ticket is not happy");
    }
    
}
