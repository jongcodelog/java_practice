import java.util.Scanner;

public class ex_19스위치문계절 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("월(1~12) 입력 : ");
    int month = sc.nextInt();

    switch(month) {
        case 12:
		    System.out.print(month+"월은 겨울입니다");
		    break;
        case 1:
		    System.out.print(month+"월은 겨울입니다");
		    break;
        case 2:
		    System.out.print(month+"월은 겨울입니다");
		    break;
        case 3:
		    System.out.print(month+"월은 봄입니다");
		    break;
        case 4:
		    System.out.print(month+"월은 봄입니다");
		    break;
        case 5:
		    System.out.print(month+"월은 봄입니다");
		    break;
        case 6:
		    System.out.print(month+"월은 여름입니다");
		    break;
        case 7:
		    System.out.print(month+"월은 여름입니다");
		    break;
        case 8:
		    System.out.print(month+"월은 여름입니다");
		    break;
        case 9:
		    System.out.print(month+"월은 가을입니다");
		    break;
        case 10:
		    System.out.print(month+"월은 가을입니다");
		    break;
        case 11:
		    System.out.print(month+"월은 가을입니다");
		    break;
    }
    }
}
