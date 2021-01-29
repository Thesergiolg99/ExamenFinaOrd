package ufv.dis.final2021.SLG;

import java.io.FileNotFoundException;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        ArrayList<IP> ip = new ArrayList<IP>();

        ip = LeerJson.leerFicheroJson();


    }
}
