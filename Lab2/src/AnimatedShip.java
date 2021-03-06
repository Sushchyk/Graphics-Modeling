import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedShip extends JPanel implements ActionListener {

    private final static int TIMER_DELAY = 20;
    private final static int INITIAL_DELAY = 500;
    private final static float DEFAULT_DELTA = 0.01f;

    private Color backgroundColor;
    private Dimension frameSize;

    private final Ship ship;
    private Timer timer;
    private SceneBorder sceneBorder;

    private float angle = 0f;
    private float scale = 1f;
    private float scaleDelta = -DEFAULT_DELTA;

    public AnimatedShip(Ship ship, Dimension frameSize, Color backgroundColor) {
        this.ship = ship;
        this.frameSize = frameSize;
        this.backgroundColor = backgroundColor;
        initTimer();
    }

    private void initTimer() {
        timer = new Timer(TIMER_DELAY, this);
        timer.setInitialDelay(INITIAL_DELAY);
        timer.start();
    }

    @Override
    public void paint(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;

        setBackgroundToDefault(g2d);

        sceneBorder = getSceneBorder();

        if(sceneBorder != null) {
            sceneBorder.drawBorder(g2d);
        }

        initAnimation(g2d);

        ship.paint(graphics);
    }

    private void initAnimation(Graphics2D g2d) {
        g2d.rotate(angle, 250, 250);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, scale));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        scale += scaleDelta;
        angle += DEFAULT_DELTA;

        if(scale < DEFAULT_DELTA || scale > 1f - DEFAULT_DELTA) {
            scaleDelta = -scaleDelta;
        }

        repaint();
    }

    private void setBackgroundToDefault(Graphics2D graphics) {
        graphics.setBackground(this.backgroundColor);
        graphics.clearRect(0, 0, frameSize.width, frameSize.height);
    }

    public SceneBorder getSceneBorder() {
        return sceneBorder;
    }

    public void setSceneBorder(SceneBorder sceneBorder) {
        this.sceneBorder = sceneBorder;
    }
}