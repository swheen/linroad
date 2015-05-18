package linmodel.eventmodel.mapping;

import linmodel.eventmodel.events.queryresult.AdottautoBalra_Event;
import linmodel.eventmodel.events.queryresult.AdottautoFelhajt_Event;
import linmodel.eventmodel.events.queryresult.AdottautoJobbra_Event;
import linmodel.eventmodel.events.queryresult.AdottautoLehajt_Event;
import linroad.queries.CarGoesEastMatch;
import linroad.queries.CarGoesEastMatcher;
import linroad.queries.CarGoesWestMatch;
import linroad.queries.CarGoesWestMatcher;
import linroad.queries.CarIsOnDownRampMatch;
import linroad.queries.CarIsOnDownRampMatcher;
import linroad.queries.CarIsOnUpRampMatch;
import linroad.queries.CarIsOnUpRampMatcher;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.evm.specific.Lifecycles;
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryActivationStateEnum;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.cep.core.streams.EventStream;
import org.eclipse.viatra.emf.runtime.rules.EventDrivenTransformationRuleGroup;
import org.eclipse.viatra.emf.runtime.rules.eventdriven.EventDrivenTransformationRule;
import org.eclipse.viatra.emf.runtime.rules.eventdriven.EventDrivenTransformationRuleFactory;
import org.eclipse.viatra.emf.runtime.transformation.eventdriven.EventDrivenTransformation;
import org.eclipse.viatra.emf.runtime.transformation.eventdriven.InconsistentEventSemanticsException;

@SuppressWarnings("all")
public class QueryEngine2ViatraCep {
  private EventStream eventStream;
  
  private ResourceSet resourceSet;
  
  private EventDrivenTransformation transformation;
  
  private QueryEngine2ViatraCep(final ResourceSet resourceSet, final EventStream eventStream) {
    this.resourceSet = resourceSet;
    this.eventStream = eventStream;
    registerRules();
  }
  
  public static QueryEngine2ViatraCep register(final ResourceSet resourceSet, final EventStream eventStream) {
    return new QueryEngine2ViatraCep(resourceSet, eventStream);
  }
  
  public EventDrivenTransformationRuleGroup getRules() {
    EventDrivenTransformationRuleGroup ruleGroup = new EventDrivenTransformationRuleGroup(
    	createcarGoesWest_MappingRule(), 
    	createcarIsOnDownRamp_MappingRule(), 
    	createcarGoesEast_MappingRule(), 
    	createcarIsOnUpRamp_MappingRule()
    );
    return ruleGroup;
  }
  
  private void registerRules() {
    try {
    	transformation = EventDrivenTransformation.forScope(new EMFScope(resourceSet)).addRules(getRules()).create();
    } catch (IncQueryException e) {
    	e.printStackTrace();
    }
  }
  
