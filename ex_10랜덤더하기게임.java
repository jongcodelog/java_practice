import java.util.Random;
import java.util.Scanner;

public class ex_10랜덤더하기게임 {
    public static void main(String[] args) {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);


    while(true) {
        int num1 = rd.nextInt(10)+1;
        int num2 = rd.nextInt(10)+1;
        System.out.println(num1+"+"+num2+"=");
        int input = sc.nextInt();
        if(input == num1+num2) {
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
    }
    }
}
