package com.tuyenhm.agar.controller;

import com.tuyenhm.agar.GamePlay;
import com.tuyenhm.agar.GameMath;
import com.tuyenhm.agar.PetriDish;
import java.util.logging.Logger;

/**
 *
 * @author tuyenhuynh
 */
public class PlayerController extends Controller{
    private static final Logger logger = Logger.getLogger(PlayerController.class.getName());
    public PlayerController(GamePlay game, PetriDish sprite) {
        super(game, sprite); 
    }
    
    @Override
    public void update(long elapsedTime) {
        int angle = GameMath.angle(sprite.getPosition(), game.mousePosition());
        sprite.setDirection(angle);
    }
}
