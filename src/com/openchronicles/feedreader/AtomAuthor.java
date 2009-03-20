package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;

/**
 * This class represents the author element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomAuthor extends MapUjo {
    // atom common attributes
    @XmlAttribute
    public static final UjoProperty<AtomAuthor,String> BASE   = newProperty("base", "");
    @XmlAttribute
    public static final UjoProperty<AtomAuthor,String> LANG   = newProperty("lang", "");

    // atom person elements
    public static final UjoProperty<AtomAuthor,String> NAME   = newProperty("name"  , "");
    public static final UjoProperty<AtomAuthor,String> URI    = newProperty("uri"   , "");
    public static final UjoProperty<AtomAuthor,String> EMAIL  = newProperty("email" , "");
}

