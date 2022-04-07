import java.util.Scanner;

public class ex_05시분초구하기 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("초 입력 : ");
    int num = sc.nextInt();
    int hour = num/3600;
    int min = num%3600/60;
    int sec = num%60;

    System.out.println(hour+"시"+min+"분"+sec+"초");
    
    
    }
}
