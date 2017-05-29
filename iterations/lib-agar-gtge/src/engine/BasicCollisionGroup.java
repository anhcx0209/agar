package engine;

/**
 * Group for detecting collision between 2 group of sprite.
 */
public class BasicCollisionGroup extends com.golden.gamedev.object.collision.BasicCollisionGroup {
    
    /**
     * Default Constructor.
     */
    public BasicCollisionGroup() {
        super();
        this.pixelPerfectCollision = true;
    }
    
    /**
     * Check if has collision between 2 group.
     */
    @Override
    public void checkCollision() {
        super.checkCollision();
    }
    
    /**
     * Set two group to check collision.
     * @param s1 first sprite group
     * @param s2 second sprite group
     */
    public void setCollisionGroup(SpriteGroup s1, SpriteGroup s2) {
        super.setCollisionGroup(s1, s2);
    }
    
    /**
     * Solve collision.
     * @param first first sprite
     * @param second second sprite
     */
    @Override
    public void collided(com.golden.gamedev.object.Sprite first, com.golden.gamedev.object.Sprite second) {
        this.collided((Sprite)first, (Sprite)second);
    }
}