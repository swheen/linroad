package linmodel.eventmodel.patterns.atomic.queryresult;

import linmodel.eventmodel.events.queryresult.AdottautoFelhajt_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class AdottautoFelhajt_Pattern extends AtomicEventPatternImpl {
  public AdottautoFelhajt_Pattern() {
    super();
    setType(AdottautoFelhajt_Event.class.getCanonicalName());
    setId("linmodel.eventmodel.patterns.atomic.queryresult.adottautofelhajt_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
