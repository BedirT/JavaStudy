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
public class DrunkenWalk {
    
    int falls = 0 , run = 0;
    int maxStep = 0, boundary = 0;
    
    DrunkenWalk(int max, int edge, int drunkTimes ){
        maxStep = max;
        boundary = edge;
        run = drunkTimes;
    }
    
    void walk(){
        
        for(int i = 0 ; i < run ; i++){
            RandomWalk obj = new RandomWalk(maxStep, boundary);
            obj.walk();
            if(!obj.inBounds()){
                falls++;
            }
        }
        System.out.println(falls);
        
    }
    
//            your program. To see the “randomness” you should run it several
//            times. Try input of 10 for the boundary and 200 for the number 
//            of steps first (sometimes the drunk falls off, sometimes not); try 
//            10 for the boundary and 500 for the steps (you should see different
//            behavior); try 50 for the boundary and 200 for the steps
//            (again different behavior).
    
}
