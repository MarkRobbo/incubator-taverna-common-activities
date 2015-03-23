/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements. See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership. The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.apache.taverna.activities.xpath;

import org.apache.taverna.visit.VisitKind;
import org.apache.taverna.visit.Visitor;

/**
 * A <code>XPathActivityHealthCheck</code> is a kind of visit that determines if
 * the corresponding XPath activity in a workflow (normally an Activity) will
 * work during a workflow run.
 * 
 * @author Sergejs Aleksejevs
 */
public class XPathActivityHealthCheck extends VisitKind {

	// The following values indicate the type of results that can be associated
	// with a VisitReport generated by a health-checking visitor.

	public static final int CORRECTLY_CONFIGURED = 0;
	public static final int EMPTY_XPATH_EXPRESSION = 5;
	public static final int INVALID_XPATH_EXPRESSION = 10;
	public static final int GENERAL_CONFIG_PROBLEM = 15;

	public static final int NO_EXAMPLE_DOCUMENT = 20;
	public static final int MISSING_NAMESPACE_MAPPINGS = 25;

	@Override
	public Class<? extends Visitor<?>> getVisitorClass() {
		return XPathActivityHealthChecker.class;
	}

	private static class Singleton {
		private static XPathActivityHealthCheck instance = new XPathActivityHealthCheck();
	}

	public static XPathActivityHealthCheck getInstance() {
		return Singleton.instance;
	}
}
