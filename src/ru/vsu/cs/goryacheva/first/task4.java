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
            double s=0;
            for (int i=1; i<=n; i++) {
                s+=(Math.pow(-1, i)*(i+1))/(factorial(i));
            }
            return s;
        }
        public static double factorial(double n)
        {
            int k=1;
            for (int i=1; i<=n; i++)
            {
                k*=i;
            }
            return k;
        }
    }
