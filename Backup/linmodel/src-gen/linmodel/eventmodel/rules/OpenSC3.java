package linmodel.eventmodel.rules;

import com.google.common.collect.Lists;
import java.util.List;
import linmodel.eventmodel.jobs.OpenSC3_Job;
import linmodel.eventmodel.patterns.complex.Iranytvaltott_Pattern;
import org.eclipse.incquery.runtime.evm.api.Job;
import org.eclipse.viatra.cep.core.api.evm.CepActivationStates;
import org.eclipse.viatra.cep.core.api.patterns.IObservableComplexEventPattern;
import org.eclipse.viatra.cep.core.api.rules.ICepRule;
import org.eclipse.viatra.cep.core.metamodels.events.EventPattern;

@SuppressWarnings("all")
public class OpenSC3 implements ICepRule {
  private List<EventPattern> eventPatterns = Lists.newArrayList();
  
  private Job<IObservableComplexEventPattern> job = new OpenSC3_Job(CepActivationStates.ACTIVE);
  
  public OpenSC3() {
    eventPatterns.add(new Iranytvaltott_Pattern());
  }
  
  @Override
  public List<EventPattern> getEventPatterns() {
    return this.eventPatterns;
  }
  
  @Override
  public Job<IObservableComplexEventPattern> getJob() {
    return this.job;
  }
}
