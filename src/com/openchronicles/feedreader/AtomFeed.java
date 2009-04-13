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

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;

/**
 * This class represents the root element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomFeed extends MapUjo {
    /* attributes */
    @XmlAttribute
    public static final UjoProperty<AtomFeed,String>        XMLNS
        = newProperty("xmlns",     "");

    /* properties */
    public static final UjoProperty<AtomFeed,AtomId>        ID
        = newProperty("id",        AtomId.class);
    public static final UjoProperty<AtomFeed,AtomGenerator> GENERATOR
        = newProperty("generator", AtomGenerator.class);
    public static final UjoProperty<AtomFeed,AtomTitle>     TITLE
        = newProperty("title",     AtomTitle.class);
    public static final UjoProperty<AtomFeed,AtomUpdated>   UPDATED
        = newProperty("updated",   AtomUpdated.class);

    /* collections */
    public static final ListProperty<AtomFeed,AtomAuthor>   AUTHORS
        = newPropertyList("author", AtomAuthor.class);
    public static final ListProperty<AtomFeed,AtomLink>     LINKS
        = newPropertyList("link",   AtomLink.class);
    public static final ListProperty<AtomFeed,AtomEntry>    ENTRIES
        = newPropertyList("entry",  AtomEntry.class);
}
