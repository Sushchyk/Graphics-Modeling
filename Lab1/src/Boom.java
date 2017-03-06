package src;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import java.util.HashMap;

public class Boom extends MyShape {

    private HashMap<String, Double> boomPoints;

    Boom(String color, HashMap<String, Double> points) {
        super(color);
        this.boomPoints = points;
    }

    @Override
    public Line build() {

        Line boomLine = new Line();

        Double boomLineStartX = this.boomPoints.get("start_x");
        Double boomLineStartY = this.boomPoints.get("start_y");
        Double boomLineLength = this.boomPoints.get("height");
        Double boomLineStroke = this.boomPoints.get("width");

        boomLine.setStartX(boomLineStartX);
        boomLine.setStartY(boomLineStartY);
        boomLine.setEndX(boomLineStartX);
        boomLine.setEndY(boomLineStartY + boomLineLength);
        boomLine.setStrokeWidth(boomLineStroke);
        boomLine.setStroke(Color.valueOf(this.shapeColor));
        return boomLine;
    }
}
