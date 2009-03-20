package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;

/**
 * This class represents the title element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomTitle extends MapUjo {
    // atom common attributes
    @XmlAttribute
    public static final UjoProperty<AtomTitle,String> BASE   = newProperty("base", "");
    @XmlAttribute
    public static final UjoProperty<AtomTitle,String> LANG   = newProperty("lang", "");

    // atom title elements
    public static final UjoProperty<AtomTitle,String> TITLE  = newProperty("title", "");
}

