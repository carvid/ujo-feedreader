package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;

/**
 * This class represents the id (unique identifier) element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomId extends MapUjo {
    // atom common attributes
    @XmlAttribute
    public static final UjoProperty<AtomId,String> BASE   = newProperty("base", "");
    @XmlAttribute
    public static final UjoProperty<AtomId,String> LANG   = newProperty("lang", "");

    public static final UjoProperty<AtomId,String> ID     = newProperty("id", "");
}

