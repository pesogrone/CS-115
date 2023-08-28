package DrawTreeBaseline;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Random;

public class Horse extends LandscapeObject {

	// Attributes
	// horse mane
	private int levels;
	private int melenax1 = 165;
	private int melenay1 = 50;
	private int melenax2 = 230;
	private int melenay2 = -15;
	private int melenastroke = 20;

	// body
	private int bodyx1 = 50;
	private int bodyy1 = 50;
	private int bodyx2 = 200;
	private int bodyy2 = 50;
	private int bodyx3 = 200;
	private int bodyy3 = 125;
	private int bodyx4 = 50;
	private int bodyy4 = 125;
	// tail
	private int tailx1 = 50;
	private int taily1 = 61;
	private int tailx2 = 10;
	private int taily2 = 100;
	// neck

	private int neckx1 = 170;
	private int necky1 = 50;
	private int neckx2 = 200;
	private int necky2 = 110;
	private int neckx3 = 256;
	private int necky3 = 56;
	private int neckx4 = 210;
	private int necky4 = 9;
	// head
	private int headx1 = 210;
	private int heady1 = 9;
	private int headx2 = 256;
	private int heady2 = 56;
	private int headx3 = 290;
	private int heady3 = 21;
	private int headx4 = 244;
	private int heady4 = -25;
	// ear1
	private int earStroke = 9;
	private int earx1 = 247;
	private int eary1 = -20;
	private int earx2 = 255;
	private int eary2 = -12;
	private int earx3 = 263;
	private int eary3 = -30;
	// ear2
	private int earx4 = 251;
	private int eary4 = -16;
	private int earx5 = 259;
	private int eary5 = -8;
	private int earx6 = 269;
	private int eary6 = -22;
	// nose
	private int nosex1 = 256;
	private int nosey1 = 56;
	private int nosex2 = 275;
	private int nosey2 = 72;
	private int nosex3 = 300;
	private int nosey3 = 48;
	private int nosex4 = 282;
	private int nosey4 = 28;
	// eye
	private int eyex1 = 240;
	private int eyey1 = -5;
	private int eye = 15;
	// eye dot
	private int eyedx1 = 243;
	private int eyedy1 = -2;
	private int eyed = 8;
	// legs left (left)
	private int legx1 = 61;
	private int legy1 = 134;
	private int legx2 = 61;
	private int legy2 = 180;

	// legs left right
	private int legx3 = 65;
	private int legy3 = 134;
	private int legx4 = 90;
	private int legy4 = 177;
	// right left
	private int legx5 = 190;
	private int legy5 = 134;
	private int legx6 = 190;
	private int legy6 = 180;
	// right right
	private int legx7 = 194;
	private int legy7 = 134;
	private int legx8 = 219;
	private int legy8 = 177;
	// horse hoof
	private int shoe1 = 10;
	private int shoe2 = 10;

	private String earsstroke;
	private String Haircolor = "";
	private String horseColor = "#000000"; // default color is black

	private BasicStroke horse = new BasicStroke(1);

	public Horse(Graphics2D g2, int x, int y, double scale, String color, String color2) {
		super(g2, x, y, scale);
		this.levels = levels;
		this.horseColor = color;
		this.Haircolor = color2;

	}

	// Methods
	public void draw() {
		applyScale();
		drawHorse();

	}

	public void repaint() {

		drawHorse();
	}

