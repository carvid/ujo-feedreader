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
    // atom updated elements
    @XmlElementBody
    public static final UjoProperty<AtomUpdated,Date> DATE  = newProperty("date", new Date());
}

