package linroad.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import linroad.queries.CarIsOnSegmentMatch;
import linroad.queries.CarIsOnSegmentMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CarIsOnSegmentMatcher in a type-safe way.
 * 
 * @see CarIsOnSegmentMatcher
 * @see CarIsOnSegmentMatch
 * 
 */
@SuppressWarnings("all")
public final class CarIsOnSegmentQuerySpecification extends BaseGeneratedEMFQuerySpecification<CarIsOnSegmentMatcher> {
  private CarIsOnSegmentQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CarIsOnSegmentQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CarIsOnSegmentMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CarIsOnSegmentMatcher.on(engine);
  }
  
  @Override
  public CarIsOnSegmentMatch newEmptyMatch() {
    return CarIsOnSegmentMatch.newEmptyMatch();
  }
  
  @Override
  public CarIsOnSegmentMatch newMatch(final Object... parameters) {
    return CarIsOnSegmentMatch.newMatch((linroad.Car) parameters[0], (java.lang.String) parameters[1], (linroad.Segment) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static CarIsOnSegmentQuerySpecification INSTANCE = make();
    
    public static CarIsOnSegmentQuerySpecification make() {
      return new CarIsOnSegmentQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CarIsOnSegmentQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "linroad.queries.carIsOnSegment";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("car","carId","segment");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("car", "linroad.Car"),new PParameter("carId", "java.lang.String"),new PParameter("segment", "linroad.Segment"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_car = body.getOrCreateVariableByName("car");
      	PVariable var_carId = body.getOrCreateVariableByName("carId");
      	PVariable var_segment = body.getOrCreateVariableByName("segment");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_car, "car"),
      				
      		new ExportedParameter(body, var_carId, "carId"),
      				
      		new ExportedParameter(body, var_segment, "segment")
      	));
      	new TypeConstraint(body, new FlatTuple(var_car), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("linroad.meta", "Car")));
      	new TypeConstraint(body, new FlatTuple(var_carId), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
      	new TypeConstraint(body, new FlatTuple(var_segment), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("linroad.meta", "Segment")));
      	new TypeConstraint(body, new FlatTuple(var_car), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("linroad.meta", "Car")));
      	new TypeConstraint(body, new FlatTuple(var_car, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("linroad.meta", "Car", "ID")));
      	new Equality(body, var__virtual_0_, var_carId);
      	new TypeConstraint(body, new FlatTuple(var_segment), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("linroad.meta", "Segment")));
      	new TypeConstraint(body, new FlatTuple(var_segment, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("linroad.meta", "Segment", "newEReference")));
      	new Equality(body, var__virtual_1_, var_car);
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
