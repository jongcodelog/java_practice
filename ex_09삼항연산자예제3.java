import java.util.Scanner;

public class ex_09삼항연산자예제3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("농구공의 개수를 입력하세요");

        int ball = sc.nextInt();
        // 공의 5개가 박스 하나에 들어간다.
        // 5의 배수일때는 박스가 딱 맞는데 넘어가면 상자 +1 더 필요하다

        int box = (ball % 5 > 0) ? (ball / 5 + 1) : (ball/5);
        System.out.println("필요한 상자의 수 : "+box);


    }
}