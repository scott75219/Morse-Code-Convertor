import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Morse Code Data Structure
 * @author Scott Goldweber
 *
 */

public class MorseCodeConverter {
	static MorseCodeTree Tree= new MorseCodeTree();
	
	public static  String convertToEnglish(File inputFile) throws FileNotFoundException  {
		String word="";
		String Sentance="";
		Scanner WordReader = new Scanner(inputFile);
		while(WordReader.hasNext()){
				word=WordReader.next();
				if(!word.equals("/")){
				Character letter= Tree.myTree.get(word);
				if(letter==' ')
					throw new FileNotFoundException("File does not contain correct morse code");	
				Sentance=Sentance+String.valueOf(letter);
				}
				else
					Sentance=Sentance+" ";
		}
		return Sentance;
		
	}

	public static  String convertToEnglish(String string) throws NoCodeFoundException {
		String word="";
		String Sentance="";
		if(string.equals(""))
			throw new NoCodeFoundException("Enter Morse Code");
		else{
		Scanner WordReader = new Scanner(string);
		while(WordReader.hasNext()){
				word=WordReader.next();
				if(!word.equals("/")){
				Character letter= Tree.myTree.get(word);
				if (!letter.isLetter(letter))
					throw new NoCodeFoundException(word + " is not a valaid morse code");					

				Sentance=Sentance+String.valueOf(letter);
				}
				else
					Sentance=Sentance+" ";
		}
		return Sentance;
		}
	}


}
