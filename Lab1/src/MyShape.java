import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public abstract class MyShape {

    protected String shapeColor;

    MyShape(String color) {
        this.shapeColor = color;
    }

    abstract public Shape build();

    protected Polygon getPolygon(Double[] shapePoints) {
        Polygon polygonShape = new Polygon();
        polygonShape.getPoints().addAll(shapePoints);
        polygonShape.setFill(Color.valueOf(this.shapeColor));
        return polygonShape;
    }



}
