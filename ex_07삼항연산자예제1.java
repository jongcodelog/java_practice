import java.util.Scanner;

public class ex_07삼항연산자예제1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수를 입력하세요 : ");
    int num = sc.nextInt();

    String res = (num%2 == 0 ? "짝수" : "홀수");
    System.out.println(num+"은(는)"+res+"입니다");
    
    }
}
