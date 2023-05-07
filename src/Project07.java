import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project07 {
    public static void main(String[] args) {

        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1~10):");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] rottoNumber = new int[6];
        int[][] myNumber = new int[count][6];

        for (int i=0; i< count; i++){
            for (int j=0; j<6; j++){
                Random random = new Random();
                int randomNumber = random.nextInt(45)+1;
                myNumber[i][j] = randomNumber;
                for (int k=0; k<j; k++){
                    if(myNumber[i][j]==myNumber[i][k]) {
                        j--;
                    }
                    if(myNumber[i][j] < myNumber[i][k]){
                        int tempNumber = myNumber[i][j];
                        myNumber[i][j] = myNumber[i][k];
                        myNumber[i][k] = tempNumber;
                    }
                }
            }
            System.out.println(String.format("%c\t%02d,%02d,%02d,%02d,%02d,%02d",65+i,myNumber[i][0],myNumber[i][1],myNumber[i][2],myNumber[i][3],myNumber[i][4],myNumber[i][5]));
        }

        for (int i=0; i<6; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(45)+1;
            rottoNumber[i] = randomNumber;
            for (int j=0; j<i; j++){
                if(rottoNumber[i]==rottoNumber[j]) {
                    i--;
                }
                if(rottoNumber[i] < rottoNumber[j]){
                    int tempNumber = rottoNumber[i];
                    rottoNumber[i] = rottoNumber[j];
                    rottoNumber[j] = tempNumber;
                }
            }
        }

        System.out.println("[로또 발표]");
        System.out.println(String.format("\t%02d,%02d,%02d,%02d,%02d,%02d",rottoNumber[0],rottoNumber[1],rottoNumber[2],rottoNumber[3],rottoNumber[4],rottoNumber[5]));

        System.out.println("[내 로또 결과]");
        for (int i=0; i< myNumber.length; i++){
            int numberCheck = 0;
            for (int j=0; j<rottoNumber.length;j++){
                for(int k=0; k<rottoNumber.length;k++){
                    if(myNumber[i][j] == rottoNumber[k]){
                        numberCheck++;
                    }
                }

            }
            System.out.println(String.format("%c\t%02d,%02d,%02d,%02d,%02d,%02d => %d개 일치",65+i,myNumber[i][0],myNumber[i][1],myNumber[i][2],myNumber[i][3],myNumber[i][4],myNumber[i][5],numberCheck));
        }
    }
}
