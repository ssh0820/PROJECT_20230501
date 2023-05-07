import java.time.LocalDate;
import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {

        int day = 0;

        System.out.println("[달력 출력 프로그램]");

        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        Scanner scanner1 = new Scanner(System.in);
        int year =  scanner1.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        Scanner scanner2 = new Scanner(System.in);
        int month =  scanner2.nextInt();

        System.out.println(String.format("[%d년 %02d월]",year,month));
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        LocalDate localDate = LocalDate.of(year,month,1);
        // 공백 개수
        day = localDate.getDayOfWeek().getValue();

        for(int i = 0; i < day % 7; i++){
            System.out.print("\t");
        }

        for(int i=1; i<=localDate.lengthOfMonth();i++){
            System.out.printf("%02d\t",i);
            day++;

            if (day % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
