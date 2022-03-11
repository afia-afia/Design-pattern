/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afia.nabil.fly.weigth;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;


/**
 *
 * @author nabil
 */
public class Forest extends JFrame {
    ArrayList<Tree> trees = new ArrayList<>();
    
    public void addTree(int x ,int y ,Color c , String name ,String otherData){
        TreeType t = FactoryTree.getTreeType( name , otherData , c) ;
        Tree tree = new Tree(x,y,t);
        trees.add(tree);
    }
    @Override
    public void paint(Graphics graphics) {
        trees.forEach(tree -> {
            tree.draw(graphics);
        });
}

}