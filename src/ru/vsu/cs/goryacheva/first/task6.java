package cs.vsu.ru.goryacheva.first;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите n");
        int n=scanner.nextInt();
        System.out.print("введите e");
        double e=scanner.nextDouble();
        System.out.print("введите x");
        double x=scanner.nextDouble();
        double an=x;
        double e10=e/10;
        double s1=x;
        double s2=Math.abs(x)>e? x: 0;
        double s3=Math.abs(x)>e10? x: 0;
        for (int i = 2; i <= n; i++) {
            int st=(i-1)*2+1;
            an*=x*x/((st-1)*st);
            s1+=an;
            double an1=Math.abs(an);
            if(an1>e){s2+=an;}
            else if(an1>e10){s3+=an;}
        }
        s3+=s2;
        System.out.println("сумма n первых = "+s1);
        System.out.println("сумма n первых больше е = "+s2);
        System.out.println("сумма n первых больше е/10 = "+s3);
        System.out.println(Math.sinh(x));
    }
}
