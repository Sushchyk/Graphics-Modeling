import java.awt.*;
import java.util.HashMap;

public class RectangleFigure extends BaseFigure {

    private HashMap<String, Integer> figurePoints;
    private Color colorForGradient;

    RectangleFigure(Color color, Color colorGradient, HashMap<String, Integer> points) {
        super(color);
        this.figurePoints = points;
        this.colorForGradient = colorGradient;
    }

    public GradientPaint getFigureGradient() {
        return new GradientPaint (5, 5, this.figureColor,
                20, 20, this.colorForGradient, true);
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.setPaint(getFigureGradient());
        int startX = this.figurePoints.get("start_x");
        int startY = this.figurePoints.get("start_y");
        int width = this.figurePoints.get("width");
        int height = this.figurePoints.get("height");
        graphics.fillRect(startX, startY, width, height);
    }
}
