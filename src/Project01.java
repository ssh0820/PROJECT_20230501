
public class Project01 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for (int i =1; i < 10; i++){
            for (int j=1; j < 10; j++){
                System.out.printf("%02d X %02d = ",j,i);
                if((""+j*i).length() > 1) {
                    System.out.printf("%d", (j * i));
                }else{
                    System.out.printf("%02d", (j * i));
                }
                System.out.print("\t\t");
            }
            System.out.print("\n");
        }
    }
}
