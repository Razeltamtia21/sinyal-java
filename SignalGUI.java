import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class SignalGUI extends JPanel {
    private static boolean isOn = false;

    public SignalGUI() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                isOn = !isOn;
                repaint();
            }
        }, 0, 1000);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(isOn ? Color.GREEN : Color.RED);
        g.fillOval(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sinyal GUI");
        SignalGUI signalGUI = new SignalGUI();
        
        frame.add(signalGUI);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
