package com.bridgelabz;

import java.util.Scanner;

public class Student {

    static int addition(int m,int n){             //Scope - Lifespan
        return m + n;
    }

    static int substraction(int x,int y){
        return x - y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c=0,d=0;
        System.out.println("Enter the 2 Numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = addition(a,b);
        d = substraction(a,b);
        System.out.println("Addition=" + c);
        System.out.println("Substraction=" + d);
    }
}
