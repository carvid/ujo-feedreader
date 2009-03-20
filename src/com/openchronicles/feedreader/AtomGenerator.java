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
public class AtomGenerator extends MapUjo {
    // atom common attributes
    @XmlAttribute
    public static final UjoProperty<AtomGenerator,String> BASE   = newProperty("base", null);
    @XmlAttribute
    public static final UjoProperty<AtomGenerator,String> LANG   = newProperty("lang", null);

    // generator elements
    public static final UjoProperty<AtomGenerator,String> URI      = newProperty("uri"   , "");
    public static final UjoProperty<AtomGenerator,String> VERSION  = newProperty("email" , "");
}
