package engine;

/**
 * Game Object.
 */
public abstract class GameObject extends com.golden.gamedev.GameObject {
    
    /**
     * Default constructor.
     * @param ge
     */
    public GameObject(GameEngine ge) {
        super(ge);
    }
    
    /**
     * Handle key press action.
     * @param i id of key.
     * @return pressed or not.
     */
    @Override
    public boolean keyPressed(int i) {
        return super.keyPressed(i);
    }
    
    /**
     * Get parent of this game object.
     * @return Game engine.
     */
    public GameEngine getParent() {        
        return (GameEngine)super.parent;
    }
    
    /**
     * Stop this game.
     */
    @Override
    public void finish() {
        super.finish();
    }
    
    /**
     * Handle click.
     * @return boolean
     */
    @Override
    public boolean click() {
        return super.click();    
    }
    
    /**
     * Get x coordinate of mouse position.
     * @return coordinate in Ox.
     */
    @Override
    public int getMouseX() {
        return super.getMouseX();
    }
    
    /**
     * Get y coordinate of mouse position.
     * @return coordinate in Oy.
     */
    @Override
    public int getMouseY() {
        return super.getMouseY();
    }
    
    /**
     * Abstract of initial resource.
     */
    @Override
    public abstract void initResources();
    
    /**
     * Abstract of update.
     * @param l
     */
    @Override
    public abstract void update(long l);
    
    /**
     * Abstract of render.
     * @param gd
     */
    @Override
    public abstract void render(java.awt.Graphics2D gd);    
}
