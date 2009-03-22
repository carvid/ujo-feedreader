package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;

/**
 * This abstract class represents a element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public abstract class AtomElement extends MapUjo {
    // atom common attributes
    @XmlAttribute
    public static final UjoProperty<AtomAuthor,String> BASE   = newProperty("base", "");
    @XmlAttribute
    public static final UjoProperty<AtomAuthor,String> LANG   = newProperty("lang", "");
}

