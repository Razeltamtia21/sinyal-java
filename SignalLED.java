import java.util.Timer;
import java.util.TimerTask;

public class SignalLED {
    private static boolean isOn = false;

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                isOn = !isOn;
                System.out.println("Sinyal: " + (isOn ? "ON" : "OFF"));
            }
        };


        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
