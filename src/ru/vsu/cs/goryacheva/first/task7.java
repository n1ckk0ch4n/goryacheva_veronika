package cs.vsu.ru.goryacheva.task7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr= new int[20]; ; //4 6 1 2 1 2 3 2 3 5 4 7 4 1 5 1 5 6
        int[] arr1= {4, 6, 1, 2, 1, 2, 1, 2, 3, 5, 4, 7,4, 1, 5, 1, 5, 6};
        int[] arr2= {4, 6, 1, 2, 2, 2, 1, 4, 3, 5, 4, 7, 4, 1, 5, 1, 5, 1, 5};
        int[] arr3= {4, 6, 1, 2, 2, 2, 1, 4, 3, 4, 3, 4, 3, 1, 5, 1, 5, 1, 5};
        int[] arr4= {4, 6, 1, 2, 2, 2, 1, 4, 3, 5, 4, 7, 4, 1, 5, 1, 5};
        int[] arr5= {4, 6, 4, 6, 4, 6, 4, 6, 3, 5, 4, 7, 4, 1, 5, 1, 5, 1, 5};
        int[] arr6= {4, 6, 2, 1, 2, 1, 1, 4, 3, 4, 3, 7, 4, 7, 4, 1, 5, 1, 5};
        int[] arr7= {4, 6, 4, 6, 4, 6, 4, 6, 4, 6};
        int[] arr8= {5, 5, 5, 5, 5, 5, 5, 5};
        int[] arr9= {4, 1, 5, 1, 5};
        int[] arr10= {4, 5, 1, 2, 2, 2, 1, 4, 3, 5, 4, 7, 4, 1, 5, 3, 5, 8, 5};
        solution(arr1, arr1.length);
        solution(arr2, arr2.length);
        solution(arr3, arr3.length);
        solution(arr4, arr4.length);
        solution(arr5, arr5.length);
        solution(arr6, arr6.length);
        solution(arr7, arr7.length);
        solution(arr8, arr8.length);
        solution(arr9, arr9.length);
        solution(arr10, arr10.length);
        int length=vvod(arr);
        solution(arr, length);
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
    public static void vyvod(int[] array, int len)
    {
        for(int i=0; i<len; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static int solution1(int[] arr, int index,int length)
    {
        int a = arr[index], b = arr[index+1], s=2;
        for (int k=index+2; k<length-1; k+=2)
        {
            if(a==arr[k] && b==arr[k+1]  && a!=b) s+=2;
            else break;
        }
        return s;
    }
    public static void solution(int[] arr, int length)
    {
        vyvod(arr, length);
        int c=0,c1=0,pos=-1, numb=0;
        for (int i=0; i<length-3; i+=c-1)
        {
            c=solution1(arr, i, length);
            if (c>c1) {c1=c; pos=i;numb=1;}
            else if(c==c1){
                numb++;
                if (numb==2) pos=i;
            }
        }
        if (c1<=2) System.out.println("Нет последовательностей");
        else System.out.println(" Индекс 1-го элемента=" + pos +" Количество элементов=" + c1);
    }
}
