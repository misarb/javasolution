

package robotapp;

public class Robot {
    private int orientation;
    private double abs;
    private double ord;
   static private int count=0;
    private int num;
    
    public void avancer(double abs,double ord)
                 {
              this.abs=abs;
              this.ord=ord;
                 }//end avancer
    public void tourner(int orientation)
    {
      this.orientation=orientation;  
    }//end tourner
    public Robot(int orientation,double abs,double ord)
    {
        this.orientation=orientation;
        this.abs=abs;
        this.ord=ord;
        this.num=count;
        count++;
        
    }//end Robot()
    public void afficher()
    {
        System.out.println(this.orientation +" et "+this.abs+":"+this.ord);
    }
    static public int getcount()
    {
        return count;
    }
      public int getnum()
    {
        return num;
    }
            
}//class
