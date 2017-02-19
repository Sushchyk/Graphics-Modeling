import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Sail extends MyShape{

    private Double[] shapePoints;

    Sail(String color, Double[] points) {
        super(color);
        this.shapePoints = points;
    }

    @Override
    public Polygon build() {
        Polygon sail = new Polygon();
        sail.getPoints().addAll(this.shapePoints);
        sail.setFill(Color.valueOf(this.shapeColor));
        return sail;
    }
}
