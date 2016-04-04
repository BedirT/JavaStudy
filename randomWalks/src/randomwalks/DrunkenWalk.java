/*
    The program should simulate a drunk staggering randomly on some
    sort of platform.
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
}
