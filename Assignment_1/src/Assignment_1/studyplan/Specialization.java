/**
 */
package Assignment_1.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment_1.studyplan.Specialization#getCode <em>Code</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Specialization#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Specialization#getSubSpecialization <em>Sub Specialization</em>}</li>
 * </ul>
 *
 * @see Assignment_1.studyplan.StudyplanPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see Assignment_1.studyplan.StudyplanPackage#getSpecialization_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Specialization#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Assignment_1.studyplan.StudyplanPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link Assignment_1.studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see Assignment_1.studyplan.StudyplanPackage#getSpecialization_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Sub Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Specialization</em>' containment reference.
	 * @see #setSubSpecialization(Specialization)
	 * @see Assignment_1.studyplan.StudyplanPackage#getSpecialization_SubSpecialization()
	 * @model containment="true"
	 * @generated
	 */
	Specialization getSubSpecialization();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Specialization#getSubSpecialization <em>Sub Specialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Specialization</em>' containment reference.
	 * @see #getSubSpecialization()
	 * @generated
	 */
	void setSubSpecialization(Specialization value);

} // Specialization
