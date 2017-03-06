import java.awt.*;

public class ShipSceneBorder implements SceneBorder {

    private Color borderColor;
    private int borderThickness = 0;
    private int borderMargin = 0;
    private final static int DEFAULT_BORDER_MARGIN = 10;
    private final static int DEFAULT_BORDER_SIZE = 4;

    private Dimension frameSize;

    public void setBorderSize(int thickness, int margin) {
        this.borderThickness = thickness;
        this.borderMargin = margin;
    }

    public ShipSceneBorder(Dimension frameSize, Color color) {
        this.borderColor = color;
        this.frameSize = frameSize;
    }

    private BasicStroke getBorderStroke() {
        return new BasicStroke(DEFAULT_BORDER_SIZE,
                BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
    }

    @Override
    public void drawBorder(Graphics2D g2d) {
        g2d.setStroke(getBorderStroke());
        g2d.setColor(this.borderColor);

        g2d.drawRect(DEFAULT_BORDER_MARGIN, DEFAULT_BORDER_MARGIN,
                frameSize.width - 2 * DEFAULT_BORDER_MARGIN,
                frameSize.height - 2 * DEFAULT_BORDER_MARGIN);
    }
}