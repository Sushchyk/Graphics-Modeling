import java.awt.*;

public class ColorsProvider {

    public final static Color BackgroundColor;
    public final static Color BoomColor;
    public final static Color BoatColor;
    public final static Color SailColor;
    public final static Color BorderColor;
    public final static Color BoomGradientColor;

    static {
        BackgroundColor = new Color(0xFF, 0xFF, 0x80);
        BoomColor = new Color(0x00, 0x00, 0xFF);
        BoatColor = new Color(0x80, 0x40, 0x00);
        SailColor = new Color(0xC0, 0xC0, 0xC0);
        BorderColor = new Color(0x00, 0x00, 0x00);
        BoomGradientColor = new Color(0xFF, 0x00, 0x00);
    }
}
