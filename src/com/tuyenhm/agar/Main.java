/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuyenhm.agar;

import com.golden.gamedev.GameLoader;
import java.awt.Dimension;

/**
 *
 * @author tuyenhuynh
 */
public class Main {
    
    public static void main(String[] args) {
        AgarGame game = new AgarGame(); 
        GameLoader gameLoader = new GameLoader();
        gameLoader.setup(game, new Dimension(768,576), false);
        gameLoader.start();
    }
    
}
