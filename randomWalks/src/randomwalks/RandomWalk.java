/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalks;

/**
 *
 * @author BedirTapkan
 */

public class RandomWalk {

    int curX = 0, curY = 0, steps = 0;
    int maxStep = 0, boundary = 0;
    
    RandomWalk (int max, int edge){
        
        maxStep = max;
        boundary = edge;
    
    }
    
    RandomWalk (int max, int edge, int startX, int startY){
        
        maxStep = max;
        boundary = edge;
        curX = startX;
        curY = startY;
        
    }
    
    public String toString(){
        return "Steps: " + steps + "; Position: (" + curX + "," + curY + ")";
    }
    
}
