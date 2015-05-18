package linmodel.main;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.cep.core.api.helpers.DefaultApplication;
import org.eclipse.viatra.cep.core.metamodels.automaton.EventContext;
import org.eclipse.viatra.cep.core.streams.EventStream;

import linmodel.eventmodel.CepFactory;
import linmodel.eventmodel.mapping.QueryEngine2ViatraCep;
import linroad.Car;
import linroad.HeadingDir;
import linroad.LinroadFactory;
import linroad.Segment;
import linroad.XWay;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Main extends DefaultApplication {

	/**
	 * The {@link QueryEngine2ViatraCep} mapping ensures the creation of atomic
	 * event instances upon graph pattern match appearance and disappearance.
	 */
	private QueryEngine2ViatraCep mapping;

	/**
	 * Attributes related to the underlying model.
	 */
	private Car car1;
	private Resource resource;
	private ResourceSet resourceSet;
	private XWay xway;
	private Segment segment;

	

	public Main() {
		super(EventContext.STRICT_IMMEDIATE);
	}

	/**
	 * Setting up the application requires preparing the model (standard EMF
	 * things, see {@link #prepareModel()}), and instantiating the mapping by
	 * registering the root graph pattern matching scope (e.g. a
	 * {@link ResourceSet}) to the {@link EventStream}.
	 */
	@Before
	public void setUp() {
		prepareModel();
		mapping = QueryEngine2ViatraCep.register(resourceSet, getEventStream());
	}

	@Override
	protected void configureRules() {
		getEngine().addRules(CepFactory.getInstance().allRules());
	}

	/**
	 * The {@link QueryEngine2ViatraCep} mapping is disposed properly by
	 * invoking the {@link QueryEngine2ViatraCep#dispose()} method.
	 */
	@After
	public void tearDown() {
		car1 = null;
		xway = null;
		segment = null;
		mapping.dispose();
		mapping = null;
	}

	/**
	 * Preparing the model by instantiating the required objects and putting the
	 * model into a {@link ResourceSet}.
	 */
	private void prepareModel() {
		xway = LinroadFactory.eINSTANCE.createXWay();
		segment = LinroadFactory.eINSTANCE.createSegment();
		car1 = LinroadFactory.eINSTANCE.createCar();
		car1.setID("drawer1");
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("fowler", new XMIResourceFactoryImpl());
		resourceSet = new ResourceSetImpl();
		resource = resourceSet.createResource(URI.createURI("fowler/model.fowler"));
		resource.getContents().add(car1);
	}

	@Test
	public void main() {
		getEngine().getLogger().debug("Starting");
		// This series of events will generate the specified complex event.
		car1.setDirection(HeadingDir.EAST);
		car1.setDirection(HeadingDir.WEST);
		car1.setDirection(HeadingDir.EAST);
		car1.setDirection(HeadingDir.WEST);
		//autok
		car1.setDirection(HeadingDir.EAST);
		car1.setDirection(HeadingDir.WEST);
		//3 autó
		car1.setDirection(HeadingDir.EAST);
		car1.setDirection(HeadingDir.WEST);
		//2 autók
		getEngine().getLogger().debug("Ending");
	}

}
