/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afia.nabil.fly.weigth;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nabil
 */
public class FactoryTree {
    
    private static Map<String,TreeType> cache = new HashMap<>();
    
    public static TreeType getTreeType(String name ,String otherData , Color c){
        
       TreeType result = cache.get(name);
        if(result == null){
            result = new TreeType(c,name ,otherData );
            cache.put(name, result);
        }
        
        return result ;
            
        
    }
    
}