	public void applyScale() {
		// body
		bodyx1 = (int) (bodyx1 * getScale());
		bodyy1 = (int) (bodyy1 * getScale());
		bodyx2 = (int) (bodyx2 * getScale());
		bodyy2 = (int) (bodyy2 * getScale());
		bodyx3 = (int) (bodyx3 * getScale());
		bodyy3 = (int) (bodyy3 * getScale());
		bodyx4 = (int) (bodyx4 * getScale());
		bodyy4 = (int) (bodyy4 * getScale());
		// horse mane
		melenax1 = (int) (melenax1 * getScale());
		melenay1 = (int) (melenay1 * getScale());
		melenax2 = (int) (melenax2 * getScale());
		melenay2 = (int) (melenay2 * getScale());
		melenastroke = (int) (melenastroke * getScale());
		// neck
		neckx1 = (int) (neckx1 * getScale());
		necky1 = (int) (necky1 * getScale());
		neckx2 = (int) (neckx2 * getScale());
		necky2 = (int) (necky2 * getScale());
		neckx3 = (int) (neckx3 * getScale());
		necky3 = (int) (necky3 * getScale());
		neckx4 = (int) (neckx4 * getScale());
		necky4 = (int) (necky4 * getScale());
		// head
		headx1 = (int) (headx1 * getScale());
		headx2 = (int) (headx2 * getScale());
		headx3 = (int) (headx3 * getScale());
		headx4 = (int) (headx4 * getScale());
		heady1 = (int) (heady1 * getScale());
		heady2 = (int) (heady2 * getScale());
		heady3 = (int) (heady3 * getScale());
		heady4 = (int) (heady4 * getScale());
		// nose
		nosex1 = (int) (nosex1 * getScale());
		nosex2 = (int) (nosex2 * getScale());
		nosex3 = (int) (nosex3 * getScale());
		nosex4 = (int) (nosex4 * getScale());
		nosey1 = (int) (nosey1 * getScale());
		nosey2 = (int) (nosey2 * getScale());
		nosey3 = (int) (nosey3 * getScale());
		nosey4 = (int) (nosey4 * getScale());
		// ear
		earx1 = (int) (earx1 * getScale());
		earx2 = (int) (earx2 * getScale());
		earx3 = (int) (earx3 * getScale());
		eary1 = (int) (eary1 * getScale());
		eary2 = (int) (eary2 * getScale());
		eary3 = (int) (eary3 * getScale());
		earx4 = (int) (earx4 * getScale());
		earx5 = (int) (earx5 * getScale());
		earx6 = (int) (earx6 * getScale());
		eary4 = (int) (eary4 * getScale());
		eary5 = (int) (eary5 * getScale());
		eary6 = (int) (eary6 * getScale());
		earStroke = (int) (earStroke * getScale());
		// eye
		eyex1 = (int) (eyex1 * getScale());
		eyey1 = (int) (eyey1 * getScale());
		eye = (int) (eye * getScale());
		eyedx1 = (int) (eyedx1 * getScale());
		eyedy1 = (int) (eyedy1 * getScale());
		eyed = (int) (eyed * getScale());
		// leg
		legx1 = (int) (legx1 * getScale());
		legy1 = (int) (legy1 * getScale());
		legx2 = (int) (legx2 * getScale());
		legy2 = (int) (legy2 * getScale());
		legx3 = (int) (legx3 * getScale());
		legy3 = (int) (legy3 * getScale());
		legx4 = (int) (legx4 * getScale());
		legy4 = (int) (legy4 * getScale());
		legx5 = (int) (legx5 * getScale());
		legy5 = (int) (legy5 * getScale());
		legx6 = (int) (legx6 * getScale());
		legy6 = (int) (legy6 * getScale());
		legx7 = (int) (legx7 * getScale());
		legy7 = (int) (legy7 * getScale());
		legx8 = (int) (legx8 * getScale());
		legy8 = (int) (legy8 * getScale());
		// horse hoof
		shoe1 = (int) (shoe1 * getScale());
		shoe2 = (int) (shoe2 * getScale());
		// tail
		tailx1 = (int) (tailx1 * getScale());
		taily1 = (int) (taily1 * getScale());
		tailx2 = (int) (tailx2 * getScale());
		taily2 = (int) (taily2 * getScale());

	}

