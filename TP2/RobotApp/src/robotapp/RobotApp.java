

package robotapp;


public class RobotApp {


    public static void main(String[] args) {
      Robot r1=new Robot(1,0.2,3.4);
      Robot r2=new Robot(3,3.4,5.0);
        System.out.println("le nombre total des robots est : "+Robot.getcount());
        System.out.println("le numéro du robot r1 est : "+r1.getnum());
        r1.avancer(4,6);
        r1.tourner(4);
        r1.afficher();
        
      System.out.println("le numéro du robot r2 est : "+r2.getnum());
        r2.avancer(1.3,6);
        r2.tourner(2);
        r2.afficher();
    }
    
}
