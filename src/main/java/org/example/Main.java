package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Strings...");

        MyArrayList<String> stringAr = new MyArrayList<>();

        java.util.Collections.addAll(stringAr, "a","bb","hello","gyi");
        System.out.println("Initial Array: " + stringAr);

        ArrayList<String> stringAr2 = new ArrayList<>();
        java.util.Collections.addAll(stringAr2, "ou","hi","1","2","frdf","sdfdfsdfgvsdfgdgfdg");
        System.out.println("Second Array: " + stringAr2);

        java.util.Collections.copy(stringAr2, stringAr);
        System.out.println("Second Array after copy: " + stringAr2);

        java.util.Collections.sort(stringAr);
        System.out.println("Initial Array after sort: " + stringAr);

        ////////////////////////////////////////

        System.out.println("\nTest Integers...");

        MyArrayList<Integer> intAr = new MyArrayList<>();

        java.util.Collections.addAll(intAr, 1,5,23,2,18);
        System.out.println("Initial Array: " + intAr);

        ArrayList<Integer> intAr2 = new ArrayList<>();
        java.util.Collections.addAll(intAr2, 200,250,232,2323,207,222,264);
        System.out.println("Second Array: " + intAr2);

        java.util.Collections.copy(intAr2, intAr);
        System.out.println("Second Array after copy: " + intAr2);

        java.util.Collections.sort(intAr);
        System.out.println("Initial Array after sort: " + intAr);

    }
}