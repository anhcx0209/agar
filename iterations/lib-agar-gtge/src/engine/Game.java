package engine;

/**
 * Main class of game.
 */
public class Game extends com.golden.gamedev.Game {
    
    /**
     * Set initial resources.
     */
    @Override
    public void initResources() {        
        
    }
    
    /**
     * Change game after a elapsed time.
     * @param elapsedTime time between 2 call of update.
     */
    @Override
    public void update(long elapsedTime) {        
        
    }
    
    /**
     * Render game.
     * @param g 
     */
    @Override
    public void render(java.awt.Graphics2D g) {
        engine.Graphics2D ctx = new engine.Graphics2D(g);
        renderInContext(ctx);
    }
    
    /**
     * Render context.
     * @param g 
     */    
    public void renderInContext(engine.Graphics2D g) {
        
    }
}
