import java.awt.*;

public class ShipSceneBorder implements SceneBorder {

    private Color borderColor;
    private Dimension frameSize;

    private int borderThickness = 0;
    private int borderMargin = 0;


    public void setBorderSize(int thickness, int margin) {
        this.borderThickness = thickness;
        this.borderMargin = margin;
    }

    public ShipSceneBorder(Dimension frameSize, Color color) {
        this.borderColor = color;
        this.frameSize = frameSize;
    }

    private BasicStroke getBorderStroke() {
        return new BasicStroke(this.borderThickness,
                BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
    }

    @Override
    public void drawBorder(Graphics2D g2d) {
        g2d.setStroke(getBorderStroke());
        g2d.setColor(this.borderColor);

        g2d.drawRect(this.borderMargin, this.borderMargin,
                frameSize.width - 2 * this.borderMargin,
                frameSize.height - 2 * this.borderMargin);
    }
}