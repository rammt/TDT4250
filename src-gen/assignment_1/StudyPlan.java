/**
 */
package assignment_1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.StudyPlan#getCourse <em>Course</em>}</li>
 *   <li>{@link assignment_1.StudyPlan#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @see assignment_1.Assignment_1Package#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link assignment_1.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see assignment_1.Assignment_1Package#getStudyPlan_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' containment reference.
	 * @see #setProgramme(Programme)
	 * @see assignment_1.Assignment_1Package#getStudyPlan_Programme()
	 * @model containment="true"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link assignment_1.StudyPlan#getProgramme <em>Programme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' containment reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

} // StudyPlan
