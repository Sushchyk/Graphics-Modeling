import java.util.HashMap;

class PointsProvider {

    final static double[][] boatPoints;
    final static double[][] sailPoints;
    final static HashMap<String, Integer> boomPoints;
    final static private Double windowWidth;
    final static int BorderThickness = 4;
    final static int BorderMargin = 10;

    static {
        double pictureWidth = 400.0;

        windowWidth = 500.0;

        Double pictureStartX = (windowWidth - pictureWidth) / 2;
        Double pictureStartY = 0.0;

        boatPoints = new double[][]{
                { pictureStartX + 0.0, 200.0 },
                { pictureStartX + 160.0, 300.0 },
                { pictureStartX + 290.0, 300.0 },
                { pictureStartX + 400.0, 210.0 },
                { pictureStartX + 300.0, 376.0 },
                { pictureStartX + 145.0, 376.0 }
        };

        sailPoints = new double[][] {
                { pictureStartX + 150.0, pictureStartY + 60.0 },
                { pictureStartX + 270.0, pictureStartY + 60.0 },
                { pictureStartX + 260.0, pictureStartY + 120.0 },
                { pictureStartX + 280.0, pictureStartY + 180.0 },
                { pictureStartX + 145.0, pictureStartY + 175.0 },
                { pictureStartX + 127.0, pictureStartY + 120.0 }
        };

        boomPoints = new HashMap<>();
        boomPoints.put("start_x", pictureStartX.intValue() + 205);
        boomPoints.put("start_y", 177);
        boomPoints.put("height", 124);
        boomPoints.put("width", 10);

    }
}
