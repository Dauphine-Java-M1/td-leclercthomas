/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author thomas
 */

/*
drawLine
drawRect
drawRoundRect
drawOval
drawArc
drawPolyline
drawPolygon
*/


public class MyDisplay extends JPanel {
    
  public void paintComponent(Graphics g) {
     g.drawLine(20, 20, 120, 120);
  }
 
  public static void main(String[] args) {
    JFrame frame = new JFrame("Java Avancé - Graphic Display");
    frame.setSize(new Dimension(500,500));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    MyDisplay panel = new MyDisplay();
    frame.add(panel);
    frame.setVisible(true);

  }
    
}
