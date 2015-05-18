package linroad.queries;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import linroad.Car;
import linroad.queries.CarIsClosedMatch;
import linroad.queries.util.CarIsClosedQuerySpecification;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the linroad.queries.carIsClosed pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CarIsClosedMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern carIsClosed(car : Car, carId : EString) {
 * 	
 * 	Car.Direction(car, false);
 * 	Car.ID(car, carId);
 * }
 * </pre></code>
 * 
 * @see CarIsClosedMatch
 * @see CarIsClosedProcessor
 * @see CarIsClosedQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CarIsClosedMatcher extends BaseMatcher<CarIsClosedMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CarIsClosedMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CarIsClosedMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CarIsClosedMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CAR = 0;
  
  private final static int POSITION_CARID = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CarIsClosedMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public CarIsClosedMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public CarIsClosedMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @return matches represented as a CarIsClosedMatch object.
   * 
   */
  public Collection<CarIsClosedMatch> getAllMatches(final Car pCar, final String pCarId) {
    return rawGetAllMatches(new Object[]{pCar, pCarId});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @return a match represented as a CarIsClosedMatch object, or null if no match is found.
   * 
   */
  public CarIsClosedMatch getOneArbitraryMatch(final Car pCar, final String pCarId) {
    return rawGetOneArbitraryMatch(new Object[]{pCar, pCarId});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Car pCar, final String pCarId) {
    return rawHasMatch(new Object[]{pCar, pCarId});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Car pCar, final String pCarId) {
    return rawCountMatches(new Object[]{pCar, pCarId});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Car pCar, final String pCarId, final IMatchProcessor<? super CarIsClosedMatch> processor) {
    rawForEachMatch(new Object[]{pCar, pCarId}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Car pCar, final String pCarId, final IMatchProcessor<? super CarIsClosedMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCar, pCarId}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CarIsClosedMatch newMatch(final Car pCar, final String pCarId) {
    return CarIsClosedMatch.newMatch(pCar, pCarId);
  }
  
  /**
   * Retrieve the set of values that occur in matches for car.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Car> rawAccumulateAllValuesOfcar(final Object[] parameters) {
    Set<Car> results = new HashSet<Car>();
    rawAccumulateAllValues(POSITION_CAR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for car.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Car> getAllValuesOfcar() {
    return rawAccumulateAllValuesOfcar(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for car.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Car> getAllValuesOfcar(final CarIsClosedMatch partialMatch) {
    return rawAccumulateAllValuesOfcar(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for car.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Car> getAllValuesOfcar(final String pCarId) {
    return rawAccumulateAllValuesOfcar(new Object[]{
    null, 
    pCarId
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for carId.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfcarId(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_CARID, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for carId.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfcarId() {
    return rawAccumulateAllValuesOfcarId(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for carId.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfcarId(final CarIsClosedMatch partialMatch) {
    return rawAccumulateAllValuesOfcarId(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for carId.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfcarId(final Car pCar) {
    return rawAccumulateAllValuesOfcarId(new Object[]{
    pCar, 
    null
    });
  }
  
  @Override
  protected CarIsClosedMatch tupleToMatch(final Tuple t) {
    try {
    	return CarIsClosedMatch.newMatch((linroad.Car) t.get(POSITION_CAR), (java.lang.String) t.get(POSITION_CARID));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CarIsClosedMatch arrayToMatch(final Object[] match) {
    try {
    	return CarIsClosedMatch.newMatch((linroad.Car) match[POSITION_CAR], (java.lang.String) match[POSITION_CARID]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CarIsClosedMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CarIsClosedMatch.newMutableMatch((linroad.Car) match[POSITION_CAR], (java.lang.String) match[POSITION_CARID]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CarIsClosedMatcher> querySpecification() throws IncQueryException {
    return CarIsClosedQuerySpecification.instance();
  }
}
