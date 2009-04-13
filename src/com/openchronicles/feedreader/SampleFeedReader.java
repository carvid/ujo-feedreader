/*
 *  Copyright 2009 Carlos David González Abraham
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
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
        AtomAuthor author = new AtomAuthor();

        AtomTitle.TITLE.setValue( title, "Sample feed");
        AtomId.ID.setValue( id, "1");
        AtomUpdated.BODY.setValue( updated, new Date().toString());
        AtomAuthor.NAME.setValue( author, "Carlos David González Abraham");

        AtomFeed.TITLE.setValue( feed, title);
        AtomFeed.ID.setValue( feed, id);
        AtomFeed.UPDATED.setValue( feed, updated);
        //AtomFeed.AUTHOR.setValue( feed, author);

        try {
            FileWriter out = new FileWriter("file.xml");
            UjoManagerXML.getInstance().saveXML(out, "feed", feed, null, "My Export");
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

       File result = new File("/home/carvid/desarrollo/rsstask/issues.atom");
       try {
           AtomFeed feedreader = UjoManagerXML.getInstance().parseXML(result, AtomFeed.class, "Data Loading");
           System.out.println(AtomFeed.TITLE.getValue(feedreader));

            FileWriter out = new FileWriter("file.xml");
            UjoManagerXML.getInstance().saveXML(out, "feed", feedreader, null, "My Export");
            out.close();
       } catch (Exception e) {
           System.out.println(e.getMessage() + e.getCause());
       }

    }
}
