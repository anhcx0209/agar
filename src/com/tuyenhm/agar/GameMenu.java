/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuyenhm.agar;

import com.golden.gamedev.GameEngine;
import com.golden.gamedev.object.Timer;
import com.golden.gamedev.object.background.ImageBackground;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author dungdunght
 */
public class GameMenu extends com.golden.gamedev.GameObject {
  
    
  private ImageBackground background; 
  private int menu_number=1;
  Timer timer = new Timer(1);
    BufferedImage background_menu_1;
   BufferedImage background_menu_2;
    private Component frame;
    public GameMenu(GameEngine parent) {
       super(parent);
    }

    public void update(long elapsedTime) {
        
       background.update(10);
      
       readIpnut();
        
       if (menu_number==1){
            background.setImage(background_menu_1);
       }
       else{
            background.setImage(background_menu_2);    
       }
       if (keyPressed(KeyEvent.VK_ENTER)) 
            if (menu_number==1)
                 {
                    parent.nextGameID = 1;
                    finish();
                 }
            else{
                    parent.nextGameID = 2;
                    finish();
            }
//       if (keyPressed(KeyEvent.VK_F1)){
//           JOptionPane.showMessageDialog(frame,
//        "Задания\n\n" +
//        "Лабараторная №1\n" +
//        "- Реализовать ограничения по размеру поля. " +
//        " Размер поля – произвольный\n" +
//        "Лабараторная №2\n" +
//        "- Реализовать препятствия и их случайную расстановку " +
//        " по полю\n" +
//        "Лабараторная №3\n" +
//        "- Реализовать объект агара и его случайное появление " +
//        " на поле.\n " +
//        "Лабараторная №4\n" +
//        " - У агара должен быть лимит по количеству объектов на " +
//        " поле.\n Агар должен появляться спустя определенный " +
//        " промежуток\n и появляться на части поля, но не под " +
//        "игроком.\n" +
//        "Лабараторная №5\n" +
//        "Сделать возможность игроку \"ускориться\" на не большое время, после чего данная возможность становиться не некоторые время не достуный.\n" +
//        "Лабаратораня №6\n" +
//        "Общая модификация\n" +
//        "Показывать список возможность игры и выбранные модификации в начале запуска приложения.\n" +
//        "Сделать предельный размер клетки, больше которого нельзя было бы физически набрать.\n"+
//        "Модификация №2\n" +
//        "Сделать возможность испускания искусственного интеллекта, который бы был на одной стороне с игроком.\n"
//                , "Справка", JOptionPane.INFORMATION_MESSAGE);
//           }
//
//
//        }

        @Override
        public void initResources() {
            try{
                background_menu_1 = ImageIO.read(new File("resources/background_menu_1.jpg"));
                background_menu_2 = ImageIO.read(new File("resources/background_menu_2.jpg"));
                background = new ImageBackground(background_menu_1);
                background.setClip(0, 0, Game.dimensions().width, Game.dimensions().height);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void render(Graphics2D gd) {
            background.render(gd);
            gd.setFont(new Font("Arial", Font.BOLD, 20));
            gd.setColor(Color.WHITE);
            gd.drawString("Press up,down to choose menu and press enter; press F1 to see help" , 30,30);
        
    }
    
    public void readIpnut(){
        if (keyPressed(KeyEvent.VK_UP)){
            menu_number=1;
            System.out.println(menu_number);
            
        }
        else if (keyPressed(KeyEvent.VK_DOWN)){
            menu_number=2;
             System.out.println(menu_number);
        }
    }
}
