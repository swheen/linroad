package linroad.queries;

import linroad.queries.CarGoesEastMatcher;
import linroad.queries.CarGoesWestMatcher;
import linroad.queries.CarIsOnDownRampMatcher;
import linroad.queries.CarIsOnSegmentMatcher;
import linroad.queries.CarIsOnUpRampMatcher;
import linroad.queries.util.CarGoesEastQuerySpecification;
import linroad.queries.util.CarGoesWestQuerySpecification;
import linroad.queries.util.CarIsOnDownRampQuerySpecification;
import linroad.queries.util.CarIsOnSegmentQuerySpecification;
import linroad.queries.util.CarIsOnUpRampQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in queries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file queries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package linroad.queries, the group contains the definition of the following patterns: <ul>
 * <li>carIsOnSegment</li>
 * <li>carGoesEast</li>
 * <li>carIsOnUpRamp</li>
 * <li>carIsOnDownRamp</li>
 * <li>carGoesWest</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() throws IncQueryException {
    querySpecifications.add(CarIsOnSegmentQuerySpecification.instance());
    querySpecifications.add(CarGoesEastQuerySpecification.instance());
    querySpecifications.add(CarIsOnUpRampQuerySpecification.instance());
    querySpecifications.add(CarIsOnDownRampQuerySpecification.instance());
    querySpecifications.add(CarGoesWestQuerySpecification.instance());
  }
  
  public CarIsOnSegmentQuerySpecification getCarIsOnSegment() throws IncQueryException {
    return CarIsOnSegmentQuerySpecification.instance();
  }
  
  public CarIsOnSegmentMatcher getCarIsOnSegment(final IncQueryEngine engine) throws IncQueryException {
    return CarIsOnSegmentMatcher.on(engine);
  }
  
  public CarGoesEastQuerySpecification getCarGoesEast() throws IncQueryException {
    return CarGoesEastQuerySpecification.instance();
  }
  
  public CarGoesEastMatcher getCarGoesEast(final IncQueryEngine engine) throws IncQueryException {
    return CarGoesEastMatcher.on(engine);
  }
  
  public CarIsOnUpRampQuerySpecification getCarIsOnUpRamp() throws IncQueryException {
    return CarIsOnUpRampQuerySpecification.instance();
  }
  
  public CarIsOnUpRampMatcher getCarIsOnUpRamp(final IncQueryEngine engine) throws IncQueryException {
    return CarIsOnUpRampMatcher.on(engine);
  }
  
  public CarIsOnDownRampQuerySpecification getCarIsOnDownRamp() throws IncQueryException {
    return CarIsOnDownRampQuerySpecification.instance();
  }
  
  public CarIsOnDownRampMatcher getCarIsOnDownRamp(final IncQueryEngine engine) throws IncQueryException {
    return CarIsOnDownRampMatcher.on(engine);
  }
  
  public CarGoesWestQuerySpecification getCarGoesWest() throws IncQueryException {
    return CarGoesWestQuerySpecification.instance();
  }
  
  public CarGoesWestMatcher getCarGoesWest(final IncQueryEngine engine) throws IncQueryException {
    return CarGoesWestMatcher.on(engine);
  }
}
