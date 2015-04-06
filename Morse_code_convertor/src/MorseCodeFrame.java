import javax.swing.JFrame;

/**
 * Creates the frame for morse code convertor
 * @author Scott Goldweber
 *
 */
public class MorseCodeFrame {

	public static void main (String[] args){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MorseCodePanel panel = new MorseCodePanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}