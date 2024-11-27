package cs.vsu.ru.goryacheva.task7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr= new int[20]; ; //4 6 1 2 1 2 3 2 3 5 4 7 4 1 5 1 5 6
        int length=vvod(arr);

        int c=0,c1=0,pos=-1, numb=0;
        for (int i=0; i<length-3; i++)
        {
            c=solution(arr, i, length);
            if (c>c1) {c1=c; pos=i;numb=1;}
            else if(c==c1){
                numb++;
                if (numb==2) pos=i;
            }
        }
        if (c1<=0) System.out.println("Нет последовательностей");
        else System.out.println(" Индекс 1-го элемента=" + pos +" Количество элементов=" + c1);
    }
    public static int vvod(int[] array)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
        array[i] = scanner.nextInt();}
        return length;
    }
    public static int solution(int[] arr, int index,int length)
    {
        int a = arr[index], b = arr[index+1], s=2;
        for (int k=index+2; k<length-1; k+=2)
        {
            if(a==arr[k] && b==arr[k+1]  && a!=b) s+=2;
            else break;
        }
        return s;
    }
}
