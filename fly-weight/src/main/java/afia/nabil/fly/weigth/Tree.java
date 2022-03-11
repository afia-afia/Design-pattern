/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afia.nabil.fly.weigth;

import java.awt.Graphics;

/**
 *
 * @author nabil
 */
class Tree {
    
    int x ;
    int y ; 
    TreeType type ; 
    public Tree(int x ,int y, TreeType type){
        this.x = x;
        this.y = y ;
        this.type =type ; 
        
    }

    void draw(Graphics graphics) {
       type.draw(graphics, x, y);
    }
}
