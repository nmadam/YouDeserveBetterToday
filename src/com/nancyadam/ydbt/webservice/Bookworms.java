package com.nancyadam.ydbt.webservice;

        import org.w3c.dom.Document;
        import org.xml.sax.InputSource;
        import org.xml.sax.SAXException;

        import javax.xml.parsers.DocumentBuilder;
        import javax.xml.parsers.DocumentBuilderFactory;
        import java.awt.print.Book;
        import java.io.*;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.util.ArrayList;

/**
 * Created by Alex on 5/6/2016.
 */
public class Bookworms {
    private final static String SERVICE_URL = "http://tomcat2-savannaholson.rhcloud.com/webService%5Fwar/webService/";

    public String getJSONBooksByAuthorName(String firstName, String lastName) throws IOException, SAXException {
        URL bookWormsUrl = null;
        try {

            bookWormsUrl = new URL(SERVICE_URL + firstName + "/" + lastName);
        } catch (MalformedURLException ex) {

            return "";
        }

        InputStream in = null;
        BufferedReader reader = null;

        String json = "";
        try {
            in = bookWormsUrl.openStream();
            reader = new BufferedReader(new InputStreamReader(in));

            String line = null;

            while ((line = reader.readLine()) != null) {

                json += line;

            }

        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return json;
    }

    /*public ArrayList<Book> getBook() {

    }*/

}