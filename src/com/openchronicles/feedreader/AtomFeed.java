package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;

/**
 * This class represents the root element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomFeed extends MapUjo {
    public static final UjoProperty<AtomFeed,String> TITLE   = newProperty("title"  , "");
    public static final UjoProperty<AtomFeed,String> LINK    = newProperty("link"   , "");
    public static final UjoProperty<AtomFeed,String> ID      = newProperty("id"     , "");
    public static final UjoProperty<AtomFeed,String> UPDATED = newProperty("updated", "");
}
