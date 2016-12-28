/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuyenhm.agar;

import com.golden.gamedev.GameEngine;
import com.golden.gamedev.GameObject;

/**
 *
 * @author tuyenhuynh
 */
public class AgarGame extends GameEngine{
    
    public GameObject getGame(int GameID) {
       start();
       switch (GameID) {
          case 0:
              return new GameMenu(this);
          case 1: 
             return new Game(this,false);
          case 2:
              return new Game(this,true);
          case 3: 
             return new GameFinishScreen(this);
             
       }
       return null;
    }

}
