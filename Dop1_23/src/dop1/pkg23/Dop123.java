package dop1.pkg23;

import java.util.Scanner;

/**
 *
 * @author Администратор
 */
public class Dop123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer [] A = new Integer[5];
        for (int i=0; i<5; i++) {
            A[i] = in.nextInt();
        }
        for (int i=0; i<4; i++) {
            for (int j=i+1; j<5; j++) {
                if (A[i]>A[j]) {
                    int q=A[i];
                    A[i]=A[j];
                    A[j]=q;
                }
            }
        }
        if(A[0]==A[4])
            System.out.println("Impossible");
        else if ((A[0]==A[3])||(A[1]==A[4]))
            System.out.println("Four of a Kind");
        else if (((A[0]==A[1])&&(A[2]==A[4]))||((A[0]==A[2])&&(A[3]==A[4])))
            System.out.println("Full House");
        else if ((A[0]+1==A[1])&&(A[1]+1==A[2])&&(A[2]+1==A[3])&&(A[3]+1==A[4]))
            System.out.println("Straight");
        else if ((A[0]==A[2])||(A[1]==A[3])||(A[2]==A[4]))
            System.out.println("Three of a Kind");
        else if (((A[0]==A[1])&&(A[2]==A[3]))||((A[0]==A[1])&&(A[3]==A[4]))||((A[1]==A[2])&&(A[3]==A[4])))
            System.out.println("Two Pairs");
        else if ((A[0]==A[1])||(A[1]==A[2])||(A[3]==A[4])||(A[2]==A[3]))
            System.out.println("One Pair");
        else System.out.println("Nothing");
    }
}
