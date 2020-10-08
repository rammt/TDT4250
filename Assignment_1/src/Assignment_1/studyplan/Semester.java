/**
 */
package Assignment_1.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment_1.studyplan.Semester#getNumber <em>Number</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Semester#getCredits <em>Credits</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Semester#getCourseGroups <em>Course Groups</em>}</li>
 * </ul>
 *
 * @see Assignment_1.studyplan.StudyplanPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see Assignment_1.studyplan.StudyplanPackage#getSemester_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see Assignment_1.studyplan.StudyplanPackage#getSemester_Credits()
	 * @model dataType="Assignment_1.studyplan.Credits"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Semester#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link Assignment_1.studyplan.CourseGroup}.
	 * It is bidirectional and its opposite is '{@link Assignment_1.studyplan.CourseGroup#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see Assignment_1.studyplan.StudyplanPackage#getSemester_CourseGroups()
	 * @see Assignment_1.studyplan.CourseGroup#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

} // Semester
