/**
 * *****************************************************************************
 * Copyright (C) 2012 Spanish National Bioinformatics Institute (INB),
 * Barcelona Supercomputing Center and The University of Manchester
 *
 * Modifications to the initial code base are copyright of their respective
 * authors, or their employers as appropriate.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307
 *****************************************************************************
 */

package net.sf.taverna.wsdl.parser;

/**
 * @author Dmitry Repchevsky
 */

public enum WSRF_RPOperation {
    
    GetResourcePropertyDocument("http://docs.oasis-open.org/wsrf/rpw-2/GetResourcePropertyDocument/GetResourcePropertyDocumentRequest"),
    GetResourceProperty("http://docs.oasis-open.org/wsrf/rpw-2/GetResourceProperty/GetResourcePropertyRequest"),
    GetMultipleResourceProperties("http://docs.oasis-open.org/wsrf/rpw-2/GetMultipleResourceProperties/GetMultipleResourcePropertiesRequest"),
    QueryResourceProperties("http://docs.oasis-open.org/wsrf/rpw-2/QueryResourceProperties/QueryResourcePropertiesRequest"),
    QueryExpressionDialect("http://docs.oasis-open.org/wsrf/rpw-2/QueryResourceProperties/QueryResourcePropertiesRequest"),
    PutResourcePropertyDocument("http://docs.oasis-open.org/wsrf/rpw-2/PutResourcePropertyDocument/PutResourcePropertyDocumentRequest"),
    SetResourceProperties("http://docs.oasis-open.org/wsrf/rpw-2/SetResourceProperties/SetResourcePropertiesRequest"),
    InsertResourceProperties("http://docs.oasis-open.org/wsrf/rpw-2/InsertResourceProperties/InsertResourcePropertiesRequest"),
    UpdateResourceProperties("http://docs.oasis-open.org/wsrf/rpw-2/UpdateResourceProperties/UpdateResourcePropertiesRequest"),
    DeleteResourceProperties("http://docs.oasis-open.org/wsrf/rpw-2/DeleteResourceProperties/DeleteResourcePropertiesRequest");
    
    public final String SOAP_ACTION;
    
    private WSRF_RPOperation(String req_action) {
        SOAP_ACTION = req_action;
    }
}
