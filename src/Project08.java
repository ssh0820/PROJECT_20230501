import java.util.Scanner;

public class Project08 {
    public static void main(String[] args) {

        System.out.println("[과세금 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        Scanner scanner = new Scanner(System.in);
        long cost = scanner.nextLong();
        long rateSum = 0;
        long costSum = 0;
        long maxCost = 0;
        long rateCost = 0;
        int rate = 1;

        if(cost > 0) {
            rate = 6;
        }
        if(cost > 12000000){
            maxCost = 12000000;
            System.out.println(String.format("%d * %d%% =\t\t%d",maxCost,rate,maxCost*rate/100));
            costSum += maxCost*rate/100;
            rate = 15;
            rateCost = 12000000;
        }
        if(cost > 46000000){
            maxCost = 34000000;
            System.out.println(String.format("%d * %d%% =\t%d",maxCost,rate,maxCost*rate/100));
            costSum += maxCost*rate/100;
            rate = 24;
            rateCost = 46000000;
        }
        if(cost > 88000000){
            maxCost = 42000000;
            System.out.println(String.format("%d * %d%% =\t%d",maxCost,rate,maxCost*rate/100));
            costSum += maxCost*rate/100;
            rate = 35;
            rateCost = 88000000;
        }
        if(cost > 150000000){
            maxCost = 62000000;
            System.out.println(String.format("%d * %d%% =\t%d",maxCost,rate,maxCost*rate/100));
            costSum += maxCost*rate/100;
            rate = 38;
            rateCost = 150000000;
        }
        if(cost > 300000000){
            maxCost = 150000000;
            System.out.println(String.format("%d * %d%% =\t%d",maxCost,rate,maxCost*rate/100));
            costSum += maxCost*rate/100;
            rate = 40;
            rateCost = 300000000;
        }
        if(cost > 500000000){
            maxCost = 200000000;
            System.out.println(String.format("%d * %d%% =\t%d",maxCost,rate,maxCost*rate/100));
            costSum += maxCost*rate/100;
            rate = 42;
            rateCost = 500000000;
        }
        if(cost > 1000000000){
            maxCost = 500000000;
            System.out.println(String.format("%d * %d%% =\t%d",maxCost,rate,maxCost*rate/100));
            costSum += maxCost*rate/100;
            rate = 45;
            rateCost = 1000000000;
        }
        System.out.println(String.format("%d * %d%% =\t\t%d",(cost-rateCost),rate,(cost-rateCost)*rate/100));
        costSum += (cost-rateCost)*rate/100;
        rateSum = cost*rate/100-costSum;

        System.out.println(String.format("[세율에 의한 세금]:\t\t\t%d",costSum));
        if(cost > 12000000){
            System.out.println(String.format("[누진공제 계산에 의한 세금]:\t%d",cost*rate/100-rateSum));
        }else{
            System.out.println(String.format("[누진공제 계산에 의한 세금]:\t-"));
        }


    }
}
