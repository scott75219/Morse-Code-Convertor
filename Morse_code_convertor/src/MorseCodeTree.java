
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;




 
public class MorseCodeTree   {
	 static TreeMap<String, Character> myTree = new TreeMap<String,Character>(new MorseCodeComparator());
	 public MorseCodeTree(){
			buildTree();
		 }
	public static void buildTree() {
		myTree.put("",' ');
		
		myTree.put(".",'e');
		myTree.put("-",'t');
		
		myTree.put("..",'i');
		myTree.put(".-",'a');
		myTree.put("--",'m');
		myTree.put("-.",'n');
		
		myTree.put("...",'s');
		myTree.put("..-",'u');
		myTree.put(".-.",'r');
		myTree.put(".--",'w');
		myTree.put("-..",'d');
		myTree.put("-.-",'k');
		myTree.put("--.",'g');
		myTree.put("---",'o');
		
		myTree.put("....",'h');
		myTree.put("...-",'v');
		myTree.put("..-.",'f');
		myTree.put(".-..",'l');
		myTree.put(".--.",'p');
		myTree.put(".---",'j');
		myTree.put("-...",'b');
		myTree.put("-..-",'x');
		myTree.put("-.-.",'c');
		myTree.put("-.--",'y');
		myTree.put("--..",'z');
		myTree.put("--.-",'q');
	}
	
	public static String PrintTree()
	{
		String Print="";
		Set set = myTree.entrySet(); 
		// Get an iterator 
		Iterator i = set.iterator(); 
		// Display elements 
		while(i.hasNext()) { 
		Map.Entry me = (Map.Entry)i.next(); 
		Print+=me.getValue() + " ";
		}
		System.out.print(Print);
		return Print;
	}
	
}


