package DrawTreeBaseline;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Person Class. Extends LandscapObject Class. Note this class inherits 3
 * protected attributes from LandscapeObject for convenience in coding methods.
 * protected int currentX protected int currentY protected Graphics2D
 * 
 * When creating a Person object in the DrawPanel.paintComponent(Graphics)
 * method, usually the following syntax is used.
 * 
 * Person p1 = new Person(args); p1.draw();
 * 
 * @author Ronald britos
 * @version 1.0
 * @since 12/8/2022
 */
public class Person extends LandscapeObject {

	// Attributes
	private int levels;
	private int parts;

	private String PersonColor;
	private int bodyWidth = 10;
	// head
	private int head = 50;
	private int headx = 140;
	private int heady = 175;
	// arms
	private int armsx1 = 170;
	private int armsy1 = 245;
	private int armsx2 = 200;
	private int armsy2 = 260;
	private int armsx3 = 180;
	private int armsy3 = 275;
	// body
	private int cuerpox1 = 165;
	private int cuerpoy1 = 225;
	private int cuerpoy2 = 325;
	// legs
	private int legsx1 = 165;
	private int legsy1 = 325;
	private int legsx2 = 145;
	private int legsy2 = 365;
	private int legsx3 = 185;
	private int legsy3 = 365;
	// eye
	private int eyex1 = 152;
	private int eyey1 = 190;
	private int eyex2 = 165;
	private int eyey2 = 190;
	private int eye = 10;
	// mouth
	private int mouthx1 = 152;
	private int mouthy1 = 210;
	private int mouthx2 = 175;
	private int mouthy2 = 210;
	private int mouths = 2;

	public Person(Graphics2D g2, int x, int y, double scale, int parts, String pcolor) {
		super(g2, x, y, scale);
		this.parts = parts;
		this.PersonColor = pcolor;

	}// end of constructor

	// Methods

	public void draw() {

		applyScale();

		drawMen(0);

	}

	public void repaint() {
		applyScale();
		drawMen(0);

	}

	public void applyScale() {
		bodyWidth = (int) (bodyWidth * getScale());

		legsx1 = (int) (legsx1 * getScale());
		legsx2 = (int) (legsx2 * getScale());
		legsx3 = (int) (legsx3 * getScale());
		legsy1 = (int) (legsy1 * getScale());
		legsy2 = (int) (legsy2 * getScale());
		legsy3 = (int) (legsy3 * getScale());

		head = (int) (head * getScale());
		headx = (int) (headx * getScale());
		heady = (int) (heady * getScale());

		cuerpox1 = (int) (cuerpox1 * getScale());
		cuerpoy1 = (int) (cuerpoy1 * getScale());
		cuerpoy2 = (int) (cuerpoy2 * getScale());

		armsx1 = (int) (armsx1 * getScale());
		armsy1 = (int) (armsy1 * getScale());
		armsx2 = (int) (armsx2 * getScale());
		armsy2 = (int) (armsy2 * getScale());
		armsx3 = (int) (armsx3 * getScale());
		armsy3 = (int) (armsy3 * getScale());

		eyex1 = (int) (eyex1 * getScale());
		eyey1 = (int) (eyey1 * getScale());
		eyex2 = (int) (eyex2 * getScale());
		eyey2 = (int) (eyey2 * getScale());
		eye = (int) (eye * getScale());

		mouthx1 = (int) (mouthx1 * getScale());
		mouthy1 = (int) (mouthy1 * getScale());
		mouthx2 = (int) (mouthx2 * getScale());
		mouthy2 = (int) (mouthy2 * getScale());
		mouths = (int) (mouths * getScale());

	}// end of method applyScale()

	public void drawbody() {

		
		// this set the stroke and color for the body
		g2.setStroke(new BasicStroke(bodyWidth));
		g2.setColor(Color.decode(PersonColor));
		// body draw
		g2.drawLine(currentX + cuerpox1, currentY + cuerpoy1, currentX + cuerpox1, currentY + cuerpoy2);
		//color for the head
		g2.setColor(Color.decode("#f2b68b"));
		// head
        g2.fillOval(currentX + headx, currentY + heady, head, head);
		
        // color for the eyes
		g2.setColor(Color.white);
		// eyes
		g2.fillOval(currentX + eyex1, currentY + eyey1, eye, eye);
		g2.fillOval(currentX + eyex2, currentY + eyey2, eye, eye);
		
        // stroke for the mouth
		g2.setStroke(new BasicStroke(mouths));
		// mouth
		g2.drawLine(currentX + mouthx1, currentY + mouthy1, currentX + mouthx2, currentY + mouthy2);

	}

