package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media1, media2;
        System.out.println("Informe a nota da 1ª avaliação: ");
        nota1 = sc.nextDouble();
        System.out.println("Informe a nota da 2ª avaliação: ");
        nota2 = sc.nextDouble();
        System.out.println("Informe a nota da 3ª avaliação: ");
        nota3 = sc.nextDouble();
        media1 = nota1+nota2+nota3;
        media2 = media1/3;
        if (media2 <= 3) {
            System.out.println("Reprovado");
        }else if ((media2>3) && (media2 <=7)) {
            System.out.println("Exame final");
        }else{
            System.out.println("Aprovado");
        }
        // write your code here
    }
}
