import java.util.Scanner;

public class ex_11조건문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이입력 : ");
        int age = sc.nextInt();

        if(10<=age && age<20) {
            System.out.println("10대입니다!");
        }
        else if(20<=age && age<30) {
            System.out.println("20대입니다!");
        }else if(30<=age && age<40) {
            System.out.println("30대입니다!");
        }else if(40<=age && age<50) {
            System.out.println("40대입니다!");
        }else {
            System.out.println("미성년자입니다!");
        }
        System.out.println("프로그램종료!");
    }
}
