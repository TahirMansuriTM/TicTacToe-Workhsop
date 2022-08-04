package com.bridgelabz;

public class EvenOdd {
    public static void main(String[] args) {

        int i, sumOdd = 0, sumEven = 0;

        i = 1;

        while( i <= 20 ) {
            if( i % 2 != 0 ){
                System.out.print( i );
                sumOdd = sumOdd + i;
            } else {
                System.out.println("\t"+i);
                sumEven = sumEven + i;
            }

            i++;
        }

    }
}
