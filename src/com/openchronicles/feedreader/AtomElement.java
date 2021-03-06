/*
 *  Copyright 2009 Carlos David González Abraham
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.openchronicles.feedreader;

import java.util.ArrayList;

import org.ujoframework.UjoProperty;
import org.ujoframework.extensions.UjoAction;
import org.ujoframework.extensions.ListProperty;
import org.ujoframework.implementation.map.MapUjo;
import org.ujoframework.core.annot.XmlAttribute;
import static org.ujoframework.extensions.UjoAction.*;

/**
 * This abstract class represents a element of the Atom 1.0 specification.
 * @author Carlos David González Abraham
 */
public abstract class AtomElement extends MapUjo {
    // atom common attributes
    @XmlAttribute
    public static final UjoProperty<AtomAuthor,String> BASE = newProperty("base", "");
    @XmlAttribute
    public static final UjoProperty<AtomAuthor,String> LANG = newProperty("lang", "");

    @Override
    /** Prevents to XML export of properties with default value. */
    public boolean readAuthorization(UjoAction action, UjoProperty property, Object value) {
        switch(action.getType()) {
            case ACTION_XML_EXPORT:
                return !property.isDefault(this);
            default:
                return super.readAuthorization(action, property, value);
        }
    }
}

