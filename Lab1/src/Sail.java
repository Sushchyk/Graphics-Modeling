package src;

import javafx.scene.shape.Polygon;

public class Sail extends MyShape{

    private Double[] shapePoints;

    Sail(String color, Double[] points) {
        super(color);
        this.shapePoints = points;
    }

    @Override
    public Polygon build() {
        return getPolygon(this.shapePoints);
    }
}
