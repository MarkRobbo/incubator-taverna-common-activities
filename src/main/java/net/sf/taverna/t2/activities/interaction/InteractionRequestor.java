/**
 *
 */
package net.sf.taverna.t2.activities.interaction;

import java.util.Map;

/**
 * @author alanrw
 * 
 */
public interface InteractionRequestor {

	String getRunId();

	Map<String, Object> getInputData();

	void fail(String string);

	void carryOn();

	String generateId();

	InteractionActivityType getPresentationType();

	InteractionType getInteractionType();

	String getPresentationOrigin();

	void receiveResult(Map<String, Object> resultMap);

}