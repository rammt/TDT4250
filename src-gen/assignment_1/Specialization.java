/**
 */
package assignment_1;

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
 *   <li>{@link assignment_1.Specialization#getSubSpecialization <em>Sub Specialization</em>}</li>
 *   <li>{@link assignment_1.Specialization#getSemester <em>Semester</em>}</li>
 *   <li>{@link assignment_1.Specialization#getSpecializationCode <em>Specialization Code</em>}</li>
 *   <li>{@link assignment_1.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link assignment_1.Specialization#getStudystart <em>Studystart</em>}</li>
 * </ul>
 *
 * @see assignment_1.Assignment_1Package#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link assignment_1.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Specialization</em>' containment reference list.
	 * @see assignment_1.Assignment_1Package#getSpecialization_SubSpecialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSubSpecialization();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference list.
	 * The list contents are of type {@link assignment_1.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference list.
	 * @see assignment_1.Assignment_1Package#getSpecialization_Semester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemester();

	/**
	 * Returns the value of the '<em><b>Specialization Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization Code</em>' attribute.
	 * @see #setSpecializationCode(String)
	 * @see assignment_1.Assignment_1Package#getSpecialization_SpecializationCode()
	 * @model
	 * @generated
	 */
	String getSpecializationCode();

	/**
	 * Sets the value of the '{@link assignment_1.Specialization#getSpecializationCode <em>Specialization Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization Code</em>' attribute.
	 * @see #getSpecializationCode()
	 * @generated
	 */
	void setSpecializationCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment_1.Assignment_1Package#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment_1.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Studystart</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link assignment_1.StudyStart#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studystart</em>' containment reference.
	 * @see #setStudystart(StudyStart)
	 * @see assignment_1.Assignment_1Package#getSpecialization_Studystart()
	 * @see assignment_1.StudyStart#getSpecialization
	 * @model opposite="specialization" containment="true"
	 * @generated
	 */
	StudyStart getStudystart();

	/**
	 * Sets the value of the '{@link assignment_1.Specialization#getStudystart <em>Studystart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studystart</em>' containment reference.
	 * @see #getStudystart()
	 * @generated
	 */
	void setStudystart(StudyStart value);

} // Specialization
