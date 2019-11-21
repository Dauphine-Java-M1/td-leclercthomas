/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author thomas
 */
public class Ligne {
    
    Point[] tableauPoint;
    
    public Ligne(){
        int max = 5;
        tableauPoint = new Point[max];
    }
    
    public void add(Point p){
        boolean inscription = false;
        for(int i = 0 ; i < this.tableauPoint.length ; i++){
            if(this.tableauPoint[i] == null){
                this.tableauPoint[i] = Objects.requireNonNull(p);
                inscription = true;
                break;
            }
        }
        if(inscription == false){
            System.out.println("Dépassement de la capacité du tableau");
        }
    }
    
    public int pointCapacity(){
        return this.tableauPoint.length;
    }
    
    public int nbPoints(){
        for(int i = 0 ; i < this.tableauPoint.length ; i++){
            if(this.tableauPoint[i] == null){
                return i;
            }
        }
        return this.tableauPoint.length;
    }
    
    public boolean contains(Point p1){
        for(Point p2 : this.tableauPoint){
            if(p2 == p1){
                return true;
            }
        }
        return false;
    }
    
    public static void main( String[] args )
    {
        Point p1 = new Point(0,1);
        Point p2 = new Point(3,1);
        Point p3 = new Point(1,2);
        
        Ligne l = new Ligne();
        System.out.println(l.pointCapacity());
        System.out.println(l.nbPoints());
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p3);
        
        //l.add(null);
        System.out.println(l.nbPoints());
        System.out.println("p2 ? : " + l.contains(p2));
        System.out.println("p3 ? : " + l.contains(p3));
        System.out.println("null ? : " + l.contains(null));
        //System.out.println(l.tableauPoint[4].getX());
        
    }

}
