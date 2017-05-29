package com.tuyenhm.agar;

import engine.GameEngine;
import engine.GameObject;

/**
 *
 * @author tuyenhuynh
 */
public class AgarGameEngine extends GameEngine {
    
    @Override
    public GameObject getGame(int GameID) {       
       switch (GameID) {
          case 0:
              return new GameMenu(this);
          case 1: 
             return new GamePlay(this, false);
          case 2:
              return new GamePlay(this, true);
          case 3: 
             return new GameFinish(this);
       }
       return null;
    }
}