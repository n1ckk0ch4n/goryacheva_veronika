package ru.vsu.cs.goryacheva.first;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("input x");
        double x=scanner.nextDouble();
        System.out.print("input y");
        double y=scanner.nextDouble();
        System.out.print("input z");
        double z=scanner.nextDouble();
        if (x!=0 && y!=0 && z!=0) System.out.printf("Point belongs to Oxyz");
        else {if (x==0) System.out.println("Point belongs to Oyz");
            if (y==0) System.out.println("Point belongs to Oxz");
            if (z==0) System.out.println("Point belongs to Oxy");}
    }
}