package linmodel.eventmodel.patterns.atomic.queryresult;

import linmodel.eventmodel.events.queryresult.AdottautoLehajt_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class AdottautoLehajt_Pattern extends AtomicEventPatternImpl {
  public AdottautoLehajt_Pattern() {
    super();
    setType(AdottautoLehajt_Event.class.getCanonicalName());
    setId("linmodel.eventmodel.patterns.atomic.queryresult.adottautolehajt_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
