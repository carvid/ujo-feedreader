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
import java.net.URL;

import org.ujoframework.core.UjoManagerXML;

public class SampleFeedReader {
    public static void main(String args[]) {

        String url = args[0];

        try {
            // get feed
            AtomFeed feed = FeedManager.readFeed(url);

            // display feed's title
            System.out.println ("\n");
            System.err.println ("=== " + AtomTitle.BODY.of(AtomFeed.TITLE.of(feed)) + " ===");

            // display feed's links
            for (AtomLink link : AtomFeed.LINKS.of(feed)) {
                System.err.println ("* URL: " + AtomLink.HREF.of(link));
            }

            for (AtomEntry item : AtomFeed.ENTRIES.of(feed)) {

                //displays item's title
                System.out.println ("\n");
                System.out.println (AtomTitle.BODY.of ((AtomEntry.TITLE.of(item))) +
                    "(" + AtomUpdated.BODY.of ((AtomEntry.UPDATED.of(item))) + ")");
                System.out.println ("-------------------------------------------------------------");

                //displays item's authors
                for (AtomAuthor author : AtomEntry.AUTHORS.of(item)) {
                    System.out.println ("* Author: " + AtomAuthor.NAME.of(author) +
                        " <" + AtomAuthor.EMAIL.of(author) + ">");
                }

                //displays item's content (limit to 100 characters)
                System.out.println ("\n");
                System.out.println (AtomContent.BODY.of ((AtomEntry.CONTENT.of(item))).length() <= 100
                    ? AtomContent.BODY.of ((AtomEntry.CONTENT.of(item)))
                    : AtomContent.BODY.of ((AtomEntry.CONTENT.of(item))).substring(1,100) + "..."
                );
            }

        } catch (Exception e) {
            System.err.println("No se pudo iniciar el canal.");
            System.err.println(e.getMessage());
        }
    }
}
