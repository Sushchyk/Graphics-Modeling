import java.awt.*;

public class ShipSceneBorder implements SceneBorder {

    private Color borderColor;

    private final static int DEFAULT_BORDER_MARGIN = 10;
    private final static int DEFAULT_BORDER_SIZE = 4;

    private Dimension frameSize;

    public ShipSceneBorder(Dimension frameSize, Color color) {
        this.borderColor = color;
        this.frameSize = frameSize;
    }

    @Override
    public void drawBorder(Graphics2D g2d) {
        BasicStroke miterStroke = new BasicStroke(DEFAULT_BORDER_SIZE,
                BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
        g2d.setStroke(miterStroke);

        g2d.setColor(this.borderColor);

        g2d.drawRect(DEFAULT_BORDER_MARGIN, DEFAULT_BORDER_MARGIN,
                frameSize.width - 2 * DEFAULT_BORDER_MARGIN,
                frameSize.height - 2 * DEFAULT_BORDER_MARGIN);
    }
}