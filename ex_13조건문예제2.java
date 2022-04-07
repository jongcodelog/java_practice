import java.util.Scanner;

public class ex_13조건문예제2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //시험 합격 불합격 나타내기
    System.out.println("Java점수 입력 : ");
    int Ja = sc.nextInt();
    
    System.out.println("Python점수 입력 : ");
    int Py = sc.nextInt();
    
    System.out.println("Html점수 입력 : ");
    int Ht = sc.nextInt();

    if(Ja+Py+Ht/3>70) {
        System.out.println("합격");
    }else {
        System.out.println("불합격");
    }
    }
}
