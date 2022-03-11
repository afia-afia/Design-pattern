/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afia.nabil.fly.weigth;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author nabil
 * this is the flyweight class 
 * it's hold the attribute common to all object 
 */
public class TreeType {
    
    private Color color ;
    private String name ;
    private String otherData ;
    
    public TreeType(Color c, String n , String o){
        this.color = c;
        this.name = n ;
        this.otherData = o;
        
    }
    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
    
}
