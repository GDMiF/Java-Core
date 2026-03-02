import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main65 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of second to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask tast = new TimerTask() {

            int count = response;

            @Override
            public void run() {

                System.out.println(count);
                count --;

                if(count <= 0){
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }

            }
        };

        timer.scheduleAtFixedRate(tast, 0, 1000);

        scanner.close();
    }
}
