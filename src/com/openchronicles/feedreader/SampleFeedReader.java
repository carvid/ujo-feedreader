package com.openchronicles.feedreader;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

import org.ujoframework.core.UjoManagerXML;

public class SampleFeedReader {
    public static void main(String args[]) {
        AtomFeed feed = new AtomFeed();
        AtomTitle title = new AtomTitle();
        AtomId id = new AtomId();
        AtomUpdated updated = new AtomUpdated();

        AtomTitle.TITLE.setValue( title, "Sample feed");
        AtomId.ID.setValue( id, "1");
        AtomUpdated.DATE.setValue( updated, new Date());

        AtomFeed.TITLE.setValue( feed, title);
        AtomFeed.ID.setValue( feed, id);
        AtomFeed.UPDATED.setValue( feed, updated);

        try {
            FileWriter out = new FileWriter("file.xml");
            UjoManagerXML.getInstance().saveXML(out, "feed", feed, null, "My Export");
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
