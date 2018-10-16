import com.java.XML_Parsing_TEST.XML_Parsing_test;

public class app {
	public static void main(String[] args) {
		XML_Parsing_test xmlParsor = new XML_Parsing_test();
		try {
//			./
			xmlParsor.parseTest("src/com/java/XML_Parsing_TEST/XMLFile.xml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
