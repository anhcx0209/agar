package engine;

import java.awt.Dimension;

/**
 * Game loader.
 */
public class GameLoader {
    
    /**
     * Default constructor.
     */
    public GameLoader() {
        m_loader = new com.golden.gamedev.GameLoader();
    }
    
    /**
     * Start game.
     */
    public void start() {
        m_loader.start();
    }
    
    /**
     * Game Loader gtge.
     */
    com.golden.gamedev.GameLoader m_loader;

    /**
     * Set up game loader.
     * @param game game.
     * @param dimension dimension of window.
     * @param b full screen on or off.
     */
    public void setup(GameEngine game, Dimension dimension, boolean b) {
        m_loader.setup(game, dimension, b);
    }
}
