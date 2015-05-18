package linmodel.eventmodel.patterns.atomic.queryresult;

import linmodel.eventmodel.events.queryresult.AdottautoBalra_Event;
import org.eclipse.viatra.cep.core.metamodels.events.impl.AtomicEventPatternImpl;

@SuppressWarnings("all")
public class AdottautoBalra_Pattern extends AtomicEventPatternImpl {
  public AdottautoBalra_Pattern() {
    super();
    setType(AdottautoBalra_Event.class.getCanonicalName());
    setId("linmodel.eventmodel.patterns.atomic.queryresult.adottautobalra_pattern");
  }
  
  public boolean evaluateCheckExpression() {
    return true;
  }
}
