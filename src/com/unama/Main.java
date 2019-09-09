package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        System.out.println("Primeiro numero: ");
        a = ler.nextInt();
        System.out.println("Segundo numero: ");
        b = ler.nextInt();
        System.out.println("Terceiro numero: ");
        c = ler.nextInt();
        if (a < b) {
            if (b < c){
                System.out.println(a+ "\n" + b+ "\n" +c);

            }
            else if (a <c ) {
                System.out.println(a+ "\n" + c+ "\n" +b);
            }
            else {
                System.out.println(c+ "\n" + a+ "\n" +b);
            }
            }
        else if (b < c) {
            if (a < c) {
                System.out.println(b + "\n" + a + "\n" + c);
            } else {
                System.out.println(b + "\n" + c + "\n" + a);
            }
            }

        }
        }
	// write your code here


