/**
 * Write a description of class POSITION here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class POSITION implements Cloneable
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class POSITION
     */
    public POSITION(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int get_x(){
        return x;
    }
    
    public void set_x(int x){
        this.x = x;
    }
    
    public int get_y(){
        return y;
    }
    
    public void set_y(int y){
        this.y = y;
    }
    
    public void inverse_x(){
        x = -x;
    }
    
    public void inverse_y(){
        y = -y;
    }
    
    public void inverse(){
        y = -y;
        x = -x;
    }

    public void add(POSITION p){
        x = x + p.get_x();
        y = y + p.get_y();
    }
    
    public void subtract(POSITION p){
        x = x - p.get_x();
        y = y - p.get_y();
    }
    
    public double get_length(){
        return get_distance(new POSITION(0,0), this);
    }
    
    public POSITION direction_to(POSITION p){
        POSITION delta = subtract(p, this);
        int x = delta.get_x();
        int y = delta.get_y();
        if(x != 0){
            delta.set_x(x/ Math.abs(x));
        } else {
            delta.set_x(0);
        }
        
        if (y != 0){
            delta.set_y(y / Math.abs(y));
        } else {
            delta.set_y(0);
        }
        
        return delta;
    }
    
    public static POSITION add(POSITION p_1, POSITION p_2){
        return new POSITION(p_1.get_x() + p_2.get_x(), p_1.get_y() + p_2.get_y());
    }
    
    public static POSITION subtract(POSITION minuend, POSITION subtrahend){
        return new POSITION(minuend.get_x() - subtrahend.get_x(), minuend.get_y() - subtrahend.get_y());
    }
    
    public static double get_distance(POSITION p_1,POSITION p_2){
        double distance =0;
        int diff_x = p_2.get_x()-p_1.get_x();
        int diff_y = p_2.get_y()-p_1.get_y();
        distance = Math.sqrt(Math.pow(diff_x,2)+Math.pow(diff_y,2));
        return distance;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}
