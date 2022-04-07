public class ex_15switch_case {
    public static void main(String[] args) {
    int num = 40;

    // switch(기준값)
    // case value : -> 기준값이랑 value랑 비교해서 같다면 실행시킨다
     
    switch(num) {
    case 10:
        System.out.println("10이 들어있습니다!");
        break;
    case 20:
        System.out.println("20이 들어있습니다!");
        break;
    case 30:
        System.out.println("30이 들어있습니다!");
        break;
    default: // 다중 if문의 else에 해당됨
        System.out.println("10,20,30이 아닙니다");

    }
    
    }
}
