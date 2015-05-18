package linroad.queries.util;

import linroad.Car;
import linroad.Segment;
import linroad.queries.CarIsOnSegmentMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the linroad.queries.carIsOnSegment pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CarIsOnSegmentProcessor implements IMatchProcessor<CarIsOnSegmentMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCar the value of pattern parameter car in the currently processed match
   * @param pCarId the value of pattern parameter carId in the currently processed match
   * @param pSegment the value of pattern parameter segment in the currently processed match
   * 
   */
  public abstract void process(final Car pCar, final String pCarId, final Segment pSegment);
  
  @Override
  public void process(final CarIsOnSegmentMatch match) {
    process(match.getCar(), match.getCarId(), match.getSegment());
  }
}
