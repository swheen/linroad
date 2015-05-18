package linmodel.eventmodel.events.queryresult;

import linroad.Car;
import org.eclipse.viatra.cep.core.api.events.ParameterizableIncQueryPatternEventInstance;
import org.eclipse.viatra.cep.core.metamodels.events.EventSource;

@SuppressWarnings("all")
public class AdottautoLehajt_Event extends ParameterizableIncQueryPatternEventInstance {
  private String ide;
  
  private Car car;
  
  public AdottautoLehajt_Event(final EventSource eventSource) {
    super(eventSource);
    getParameters().add(ide);
    getParameters().add(car);
    
  }
  
  public String getIde() {
    return this.ide;
  }
  
  public void setIde(final String ide) {
    this.ide = ide;
    getParameters().set(0, ide);
  }
  
  public Car getCar() {
    return this.car;
  }
  
  public void setCar(final Car car) {
    this.car = car;
    getParameters().set(1, car);
  }
}
