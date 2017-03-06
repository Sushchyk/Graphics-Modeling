import sun.rmi.runtime.Log;

import javax.swing.*;
import java.awt.*;


public class Ship extends JPanel {

    private BaseFigure[] shipParts;

    public Ship(BaseFigure[] figures) {
        this.shipParts = figures;
    }

    @Override
    public void paint(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;
        initRenderingHints(g2d);

        for(BaseFigure shipPart : this.shipParts) {
            shipPart.draw(g2d);
        }
    }
    private void initRenderingHints(Graphics2D graphics) {
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        graphics.setRenderingHints(rh);
    }
}