	private void drawHorse() {

		// horse mane
		g2.setColor(Color.decode(Haircolor));
		g2.setStroke(new BasicStroke(melenastroke));
		g2.drawLine(currentX + melenax1, currentY + melenay1, currentX + melenax2, currentY + melenay2);

		// Neck
		g2.setColor(Color.decode(horseColor));
		int[] n1 = { currentX + neckx1, currentX + neckx2, currentX + neckx3, currentX + neckx4 };
		int[] n2 = { currentY + necky1, currentY + necky2, currentY + necky3, currentY + necky4 };
		var neck = new Polygon(n1, n2, 4);
		g2.fill(neck);

		// head
		g2.setColor(Color.decode(horseColor));
		int[] x1 = { currentX + headx1, currentX + headx2, currentX + headx3, currentX + headx4 };
		int[] y1 = { currentY + heady1, currentY + heady2, currentY + heady3, currentY + heady4 };
		var head = new Polygon(x1, y1, 4);
		g2.fill(head);

		// nose
		g2.setColor(Color.black);
		int[] no1 = { currentX + nosex1, currentX + nosex2, currentX + nosex3, currentX + nosex4 };
		int[] no2 = { currentY + nosey1, currentY + nosey2, currentY + nosey3, currentY + nosey4 };
		var nose = new Polygon(no1, no2, 4);
		g2.fill(nose);

		// right ear
		g2.setStroke(new BasicStroke(earStroke));
		g2.setColor(Color.decode(horseColor));
		int[] ear3 = { currentX + earx4, currentX + earx5, currentX + earx6 };
		int[] ear4 = { currentY + eary4, currentY + eary5, currentY + eary6 };
		var rightear = new Polygon(ear3, ear4, 3);
		// first drawing and then fill it to give borders
		g2.drawPolygon(ear3, ear4, 3);
		g2.setColor(Color.white);
		g2.fill(rightear);
		// Left ear
		g2.setColor(Color.decode(horseColor));

		int[] ear1 = { currentX + earx1, currentX + earx2, currentX + earx3 };
		int[] ear2 = { currentY + eary1, currentY + eary2, currentY + eary3 };
		var leftear = new Polygon(ear1, ear2, 3);
		// first drawing and then fill it to give borders
		g2.drawPolygon(ear1, ear2, 3);
		g2.setColor(Color.white);
		g2.fill(leftear);

		// eye circle
		g2.setColor(Color.white);

		g2.fillOval(currentX + eyex1, currentY + eyey1, eye, eye);

		g2.setColor(Color.black);
		g2.fillOval(currentX + eyedx1, currentY + eyedy1, eyed, eyed);

		// randomizing the legs of the horse
		Random randomObj = new Random();
		int randomNum1 = randomObj.nextInt(20 - 5);
		legx2 = legx2 + randomNum1;
		int randomNum2 = randomObj.nextInt(10 - (-10));
		legx4 = legx4 + randomNum2;
		int randomNum3 = randomObj.nextInt(20 - 5);
		legx6 = legx6 + randomNum1;
		int randomNum4 = randomObj.nextInt(10 - (-10));
		legx8 = legx8 + randomNum2;
		// LEGS
		////////////////////////////////////////////////////////////////////////////////////
		// horse hoof left 1
		g2.setStroke(new BasicStroke(melenastroke));
		g2.setColor(Color.decode("#573419"));
		g2.drawLine(currentX + legx4 - shoe2, currentY + legy4 - shoe2, currentX + legx4 + shoe2,
				currentY + legy4 + shoe2);
		// left 1
		g2.setColor(Color.white);
		g2.drawLine(currentX + legx3, currentY + legy3, currentX + legx4, currentY + legy4);
		////////////////////////////////////////////////////////////////////////////////////
		// horse hoof left 2
		g2.setColor(Color.decode("#573419"));
		g2.drawLine(currentX + legx1, currentY + legy1, currentX + legx2, currentY + legy2 + shoe1);
		// left 2
		g2.setColor(Color.white);
		g2.drawLine(currentX + legx1, currentY + legy1, currentX + legx2, currentY + legy2);
		/////////////////////////////////////////////////////////////////////////////////////
		// horse hoof right 1
		g2.setColor(Color.decode("#573419"));
		g2.drawLine(currentX + legx8 - shoe2, currentY + legy8 - shoe2, currentX + legx8 + shoe2,
				currentY + legy8 + shoe2);
		// Right 1
		g2.setColor(Color.white);
		g2.drawLine(currentX + legx7, currentY + legy7, currentX + legx8, currentY + legy8);
		///////////////////////////////////////////////////////////////////////////////////////
		// horse hoof right 2
		g2.setColor(Color.decode("#573419"));
		g2.drawLine(currentX + legx5, currentY + legy5, currentX + legx6, currentY + legy6 + shoe1);
		// Right 1
		g2.setColor(Color.white);
		g2.drawLine(currentX + legx5, currentY + legy5, currentX + legx6, currentY + legy6);
		/////////////////////////////////////////////////////////////////////////////////////////
		// TAIL
		// Randomizing positions to give the impression of moving tail
		int randomNum5 = randomObj.nextInt(10 - (-10));
		taily2 = taily2 + randomNum5;
        // color and drawing
		g2.setColor(Color.decode(Haircolor));
		g2.drawLine(currentX + tailx1, currentY + taily1, currentX + tailx2, currentY + taily2);

		// body Polygon
		g2.setColor(Color.decode(horseColor));
		int[] B1 = { currentX + bodyx1, currentX + bodyx2, currentX + bodyx3, currentX + bodyx4 };
		int[] B2 = { currentY + bodyy1, currentY + bodyy2, currentY + bodyy3, currentY + bodyy4 };
		var body = new Polygon(B1, B2, 4);
		g2.fill(body);

	}

}
