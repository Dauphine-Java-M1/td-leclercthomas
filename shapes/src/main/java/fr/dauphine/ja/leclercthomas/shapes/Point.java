/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.ja.leclercthomas.shapes;

/**
 *
 * @author thomas
 */
public class Point {
    private int x;
    private int y;
    private static int compteurPoint;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
    
    
    public static void main( String[] args )
    {
        // Création du point 1
        Point p=new Point(0,1);
        System.out.println("("+p.x+","+p.y+")");
        
        // Création du point 2
        Point p2 = new Point(p);
        System.out.println("("+p2.x+","+p2.y+")");
        
        System.out.println( "Il y a " + compteurPoint + " points" );
    }
    
}
