/**
 */
package linroad;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see linroad.LinroadFactory
 * @model kind="package"
 * @generated
 */
public interface LinroadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "linroad";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "linroad.meta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hazi.linroad";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinroadPackage eINSTANCE = linroad.impl.LinroadPackageImpl.init();

	/**
	 * The meta object id for the '{@link linroad.impl.XWayImpl <em>XWay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linroad.impl.XWayImpl
	 * @see linroad.impl.LinroadPackageImpl#getXWay()
	 * @generated
	 */
	int XWAY = 0;

	/**
	 * The feature id for the '<em><b>New EReference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWAY__NEW_EREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWAY__ID = 1;

	/**
	 * The number of structural features of the '<em>XWay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>XWay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link linroad.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linroad.impl.SegmentImpl
	 * @see linroad.impl.LinroadPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 1;

	/**
	 * The feature id for the '<em><b>New EReference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NEW_EREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__ID = 1;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link linroad.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linroad.impl.CarImpl
	 * @see linroad.impl.LinroadPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ID = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__LINE = 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__SPEED = 3;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link linroad.HeadingDir <em>Heading Dir</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linroad.HeadingDir
	 * @see linroad.impl.LinroadPackageImpl#getHeadingDir()
	 * @generated
	 */
	int HEADING_DIR = 3;

	/**
	 * The meta object id for the '{@link linroad.Line <em>Line</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linroad.Line
	 * @see linroad.impl.LinroadPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 4;


	/**
	 * Returns the meta object for class '{@link linroad.XWay <em>XWay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XWay</em>'.
	 * @see linroad.XWay
	 * @generated
	 */
	EClass getXWay();

	/**
	 * Returns the meta object for the containment reference list '{@link linroad.XWay#getNewEReference <em>New EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New EReference</em>'.
	 * @see linroad.XWay#getNewEReference()
	 * @see #getXWay()
	 * @generated
	 */
	EReference getXWay_NewEReference();

	/**
	 * Returns the meta object for the attribute '{@link linroad.XWay#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see linroad.XWay#getID()
	 * @see #getXWay()
	 * @generated
	 */
	EAttribute getXWay_ID();

	/**
	 * Returns the meta object for class '{@link linroad.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see linroad.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link linroad.Segment#getNewEReference <em>New EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New EReference</em>'.
	 * @see linroad.Segment#getNewEReference()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_NewEReference();

	/**
	 * Returns the meta object for the attribute '{@link linroad.Segment#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see linroad.Segment#getID()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_ID();

	/**
	 * Returns the meta object for class '{@link linroad.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see linroad.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link linroad.Car#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see linroad.Car#getID()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_ID();

	/**
	 * Returns the meta object for the attribute '{@link linroad.Car#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see linroad.Car#getDirection()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Direction();

	/**
	 * Returns the meta object for the attribute '{@link linroad.Car#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see linroad.Car#getLine()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Line();

	/**
	 * Returns the meta object for the attribute '{@link linroad.Car#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see linroad.Car#getSpeed()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Speed();

	/**
	 * Returns the meta object for enum '{@link linroad.HeadingDir <em>Heading Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Heading Dir</em>'.
	 * @see linroad.HeadingDir
	 * @generated
	 */
	EEnum getHeadingDir();

	/**
	 * Returns the meta object for enum '{@link linroad.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line</em>'.
	 * @see linroad.Line
	 * @generated
	 */
	EEnum getLine();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinroadFactory getLinroadFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link linroad.impl.XWayImpl <em>XWay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linroad.impl.XWayImpl
		 * @see linroad.impl.LinroadPackageImpl#getXWay()
		 * @generated
		 */
		EClass XWAY = eINSTANCE.getXWay();

		/**
		 * The meta object literal for the '<em><b>New EReference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XWAY__NEW_EREFERENCE = eINSTANCE.getXWay_NewEReference();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XWAY__ID = eINSTANCE.getXWay_ID();

		/**
		 * The meta object literal for the '{@link linroad.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linroad.impl.SegmentImpl
		 * @see linroad.impl.LinroadPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>New EReference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__NEW_EREFERENCE = eINSTANCE.getSegment_NewEReference();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__ID = eINSTANCE.getSegment_ID();

		/**
		 * The meta object literal for the '{@link linroad.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linroad.impl.CarImpl
		 * @see linroad.impl.LinroadPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__ID = eINSTANCE.getCar_ID();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__DIRECTION = eINSTANCE.getCar_Direction();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__LINE = eINSTANCE.getCar_Line();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__SPEED = eINSTANCE.getCar_Speed();

		/**
		 * The meta object literal for the '{@link linroad.HeadingDir <em>Heading Dir</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linroad.HeadingDir
		 * @see linroad.impl.LinroadPackageImpl#getHeadingDir()
		 * @generated
		 */
		EEnum HEADING_DIR = eINSTANCE.getHeadingDir();

		/**
		 * The meta object literal for the '{@link linroad.Line <em>Line</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linroad.Line
		 * @see linroad.impl.LinroadPackageImpl#getLine()
		 * @generated
		 */
		EEnum LINE = eINSTANCE.getLine();

	}

} //LinroadPackage
