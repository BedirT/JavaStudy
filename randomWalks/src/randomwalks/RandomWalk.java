/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalks;

import java.util.Random;

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
    
    void takeStep(){ // WE HAVE A PROBLEM HERE ??
        Random random = new Random();

        int  rand = random.nextInt(4);
        //System.out.println(rand);
        
        if      (rand==0){curX++;}
        else if (rand==1){curX--;}
        else if (rand==2){curY++;}
        else if (rand==3){curY--;}
        
        // If I make it Switch , and don't use break, it is causing error
        // WHY IS THAT ??
        
        steps++;
    }
    
    boolean moreSteps(){
        return steps<maxStep;
    }
    
    boolean inBounds(){
        return curY<=boundary && curX<=boundary;
    }
    
    void walk(){
        while(moreSteps() && inBounds()){
            takeStep();
        }
    }
    
    int getX(){
        return curX;
    }
    
    int getY(){
        return curY;
    }
    
}
