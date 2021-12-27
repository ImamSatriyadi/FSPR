package Sesi_10;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class ParseKnownXmlStructure {
    public static void main(String[] args) throws Exception {
        // GET DOCUMENT BUILDER
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // BUILD DOCUMENT
        Document document = builder.parse(new File("Sesi_10/employee.xml"));

        // NORMALIZE THE XML STRUCTURE; IT'S JUST TOO IMPORTANT !!
        document.getDocumentElement().normalize();

        // HERE COMES THE ROOT NODE
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());

        // GET ALL EMPLOYEE
        NodeList nList = document.getElementsByTagName("employee");
        System.out.println("==============================");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            System.out.println("");
            ;
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                // PRINT EACH EMPLOYEE'S DETAIL
                Element eElement = (Element) node;
                eElement.getParentNode().removeChild(eElement);

                System.out.println("Employee id : " + eElement.getAttribute("id"));
                System.out
                        .println("First Name : " + eElement.getElementsByTagName("firstName").item(0).getTextContent());
                System.out.println("Last Name : " + eElement.getElementsByTagName("lastName").item(0).getTextContent());
                System.out.println("Location : " + eElement.getElementsByTagName("location").item(0).getTextContent());

            }
        }
    }
}
