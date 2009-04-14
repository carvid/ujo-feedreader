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

import java.io.FileWriter;
import java.io.File;
import java.net.URL;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.ujoframework.core.UjoManagerXML;

/**
 * Testcase of AtomFeed class.
 *
 * @author Carlos David González Abraham &lt;
 * <a href="mailto:carlosdavid@gonzalez-abraham.com.mx">carlosdavid@gonzalez-abraham.com.mx</a>&gt;
*/
public class AtomFeedTest extends TestCase {

    public static final String ATOM_FILE = "sample.atom";

    private String atomFilePath;
    private URL atomFileUrl;

    public static Test suite() {
        return new TestSuite(AtomFeedTest.class);
    }

    protected void setUp() {
        atomFilePath = getClass().getPackage().getName().replace('.', '/');
        System.out.println ("path: " + atomFilePath);
        atomFileUrl = getClass().getResource("/" + atomFilePath + "/resources/" + ATOM_FILE);
    }

    // ------------------------------------------------------------------------
    // tests
    // ------------------------------------------------------------------------

    public void testParseAtomFile() throws Exception {
        System.out.println("Atom file path: " + atomFileUrl.getPath());
        File atomFile = new File(atomFileUrl.getPath());
        System.out.println("File: " + atomFile);

        // FIXME: for some reson the next line its not parsing the input file correctly
        AtomFeed feed = UjoManagerXML.getInstance().parseXML(atomFile, AtomFeed.class, "Data Loading");
        AtomTitle title = AtomFeed.TITLE.getValue(feed);

        assertEquals ("title element", "Sample Atom file", AtomTitle.BODY.getValue(title));
    }
}
