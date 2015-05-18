package linmodel.eventmodel.patterns.complex.anonymous;

import com.google.common.collect.Lists;
import linmodel.eventmodel.patterns.atomic.queryresult.AdottautoBalra_Pattern;
import linmodel.eventmodel.patterns.atomic.queryresult.AdottautoJobbra_Pattern;
import org.eclipse.viatra.cep.core.api.patterns.ParameterizableComplexEventPattern;
import org.eclipse.viatra.cep.core.metamodels.events.EventsFactory;

@SuppressWarnings("all")
public class _AnonymousPattern_1 extends ParameterizableComplexEventPattern {
  public _AnonymousPattern_1() {
    super();
    setOperator(EventsFactory.eINSTANCE.createFOLLOWS());
    
    // contained event patterns
    addEventPatternRefrence(new AdottautoBalra_Pattern(), 1, Lists.newArrayList("ide", "sajt"));
    addEventPatternRefrence(new AdottautoJobbra_Pattern(), 1, Lists.newArrayList("ide", "sajt"));
    setId("linmodel.eventmodel.patterns.complex.anonymous._anonymouspattern_1");
  }
}
