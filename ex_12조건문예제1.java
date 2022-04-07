import java.util.Scanner;

public class ex_12조건문예제1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //3 또는 5의 배수 구하기

    System.out.println("숫자입력:");
    int number = sc.nextInt();

    if((number%3==0 || number%5==0)) {
        System.out.println("3또는5의 배수 입니다");
    }else {
        System.out.println("3또는5의 배수 아닙니다");
    }

    }
}
