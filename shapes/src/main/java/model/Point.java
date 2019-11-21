/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;

/**
 *
 * @author thomas
 */
public class Point {
    private int x;
    private int y;
    private static int compteurPoint;

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    
    
    public Point(int px, int py) {
        this.x = px;
        this.y = py;
        compteurPoint++;
    }
    
    public Point (Point p){
        this.x = p.getX();
        this.y = p.getY();    
        compteurPoint++;
    }
    
    
    public boolean isSameAs(Point p){
        if((this.x == p.x) && (this.y == p.y)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void translate(int dx, int dy){
        this.x = x + dx;
        this.y = y + dy;
    }
    
    
    public static void main( String[] args )
    {
        /* EXO 1
        // Création du point 1
        Point p=new Point(0,1);
        System.out.println("("+p.x+","+p.y+")");
        
        // Création du point 2
        Point p2 = new Point(p);
        System.out.println("("+p2.x+","+p2.y+")");
        
        System.out.println( "Il y a " + compteurPoint + " points" );
        
        FIN EXO 1 */
        
        /* EXO 2
        Point p1 = new Point(1,2);
        Point p2 = p1;
        Point p3 = new Point(1,2);
        System.out.println("Test avec '==' : ");
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println("Test avec la méthode 'isSameAs' : ");
        System.out.println(p1.isSameAs(p2));
        System.out.println(p1.isSameAs(p3));
        
        System.out.println("Question 3 : ");
        ArrayList<Point> list = new ArrayList<>();
        list.add(p1);
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));
        
        FIN EXO 2 */
        

        
        
        
    }
    
}
