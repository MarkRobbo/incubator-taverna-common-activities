package net.sf.taverna.t2.activities.xpath;

import net.sf.taverna.t2.visit.VisitKind;
import net.sf.taverna.t2.visit.Visitor;

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
	public Class<? extends Visitor> getVisitorClass() {
		return XPathActivityHealthChecker.class;
	}

	private static class Singleton {
		private static XPathActivityHealthCheck instance = new XPathActivityHealthCheck();
	}

	public static XPathActivityHealthCheck getInstance() {
		return Singleton.instance;
	}
}
