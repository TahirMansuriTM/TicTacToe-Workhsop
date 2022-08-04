package com.bridgelabz;

public class BasicDemo {
    public static void main(String[] args) {

        boolean a = false;
        System.out.println("A=" + (!a) );

        int x = 1;
        x++;    // x = x + 1;  ++x;
        System.out.println("X=" + x);
        x--;    // x = x - 1;  --x;
        System.out.println("X=" + x);

        int m = 50, n = 20;

        if(m > n){  //if(10 > 20)
            System.out.println("M is Bigger than N");
        }else{
            System.out.println("N is Bigger than M");
        }

        int z = 15;
        if(z % 2 == 0 || z % 5 == 0){
            System.out.println("No is Divisible by 2 or 5");
        }else{
            System.out.println("No is Not divisible by 2 or 5");
        }
    }
}
