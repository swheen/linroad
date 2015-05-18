package linmodel.eventmodel.jobs;

import org.eclipse.incquery.runtime.evm.api.Activation;
import org.eclipse.incquery.runtime.evm.api.Context;
import org.eclipse.incquery.runtime.evm.api.Job;
import org.eclipse.incquery.runtime.evm.api.event.ActivationState;
import org.eclipse.viatra.cep.core.api.patterns.IObservableComplexEventPattern;

@SuppressWarnings("all")
public class OpenSC3_Job extends Job<IObservableComplexEventPattern> {
  public OpenSC3_Job(final ActivationState activationState) {
    super(activationState);
  }
  
  @Override
  public void execute(final Activation<? extends IObservableComplexEventPattern> activation, final Context context) {
    System.out.println("Cars walking down the road! up and down to go!");
  }
  
  @Override
  public void handleError(final Activation<? extends IObservableComplexEventPattern> activation, final Exception exception, final Context context) {
    //not gonna happen
  }
}