  public EventDrivenTransformationRule<CarGoesWestMatch, CarGoesWestMatcher> createcarGoesWest_MappingRule() {
    try{
      EventDrivenTransformationRuleFactory.EventDrivenTransformationBuilder<CarGoesWestMatch, CarGoesWestMatcher> builder = new EventDrivenTransformationRuleFactory().createRule();
      builder.addLifeCycle(Lifecycles.getDefault(false, true));
      builder.precondition(CarGoesWestMatcher.querySpecification());
      
      IMatchProcessor<CarGoesWestMatch> actionOnAppear_0 = new IMatchProcessor<CarGoesWestMatch>() {
        public void process(final CarGoesWestMatch matchedPattern) {
          AdottautoJobbra_Event event = new AdottautoJobbra_Event(null);event.setCar((linroad.Car)matchedPattern.get(0));
          event.setIde((java.lang.String)matchedPattern.get(1));
          
          event.setIncQueryPattern(matchedPattern);
          eventStream.push(event);
        }
      };
      builder.action(IncQueryActivationStateEnum.APPEARED, actionOnAppear_0);
      
      IMatchProcessor<CarGoesWestMatch> actionOnDisappear_0 = new IMatchProcessor<CarGoesWestMatch>() {
        public void process(final CarGoesWestMatch matchedPattern) {
        }
      };
      builder.action(IncQueryActivationStateEnum.DISAPPEARED, actionOnDisappear_0);
      
      return builder.build();
    } catch (IncQueryException e) {
      e.printStackTrace();
    } catch (InconsistentEventSemanticsException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public EventDrivenTransformationRule<CarIsOnDownRampMatch, CarIsOnDownRampMatcher> createcarIsOnDownRamp_MappingRule() {
    try{
      EventDrivenTransformationRuleFactory.EventDrivenTransformationBuilder<CarIsOnDownRampMatch, CarIsOnDownRampMatcher> builder = new EventDrivenTransformationRuleFactory().createRule();
      builder.addLifeCycle(Lifecycles.getDefault(false, true));
      builder.precondition(CarIsOnDownRampMatcher.querySpecification());
      
      IMatchProcessor<CarIsOnDownRampMatch> actionOnAppear_0 = new IMatchProcessor<CarIsOnDownRampMatch>() {
        public void process(final CarIsOnDownRampMatch matchedPattern) {
          AdottautoLehajt_Event event = new AdottautoLehajt_Event(null);event.setCar((linroad.Car)matchedPattern.get(0));
          event.setIde((java.lang.String)matchedPattern.get(1));
          
          event.setIncQueryPattern(matchedPattern);
          eventStream.push(event);
        }
      };
      builder.action(IncQueryActivationStateEnum.APPEARED, actionOnAppear_0);
      
      IMatchProcessor<CarIsOnDownRampMatch> actionOnDisappear_0 = new IMatchProcessor<CarIsOnDownRampMatch>() {
        public void process(final CarIsOnDownRampMatch matchedPattern) {
        }
      };
      builder.action(IncQueryActivationStateEnum.DISAPPEARED, actionOnDisappear_0);
      
      return builder.build();
    } catch (IncQueryException e) {
      e.printStackTrace();
    } catch (InconsistentEventSemanticsException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public EventDrivenTransformationRule<CarGoesEastMatch, CarGoesEastMatcher> createcarGoesEast_MappingRule() {
    try{
      EventDrivenTransformationRuleFactory.EventDrivenTransformationBuilder<CarGoesEastMatch, CarGoesEastMatcher> builder = new EventDrivenTransformationRuleFactory().createRule();
      builder.addLifeCycle(Lifecycles.getDefault(false, true));
      builder.precondition(CarGoesEastMatcher.querySpecification());
      
      IMatchProcessor<CarGoesEastMatch> actionOnAppear_0 = new IMatchProcessor<CarGoesEastMatch>() {
        public void process(final CarGoesEastMatch matchedPattern) {
          AdottautoBalra_Event event = new AdottautoBalra_Event(null);event.setCar((linroad.Car)matchedPattern.get(0));
          event.setIde((java.lang.String)matchedPattern.get(1));
          
          event.setIncQueryPattern(matchedPattern);
          eventStream.push(event);
        }
      };
      builder.action(IncQueryActivationStateEnum.APPEARED, actionOnAppear_0);
      
      IMatchProcessor<CarGoesEastMatch> actionOnDisappear_0 = new IMatchProcessor<CarGoesEastMatch>() {
        public void process(final CarGoesEastMatch matchedPattern) {
        }
      };
      builder.action(IncQueryActivationStateEnum.DISAPPEARED, actionOnDisappear_0);
      
      return builder.build();
    } catch (IncQueryException e) {
      e.printStackTrace();
    } catch (InconsistentEventSemanticsException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public EventDrivenTransformationRule<CarIsOnUpRampMatch, CarIsOnUpRampMatcher> createcarIsOnUpRamp_MappingRule() {
    try{
      EventDrivenTransformationRuleFactory.EventDrivenTransformationBuilder<CarIsOnUpRampMatch, CarIsOnUpRampMatcher> builder = new EventDrivenTransformationRuleFactory().createRule();
      builder.addLifeCycle(Lifecycles.getDefault(false, true));
      builder.precondition(CarIsOnUpRampMatcher.querySpecification());
      
      IMatchProcessor<CarIsOnUpRampMatch> actionOnAppear_0 = new IMatchProcessor<CarIsOnUpRampMatch>() {
        public void process(final CarIsOnUpRampMatch matchedPattern) {
          AdottautoFelhajt_Event event = new AdottautoFelhajt_Event(null);event.setCar((linroad.Car)matchedPattern.get(0));
          event.setIde((java.lang.String)matchedPattern.get(1));
          
          event.setIncQueryPattern(matchedPattern);
          eventStream.push(event);
        }
      };
      builder.action(IncQueryActivationStateEnum.APPEARED, actionOnAppear_0);
      
      IMatchProcessor<CarIsOnUpRampMatch> actionOnDisappear_0 = new IMatchProcessor<CarIsOnUpRampMatch>() {
        public void process(final CarIsOnUpRampMatch matchedPattern) {
        }
      };
      builder.action(IncQueryActivationStateEnum.DISAPPEARED, actionOnDisappear_0);
      
      return builder.build();
    } catch (IncQueryException e) {
      e.printStackTrace();
    } catch (InconsistentEventSemanticsException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public void dispose() {
    this.transformation = null;
  }
}
