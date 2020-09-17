package Prac_5;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void print_reverse(int n){
        System.out.println(n%10);
        n=n/10;
        if (n!=0) {
            print_reverse(n);
        }
    }
    public static int get_first_num(int n){
        if (n/10!=0){
            n=n/10;
            return get_first_num(n);
        }
        return n;
    }
    public static int deep(int n, int c){
        if (n!=0){
            return deep(n/10, c+1);
        }
        return c;
    }
    public static void print(int n){
        if (n!=0){
            int d=deep(n, 0);
            System.out.println(get_first_num(n));
            int next_num=n%(int)Math.pow(10, d-1);
            null_print(d-deep(next_num, 0)-1);
            print(next_num);
        }
    }
    public static  void null_print(int n){
        if(n!=0){
            System.out.println(0);
            null_print(n-1);
        }
    }
    public static void q_max(int c, int max) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x==0){
            System.out.println(String.format("Result is: %d", c));
        }
        else if(x>max){
            q_max(1, x);
        }
        else if(x==max){
            q_max(c+1, x);
        }
        else{
            q_max(c, max);
        }
    }

    public static void max(int max) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println(String.format("Result is: %d", max));
        } else if (x > max) {
            max(x);
        } else {
            max(max);
        }
    }

    public static void main(String[] args) {
        int n = 25064;
        System.out.println("Reverse num:");
        print_reverse(n);
        System.out.println("Straight num:");
        print(n);
        System.out.println("Start q_max:");
        q_max(1, 0);
        System.out.println("Start max:");
        max(0);

    }
}
