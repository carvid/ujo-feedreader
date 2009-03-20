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

    @XmlAttribute
    public static final UjoProperty<AtomFeed,String> XMLNS   = newProperty("xmlns"  , "");

    public static final UjoProperty<AtomFeed,AtomTitle>   TITLE   = newProperty("title"  , AtomTitle.class);
    public static final UjoProperty<AtomFeed,AtomId>      ID      = newProperty("id"     , AtomId.class);
    public static final UjoProperty<AtomFeed,AtomUpdated> UPDATED = newProperty("updated", AtomUpdated.class);
}
