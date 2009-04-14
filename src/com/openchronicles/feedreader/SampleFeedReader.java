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

       // TODO: convert this class into a useful example of the use of ujo-feedreader
       String path = SampleFeedReader.class.getPackage().getName().replace('.', '/');
       URL url = SampleFeedReader.class.getResource("/" + path + "/resources/sample.atom");
       File atomFile = new File(url.getPath());
       
       try {
           AtomFeed feed = UjoManagerXML.getInstance().parseXML(atomFile, AtomFeed.class, "Data Loading");
           FileWriter out = new FileWriter("first_output.xml");
           UjoManagerXML.getInstance().saveXML(out, "feed", feed, null, "Feed export");
           out.close();
       } catch (Exception e) {
           System.out.println(e.getMessage() + e.getCause());
       }

       try {
           AtomFeed feed = UjoManagerXML.getInstance().parseXML(atomFile, AtomFeed.class, "Data Loading");
           FileWriter out = new FileWriter("second_output.xml");
           UjoManagerXML.getInstance().saveXML(out, "feed", feed, null, "Feed export");
           out.close();
       } catch (Exception e) {
           System.out.println(e.getMessage() + e.getCause());
       }
    }
}
