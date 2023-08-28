package javaapplication11;
import java.applet.*;
import java.awt.Graphics
;
import java.awt.Color;
import java.applet.Applet;
import java.awt.Color;

public class moving_man extends Applet {

   int x;
    int y;
    int w;
 void slep()
    {
        try {
            Thread.sleep(200);
        } catch (Exception ex) {
        }
    }
public void init() {
        y = 30;
        x = 20;
    }
    public void paint(Graphics g)
   {
       //this is for background color
        setBackground(Color.pink);
        w = getWidth();
        
        //this is for umbrella
        g.drawLine(0, y + 365, w, y + 365);
        g.setColor(Color.blue);
        g.fillArc(x +100, y +100, 200, 150, 0, 180);
        
        //this is for head
        g.setColor(Color.black);
        g.fillOval(x +140,y + 175, 50, 50);
        
        //this is for hand 
        g.drawLine(x +170, y +245, x +180,y + 275);
        g.setColor(Color.blue);
        g.drawLine(x +170,y + 245,x + 200, y +260);
        g.drawLine(x +170, y +245, x +180,y + 275);
        g.drawLine(x +200, y +175,x + 200,y + 260);
        
        int [] a = { x +160,x + 170, x +170, x +160  };
        int [] b = { y +225,y + 225,y + 325,y + 325  };
        g.setColor(Color.blue);
        g.fillPolygon(a, b, 4);
        
        //this is for moving man with umbrella
        try {
            Thread.sleep(200);
        } catch (Exception ex) {
        }
        g.drawLine(x +165,y +325, x +145, y +365);
        try {
            Thread.sleep(200);
        } catch (Exception ex) {
        }
        g.drawLine(x +165,y + 325,x+ 185, y +365);
        x = x + 10;
        slep();
        if (x + 100 < w) {
            repaint();
        } else {
            repaint();
            x = 20;
            y += 30;
        }
   }
}