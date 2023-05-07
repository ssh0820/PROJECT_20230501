import java.util.Scanner;

public class Project03 {
    public static void main(String[] args) {
        int cost = 0;

        System.out.println("[입장권 계산]");

        System.out.print("나이를 입력해 주세요.(숫자):");
        Scanner scanner1 = new Scanner(System.in);
        int age =  scanner1.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        Scanner scanner2 = new Scanner(System.in);
        int hour =  scanner2.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        Scanner scanner3 = new Scanner(System.in);
        String personAt =  scanner3.nextLine();

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        Scanner scanner4 = new Scanner(System.in);
        String cardAt =  scanner4.nextLine();

        if(hour > 17){
            cost = 4000;
        }else if(age < 13){
            cost = 4000;
        }else if(personAt.equals("y") || cardAt.equals("y")){
            cost = 8000;
        }else{
            cost = 10000;
        }

        if(age > 2) {
            System.out.println(String.format("입장료:%d", cost));
        }else {
            System.out.println("무료 입장입니다.");
        }

    }
}
