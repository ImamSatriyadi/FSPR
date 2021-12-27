package Sesi_10;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler2 extends DefaultHandler {
    private List<User2> users = new ArrayList<>();
    private User2 user;

    private boolean bfn = false;
    private boolean bln = false;
    private boolean boc = false;

    @Override
    public void startElement(String uri, String localName,
            String qName, Attributes attributes) throws SAXException {

        if ("user".equals(qName)) {

            user = new User2();

            int id = Integer.valueOf(attributes.getValue("id"));
            user.setId(id);
        }

        switch (qName) {

            case "firstname":
                bfn = true;
                break;

            case "lastname":
                bln = true;
                break;

        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (bfn) {
            user.setFirstname(new String(ch, start, length));
            bfn = false;
        }

        if (bln) {
            user.setLastname(new String(ch, start, length));
            bln = false;
        }

    }

    @Override
    public void endElement(String uri, String localName,
            String qName) throws SAXException {

        if ("user".equals(qName)) {
            users.add(user);
        }
    }

    public List<User2> getUsers() {

        return users;
    }
}