	public void drawMen(int legss) {
       // when you call the drawMen the other methods are getting apply by calling them from here.
		applyScale();
		drawbody();
		drawarms();
		//set the color and stroke for the legs
		g2.setColor(Color.decode("#f2b68b"));
		g2.setStroke(new BasicStroke(bodyWidth));
		// The leg number 1 it only display one leg(it is good to use it when riding a horse.)
		if (legss == 1) {
            // Randomizing the position of the leg to give the sensation of walking
			Random randomObj = new Random();
			int randomNum1 = randomObj.nextInt(20 - 5);
			legsx2 = legsx2 + randomNum1;
			int randomNum2 = randomObj.nextInt(10 - (-10));
			legsx3 = legsx3 + randomNum2;
			g2.drawLine(currentX + legsx1, currentY + legsy1, currentX + legsx2, currentY + legsy2);
			g2.setColor(Color.decode(PersonColor));
			g2.fillOval((int) (currentX + legsx2 * 0.95), currentY + legsy2, head / 2, (int) (head / 4.5));
		} else if (legss == 2) {
			//drawing two legs 
			g2.drawLine(currentX + legsx1, currentY + legsy1, currentX + legsx2, currentY + legsy2);
            g2.drawLine(currentX + legsx1, currentY + legsy1, currentX + legsx3, currentY + legsy3);
          //setting up the color for the shoes and drawing them
            g2.setColor(Color.decode(PersonColor));
			g2.fillOval((int) (currentX + legsx2 * 0.95), currentY + legsy2, head / 2, (int) (head / 4.5));
			g2.fillOval((int) (currentX + legsx3 * 0.98), currentY + legsy3, head / 2, (int) (head / 4.5));
		} else if (legss == 3) {
			// Randomizing the position of the leg to give the sensation of walking
			Random randomObj = new Random();
			int randomNum1 = randomObj.nextInt(20 - 5);
			legsx2 = legsx2 + randomNum1;
			int randomNum2 = randomObj.nextInt(10 - (-10));
			legsx3 = legsx3 + randomNum2;
			//drawing two legs 
			g2.drawLine(currentX + legsx1, currentY + legsy1, currentX + legsx2, currentY + legsy2);
            g2.drawLine(currentX + legsx1, currentY + legsy1, currentX + legsx3, currentY + legsy3);
			//setting up the color for the shoes and drawing them
            g2.setColor(Color.decode(PersonColor));
			g2.fillOval((int) (currentX + legsx2 * 0.95), currentY + legsy2, head / 2, (int) (head / 4.5));
			g2.fillOval((int) (currentX + legsx3 * 0.98), currentY + legsy3, head / 2, (int) (head / 4.5));
		}
	}

	public void drawarms() {
		g2.setColor(Color.decode(PersonColor));
		g2.setStroke(new BasicStroke(bodyWidth));

		if (parts == 1) {

			armsx1 = 165;
			armsy1 = 245;
			armsx2 = 115;
			armsy2 = 150;
			armsx3 = 215;
			armsy3 = 150;
			armsx1 = (int) (armsx1 * getScale());
			armsy1 = (int) (armsy1 * getScale());
			armsx2 = (int) (armsx2 * getScale());
			armsy2 = (int) (armsy2 * getScale());
			armsx3 = (int) (armsx3 * getScale());
			armsy3 = (int) (armsy3 * getScale());
			// Randomizing the position of the arms to give the sensation of using the rope while riding a horse
			
			Random randomObj = new Random();
			int randomNum3 = randomObj.nextInt(20 - 5);
			armsy2 = armsy2 + randomNum3;
			int randomNum4 = randomObj.nextInt(10 - (-10));
			armsy3 = armsy3 + randomNum4;
			//drawing arms
			g2.drawLine(currentX + armsx1, currentY + armsy1, currentX + armsx2, currentY + armsy2);
			g2.drawLine(currentX + armsx1, currentY + armsy1, currentX + armsx3, currentY + armsy3);

		} else if (parts == 2) {
			// Randomizing the position of the arms to give the sensation of cheering
			Random randomObj = new Random();
			int randomNum3 = randomObj.nextInt(20 - 5);
			armsx2 = armsx2 + randomNum3;
			int randomNum4 = randomObj.nextInt(10 - (-10));
			armsx3 = armsx3 + randomNum4;
			//drawing arms
			g2.drawLine(currentX + armsx1, currentY + armsy1, currentX + armsx2, currentY + armsy2);
			g2.drawLine(currentX + armsx1, currentY + armsy1, currentX + armsx3, currentY + armsy3);
		} else if (parts == 3) {
			// Randomizing the position of the arms to give the sensation of runing
			g2.setColor(Color.decode(PersonColor));
			armsx1 = 165;
			armsy1 = 245;
			armsx2 = 115;
			armsy2 = 150;
			armsx3 = 215;
			armsy3 = 250;
			armsx1 = (int) (armsx1 * getScale());
			armsy1 = (int) (armsy1 * getScale());
			armsx2 = (int) (armsx2 * getScale());
			armsy2 = (int) (armsy2 * getScale());
			armsx3 = (int) (armsx3 * getScale());
			armsy3 = (int) (armsy3 * getScale());
			Random randomObj = new Random();
			int randomNum3 = randomObj.nextInt(100 - 5);
			armsx2 = armsx2 + randomNum3;
			int randomNum4 = randomObj.nextInt(10 - (-10));
			armsx3 = armsx3 + randomNum4;
			//drawing arms
			g2.drawLine(currentX + armsx1, currentY + armsy1, currentX + armsx2, currentY + armsy2);

			g2.drawLine(currentX + armsx1, currentY + armsy1, currentX + armsx3, currentY + armsy3);
			//Drawing the rope
			g2.setStroke(new BasicStroke((bodyWidth / 2)));
			g2.setColor(Color.decode("#573419"));
			g2.drawLine(currentX + armsx2, currentY + armsy2, currentX + armsx2, (int) (currentY + (armsy2 * 0.85)));
			g2.drawOval(currentX + armsx2, (int) (currentY + (armsy2 * 0.85)), head * 2, (int) (head / 4.5));
		}
	}

}// end of class Person