import java.awt.*;

public interface SceneBorder {
    void drawBorder(Graphics2D g2d);
    void setBorderSize(int thickness, int margin);
}