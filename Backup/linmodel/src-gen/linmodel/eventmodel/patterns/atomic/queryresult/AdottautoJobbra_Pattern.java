package linmodel.eventmodel.patterns.atomic.queryresult;

import linmodel.eventmodel.events.queryresult.AdottautoJobbra_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class AdottautoJobbra_Pattern extends AtomicEventPatternImpl {
  public AdottautoJobbra_Pattern() {
    super();
    setType(AdottautoJobbra_Event.class.getCanonicalName());
    setId("linmodel.eventmodel.patterns.atomic.queryresult.adottautojobbra_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
