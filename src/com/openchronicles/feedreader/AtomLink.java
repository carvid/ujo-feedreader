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
public class AtomLink extends AtomElement {
    /* attributes */
    @XmlAttribute
    public static final UjoProperty<AtomLink,String> HREF
        = newProperty("href",     "");
    @XmlAttribute
    public static final UjoProperty<AtomLink,String> REL
        = newProperty("rel",      "");
    @XmlAttribute
    public static final UjoProperty<AtomLink,String> TYPE
        = newProperty("type",     "");
    @XmlAttribute
    public static final UjoProperty<AtomLink,String> HREFLANG
        = newProperty("hreflang", "");
    @XmlAttribute
    public static final UjoProperty<AtomLink,String> TITLE
        = newProperty("title",    "");
    @XmlAttribute
    public static final UjoProperty<AtomLink,String> LENGTH
        = newProperty("length",   "");
}

