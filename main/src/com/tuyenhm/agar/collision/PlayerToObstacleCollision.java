/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuyenhm.agar.collision;

import engine.Sprite;
import engine.BasicCollisionGroup;
import java.util.logging.Logger;

/**
 *
 * @author tuyenhuynh
 */
public class PlayerToObstacleCollision extends BasicCollisionGroup {
    private static final Logger logger = Logger.getLogger(PlayerToPlayerCollision.class.getName());

    @Override
    public void collided(Sprite playerSprite, Sprite obstacle) {
        com.tuyenhm.agar.PetriDish sprite = (com.tuyenhm.agar.PetriDish)(playerSprite); 
        sprite.setCollision(true);
        playerSprite.setSpeed(-sprite.getHorizontalSpeed(), -sprite.getVerticalSpeed());
        
    }
}
