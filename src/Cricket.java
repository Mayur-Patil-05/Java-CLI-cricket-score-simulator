import java.util.Scanner;

public class Cricket {
    Scanner sc = new Scanner(System.in);
    int runs;
    int runScored;
    int overs;

    Cricket(){
        System.out.println("How many overs of match ?");
        overs = sc.nextInt();
        System.out.println("Match started...");
        for (int i = 1; i <= overs ; i++) {
            System.out.println(i+ " over started");
            for (int j = 1; j <= 6; j++) {
                System.out.println("Ball " +j+ "- Runs scored (0/1/2/4/6) ?");
                run();
            }
        }
        System.out.println("Total runs in this innings = "+runs);
    }

    public void run(){
        runScored = sc.nextInt();
        if (runScored == 0){
            System.out.println("Dot ball");
        }
        else if (runScored == 1){
            System.out.println("Single run");
            runs++;
        } else if (runScored==2) {
            System.out.println("Double runs");
            runs+=2;
        }
        else if (runScored==3) {
            System.out.println("Three run");
            runs+=3;
        }
        else if (runScored==4) {
            System.out.println("Four");
            runs+=4;
        }
        else if (runScored==6) {
            System.out.println("Six");
            runs+=6;
        }
    }
}
