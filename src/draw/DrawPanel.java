package draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;

import DrawTreeBaseline.Cloud;
import DrawTreeBaseline.Horse;
import DrawTreeBaseline.House;
import DrawTreeBaseline.LandscapeObject;
import DrawTreeBaseline.Person;
import DrawTreeBaseline.Tree;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programmer
 * (via code).
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawPanel extends JPanel {

	// Attributes
	private static final long serialVersionUID = 6311020027600344213L;

	// Landscape Colors
	private final String LIGHT_SKY_BLUE = "#87CEFA";
	private final String MIDNIGHT_BLUE = "#191970";
	private final String SNOW3 = "#CDC9C8";
	private final String WHITE = "#FFFFFF";
	private final String MY_WHITE_SMOKE = "#F5F5F5";
	private final String LAWN_GREEN = "#7CFC00";
	private final String MEDIUM_SPRING_GREEN = "#00FA9A";
	private final String SPRING_GREEN = "#00FF7F";
	private final String DESERT = "#C19A6B";
	private final String PATH = "#dca97a";
	// Tree Colors
	private final String BROWN = "#A52A2A";
	private final String DARK_GREEN = "#006400";
	private final String FOREST_GREEN = "#228B22";
	private final String GRAY = "#808080";
	private final String GREEN = "#008000";

	// House Colors
	private final String DARK_SLATE_GRAY = "#2F4F4F";
	private final String FIREBRICK = "#B22222";
	private final String INDIAN_RED = "#CD5C5C";
	private final String MAROON = "#800000";
	private final String MOCCASIN = "#FFE4B5";
	private final String RED = "#FF0000";
	private final String SADDLE_BROWN = "#8B4513";
	private final String SIENNA = "#A0522D";
	private final String SLATE_GRAY = "#708090";
	private final String PERU = "#CD853F";
	private final String WHITE_SMOKE = "#F5F5F5";
	private final String BURLYWOOD = "#DEB887";
	private final String YELLOW = "#FFFF00";
	private final String WILDGREEN = "#afa554";
	private final String WINDOWG = "#2e707e";
	private final String DOORG = "#aeb399";
	private final String WILDBROWN = "#ba9159";
	private final String BORDERWINDOW = "#524028";
	private final int PANEL_WIDTH = 1600;
	private final int PANEL_HEIGHT = 900;
	// Horse Colors
	private final String horse1 = "#cb5317";
	private final String hair1 = "#f9c62b";
	int x;
	int y;
	int w = 1600;

	int h = 900;
	int xVelocity = 25;
	int yVelocity = 1;

	public DrawPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT)); // Sets the dimensions of the DrawPanel. Change
																			// this if your
		// screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE); // Sets the background of the DrawPanel LIGHT_GRAY. You may change this if
		String filepath = "src\\draw\\ranger.wav";
		playMusic(filepath);								// desired.
	}public static void playMusic (String location)
	{
        try
        {
            File musicPath = new File(location);
            
            if (musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else
            {
                System.out.println("Can't find file");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
	}

	/**
	 * Overrides the JComponent.paintComponent method. EVERYTHING that gets drawn to
	 * the Component (which sits on the content frame of the JFrame) is drawn in
	 * this method. Draw12a Draw all your objects in the paintComponent method.
	 * Automatically called by the event handler whenever the screen needs to be
	 * redrawn. DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param g //All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g; // Allows us to draw using both the Graphics class methods and the Graphics2D
										// class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Makes drawn shapes
																									// and fonts clearer


		Toolkit t = Toolkit.getDefaultToolkit();
		Image Image1 = t.getImage("C:\\Users\\rmbgk\\Desktop\\Fall 2022\\CS 115\\background.jpg");

		// Draw the image on the screen
		g2.drawImage(Image1, 0, 0, this);
		
		//drawing random trees
		for (int i = 0; i < 25; i++) {
			try {
				Thread.sleep(2);
			} catch (Exception ex) {
			}

			int rantree = (int) (Math.random() * (2000 - 10) + -10);
			int colora = (int) ((Math.random() * (500 - 50)) + 30);
			String Colorrand = Integer.toHexString(colora) + "8800";
			Tree tree = new Tree(g2, rantree, 540, 2, 2, BROWN, Colorrand);
			tree.draw();
		}

       //Drawing houses
		House h11 = new House(g2, 100, 420, 7, 1, WILDBROWN, WHITE);
		h11.drawHouse(1);
		House h12 = new House(g2, 280, 420, 6, 2, FIREBRICK, YELLOW);
		h12.drawHouse(2);
		House h13 = new House(g2, 450, 420, 5, 3, INDIAN_RED, SLATE_GRAY);
		h13.drawHouse(2);
		House h14 = new House(g2, 600, 420, 7, 1, MOCCASIN, WINDOWG);
		h14.drawHouse(2);
		House h15 = new House(g2, 780, 420, 7, 2, SIENNA, YELLOW);
		h15.drawHouse(1);
		House h16 = new House(g2, 950, 420, 6, 3, WHITE, SADDLE_BROWN);
		h16.drawHouse(2);
		House h17 = new House(g2, 1150, 420, 5, 2, WILDBROWN, WINDOWG);
		h17.drawHouse(1);
		
		//Draw mens
		Person p4 = new Person(g2, 0, 520, 0.3, 1, GREEN);
		p4.drawMen(2);	
		Person p5 = new Person(g2, 50, 520, 0.3, 1,   WHITE);
		p5.drawMen(2);
		Person p6 = new Person(g2, 100, 520, 0.3, 1, BROWN);
		p6.drawMen(2);
		Person p7 = new Person(g2, 150, 520, 0.3, 1, DARK_GREEN);
		p7.drawMen(2);
		Person p8 = new Person(g2, 200, 520, 0.3, 1, MIDNIGHT_BLUE);
		p8.drawMen(2);
		Person p9 = new Person(g2, 250, 520, 0.3, 1, BROWN);
		p9.drawMen(2);
		Person p10 = new Person(g2, 300, 520, 0.3, 1, GREEN);
		p10.drawMen(2);
		Person p11 = new Person(g2, 350, 520, 0.3, 1, GREEN);
		p11.drawMen(2);
		
		//draw a Horses
		Horse h2 = new Horse(g2, 900, 600, 0.5, DARK_SLATE_GRAY, WHITE);
		h2.draw();
		Person p13 = new Person(g2, 890, 465, 0.5, 1, GREEN);
		p13.drawMen(1);
		Horse h3 = new Horse(g2, 1200, 600, 0.3, WHITE, DARK_SLATE_GRAY);
		h3.draw();
		
		
		// drawing random clouds

	
		int xc = 2000;

		for (int i = 0; i < 5; i++) {

			int rancloud = (int) (Math.random() * xc);
			int randValue = (int) ((Math.random() * (500 - 50)) + 50);
			String randColor = Integer.toHexString(randValue) + "FFFFF";
			Cloud cloud = new Cloud(g2, rancloud, 1, 3, 3, randColor);
			cloud.draw();
		}
		
		
		
		// drawing the Long ranger with Horse Silver and thief running
		Person p3 = new Person(g2, x + 0, y + 350, 0.9,3, RED);
		Person p12 = new Person(g2, x + 300, y + 450, 0.9,2, DARK_SLATE_GRAY);
		Horse h1 = new Horse(g2, x+20, y+ 600, 0.9, horse1, hair1);

		try {
			Thread.sleep(1);
		} catch (Exception ex) {
		}

		h1.draw();

		p3.drawMen(1);
		p12.drawMen(3);
		

		if (x >= -200 + PANEL_WIDTH || x < -200) {
			xVelocity = xVelocity * -1;
			yVelocity = yVelocity * -1;

		}

		x = x + xVelocity;
		repaint();

	

	}// end of method paintComponent(Graphics)
}//


