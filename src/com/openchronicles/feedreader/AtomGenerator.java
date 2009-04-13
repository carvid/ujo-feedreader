package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;

/**
 * This class represents the generator element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomGenerator extends AtomElement {
    /* attributes */
     @XmlAttribute
    public static final UjoProperty<AtomGenerator,String> URI
        = newProperty("uri",   "");
    @XmlAttribute
    public static final UjoProperty<AtomGenerator,String> VERSION
        = newProperty("email", "");

    /* body */
    public static final UjoProperty<AtomGenerator,String> BODY
        = newProperty("body",  "");
}

