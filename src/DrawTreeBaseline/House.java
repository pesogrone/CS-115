package DrawTreeBaseline;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

public class House extends LandscapeObject {
	// Attributes
	private int levels;
	private String HouseColor;
	private String WinDoor;
	private int housex1 = 10;
	private int housey1 = 15;
	private int housex2 = 31;
	private int housey2 = 30;
	private double columnStroke = 1.5;
	private double semicolumnStroke = 0.5;
	private double windowStroke = 1;
	private double houseOverlap = .45;
	private int arc = 10;
	private int Word = 3;
	private BasicStroke treeStroke = new BasicStroke(1); // Stroke of 1 pixel use to outline each shape of the tree.
	private String trunkColor;

	public House(Graphics2D g2, int x, int y, double scale, int levels, String HouseColor, String WinDoor) {
		super(g2, x, y, scale);
		this.levels = levels;
		this.HouseColor = HouseColor;
		this.WinDoor = WinDoor;

	}// end of Constructor Tree

	// Methods

	public void draw() {
		applyScale();

		drawHouse(housex1);
		typesroof();
	}// end of method draw()

	public void applyScale() {

		housex1 = (int) (housex1 * getScale());
		housex2 = (int) (housex2 * getScale());
		housey1 = (int) (housey1 * getScale());
		housey2 = (int) (housey2 * getScale());
		//Strokes
		columnStroke = (int) (columnStroke * getScale());
		semicolumnStroke = (int) (semicolumnStroke * getScale());
		windowStroke = (int) (windowStroke * getScale());
		Word = (int) (Word* getScale());
		//arch
		arc = (int) (arc* getScale());
	}// end of method applyScale()

