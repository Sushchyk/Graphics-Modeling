import java.awt.*;
import java.util.HashMap;

public class RectangleFigure extends BaseFigure {

    private HashMap<String, Integer> figurePoints;

    RectangleFigure(Color color, HashMap<String, Integer> points) {
        super(color);
        this.figurePoints = points;
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.setColor(this.figureColor);
        int startX = this.figurePoints.get("start_x");
        int startY = this.figurePoints.get("start_y");
        int width = this.figurePoints.get("width");
        int height = this.figurePoints.get("height");
        graphics.fillRect(startX, startY, width, height);
    }
}
