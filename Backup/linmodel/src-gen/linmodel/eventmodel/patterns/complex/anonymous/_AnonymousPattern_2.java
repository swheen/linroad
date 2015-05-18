package linmodel.eventmodel.patterns.complex.anonymous;

import com.google.common.collect.Lists;
import linmodel.eventmodel.patterns.atomic.queryresult.AdottautoJobbra_Pattern;
import linmodel.eventmodel.patterns.complex.anonymous._AnonymousPattern_1;
import org.eclipse.viatra.cep.core.api.patterns.ParameterizableComplexEventPattern;
import org.eclipse.viatra.cep.core.metamodels.events.EventsFactory;

@SuppressWarnings("all")
public class _AnonymousPattern_2 extends ParameterizableComplexEventPattern {
  public _AnonymousPattern_2() {
    super();
    setOperator(EventsFactory.eINSTANCE.createOR());
    
    // contained event patterns
    addEventPatternRefrence(new _AnonymousPattern_1(), 1);
    addEventPatternRefrence(new AdottautoJobbra_Pattern(), 1, Lists.newArrayList("ide", "sajt"));
    setId("linmodel.eventmodel.patterns.complex.anonymous._anonymouspattern_2");
  }
}
