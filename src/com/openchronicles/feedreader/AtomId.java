package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;
import org.ujoframework.core.annot.XmlElementBody;

/**
 * This class represents the id (unique identifier) element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomId extends AtomElement {
    @XmlElementBody
    public static final UjoProperty<AtomId,String> ID     = newProperty("id", "");
}

