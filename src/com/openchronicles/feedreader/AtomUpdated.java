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

