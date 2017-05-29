package engine;

import java.awt.image.BufferedImage;

/**
 * Background of game.
 */
public class ImageBackground extends com.golden.gamedev.object.background.ImageBackground {

    /**
     * Constructor.
     * @param bi image.
     */
    public ImageBackground(BufferedImage bi) {
        super(bi);
    }
    
    /**
     * Set image for background object.
     * @param bi new image.
     */
    @Override
    public void setImage(BufferedImage bi) {
        super.setImage(bi);        
    }
    
    /**
     * Clip image to fit background.
     * @param x
     * @param y
     * @param width
     * @param height 
     */
    @Override
    public  void setClip(int x, int y, int width, int height) {
        super.setClip(x, y, width, height);
    }
    
    /**
     * Setup total clip image.
     * @param totalWidth
     * @param totalHeight 
     */
    public void setTotalClip(int totalWidth, int totalHeight) {
        
    }
    
    /**
     * Update background image.
     * @param elapsed 
     */
    @Override
    public void update(long elapsed) {
        super.update(elapsed);
    }
    
    /**
     * Render background image.
     * @param g 
     */
    public void render(Graphics2D g) {
        super.render(g.get());
    }
    
    /**
     * Set sprite to center of background.
     * @param s 
     */
    public void setToCenter(Sprite s) {
        super.setToCenter(s);
    }
    
    /**
     * Return position x of background.
     * @return 
     */
    @Override
    public double getX() {
        return super.getX();
    }

    /**
     * Return position y of background.
     * @return 
     */    
    @Override
    public double getY() {
        return super.getY();
    }
}
