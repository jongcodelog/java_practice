import java.util.Scanner;

public class ex_17do_while {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;

    do {
        System.out.println("숫자입력 :");
        num = sc.nextInt();

    }while(num<10);

    System.out.println("종료되었습니다!");


    }
}
