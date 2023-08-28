package DrawTreeBaseline;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class Cloud extends LandscapeObject {
	// Attributes
	private int levels;
	private String cloudColor;

	// position
	private int cloud1 = 35;
	// dimension
	private int cloudx1 = 27;
	private int cloudy1 = 25;
	// position
	private int cloud2 = 26;
	private int cloud2y = 8;
	// dimension
	private int cloudx2 = 21;
	private int cloudy2 = 18;

	// position
	private int cloud3 = 55;
	private int cloud3y = 14;
	// dimension
	private int cloudx3 = 15;
	private int cloudy3 = 13;
	// body
	private int bodyx1 = 35;
	private int bodyy1 = 10;
	private int bodyx4 = 35;
	private int bodyy4 = 26;
	private int bodyx2 = 62;
	private int bodyy2 = 14;
	private int bodyx3 = 62;
	private int bodyy3 = 27;

	// private String cloudColors;
	private BasicStroke Strokes = new BasicStroke(1);

	public Cloud(Graphics2D g2, int x, int y, double scale, int levels, String cloudColor) {
		super(g2, x, y, scale);
		this.levels = levels;
		this.cloudColor = "#" + cloudColor;

	}// end of Constructor Tree

	// Methods
	public void draw() {
		applyScale();
		for (int i = 1; i <= levels; i++) {
			currentX = (int) (currentX + (15 * -getScale()));
			currentY = (int) (currentY + (20 * getScale()));
			drawCloud2();
			drawCloud3();
			drawCloud();

		}
	}// end of method draw()

	public void applyScale() {
		bodyx1 = (int) (bodyx1 * getScale());
		bodyy1 = (int) (bodyy1 * getScale());
		bodyx2 = (int) (bodyx2 * getScale());
		bodyy2 = (int) (bodyy2 * getScale());
		bodyx3 = (int) (bodyx3 * getScale());
		bodyy3 = (int) (bodyy3 * getScale());
		bodyx4 = (int) (bodyx4 * getScale());
		bodyy4 = (int) (bodyy4 * getScale());
		cloudx1 = (int) (cloudx1 * getScale());
		cloudy1 = (int) (cloudy1 * getScale());
		cloudx2 = (int) (cloudx2 * getScale());
		cloudy2 = (int) (cloudy2 * getScale());
		cloudx3 = (int) (cloudx3 * getScale());
		cloudy3 = (int) (cloudy3 * getScale());
		cloud1 = (int) (cloud1 * getScale());
		cloud2 = (int) (cloud2 * getScale());
		cloud3 = (int) (cloud3 * getScale());
		cloud2y = (int) (cloud2y * getScale());
		cloud3y = (int) (cloud3y * getScale());
	}// end of method applyScale()

	private void drawCloud() {
		// drawing center arch
		g2.setStroke(new BasicStroke(8));
		g2.setColor(Color.black);

		g2.fillArc(currentX + cloud1, currentY, cloudx1, cloudy1, -8, 180);

		g2.draw(new Arc2D.Double(currentX + cloud1, currentY, cloudx1, cloudy1, -8, 180, Arc2D.OPEN));
		g2.setStroke(new BasicStroke(1));
		g2.setColor(Color.decode(cloudColor));
		g2.fill(new Arc2D.Double(currentX + cloud1, currentY, cloudx1, cloudy1, -8, 180, Arc2D.OPEN));

		// drawing a line to give border
		g2.setStroke(new BasicStroke(8));
		g2.setColor(Color.black);
		g2.drawLine(currentX + bodyx3, currentY + bodyy3, currentX + bodyx4, currentY + bodyy4);

		// drawing a square
		g2.setStroke(new BasicStroke(1));
		g2.setColor(Color.decode(cloudColor));
		int[] B1 = { currentX + bodyx1, currentX + bodyx2, currentX + bodyx3, currentX + bodyx4 };
		int[] B2 = { currentY + bodyy1, currentY + bodyy2, currentY + bodyy3, currentY + bodyy4 };
		var body = new Polygon(B1, B2, 4);
		g2.fill(body);

	}// end of method drawTrunk()

	private void drawCloud2() {
		// drawing left oval
		var cloud_2 = new Ellipse2D.Double(currentX + cloud2, currentY + cloud2y, cloudx2, cloudy2);
		g2.setStroke(new BasicStroke(8));
		g2.setColor(Color.black);
		g2.draw(cloud_2);

		g2.setColor(Color.decode(cloudColor));

		g2.fill(cloud_2);

	}// end of method drawCoud2()

	private void drawCloud3() {
		// drawing right oval
		var cloud_3 = new Ellipse2D.Double(currentX + cloud3, currentY + cloud3y, cloudx3, cloudy3);
		g2.setStroke(new BasicStroke(8));
		g2.setColor(Color.black);
		g2.draw(cloud_3);

		g2.setColor(Color.decode(cloudColor));
		g2.fill(cloud_3);
	}

}// end of class Cloud