/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thomas
 */
public class Ring extends Circle {
    
    private int rayonInterne;
    
    public Ring(Point p, int rayon, int rayonInterne) {
        super(p, rayon);
        this.rayonInterne = rayonInterne;
    }
    
    public Ring(Circle c, int rayonInterne) {
        super(c.getCenter(),c.getRayon());
        this.rayonInterne = rayonInterne;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ring other = (Ring) obj;
        if ( (this.rayonInterne != other.rayonInterne) || (super.getCenter() != other.getCenter()) || (super.getRayon() != other.getRayon()) ) {
            return false;
        }
        return true;
    }
      
    @Override
    public String toString() {
        return "Ring{" + "centre=" + super.getCenter() +", rayon=" + super.getRayon() + ", rayonInterne=" + rayonInterne + '}';
    }
    

    
    public static void main( String[] args )
    {
        Point p = new Point(2,3);
        Ring r = new Ring(p, 3, 2);
        System.out.println(r);
        
        //Test de la méthode equals
        Point p1 = new Point(2,3);
        Point p2 = new Point(2,3);
        
        Ring r1 = new Ring(p, 3, 2);
        Ring r2 = new Ring(p, 3, 2);
        System.out.println("r1=r2? : " + r1.equals(r2));
        
        // Question 4
        System.out.println(r);
        
        // Question 5
        System.out.println(r.contains(p));
        
        // Question 6
        //System.out.println(p,r);
        
    }
    
}
