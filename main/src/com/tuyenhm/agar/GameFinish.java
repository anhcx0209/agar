/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuyenhm.agar;

import engine.ImageBackground;
import java.awt.Color;
import java.awt.Font;
import engine.Graphics2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author tuyenhuynh
 */
public class GameFinish extends engine.GameObject {
    
    private ImageBackground background; 
    
    public GameFinish(engine.GameEngine parent) {
       super(parent);
    }

    @Override
    public void update(long elapsedTime) {
       background.update(elapsedTime);
        if (click()) {
          getParent().setNextGameID(0);
          finish();
       }
    }

    @Override
    public void initResources() {
        try{
            background = new ImageBackground(ImageIO.read(new File("resources/background.jpg")));
            background.setClip(0, 0, GamePlay.dimensions().width, GamePlay.dimensions().height);
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void render(java.awt.Graphics2D gd) {
        Graphics2D engine_g2d = new Graphics2D(gd);
        background.render(engine_g2d);
        
        
        gd.setFont(new Font("Arial", Font.BOLD, 20));
        gd.setColor(Color.RED);
        gd.drawString("CLICK INTO SCREEN TO START NEW GAME" , 170,300 );
        
    }
    
    public void renderInContext(Graphics2D gd){        
        background.render(gd);
    }

 }
 