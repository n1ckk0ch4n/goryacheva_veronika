package cs.vsu.ru.goryacheva.first;
    import java.util.Locale;
    import java.util.Scanner;
    public class Main {

        public static void main(String[] args)
        {
            Locale.setDefault(Locale.ROOT);
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите натуральное число n");
            double n=scanner.nextDouble();
            System.out.printf ("значение = "+calc(n));
        }
         public static double calc(double n)
    {
        double s=0, fc=1, st=1;
        for (int i=1; i<=n; i++) {
            fc*=i;
            st*=-1;
            s+=((st)*(i+1))/fc;
        }
        return s;
    }
           /* вариант 2 
           public static double calc(double n)
    {
        double s=0, fc=1;
        for (int i=1; i<=n; i+=2) {
            fc*=i;
            s-=(i+1)/fc;
        }
        for (int i=2; i<=n; i+=2) {
            fc*=i;
            s+=(i+1)/fc;
        }
        return s;
    }
 */
}
