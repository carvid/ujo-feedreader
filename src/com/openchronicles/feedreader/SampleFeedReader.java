package com.openchronicles.feedreader;

import java.io.File;
import java.io.FileWriter;

import org.ujoframework.core.UjoManagerXML;

public class SampleFeedReader {
    public static void main(String args[]) {
        AtomFeed feed = new AtomFeed();

        AtomFeed.TITLE.setValue(   feed, "Sample feed");
        AtomFeed.LINK.setValue(    feed, "Link");
        AtomFeed.ID.setValue(      feed, "1");
        AtomFeed.UPDATED.setValue( feed, "2009-03-12");

        try {
            FileWriter out = new FileWriter("file.xml");
            UjoManagerXML.getInstance().saveXML(out, "feed", feed, null, "My Export");
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
