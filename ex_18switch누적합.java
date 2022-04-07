import java.util.Scanner;

public class ex_18switch누적합 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int total = 0;

    while(true) {
        total += num;
        System.out.println("숫자 입력 :");
        num = sc.nextInt();
        if(num == -1) {
            break;
        }
    }
    System.out.println("누적 합 : "+ total);
    
    }
}
