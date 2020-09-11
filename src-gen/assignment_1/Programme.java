/**
 */
package assignment_1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.Programme#getName <em>Name</em>}</li>
 *   <li>{@link assignment_1.Programme#getDuration <em>Duration</em>}</li>
 *   <li>{@link assignment_1.Programme#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link assignment_1.Programme#getDegree <em>Degree</em>}</li>
 * </ul>
 *
 * @see assignment_1.Assignment_1Package#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment_1.Assignment_1Package#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment_1.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see assignment_1.Assignment_1Package#getProgramme_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link assignment_1.Programme#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link assignment_1.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference list.
	 * @see assignment_1.Assignment_1Package#getProgramme_Specialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecialization();

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment_1.Degree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see assignment_1.Degree
	 * @see #setDegree(Degree)
	 * @see assignment_1.Assignment_1Package#getProgramme_Degree()
	 * @model
	 * @generated
	 */
	Degree getDegree();

	/**
	 * Sets the value of the '{@link assignment_1.Programme#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see assignment_1.Degree
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(Degree value);

} // Programme