	public void drawHouse(int housetype) {
		applyScale();
		typesroof();
		if (housetype == 1) {
			g2.setColor(Color.decode(HouseColor));
			int[] house1 = { currentX + housex1, currentX + housex2, currentX + housex2, currentX + housex1 };
			int[] HOUSE1 = { currentY + housey1, currentY + housey1, currentY + housey2, currentY + housey2 };
			var firstfl = new Polygon(house1, HOUSE1, 4);
			g2.fill(firstfl);
			
			// BIG columns
			g2.setStroke(new BasicStroke((int) columnStroke));
			g2.setColor(Color.decode("#746544"));
			// column1
			g2.drawLine(currentX + housex1, currentY + (int) (housey1 * 1.05), currentX + housex1, currentY + housey2);
			// column2
			g2.drawLine(currentX + (int) (housex1 * 1.7), currentY + (int) (housey1 * 1.05),
					currentX + (int) (housex1 * 1.7), currentY + housey2);
			// column3
			g2.drawLine(currentX + (int) (housex1 * 2.4), currentY + (int) (housey1 * 1.05),
					currentX + (int) (housex1 * 2.4), currentY + housey2);
			// column4
			g2.drawLine(currentX + (int) (housex1 * 3.03), currentY + (int) (housey1 * 1.05),
					currentX + (int) (housex1 * 3.03), currentY + housey2);
			//Floor
			g2.setColor(Color.decode("#4c3c22"));
			g2.drawLine(currentX + housex1, currentY + housey2, currentX + (int) (housex2 * 0.97), currentY + housey2);

			// vertical lines wooden grilles
			
			g2.setStroke(new BasicStroke((int) semicolumnStroke));
			g2.drawLine(currentX + (int) (housex1 * 0.95), currentY + housey1, currentX + (int) (housex1 * 0.95),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + housex1, currentY + housey1, currentX + housex1, currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 1.1), currentY + housey1, currentX + (int) (housex1 * 1.1),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 1.2), currentY + housey1, currentX + (int) (housex1 * 1.2),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 1.3), currentY + housey1, currentX + (int) (housex1 * 1.3),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 1.4), currentY + housey1, currentX + (int) (housex1 * 1.4),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 1.5), currentY + housey1, currentX + (int) (housex1 * 1.5),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 1.6), currentY + housey1, currentX + (int) (housex1 * 1.6),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 1.7), currentY + housey1, currentX + (int) (housex1 * 1.7),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 1.8), currentY + housey1, currentX + (int) (housex1 * 1.8),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 1.9), currentY + housey1, currentX + (int) (housex1 * 1.9),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2), currentY + housey1, currentX + (int) (housex1 * 2),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2.1), currentY + housey1, currentX + (int) (housex1 * 2.1),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2.2), currentY + housey1, currentX + (int) (housex1 * 2.2),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2.3), currentY + housey1, currentX + (int) (housex1 * 2.3),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2.4), currentY + housey1, currentX + (int) (housex1 * 2.4),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2.5), currentY + housey1, currentX + (int) (housex1 * 2.5),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2.6), currentY + housey1, currentX + (int) (housex1 * 2.6),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2.7), currentY + housey1, currentX + (int) (housex1 * 2.7),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2.8), currentY + housey1, currentX + (int) (housex1 * 2.8),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 2.9), currentY + housey1, currentX + (int) (housex1 * 2.9),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 3), currentY + housey1, currentX + (int) (housex1 * 3),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1 * 3.08), currentY + housey1, currentX + (int) (housex1 * 3.08),
					currentY + (int) (housey1 / 1.3));
			// horizontal line wooden grilles
			g2.drawLine(currentX + (int) (housex1*0.99), currentY + (int) (housey1 / 1.3), currentX + (int) (housex1 * 3.08),
					currentY + (int) (housey1 / 1.3));
			g2.drawLine(currentX + (int) (housex1*0.99), currentY + housey1, currentX + (int) (housex1 * 3.08),
					currentY + housey1);

			// window left

			int[] window1 = { currentX + (int) (housex1 * 1.2), currentX + (int) (housex1 * 1.5),
					currentX + (int) (housex1 * 1.5), currentX + (int) (housex1 * 1.2) };
			int[] WINDOW1 = { currentY + (int) (housey1 * 1.3), currentY + (int) (housey1 * 1.3),
					currentY + (int) (housey1 * 1.8), currentY + (int) (housey1 * 1.8) };
			var windows = new Polygon(window1, WINDOW1, 4);

			// draw the window to give frame and then fill it up
			
			g2.setStroke(new BasicStroke((int) windowStroke));
			g2.draw(windows);
			g2.setColor(Color.decode(WinDoor));
			g2.setStroke(new BasicStroke((int) semicolumnStroke));
			g2.fill(windows);
			
			
			//  window right
			g2.setColor(Color.decode("#4c3c22"));
			int[] window2 = { currentX + (int) (housex1 * 2.6), currentX + (int) (housex1 * 2.9),
					currentX + (int) (housex1 * 2.9), currentX + (int) (housex1 * 2.6) };
			int[] WINDOW2 = { currentY + (int) (housey1 * 1.3), currentY + (int) (housey1 * 1.3),
					currentY + (int) (housey1 * 1.8), currentY + (int) (housey1 * 1.8) };
			var WINDOWS = new Polygon(window2, WINDOW2, 4);

			// draw the window to give frame and then fill it up
			g2.setStroke(new BasicStroke((int) windowStroke));
			g2.draw(WINDOWS);
			g2.setColor(Color.decode(WinDoor));
			g2.setStroke(new BasicStroke((int) semicolumnStroke));
			g2.fill(WINDOWS);
			
			// grids 
			g2.setColor(Color.decode("#4c3c22"));
			g2.drawLine(currentX + (int) ((housex1 * 1.5) / 1.095), currentY + (int) (housey1 * 1.3),
					currentX + (int) ((housex1 * 1.5) / 1.095), currentY + (int) (housey1 * 1.8));
			g2.drawLine(currentX + (int) ((housex1 * 1.2)), currentY + (int) (housey1 * 1.55),
					currentX + (int) (housex1 * 1.5), (int) (currentY + (housey1 * 1.55)));

			g2.drawLine(currentX + (int) ((housex1 * 2.9) / 1.055), currentY + (int) (housey1 * 1.3),
					currentX + (int) ((housex1 * 2.9) / 1.055), currentY + (int) (housey1 * 1.8));

			g2.drawLine(currentX + (int) ((housex1 * 2.6)), currentY + (int) (housey1 * 1.55),
					currentX + (int) (housex1 * 2.9), (int) (currentY + (housey1 * 1.55)));
			
			// Door center

			int[] door1 = { currentX + (int) (housex1 * 1.9), currentX + (int) (housex1 * 2.2),
					currentX + (int) (housex1 * 2.2), currentX + (int) (housex1 * 1.9) };
			int[] door2 = { currentY + (int) (housey1 * 1.6), currentY + (int) (housey1 * 1.6),
					currentY + (int) (housey2 * 0.959), currentY + (int) (housey2 * 0.959) };
			var door = new Polygon(door1, door2, 4);
			// draw the door to give frame and then fill it up
			g2.setStroke(new BasicStroke((int) windowStroke));
			g2.draw(door);
			g2.setStroke(new BasicStroke((int) semicolumnStroke));
			g2.setColor(Color.decode(WinDoor));
			g2.fill(door);
			//
		} else if (housetype == 2) {
			g2.setColor(Color.decode(HouseColor));
			int[] house1 = { currentX + housex1, currentX + housex2, currentX + housex2, currentX + housex1 };
			int[] HOUSE1 = { currentY + housey1, currentY + housey1, currentY + housey2, currentY + housey2 };
			var firstfl = new Polygon(house1, HOUSE1, 4);
            g2.fill(firstfl);
            
			// BIG columns
			g2.setStroke(new BasicStroke((int) columnStroke));
			g2.setColor(Color.decode("#746544"));
			// column1
			g2.drawLine(currentX + housex1, currentY + (int) (housey1 * 1.05), currentX + housex1, currentY + housey2);
			// column2
			g2.drawLine(currentX + (int) (housex1 * 1.7), currentY + (int) (housey1 * 1.05),
					currentX + (int) (housex1 * 1.7), currentY + housey2);
			// column3
			g2.drawLine(currentX + (int) (housex1 * 2.4), currentY + (int) (housey1 * 1.05),
					currentX + (int) (housex1 * 2.4), currentY + housey2);
			// column4
			g2.drawLine(currentX + (int) (housex1 * 3.03), currentY + (int) (housey1 * 1.05),
					currentX + (int) (housex1 * 3.03), currentY + housey2);
			
			//floor
			g2.setColor(Color.decode("#4c3c22"));
			g2.drawLine(currentX + housex1, currentY + housey2, currentX + (int) (housex2 * 0.97), currentY + housey2);

			

			// roof of the house
			g2.setStroke(new BasicStroke((int) semicolumnStroke));
			int[] roof1 = { currentX + (int) ((housex1) / 0.9), currentX + (int) (housex1 * 3),
					currentX + (int) ((housex1) * 3.2), currentX + (int) (housex1 / 1.2) };
			int[] roof2 = { currentY + (int) (housey1 / 1.1), currentY + (int) (housey1 / 1.1),
					currentY + (int) (housey1 * 1.05), currentY + (int) (housey1 * 1.05) };
			var roof = new Polygon(roof1, roof2, 4);
            g2.setColor(Color.decode("#746544"));
			g2.setStroke(new BasicStroke((int) windowStroke));
			g2.draw(roof);		
			g2.setStroke(new BasicStroke((int) semicolumnStroke));
			g2.fill(roof);
			
			
			// door left		

			int[] door1 = { currentX + (int) (housex1 * 1.2), currentX + (int) (housex1 * 1.5),
					currentX + (int) (housex1 * 1.5), currentX + (int) (housex1 * 1.2) };

			int[] DOOR1 = { currentY + (int) (housey1 * 1.6), currentY + (int) (housey1 * 1.6),
					currentY + (int) (housey2 * 0.959), currentY + (int) (housey2 * 0.959) };
			var door = new Polygon(door1, DOOR1, 4);
			// draw the door to give frame and then fill it up
			g2.setStroke(new BasicStroke((int) windowStroke));
			g2.draw(door);
			g2.setStroke(new BasicStroke((int) semicolumnStroke));
			g2.setColor(Color.decode(WinDoor));
			g2.fill(door);
            
			//window center
			int[] window2 = { currentX + (int) (housex1 * 2.6), currentX + (int) (housex1 * 2.9),
					currentX + (int) (housex1 * 2.9), currentX + (int) (housex1 * 2.6) };
			int[] WINDOW2 = { currentY + (int) (housey1 * 1.3), currentY + (int) (housey1 * 1.3),
					currentY + (int) (housey1 * 1.8), currentY + (int) (housey1 * 1.8) };
			var WINDOWS = new Polygon(window2, WINDOW2, 4);
			// draw the window to give frame and then fill it up
			g2.setColor(Color.decode("#746544"));
			g2.setStroke(new BasicStroke((int) windowStroke));
			g2.draw(WINDOWS);
			g2.setColor(Color.decode(WinDoor));
			g2.setStroke(new BasicStroke((int) semicolumnStroke));
			g2.fill(WINDOWS);

			// window right
			g2.setColor(Color.decode("#746544"));
			int[] window1 = { currentX + (int) (housex1 * 1.9), currentX + (int) (housex1 * 2.2),
					currentX + (int) (housex1 * 2.2), currentX + (int) (housex1 * 1.9) };
			int[] WINDOW1 = { currentY + (int) (housey1 * 1.3), currentY + (int) (housey1 * 1.3),
					currentY + (int) (housey1 * 1.8), currentY + (int) (housey1 * 1.8) };
			var windows = new Polygon(window1, WINDOW1, 4);
			// draw the window to give frame and then fill it up
			g2.draw(windows);
			g2.setColor(Color.decode(WinDoor));
			g2.setStroke(new BasicStroke((int) semicolumnStroke));
			g2.fill(windows);

			// grids
			g2.setColor(Color.decode("#746544"));
			g2.drawLine(currentX + (int) (housex1 * 2.055), currentY + (int) (housey1 * 1.3),
					currentX + (int) (housex1 * 2.055), currentY + (int) (housey1 * 1.8));
			g2.drawLine(currentX + (int) ((housex1 * 1.9)), currentY + (int) (housey1 * 1.55),
					currentX + (int) (housex1 * 2.21), (int) (currentY + (housey1 * 1.55)));

			g2.drawLine(currentX + (int) ((housex1 * 2.9) / 1.055), currentY + (int) (housey1 * 1.3),
					currentX + (int) ((housex1 * 2.9) / 1.055), currentY + (int) (housey1 * 1.8));

			g2.drawLine(currentX + (int) ((housex1 * 2.6)), currentY + (int) (housey1 * 1.55),
					currentX + (int) (housex1 * 2.9), (int) (currentY + (housey1 * 1.55)));
		}

	}// end of method

	private void typesroof() {
		for (int i = 0; i < levels; i++) {
			if (levels == 1) {
				//drawing the bank
				g2.setColor(Color.decode("#746544"));
				int[] style1 = { (int) (currentX + housex1 * 1.1), (int) (currentX + housex2 * 0.97),
						(int) (currentX + housex2 * 0.97), (int) (currentX + housex1 * 1.1) };
				int[] STYLE1 = { (int) (currentY + housey1 / 2), (int) (currentY + housey1 / 2), currentY + housey2,
						currentY + housey2 };
				var ROOF1 = new Polygon(style1, STYLE1, 4);
				g2.setStroke(new BasicStroke((int) windowStroke));
				g2.draw(ROOF1);
				g2.setColor(Color.decode(HouseColor));
				g2.fill(ROOF1);
				//setting the color for font and writing bank in it
				g2.setColor(Color.black);
				g2.setFont(new Font("SANS SERIF", Font.BOLD, Word));				
				g2.drawString("BANK", (int) (currentX + housex1 * 1.7), (int) (currentY + housey1 / 1.5));
			} else if (levels == 2) {
				g2.setColor(Color.decode("#746544"));
				int[] style1 = { (int) (currentX + housex1 * 1.1), (int) (currentX + housex2 * 0.97),
						(int) (currentX + housex2 * 0.97), (int) (currentX + housex1 * 1.1) };
				int[] STYLE1 = { (int) (currentY + housey1 / 2), (int) (currentY + housey1 / 2), currentY + housey2,
						currentY + housey2 };
				var ROOF1 = new Polygon(style1, STYLE1, 4);
				g2.setStroke(new BasicStroke((int) windowStroke));
				g2.draw(ROOF1);
				g2.setColor(Color.decode(HouseColor));
				g2.fill(ROOF1);
				// window left
				g2.setColor(Color.decode("#746544"));

				int[] window1 = { currentX + (int) (housex1 * 1.2), currentX + (int) (housex1 * 1.5),
						currentX + (int) (housex1 * 1.5), currentX + (int) (housex1 * 1.2) };

				int[] WINDOW1 = { currentY + (int) (housey1 / 1.8), currentY + (int) (housey1 / 1.8),
						currentY + (int) (housey1 * 0.8), currentY + (int) (housey1 * 0.8) };
				var windows = new Polygon(window1, WINDOW1, 4);
				
				// draw the window to give frame and then fill it up
				g2.setStroke(new BasicStroke((int) windowStroke));
				g2.draw(windows);
				g2.setColor(Color.decode(WinDoor));
				g2.setStroke(new BasicStroke((int) semicolumnStroke));
				g2.fill(windows);
				
				//window center
				g2.setColor(Color.decode("#746544"));
				g2.setStroke(new BasicStroke((int) windowStroke));
				int[] window3 = { currentX + (int) (housex1 * 1.9), currentX + (int) (housex1 * 2.2),
						currentX + (int) (housex1 * 2.2), currentX + (int) (housex1 * 1.9) };
				int[] WINDOW3 = { currentY + (int) (housey1 / 1.8), currentY + (int) (housey1 / 1.8),
						currentY + (int) (housey1 * 0.8), currentY + (int) (housey1 * 0.8) };
				var windows3 = new Polygon(window3, WINDOW3, 4);

				// draw the window to give frame and then fill it up
				g2.draw(windows3);
			    g2.setColor(Color.decode(WinDoor));
				g2.setStroke(new BasicStroke((int) semicolumnStroke));
				g2.fill(windows3);

				// window right

				int[] window2 = { currentX + (int) (housex1 * 2.6), currentX + (int) (housex1 * 2.9),
						currentX + (int) (housex1 * 2.9), currentX + (int) (housex1 * 2.6) };
				int[] WINDOW2 = { currentY + (int) (housey1 / 1.8), currentY + (int) (housey1 / 1.8),
						currentY + (int) (housey1 * 0.8), currentY + (int) (housey1 * 0.8) };
				var WINDOWS = new Polygon(window2, WINDOW2, 4);

				// draw the window to give frame and then fill it up
				g2.setColor(Color.decode("#746544"));
				g2.setStroke(new BasicStroke((int) windowStroke));
				g2.draw(WINDOWS);
				g2.setColor(Color.decode(WinDoor));
				g2.setStroke(new BasicStroke((int) semicolumnStroke));
				g2.fill(WINDOWS);

			} else if (levels == 3) {
				//Saloon building
				g2.setColor(Color.decode("#746544"));
				int[] style1 = { (int) (currentX + housex1 * 1.1), (int) (currentX + housex2 * 0.97),
						(int) (currentX + housex2 * 0.97), (int) (currentX + housex1 * 1.1) };
				int[] STYLE1 = { (int) (currentY + housey1 / 2), (int) (currentY + housey1 / 2), currentY + housey2,
						currentY + housey2 };
				var ROOF1 = new Polygon(style1, STYLE1, 4);
				g2.setColor(Color.decode("#746544"));
				g2.setStroke(new BasicStroke((int) windowStroke));
				g2.draw(ROOF1);
				g2.setColor(Color.decode(HouseColor));
				g2.fill(ROOF1);
				// Drawing the arch
				g2.fill (new Arc2D.Double(  (int) (currentX + housex1*1.6 ),( int) (currentY + housey1 / 7.5) , arc,  arc, 0, 180, Arc2D.OPEN));
				g2.setStroke(new BasicStroke((int) semicolumnStroke));
				g2.setColor(Color.decode("#746544"));
				g2.draw (new Arc2D.Double(  (int) (currentX + housex1*1.6 ),( int) (currentY + housey1 / 7.5) , arc,  arc, 0, 180, Arc2D.OPEN));
				//setting the color for font and writing bank in it
				g2.setColor(Color.black);
				g2.setFont(new Font("SANS SERIF", Font.BOLD, (int) (Word*0.9)));
				g2.drawString("SALON", (int) (currentX + housex1 * 1.65), (int) (currentY + housey1 / 2.1));
			}
		}

	}// end of method */

}// end of class Tree
