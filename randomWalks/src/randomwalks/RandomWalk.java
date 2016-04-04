/*
    A random walk is basically a sequence of steps in some enclosed space where 
    the direction of each step is random. The walk terminates either when a 
    maximum number of steps has been taken or a step goes outside of the 
    boundary of the space.
 */
package randomwalks;

import java.util.Random;

/*
 * @author BedirTapkan
 */

public class RandomWalk {

    int curX = 0, curY = 0, steps = 0;
    int maxStep = 0, boundary = 0, maxDistance = 0;
    
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
    
    void takeStep(){
        Random random = new Random();
        
        
        int  rand = random.nextInt(4);
        
        //System.out.println(rand);
//        switch (rand) {
//            case 0:
//                curX++;
//                break;
//            case 1:
//                curX--;
//                break;
//            case 2:
//                curY++;
//                break;
//            case 3:
//                curY--;
//                break;
//            default:
//                break;
//        }
//      
        // I made it with swift but I prefer if-else

        if      (rand==0){curX++;}
        else if (rand==1){curX--;}
        else if (rand==2){curY++;}
        else if (rand==3){curY--;}
        
        // If I make it Switch , and don't use break, it is causing error
        // WHY IS THAT ??
        
        maxDistance = max(maxDistance, max(Math.abs(curX), Math.abs(curY)));
        
        steps++;
    }
    
    boolean moreSteps(){
        return steps<maxStep;
    }
    
    boolean inBounds(){
        return Math.abs(curY)<=boundary && Math.abs(curX)<=boundary;
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
    
    private int max(int num1, int num2){
        if (num1 >= num2){return num1;}
        else {return num2;}
    }
    
    public int getMaxDistance(){
        return maxDistance;
    }
    
}
