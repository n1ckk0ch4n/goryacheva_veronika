package cs.vsu.ru.goryacheva.first;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите s");
        int s=scanner.nextInt();
        figure(s);
    }
    public static void figure(int s){
        for (int i = 1; i <= (s+1)/2; i++) {
            for (int chs = 1; chs  <= i-1; chs++) {System.out.print('|');}
            System.out.print('*');
            for (int chm = 1; chm <= s-(i-1)*2-2; chm++) {System.out.print('-');}
            if((s%2==0 || i!=(s+1)/2))System.out.print('*');
            for (int chs = 1; chs  <= i-1; chs++) {System.out.print('|');}
            System.out.println();
        }
        for (int i = s/2; i >= 1; i--) {
            for (int chs = 1; chs  <= i-1; chs++) {System.out.print('|');}
            System.out.print('*');
            for (int chm = 1; chm <= s-(i-1)*2-2; chm++) {System.out.print('-');}
            System.out.print('*');
            for (int chs = 1; chs  <= i-1; chs++) {System.out.print('|');}
            System.out.println();
        }
    }
}
