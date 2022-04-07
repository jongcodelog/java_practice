import java.util.Scanner;

public class ex_16switch나라별언어 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("입력 : ");
    String data = sc.next();

    switch(data) {
        case "한국어":
            System.out.println("안녕하세요");
            break;
        case "영어":
        System.out.println("Hello");
        break;
    }
    }
}
