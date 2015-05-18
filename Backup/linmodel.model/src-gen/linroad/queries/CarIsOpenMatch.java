package linroad.queries;

import java.util.Arrays;
import java.util.List;
import linroad.Car;
import linroad.queries.util.CarIsOpenQuerySpecification;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the linroad.queries.carIsOpen pattern,
 * to be used in conjunction with {@link CarIsOpenMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CarIsOpenMatcher
 * @see CarIsOpenProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CarIsOpenMatch extends BasePatternMatch {
  private Car fCar;
  
  private String fCarId;
  
  private static List<String> parameterNames = makeImmutableList("car", "carId");
  
  private CarIsOpenMatch(final Car pCar, final String pCarId) {
    this.fCar = pCar;
    this.fCarId = pCarId;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("car".equals(parameterName)) return this.fCar;
    if ("carId".equals(parameterName)) return this.fCarId;
    return null;
  }
  
  public Car getCar() {
    return this.fCar;
  }
  
  public String getCarId() {
    return this.fCarId;
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
  
  @Override
  public String patternName() {
    return "linroad.queries.carIsOpen";
  }
  
  @Override
  public List<String> parameterNames() {
    return CarIsOpenMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCar, fCarId};
  }
  
  @Override
  public CarIsOpenMatch toImmutable() {
    return isMutable() ? newMatch(fCar, fCarId) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"car\"=" + prettyPrintValue(fCar) + ", ");
    
    result.append("\"carId\"=" + prettyPrintValue(fCarId)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCar == null) ? 0 : fCar.hashCode());
    result = prime * result + ((fCarId == null) ? 0 : fCarId.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CarIsOpenMatch)) { // this should be infrequent
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
    CarIsOpenMatch other = (CarIsOpenMatch) obj;
    if (fCar == null) {if (other.fCar != null) return false;}
    else if (!fCar.equals(other.fCar)) return false;
    if (fCarId == null) {if (other.fCarId != null) return false;}
    else if (!fCarId.equals(other.fCarId)) return false;
    return true;
  }
  
  @Override
  public CarIsOpenQuerySpecification specification() {
    try {
    	return CarIsOpenQuerySpecification.instance();
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
  public static CarIsOpenMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCar the fixed value of pattern parameter car, or null if not bound.
   * @param pCarId the fixed value of pattern parameter carId, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CarIsOpenMatch newMutableMatch(final Car pCar, final String pCarId) {
    return new Mutable(pCar, pCarId);
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
  public static CarIsOpenMatch newMatch(final Car pCar, final String pCarId) {
    return new Immutable(pCar, pCarId);
  }
  
  private static final class Mutable extends CarIsOpenMatch {
    Mutable(final Car pCar, final String pCarId) {
      super(pCar, pCarId);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CarIsOpenMatch {
    Immutable(final Car pCar, final String pCarId) {
      super(pCar, pCarId);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
