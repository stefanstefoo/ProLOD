/*-
 * Copyright 2012 by: Hasso Plattner Institute for Software Systems Engineering 
 * Prof.-Dr.-Helmert-Str. 2-3
 * 14482 Potsdam, Germany
 * Potsdam District Court, HRB 12184
 * Authorized Representative Managing Director: Prof. Dr. Christoph Meinel
 * http://www.hpi-web.de/
 * 
 * Information Systems Group, http://www.hpi-web.de/naumann/
 * 
 * 
 * Licence: http://creativecommons.org/licenses/by-sa/3.0/
 * 
 */

package de.hpi.fgis.ldp.shared.data;

/**
 * represents a object
 * 
 * @author toni.gruetze
 * 
 */
public class ObjectValue extends DataElement {
  private static final long serialVersionUID = 9054321690935960654L;

  protected ObjectValue() {
    // hide default constructor
  }

  /**
   * creates a new abstract pattern for different objects in the db
   * 
   * @param pattern the pattern of the object
   */
  public ObjectValue(final String pattern) {
    this.id = -1;
    this.label = pattern;
  }

  /**
   * creates a new object with the given attributes
   * 
   * @param id the id of the object
   * @param name the name of the object
   */
  public ObjectValue(final int id, final String name) {
    this.id = id;
    this.label = name;
  }
}