package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;

/**
 * This class represents the link element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomLink extends MapUjo {
    // atom common attributes
    @XmlAttribute
    public static final UjoProperty<AtomLink,String> BASE   = newProperty("base", "");
    @XmlAttribute
    public static final UjoProperty<AtomLink,String> LANG   = newProperty("lang", "");

    // atom link elements
    public static final UjoProperty<AtomLink,String> HREF      = newProperty("href"     , "");
    public static final UjoProperty<AtomLink,String> REL       = newProperty("rel"      , "");
    public static final UjoProperty<AtomLink,String> TYPE      = newProperty("type"     , "");
    public static final UjoProperty<AtomLink,String> HREFLANG  = newProperty("hreflang" , "");
    public static final UjoProperty<AtomLink,String> TITLE     = newProperty("title"    , "");
    public static final UjoProperty<AtomLink,String> LENGTH    = newProperty("length"   , "");
}

