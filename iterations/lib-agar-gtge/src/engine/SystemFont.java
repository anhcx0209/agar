package engine;

import java.awt.Font;

/**
 * System font for write text.
 */
public class SystemFont extends com.golden.gamedev.object.font.SystemFont {
    
    /**
     * Constructor.
     * @param fontName font name.
     * @param attrs attributes.
     * @param size font size.
     * @param clr  color.
     */
    public SystemFont(String fontName, int attrs, int size, java.awt.Color clr) {
        super(new Font(fontName, attrs, size), clr);
    }
    
    /**
     * Render.
     * @param g context.
     * @param data data.
     * @param x x coordinate of position.
     * @param y y coordinate of position.
     */
    public void drawString(Graphics2D g, String data, int x, int y) {
        super.drawString(g.get(), data, x, y);
    }
}
