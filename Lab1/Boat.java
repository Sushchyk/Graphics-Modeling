import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Boat extends MyShape {
    private Double[] shapePoints;

    Boat(String color, Double[] points) {
        super(color);
        this.shapePoints = points;
    }
    @Override
    public Polygon build() {
        Polygon boat = new Polygon();
        boat.getPoints().addAll(this.shapePoints);
        boat.setFill(Color.valueOf(this.shapeColor));
        return boat;
    }
}
