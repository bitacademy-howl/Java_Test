package com.java.XML_Parsing_TEST;

//import java.io.ByteArrayInputStream;
import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

public class XML_Parsing_test {
	
	public void parseTest(String xml) throws Exception {
		
//		byte [] b = new byte[1024];
		File f = new File(xml);
//		File f = new File("/XMLFile.xml");
//		InputStream is = new FileInputStream(f);
		
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getCanonicalPath());
		
//		is.read(b);
//		is.close();
//		System.out.println(is.read());
//		String XML_String = new String(b);
//		System.out.println(XML_String);
//		
		
//		InputStream bais = new ByteArrayInputStream(b);
		
		
//		System.out.println(new String(b));
		
	    Document doc = parseXML(f);
//	    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	    System.out.println(doc.getChildNodes().getLength());
////	    
	    NodeList nl = doc.getElementsByTagName("res");
//	    System.out.println(nl.item(0).getFirstChild());
//	    System.out.println(nl.getLength());
	    System.out.println(nl);
	    System.out.println(nl.item(0));
	    Node root = doc.getDocumentElement().getAttributeNode("id");
	    
	    System.out.println(root);
	    Node node = nl.item(0);
	    node.getAttributes().getNamedItem("name");
	    System.out.println(node.getAttributes().getNamedItem("name"));
//	    NodeList chnl = node.getChildNodes();
//	     >>>>> 아래의 한줄로...
//	    NodeList chnl = nl.item(0).getChildNodes();
////	    System.out.println(chnl);
//	    
//	    
//	    for (int i =0; i < chnl.getLength(); i++) {
////	    	System.out.println(chnl.item(i));
//	        System.out.println(chnl.item(i).getNodeName()+"="+ chnl.item(i).getTextContent());
//	    }
//	    
	    
	    
//	    System.out.println(node.get);

//	    while(node != null) {
//	        if (node.getNodeName().equals("code")) {
//	            System.out.println("code="+ node.getFirstChild().getNodeValue());
//	        } else if (node.getNodeName().equals("msg")) {
//	            System.out.println("msg="+ node.getFirstChild().getNodeValue());
//	        }
//	    }
	}

//	private Document parseXML(InputStream stream) throws Exception{
	private Document parseXML(File f) throws Exception{
	    DocumentBuilderFactory objDocumentBuilderFactory = null;
	    DocumentBuilder objDocumentBuilder = null;
	    Document doc = null;

	    try{

	        objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
	        objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();

	        doc = objDocumentBuilder.parse(f);

	    }catch(Exception ex){
	        throw ex;
	    }       

	    return doc;
	}
}
