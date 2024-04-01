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
}