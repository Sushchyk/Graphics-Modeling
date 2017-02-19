import java.util.HashMap;

class PointsProvider {

    final static Double[] sailPoints;
    final static HashMap<String, Double> boomPoints;
    final static Double[] boatPoints;
    final static Double windowHeight;
    final static Double windowWidth;

    static {
        windowHeight = 500.0;
        windowWidth = 500.0;

        sailPoints = new Double[] {
                200.0, 60.0,
                320.0, 60.0,
                310.0, 120.0,
                330.0, 180.0,
                195.0, 175.0,
                183.0, 120.0
        };


        boomPoints = new HashMap<>() ;
        boomPoints.put("start_x", 255.0);
        boomPoints.put("start_y", 100.0);
        boomPoints.put("height", 200.0);
        boomPoints.put("width", 10.0);


        boatPoints = new Double[] {
                50.0, 200.0,
                200.0, 300.0,
                300.0, 300.0,
                450.0, 210.0,
                330.0, 376.0,
                195.0, 376.0
        };
    }
}
