package linroad.queries;

import java.util.Arrays;
import java.util.List;
import linroad.Car;
import linroad.Segment;
import linroad.queries.util.CarIsOnSegmentQuerySpecification;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the linroad.queries.carIsOnSegment pattern,
 * to be used in conjunction with {@link CarIsOnSegmentMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CarIsOnSegmentMatcher
 * @see CarIsOnSegmentProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CarIsOnSegmentMatch extends BasePatternMatch {
  private Car fCar;
  
  private String fCarId;
  
  private Segment fSegment;
  
  private static List<String> parameterNames = makeImmutableList("car", "carId", "segment");
  
  private CarIsOnSegmentMatch(final Car pCar, final String pCarId, final Segment pSegment) {
    this.fCar = pCar;
    this.fCarId = pCarId;
    this.fSegment = pSegment;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("car".equals(parameterName)) return this.fCar;
    if ("carId".equals(parameterName)) return this.fCarId;
    if ("segment".equals(parameterName)) return this.fSegment;
    return null;
  }
  
  public Car getCar() {
    return this.fCar;
  }
  
  public String getCarId() {
    return this.fCarId;
  }
  
  public Segment getSegment() {
    return this.fSegment;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("car".equals(parameterName) ) {
    	this.fCar = (linroad.Car) newValue;
    	return true;
    }
    if ("carId".equals(parameterName) ) {
    	this.fCarId = (java.lang.String) newValue;
    	return true;
    }
    if ("segment".equals(parameterName) ) {
    	this.fSegment = (linroad.Segment) newValue;
    	return true;
    }
    return false;
  }
  
  public void setCar(final Car pCar) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCar = pCar;
  }
  
  public void setCarId(final String pCarId) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCarId = pCarId;
  }
  
  public void setSegment(final Segment pSegment) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSegment = pSegment;
  }
  
  @Override
  public String patternName() {
    return "linroad.queries.carIsOnSegment";
  }
  
  @Override
  public List<String> parameterNames() {
    return CarIsOnSegmentMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCar, fCarId, fSegment};
  }
  
  @Override
  public CarIsOnSegmentMatch toImmutable() {
    return isMutable() ? newMatch(fCar, fCarId, fSegment) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"car\"=" + prettyPrintValue(fCar) + ", ");
    
    result.append("\"carId\"=" + prettyPrintValue(fCarId) + ", ");
    
    result.append("\"segment\"=" + prettyPrintValue(fSegment)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCar == null) ? 0 : fCar.hashCode());
    result = prime * result + ((fCarId == null) ? 0 : fCarId.hashCode());
    result = prime * result + ((fSegment == null) ? 0 : fSegment.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CarIsOnSegmentMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CarIsOnSegmentMatch other = (CarIsOnSegmentMatch) obj;
    if (fCar == null) {if (other.fCar != null) return false;}
    else if (!fCar.equals(other.fCar)) return false;
    if (fCarId == null) {if (other.fCarId != null) return false;}
    else if (!fCarId.equals(other.fCarId)) return false;
    if (fSegment == null) {if (other.fSegment != null) return false;}
    else if (!fSegment.equals(other.fSegment)) return false;
    return true;
  }
  
  @Override
  public CarIsOnSegmentQuerySpecification specification() {
    try {
    	return CarIsOnSegmentQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static CarIsOnSegmentMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @param pSegment the fixed value of pattern parameter segment, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CarIsOnSegmentMatch newMutableMatch(final Car pCar, final String pCarId, final Segment pSegment) {
    return new Mutable(pCar, pCarId, pSegment);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @param pSegment the fixed value of pattern parameter segment, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CarIsOnSegmentMatch newMatch(final Car pCar, final String pCarId, final Segment pSegment) {
    return new Immutable(pCar, pCarId, pSegment);
  }
  
  private static final class Mutable extends CarIsOnSegmentMatch {
    Mutable(final Car pCar, final String pCarId, final Segment pSegment) {
      super(pCar, pCarId, pSegment);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CarIsOnSegmentMatch {
    Immutable(final Car pCar, final String pCarId, final Segment pSegment) {
      super(pCar, pCarId, pSegment);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
