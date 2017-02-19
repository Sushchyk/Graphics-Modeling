import java.util.HashMap;

class PointsProvider {

    final static Double[] sailPoints;
    final static HashMap<String, Double> boomPoints;
    final static Double[] boatPoints;
    final static Double windowHeight;
    final static Double windowWidth;

    static {
        Double pictureWidth = 400.0;
        Double pictureHeight = 400.0;
        windowHeight = 500.0;
        windowWidth = 500.0;
        Double pictureStartX = (windowWidth - pictureWidth) / 2;
        Double pictureStartY = 0.0;
        sailPoints = new Double[] {
                pictureStartX + 150.0, pictureStartY + 60.0,
                pictureStartX + 270.0, pictureStartY + 60.0,
                pictureStartX + 260.0, pictureStartY + 120.0,
                pictureStartX + 280.0, pictureStartY + 180.0,
                pictureStartX + 145.0, pictureStartY + 175.0,
                pictureStartX + 127.0, pictureStartY + 120.0
        };

        boomPoints = new HashMap<>() ;
        boomPoints.put("start_x", pictureStartX + 205.0);
        boomPoints.put("start_y", 100.0);
        boomPoints.put("height", 200.0);
        boomPoints.put("width", 10.0);


        boatPoints = new Double[] {
                pictureStartX + 0.0, 200.0,
                pictureStartX + 160.0, 300.0,
                pictureStartX + 290.0, 300.0,
                pictureStartX + 400.0, 210.0,
                pictureStartX + 300.0, 376.0,
                pictureStartX + 145.0, 376.0
        };
    }
}
