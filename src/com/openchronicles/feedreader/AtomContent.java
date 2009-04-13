package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;
import org.ujoframework.core.annot.XmlElementBody;

/**
 * This class represents the content element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomContent extends AtomElement {
    /* attributes */
    @XmlAttribute
    public static final UjoProperty<AtomContent,String> TYPE
        = newProperty("type", "");

    /* body */
    @XmlElementBody
    public static final UjoProperty<AtomContent,String> BODY
        = newProperty("body", "");
}

