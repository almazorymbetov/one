/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int result = squaresum(n);
        System.out.println(result);
    }
    public static int squaresum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*n+squaresum(n-1);
        }
    }
}*/

/*
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        scanner.close();
        int result = sum(array,n);
        System.out.println(result);
    }
    public static int sum(int[] array, int n)
    {
        if (n<=0 || array.length==0)
        {
            return 0;
        }
        else
        {
            return array[n-1] + sum(array, n-1);
        }
    }
}*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = sum(n);
        System.out.println(result);
    }
    public static int sum(int n)
    {
        if (n==1)
        {
            return 1;
        }
        else
        {
            return n + sum(n-1);
        }
    }
}

