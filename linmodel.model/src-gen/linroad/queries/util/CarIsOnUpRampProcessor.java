package linroad.queries.util;

import linroad.Car;
import linroad.queries.CarIsOnUpRampMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the linroad.queries.carIsOnUpRamp pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CarIsOnUpRampProcessor implements IMatchProcessor<CarIsOnUpRampMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCar the value of pattern parameter car in the currently processed match
   * @param pCarId the value of pattern parameter carId in the currently processed match
   * 
   */
  public abstract void process(final Car pCar, final String pCarId);
  
  @Override
  public void process(final CarIsOnUpRampMatch match) {
    process(match.getCar(), match.getCarId());
  }
}
