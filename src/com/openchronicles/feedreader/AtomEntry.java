package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;

/**
 * This class represents the entry element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public class AtomEntry extends AtomElement {
    /* sub-elements */
    public static final UjoProperty<AtomEntry,AtomId>      ID
         = newProperty("id",      AtomId.class);
    public static final UjoProperty<AtomEntry,AtomContent> CONTENT
         = newProperty("content", AtomContent.class);
    public static final UjoProperty<AtomEntry,AtomTitle>   TITLE
         = newProperty("title",   AtomTitle.class);
    public static final UjoProperty<AtomEntry,AtomUpdated> UPDATED
         = newProperty("updated", AtomUpdated.class);

    /* collections */
    public static final ListProperty<AtomEntry,AtomAuthor> AUTHORS
        = newPropertyList("author", AtomAuthor.class);
    public static final ListProperty<AtomFeed,AtomLink>    LINKS
        = newPropertyList("link",   AtomLink.class);
}
