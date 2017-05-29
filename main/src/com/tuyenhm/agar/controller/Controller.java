package com.tuyenhm.agar.controller;
import com.tuyenhm.agar.GamePlay;
import com.tuyenhm.agar.PetriDish;

/**
 *
 * @author tuyenhuynh
 */
public class Controller {
    protected PetriDish sprite; 
    protected GamePlay game; 
    
    public Controller(GamePlay game, PetriDish sprite) {
        this.game = game; 
        this.sprite = sprite; 
    }
    
    public void update(long elapsedTime){
        if(sprite.getX() <= 0 && sprite.getHorizontalSpeed() < 0) {
            sprite.setHorizontalSpeed(0);
        }
        if(sprite.getX() + sprite.getWidth() > game.TOTAL_WIDTH && sprite.getHorizontalSpeed() >0) {
            sprite.setHorizontalSpeed(0);
        }
        if(sprite.getY() <= 0 && sprite.getVerticalSpeed() < 0) {
            sprite.setVerticalSpeed(0);
        }
        if(sprite.getY() + sprite.getWidth() > game.TOTAL_HEIGHT && sprite.getVerticalSpeed() >0) {
            sprite.setVerticalSpeed(0);
        }
    }   
}
