package engine;

import com.golden.gamedev.GameObject;

/**
 * Game Engine.
 */
public class GameEngine extends com.golden.gamedev.GameEngine {
    
    /**
     *  Default constructor.
     */
    public GameEngine() { 
        super();
    }
        
    /**
     *  Start game engine.
     */
    public void startEngine() {
        super.start();
    }
    
    /**
     * Set next game id.
     * @param i next game id.
     */
    public void setNextGameID(int i) {
        super.nextGameID = i;
    }
    
    /**
     * Get next game id.
     * @return id of next game.
     */
    public int getNextGameID() {
        return super.nextGameID;
    }

    /**
     * Get i-th game.
     * @param i id of game.
     * @return game object.
     */
    @Override
    public GameObject getGame(int i) {
       return null;
    }
    
    
}
