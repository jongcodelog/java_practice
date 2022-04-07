import java.util.Scanner;

public class ex_08삼항연산자예제2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("첫번째 정수 입력 : ");
    int num1 = sc.nextInt();
    System.out.println("두번째 정수 입력 : ");
    int num2 = sc.nextInt();

    int res = ((num1>num2) ? num1-num2 : num2-num1);
    System.out.println("두수의 차 : "+res);
    } 
}
