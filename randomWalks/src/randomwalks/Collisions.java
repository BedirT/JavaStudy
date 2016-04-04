/*
    
 */
package randomwalks;

/**
 *
 * @author BedirTapkan
 */
public class Collisions {

    int collides = 0, maxStep = 0, boundary = 0;
    int curX1 = 0, curY1 = 0, curX2 = 0, curY2 = 0;
    Collisions (int max, int edge){
        
        maxStep = max;
        boundary = edge;
        
    }
    
    int hits(){
        
        RandomWalk particle1 = new RandomWalk(maxStep, boundary, curX1, curX1);
        RandomWalk particle2 = new RandomWalk(maxStep, boundary, curX2, curX2);
        
        for(int i = 0 ; i < maxStep ; i++){
           
            if(particle1.getX()==particle2.getX()&&particle1.getY()==
                    particle2.getY()){
                collides++;
            }
            
            particle1.takeStep();
            particle2.takeStep();
            
        }
        
        return collides;
    }
    
    public static boolean samePosition (RandomWalk p1, RandomWalk p2){
        return p1.getX()==p2.getX()&&p1.getY()==
                    p2.getY();
    }
    
    
    
}
