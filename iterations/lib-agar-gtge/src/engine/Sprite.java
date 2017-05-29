package engine;

import java.awt.image.BufferedImage;


/**
 * Sprite - object, what can move and play a role in game.
 */
public class Sprite extends com.golden.gamedev.object.Sprite {
    
    /**
     *  Constructor.
     */
    public Sprite() {                
        super();
    }
    
    /**
     * Create new sprite and set image and position for it.
     * @param bi image.
     * @param x x position.
     * @param y y position.
     */
    public Sprite(BufferedImage bi, int x, int y) {
        super(bi, x, y);
    }
    
    /**
     * Set image for sprite.
     * @param bi image.
     */
    @Override
    public void setImage(BufferedImage bi) {
        super.setImage(bi);
    }
    
    /**
     * Update sprite.
     * @param elapsed elapsed time.
     */
    @Override
    public void update(long elapsed) {
        super.update(elapsed);
    }
    
    /**
     * Render sprite.
     * @param g graphic. 
     */
    public void render(Graphics2D g) {
        super.render(g.get());
    }
    
    /**
     * Set x position for sprite.
     * @param x position in Ox.
     */
    @Override
    public void setX(double x) {
        super.setX(x);
    }

    /**
     * Set y position for sprite.
     * @param y position in Oy.
     */
    @Override
    public void setY(double y) {
        super.setY(y);
    }

    /**
     * Get x position of sprite.
     * @return position in Ox.
     */
    @Override
    public double getX() {
        return super.getX();
    }

    /**
     * Get y position of sprite.
     * @return position in Oy.
     */
    @Override
    public double getY() {
        return super.getY();
    }
    
    /**
     * Set horizontal speed for sprite.
     * @param v speed in Ox.
     */
    @Override
    public void setHorizontalSpeed(double v) {
        super.setHorizontalSpeed(v);
    }

    /**
     * Set vertical speed for sprite.
     * @param v speed in Oy.
     */
    @Override
    public void setVerticalSpeed(double v) {
        super.setVerticalSpeed(v);
    }
    
    /**
     * Get horizontal speed.
     * @return speed in Ox.
     */
    @Override
    public double getHorizontalSpeed() {
        return super.getHorizontalSpeed();
    }

    /**
     * Get vertical speed.
     * @return speed in Oy.
     */
    @Override
    public double getVerticalSpeed() {
        return super.getVerticalSpeed();
    }
    
    /**
     * Get width of sprite.
     * @return width of sprite.
     */
    @Override
    public int getWidth() {        
        return super.getWidth();
    }
    
    /**
     * Get old position in Ox.
     * @return  position in Ox.
     */
    @Override    
    public double getOldX() {
        return super.getOldX();
    }
    
    /**
     * Get old position in Oy.
     * @return position in Oy.
     */
    @Override    
    public double getOldY() {
       return super.getOldY();
    }
    
    /**
     * Mark sprite active.
     * @param b status.
     */
    @Override    
    public void setActive(boolean b) {
       super.setActive(b);
    }    
    
    /**
     * Set speed for sprite.
     * @param d1 speed in Ox.
     * @param d2 speed in Oy.
     */
    @Override
    public void setSpeed(double d1, double d2) {
        super.setSpeed(d1, d2);
    }
    
    /**
     * Check if sprite is active.
     * @return status.
     */
    @Override
    public boolean isActive() {
        return super.isActive();
    }
    
    /**
     * Set background for sprite.
     * @param b image background.
     */
    public void setBackground(ImageBackground b) {
        super.setBackground(b);    
    }    
}
