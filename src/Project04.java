import java.util.Random;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        String RRN = "";

        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        Scanner scanner1 = new Scanner(System.in);
        int year =  scanner1.nextInt();

        System.out.print("출생월을 입력해 주세요.(mm):");
        Scanner scanner2 = new Scanner(System.in);
        int month =  scanner2.nextInt();

        System.out.print("출생일을 입력해 주세요.(dd):");
        Scanner scanner3 = new Scanner(System.in);
        int day =  scanner3.nextInt();

        System.out.print("성별을 입력해 주세요.(m/f):");
        Scanner scanner4 = new Scanner(System.in);
        String genderAt =  scanner4.nextLine();

        RRN = String.format("%s%02d%02d-",(""+year).substring(2),month,day);

        if(genderAt.equals("m")){
            RRN += "3";
        }else if(genderAt.equals("f")){
            RRN += "4";
        }else{
            return;
        }
        Random random = new Random();
        RRN += String.format("%06d",random.nextInt(100000));
        System.out.println(RRN);
    }
}
