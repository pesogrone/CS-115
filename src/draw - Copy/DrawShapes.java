package draw;

import java.awt.EventQueue;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



/**
 * Main class used to run a DrawShapes program.
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawShapes extends JPanel {
	//Attributes
	private static final long serialVersionUID = 6311020027600344213L;
	
	/**
	 * Main method to run the DrawShapes program.
	 * This method sets up a JFrame, creates a DrawPanel to go inside the JFrame, and turns everything visible.
	 *   
	 * No arguments expected
	 * No return
	 */
	public static void main(String[] args) {
		//put the ranger.wav file inside the draw package
		
		
		EventQueue.invokeLater(new Runnable() {			//Program runs inside an EventQueue
			public void run() {
				JFrame frame = new JFrame();			//Create a new JFrame object called frame
				frame.setTitle("Draw12a Shapes");			//Set the attributes of the frame object
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);
				frame.setLocationByPlatform(true);
				frame.setContentPane(new DrawPanel());	//Create a new DrawPanel object and sets the content pane of the frame to it
				frame.pack();							//Pack the frame around the DrawPanel so the frame is an exact fit around the DrawPanel object
				frame.setVisible(true);					//Set the frame and everything inside it to visible
			}//end of public void run()
		}); //end of EventQueue.inovkeLater
	}//end of method main()
	
	
}//end of class DrawShapes
