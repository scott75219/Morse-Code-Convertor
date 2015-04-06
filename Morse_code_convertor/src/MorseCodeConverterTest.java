
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MorseCodeConverterTest {
	File inputFile;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertToEnglishString() {
		String test1="hello world";		
		String converter1 = MorseCodeConverter.convertToEnglish(".... . .-.. .-.. --- / .-- --- .-. .-.. -.. ");
		assertTrue(converter1.equals(test1));
		
		String test2="i love you";		
		String converter2 = MorseCodeConverter.convertToEnglish(".. / .-.. --- ...- . / -.-- --- ..- ");
		assertTrue(converter2.equals(test2));
		
		//*******Personal Test: This test will take in a sentence that has all 26 letters
		String test3="the quick brown fox jumps over the lazy dog";		
		String converter3 = MorseCodeConverter.convertToEnglish("- .... . / --.- ..- .. -.-. -.- / -... .-. --- .-- -. / ..-. --- -..- / .--- ..- -- .--. ... / --- ...- . .-. / - .... . / .-.. .- --.. -.-- / -.. --- --.");
		assertTrue(converter3.equals(test3));
		
		//***Tests for repetitive letters
		String test4="eee hhh ttt";		
		String converter4 = MorseCodeConverter.convertToEnglish(". . . / .... .... .... / - - -");
		assertTrue(converter4.equals(test4));
	}

	@Test
	public void testConvertToEnglishFile() throws FileNotFoundException {
		String test1="how do i love thee let me count the ways";		
		getFile("howDoILoveThee.txt");
		String converter1 = MorseCodeConverter.convertToEnglish(inputFile);
		assertTrue(converter1.equals(test1));
		
		String test2="love looks not with the eyes but with the mind";		
		getFile("LoveLooksNot.txt");
		String converter2 = MorseCodeConverter.convertToEnglish(inputFile);
		assertTrue(converter2.equals(test2));
		
		//** Tests file for all 26 characters
		String test3="the quick brown fox jumps over the lazy dog";		
		getFile("QuickBrownFox.txt");
		String converter3 = MorseCodeConverter.convertToEnglish(inputFile);
		assertTrue(converter3.equals(test3));

	}
	
	public void getFile(String in) throws FileNotFoundException {		
		JFileChooser chooser = new JFileChooser();
		int status;

		chooser.setDialogTitle("Select Input File - " + in);
		status = chooser.showOpenDialog(null);

		if(status == JFileChooser.APPROVE_OPTION)
		{
			try
			{
				inputFile = chooser.getSelectedFile();
				// readFile();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null, "There is a problem with this file", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
