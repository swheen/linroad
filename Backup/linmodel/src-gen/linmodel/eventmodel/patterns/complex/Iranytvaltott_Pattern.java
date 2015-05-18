package linmodel.eventmodel.patterns.complex;

import com.google.common.collect.Lists;
import linmodel.eventmodel.patterns.atomic.queryresult.AdottautoBalra_Pattern;
import linmodel.eventmodel.patterns.complex.anonymous._AnonymousPattern_2;
import org.eclipse.viatra.cep.core.api.patterns.ParameterizableComplexEventPattern;
import org.eclipse.viatra.cep.core.metamodels.events.EventsFactory;

@SuppressWarnings("all")
public class Iranytvaltott_Pattern extends ParameterizableComplexEventPattern {
  public Iranytvaltott_Pattern() {
    super();
    setOperator(EventsFactory.eINSTANCE.createFOLLOWS());
    
    // contained event patterns
    addEventPatternRefrence(new _AnonymousPattern_2(), 1);
    addEventPatternRefrence(new AdottautoBalra_Pattern(), 1, Lists.newArrayList("ide", "sajt"));
    setId("linmodel.eventmodel.patterns.complex.iranytvaltott_pattern");
  }
}
