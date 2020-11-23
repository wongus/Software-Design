import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class Main {

    public static void main(String[] args) {

        // create timer that runs every second
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                // fetch calendar data an set it to display as hours, minutes and seconds
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

                // print the clock-frame
                System.out.print("____________\n" +
                        "| " + sdf.format(cal.getTime()) +
                        " |\n" + "------------"
                );

                // clear the console to make space for the next frame
                System.out.print("\n\n");
            }
        }, 1000, 1000);
    }
}
