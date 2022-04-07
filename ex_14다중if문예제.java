import java.util.Scanner;

public class ex_14다중if문예제 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("점수 : ");
    int grade = sc.nextInt();

    if(grade>=90) {
        System.out.println("A학점입니다.");
    }
    else if(80<=grade && grade<90) {
        System.out.println("B학점입니다.");
    }
    else if(70<=grade && grade<80) {
        System.out.println("C학점입니다.");
    }else {
        System.out.println("퇴학!");
    }
    
    }
}
