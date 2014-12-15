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

package de.hpi.fgis.ldp.shared.rpc.rules;

import net.customware.gwt.dispatch.shared.Result;

import com.google.gwt.user.client.rpc.IsSerializable;

public class OntologyAlignmentResult implements Result, IsSerializable {

  private static final long serialVersionUID = 1997077551537309113L;
  private long processIdentifier;

  protected OntologyAlignmentResult() {
    // hide default constructor
  }

  public OntologyAlignmentResult(long processIdentifier) {
    this.processIdentifier = processIdentifier;
  }

  /**
   * gets the process identifier
   * 
   * @return the process identifier
   */
  public long getProcessIdentifier() {
    return processIdentifier;
  }
}