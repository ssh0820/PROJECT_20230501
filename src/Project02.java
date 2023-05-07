import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.print("결재 금액을 입력해 주세요.(금액):");
        Scanner scanner = new Scanner(System.in);

        int cost =  scanner.nextInt();
        int cashBack = (int)(cost * 0.1);

        if (cashBack > 300){
            cashBack = 300;
        }else if((""+cost).length() > 3){
            cashBack = (int)Math.floor(cashBack/100)*100;
        }

        System.out.println(String.format("결재 금액은 %d원이고, 캐시백은 %d원 입니다.",cost,cashBack));

    }
}
