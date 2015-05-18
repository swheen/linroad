package linroad.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import linroad.queries.CarGoesWestMatch;
import linroad.queries.CarGoesWestMatcher;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CarGoesWestMatcher in a type-safe way.
 * 
 * @see CarGoesWestMatcher
 * @see CarGoesWestMatch
 * 
 */
@SuppressWarnings("all")
public final class CarGoesWestQuerySpecification extends BaseGeneratedEMFQuerySpecification<CarGoesWestMatcher> {
  private CarGoesWestQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CarGoesWestQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CarGoesWestMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CarGoesWestMatcher.on(engine);
  }
  
  @Override
  public CarGoesWestMatch newEmptyMatch() {
    return CarGoesWestMatch.newEmptyMatch();
  }
  
  @Override
  public CarGoesWestMatch newMatch(final Object... parameters) {
    return CarGoesWestMatch.newMatch((linroad.Car) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CarGoesWestQuerySpecification INSTANCE = make();
    
    public static CarGoesWestQuerySpecification make() {
      return new CarGoesWestQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CarGoesWestQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "linroad.queries.carGoesWest";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("car","carId");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("car", "linroad.Car"),new PParameter("carId", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_car = body.getOrCreateVariableByName("car");
      	PVariable var_carId = body.getOrCreateVariableByName("carId");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_car, "car"),
      				
      		new ExportedParameter(body, var_carId, "carId")
      	));
      	new TypeConstraint(body, new FlatTuple(var_car), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("linroad.meta", "Car")));
      	new TypeConstraint(body, new FlatTuple(var_carId), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
      	new ConstantValue(body, var__virtual_0_, getEnumLiteral("linroad.meta", "HeadingDir", "WEST").getInstance());
      	new TypeConstraint(body, new FlatTuple(var_car), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("linroad.meta", "Car")));
      	new TypeConstraint(body, new FlatTuple(var_car, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("linroad.meta", "Car", "Direction")));
      	new Equality(body, var__virtual_1_, var__virtual_0_);
      	new TypeConstraint(body, new FlatTuple(var_car), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("linroad.meta", "Car")));
      	new TypeConstraint(body, new FlatTuple(var_car, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("linroad.meta", "Car", "ID")));
      	new Equality(body, var__virtual_2_, var_carId);
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
