import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class PolygonFigure extends  BaseFigure {

    private double[][] figurePoints;

    PolygonFigure(Color color, double[][] points) {
        super(color);
        this.figurePoints = points;
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.setColor(this.figureColor);
        GeneralPath polygon = new GeneralPath();

        double[] startPoint = this.figurePoints[0];
        polygon.moveTo(startPoint[0], startPoint[1]);

        for(int i = 1; i < this.figurePoints.length; i++) {
            double[] point = this.figurePoints[i];
            polygon.lineTo(point[0], point[1]);
        }

        polygon.closePath();
        graphics.fill(polygon);
    }
}
