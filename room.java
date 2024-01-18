
/**
 * Write a description of class room here.
 *
 * @author (shemsiya omar rashid,BITA/6/22/023/TZ)
 * @version (test:1,Question:1)
 */
public class room
{
  private double width;
  private double length;
  private int floor;
  
  public room (){
    width = 10;
    length = 12.5;
    floor = 1;
    }
     public void setwidth(double width){
       if (width >0)
       {this.width=width;}
    }
    public double getwidth()
    {return width;}
  
    public void setlength(double length){
        if (length>0)
        {this.length = length;}
    }
    
      public double getlength(){
        return length;
    }
    public void setfloor(int floor){
    this.floor= floor;
    }
    public int getfloor(){
        return floor;
    }
    public room (double width,double length,int floor){
    setwidth(width);
    setlength(length);
    setfloor(floor);
    }
    public String toString(){
      return length+"x"+width +"floor"+floor;
    }
    public static void main(String[]args){
    room defaultroom = new room();
    System.out.println("default is"+ defaultroom);
    
    room parameterizonroom = new room(15.5,8.5,2);
    
    System.out.println("pararoom:" +parameterizonroom);
    
    defaultroom.setwidth(8.0);
    defaultroom.setlength(14.0);
    defaultroom.setfloor(3);
    System.out.println("update room:" + defaultroom);
    
    }
}
