/**
 */
package linroad;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linroad.Segment#getNewEReference <em>New EReference</em>}</li>
 *   <li>{@link linroad.Segment#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see linroad.LinroadPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends EObject {
	/**
	 * Returns the value of the '<em><b>New EReference</b></em>' containment reference list.
	 * The list contents are of type {@link linroad.Car}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference</em>' containment reference list.
	 * @see linroad.LinroadPackage#getSegment_NewEReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Car> getNewEReference();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see linroad.LinroadPackage#getSegment_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link linroad.Segment#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // Segment
