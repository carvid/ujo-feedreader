package com.openchronicles.feedreader;

import java.util.ArrayList;
import java.util.Date;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;
import org.ujoframework.core.annot.XmlElementBody;

/**
 * This class represents the updated element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomUpdated extends AtomElement {
    /* body */
    @XmlElementBody
    public static final UjoProperty<AtomUpdated,String> BODY
        = newProperty("body", "");
}

