import java.awt.*;

public class ColorsProvider {

    public final static Color BackgroundColor;
    public final static Color BoomColor;
    public final static Color BoatColor;
    public final static Color SailColor;

    static {
        BackgroundColor = new Color(0xFF, 0xFF, 0x80);
        BoomColor = new Color(0x00, 0x00, 0x00);
        BoatColor = new Color(0x80, 0x40, 0x00);
        SailColor = new Color(0xC0, 0xC0, 0xC0);
    }
}
