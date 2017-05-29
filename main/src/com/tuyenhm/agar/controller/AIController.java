/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuyenhm.agar.controller;

import com.tuyenhm.agar.GamePlay;
import com.tuyenhm.agar.GameMath;
import com.tuyenhm.agar.PetriDish;
import java.awt.Point;

/**
 *
 * @author tuyenhuynh
 */
public class AIController extends Controller{
    
    PetriDish playerSprite; 
    
    static final int MAX_DISTANCE = 240; 
    
    /**
     *
     * @author tuyenhuynh
     * @param game
     * @param bot
     * @param playerSprite
     */
    public AIController(GamePlay game, PetriDish bot, PetriDish playerSprite) {
        super(game, bot);
        this.playerSprite = playerSprite; 
        int angle = GameMath.angle(sprite.getPosition(), playerSprite.getPosition()); 
        bot.setDirection(angle);
    }
    
    @Override
    public void update(long elapsedTime) {
        Point playerPos = playerSprite.getPosition(); 
        Point spritePos = sprite.getPosition(); 
        
        double distance = GameMath.distance(spritePos, playerPos); 
        
        if(distance > AIController.MAX_DISTANCE ) {
            int angle = GameMath.angle(sprite.getPosition(), playerSprite.getPosition());
            sprite.setDirection(angle);
        }
        
    }
    
}
