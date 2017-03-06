import java.awt.*;

public abstract class BaseFigure {

    protected Color figureColor;

    BaseFigure(Color color) {
        this.figureColor = color;
    }

    abstract public void draw(Graphics2D graphics);

}
