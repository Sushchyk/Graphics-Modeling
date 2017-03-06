import javax.swing.*;
import java.awt.*;

public class MainApplication {
    private final static String FRAME_HEADER = "Lab2";
    private final static int FRAME_WIDTH = 500;
    private final static int FRAME_HEIGHT = 500;
    private final static int TITLEBAR_HEIGHT = 27;

    public static void main(String[] args) {

        JFrame frame = new JFrame(FRAME_HEADER);

        initializeFrame(frame);

        Dimension availableSize = getAvailableSize(frame);

        BaseFigure boat = new PolygonFigure(ColorsProvider.BoatColor, PointsProvider.boatPoints);
        BaseFigure sail = new PolygonFigure(ColorsProvider.SailColor, PointsProvider.sailPoints);
        BaseFigure boom = new RectangleFigure(ColorsProvider.BoomColor, ColorsProvider.BoomGradientColor,
                PointsProvider.boomPoints);

        BaseFigure[] shipParts = {boom, sail, boat};
        Ship ship = new Ship(shipParts);

        AnimatedShip animatedShip = new AnimatedShip(ship, availableSize, ColorsProvider.BackgroundColor);

        SceneBorder sceneBorder = new ShipSceneBorder(availableSize, ColorsProvider.BorderColor);
        sceneBorder.setBorderSize(PointsProvider.BorderThickness, PointsProvider.BorderMargin);
        animatedShip.setSceneBorder(sceneBorder);

        frame.add(animatedShip);

        frame.setVisible(true);
    }

    private static void initializeFrame(JFrame frame) {

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    private static Dimension getAvailableSize(JFrame frame) {
        Dimension size = frame.getSize();
        Insets insets = frame.getInsets();

        int maxHeight = size.height - insets.top - insets.bottom - TITLEBAR_HEIGHT;
        int maxWidth = size.width - insets.left - insets.right;

        return new Dimension(maxWidth, maxHeight);
    }
}
