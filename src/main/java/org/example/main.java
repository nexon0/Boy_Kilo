package org.example;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double  m  ;
        double kg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        m = inp.nextInt();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = inp.nextInt();

        System.out.println("Vücut kitle indeksiniz : " + (kg / m * m));

    }
}
