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

package de.hpi.fgis.ldp.shared.rpc;

import com.google.gwt.user.client.rpc.IsSerializable;

import de.hpi.fgis.ldp.shared.data.table.IDataTable;

public class DataTableResult implements CachableResult, IsSerializable {
  private static final long serialVersionUID = 8315341463508308493L;
  private IDataTable dataTable;

  protected DataTableResult() {
    // hide default constructor
  }

  public DataTableResult(final IDataTable data) {

    this.dataTable = data;
  }

  public IDataTable getDataTable() {
    return this.dataTable;
  }

  public long getProcessIdentifier() {
    // TODO Auto-generated method stub
    return 0;
  }
}