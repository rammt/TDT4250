/**
 */
package assignment_1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.StudyStart#getYear <em>Year</em>}</li>
 *   <li>{@link assignment_1.StudyStart#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @see assignment_1.Assignment_1Package#getStudyStart()
 * @model
 * @generated
 */
public interface StudyStart extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see assignment_1.Assignment_1Package#getStudyStart_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link assignment_1.StudyStart#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link assignment_1.Specialization#getStudystart <em>Studystart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' container reference.
	 * @see #setSpecialization(Specialization)
	 * @see assignment_1.Assignment_1Package#getStudyStart_Specialization()
	 * @see assignment_1.Specialization#getStudystart
	 * @model opposite="studystart" transient="false"
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link assignment_1.StudyStart#getSpecialization <em>Specialization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' container reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

} // StudyStart
