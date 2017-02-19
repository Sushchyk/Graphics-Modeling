import javafx.scene.shape.Shape;

public abstract class MyShape {
    protected String shapeColor;

    MyShape(String color) {
        this.shapeColor = color;
    }

    abstract public Shape build();
}
