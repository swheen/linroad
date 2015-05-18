package linmodel.eventmodel;

import com.google.common.collect.Lists;
import java.util.List;
import linmodel.eventmodel.events.queryresult.AdottautoBalra_Event;
import linmodel.eventmodel.events.queryresult.AdottautoFelhajt_Event;
import linmodel.eventmodel.events.queryresult.AdottautoJobbra_Event;
import linmodel.eventmodel.events.queryresult.AdottautoLehajt_Event;
import linmodel.eventmodel.patterns.atomic.queryresult.AdottautoBalra_Pattern;
import linmodel.eventmodel.patterns.atomic.queryresult.AdottautoFelhajt_Pattern;
import linmodel.eventmodel.patterns.atomic.queryresult.AdottautoJobbra_Pattern;
import linmodel.eventmodel.patterns.atomic.queryresult.AdottautoLehajt_Pattern;
import linmodel.eventmodel.patterns.complex.Iranytvaltott_Pattern;
import linmodel.eventmodel.rules.OpenSC3;
import org.eclipse.viatra.cep.core.api.rules.ICepRule;
import org.eclipse.viatra.cep.core.metamodels.events.EventSource;

@SuppressWarnings("all")
public class CepFactory {
  private static CepFactory instance;
  
  public static CepFactory getInstance() {
    if(instance == null){
    	instance = new CepFactory();
    }
    return instance;
  }
  
  /**
   * Factory method for event class {@link AdottautoBalra_Event}.
   */
  public AdottautoBalra_Event createAdottautoBalra_Event(final EventSource eventSource) {
    return new AdottautoBalra_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link AdottautoBalra_Event}.
   */
  public AdottautoBalra_Event createAdottautoBalra_Event() {
    return new AdottautoBalra_Event(null);
  }
  
  /**
   * Factory method for event class {@link AdottautoFelhajt_Event}.
   */
  public AdottautoFelhajt_Event createAdottautoFelhajt_Event(final EventSource eventSource) {
    return new AdottautoFelhajt_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link AdottautoFelhajt_Event}.
   */
  public AdottautoFelhajt_Event createAdottautoFelhajt_Event() {
    return new AdottautoFelhajt_Event(null);
  }
  
  /**
   * Factory method for event class {@link AdottautoLehajt_Event}.
   */
  public AdottautoLehajt_Event createAdottautoLehajt_Event(final EventSource eventSource) {
    return new AdottautoLehajt_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link AdottautoLehajt_Event}.
   */
  public AdottautoLehajt_Event createAdottautoLehajt_Event() {
    return new AdottautoLehajt_Event(null);
  }
  
  /**
   * Factory method for event class {@link AdottautoJobbra_Event}.
   */
  public AdottautoJobbra_Event createAdottautoJobbra_Event(final EventSource eventSource) {
    return new AdottautoJobbra_Event(eventSource);
  }
  
  /**
   * Factory method for event class {@link AdottautoJobbra_Event}.
   */
  public AdottautoJobbra_Event createAdottautoJobbra_Event() {
    return new AdottautoJobbra_Event(null);
  }
  
  /**
   * Factory method for atomic query result event pattern {@link AdottautoBalra_Pattern}.
   */
  public AdottautoBalra_Pattern createAdottautoBalra_Pattern() {
    return new AdottautoBalra_Pattern();
  }
  
  /**
   * Factory method for atomic query result event pattern {@link AdottautoFelhajt_Pattern}.
   */
  public AdottautoFelhajt_Pattern createAdottautoFelhajt_Pattern() {
    return new AdottautoFelhajt_Pattern();
  }
  
  /**
   * Factory method for atomic query result event pattern {@link AdottautoLehajt_Pattern}.
   */
  public AdottautoLehajt_Pattern createAdottautoLehajt_Pattern() {
    return new AdottautoLehajt_Pattern();
  }
  
  /**
   * Factory method for atomic query result event pattern {@link AdottautoJobbra_Pattern}.
   */
  public AdottautoJobbra_Pattern createAdottautoJobbra_Pattern() {
    return new AdottautoJobbra_Pattern();
  }
  
  /**
   * Factory method for complex event pattern {@link Iranytvaltott_Pattern}.
   */
  public Iranytvaltott_Pattern createIranytvaltott_Pattern() {
    return new Iranytvaltott_Pattern();
  }
  
  /**
   * Factory method for rule {@link OpenSC3}.
   */
  public OpenSC3 createOpenSC3() {
    return new OpenSC3();
  }
  
  /**
   * Factory method for instantiating every defined rule.
   */
  public List<ICepRule> allRules() {
    List<ICepRule> rules = Lists.newArrayList();
    rules.add(new OpenSC3());
    return rules;
  }
}
