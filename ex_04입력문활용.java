import java.util.Scanner;

public class ex_04입력문활용 {
    public static void main(String[] args) {
    
        // 입력문 활용해서 4가지 연산하기
        Scanner sc = new Scanner(System.in);
        

        System.out.println("첫번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("두번째 정수 입력 : ");
        int num2 = sc.nextInt();
        System.out.println("두수 더하기 : "+(num1+num2));
        System.out.println("두수 빼기 : "+(num1-num2));
        System.out.println("두수 곱하기기 : "+(num1*num2));
        System.out.println("두수 나누기 : "+(num1/num2));

    }
}
