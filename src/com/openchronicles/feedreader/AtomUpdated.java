package com.openchronicles.feedreader;

import java.util.ArrayList;
import java.util.Date;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;

/**
 * This class represents the updated element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomUpdated extends MapUjo {
    // atom common attributes
    @XmlAttribute
    public static final UjoProperty<AtomUpdated,String> BASE   = newProperty("base", "");
    @XmlAttribute
    public static final UjoProperty<AtomUpdated,String> LANG   = newProperty("lang", "");

    // atom updated elements
    public static final UjoProperty<AtomUpdated,Date> DATE  = newProperty("date", new Date());
}

