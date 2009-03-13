package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;

/**
 * This class represents the entry element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomEntry extends MapUjo {
    public static final UjoProperty<AtomEntry,String> TITLE   = newProperty("title", "");
    public static final UjoProperty<AtomEntry,String> LINK    = newProperty("link", null);
    public static final UjoProperty<AtomEntry,String> ID      = newProperty("id", "");
    public static final UjoProperty<AtomEntry,String> UPDATED = newProperty("updated", "");
}
