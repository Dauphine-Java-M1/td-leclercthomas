/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.lang.Math;


/**
 *
 * @author thomas
 */
public class Circle {
    private Point p;
    private int rayon;

    public Circle(Point p, int rayon) {
        this.p = p;
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Circle{" + "p=" + p + ", rayon=" + rayon + ", surface=" + this.surface() + '}';
    }
    
    public void translate(int dx, int dy){
        this.p = new Point(p);
        this.p.setX(this.p.getX() + dx);
        this.p.setY(this.p.getY() + dy);
    }

    public Point getCenter() {
        return p;
    }

    public int getRayon() {
        return rayon;
    }
    
    public double surface(){
        double surface = 3.14*(this.rayon*this.rayon);
        return surface;
    }
    
    public boolean contains(Point p){
        //Pythagore : A2 + B2 = C2
        
        // On définit le point A
        Point a = p;
        
        // On définit le point B
        int xB = p.getX() + 2*(this.getCenter().getX() - p.getX());
        int yB = p.getY() + 2*(this.getCenter().getY() - p.getY());
        Point b = new Point(xB,yB);
        
        //On définit le point C (son emplacement n'est pas déterminant)
        int xC = this.getCenter().getX() + this.rayon;
        int yC = this.getCenter().getY();
        Point c = new Point(xC,yC);
        
        //Calcul
        double longAB = ((b.getX() - a.getX())*(b.getX() - a.getX())) + ((b.getY() - a.getY())*(b.getY() - a.getY()));
        double longBC = ((c.getX() - b.getX())*(c.getX() - b.getX())) + ((c.getY() - b.getY())*(c.getY() - b.getY()));
        double longAC = ((c.getX() - a.getX())*(c.getX() - a.getX())) + ((c.getY() - a.getY())*(c.getY() - a.getY()));
        //System.out.println("AB : " + longAB);
        //System.out.println("BC : " + longBC);
        //System.out.println("AC : " + longAC);
        if(longAB == longBC + longAC){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean contains (Point p, Circle c){
        // (x - a)² + (y - b)² < R²
        int a = c.getCenter().getX();
        int b = c.getCenter().getY();
        int x = p.getX();
        int y = p.getY();
        
        if ( (((x-a)*(x-a))+((y-b)*(y-b))) < (c.rayon*c.rayon) ){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static void main( String[] args )
    {
        /* Question 5
        Point p=new Point(1,2);
        Circle c=new Circle(p,1);
        Circle c2=new Circle(p,2);
        c2.translate(1,1);
        System.out.println(c+" "+c2);
        */
        
        /* Question 6
        Circle c=new Circle(new Point(1,2), 1);
        c.getCenter().translate(1,1);
        System.out.println(c);
        */
        
        /* Question 8
        Circle c=new Circle(new Point(4,0), 2);
        Point p = new Point(6,0);
        Point p2 = new Point(3,1);
        
        System.out.println("Le point " + p + " ? : " + c.contains(p));
        System.out.println("Le point " + p2 + " ? : " + c.contains(p2));
        */
        
        // Question 9
        Circle c=new Circle(new Point(4,0), 2);
        Point p = new Point(3,1);
        Point p2 = new Point(3,2);
        System.out.println("Le point " + p + " ? : " + contains(p,c));
        System.out.println("Le point " + p2 + " ? : " + contains(p2,c));
    }
    
}
