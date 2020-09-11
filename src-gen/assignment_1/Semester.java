/**
 */
package assignment_1;

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
 *   <li>{@link assignment_1.Semester#getSemesterNr <em>Semester Nr</em>}</li>
 *   <li>{@link assignment_1.Semester#getSemesterCredits <em>Semester Credits</em>}</li>
 *   <li>{@link assignment_1.Semester#getCoursegroup <em>Coursegroup</em>}</li>
 * </ul>
 *
 * @see assignment_1.Assignment_1Package#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiresMin30Credits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 requiresMin30Credits='self.semesterCredits &gt;= 30.0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Nr</em>' attribute.
	 * @see #setSemesterNr(int)
	 * @see assignment_1.Assignment_1Package#getSemester_SemesterNr()
	 * @model
	 * @generated
	 */
	int getSemesterNr();

	/**
	 * Sets the value of the '{@link assignment_1.Semester#getSemesterNr <em>Semester Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Nr</em>' attribute.
	 * @see #getSemesterNr()
	 * @generated
	 */
	void setSemesterNr(int value);

	/**
	 * Returns the value of the '<em><b>Semester Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Credits</em>' attribute.
	 * @see #setSemesterCredits(float)
	 * @see assignment_1.Assignment_1Package#getSemester_SemesterCredits()
	 * @model
	 * @generated
	 */
	float getSemesterCredits();

	/**
	 * Sets the value of the '{@link assignment_1.Semester#getSemesterCredits <em>Semester Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Credits</em>' attribute.
	 * @see #getSemesterCredits()
	 * @generated
	 */
	void setSemesterCredits(float value);

	/**
	 * Returns the value of the '<em><b>Coursegroup</b></em>' containment reference list.
	 * The list contents are of type {@link assignment_1.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coursegroup</em>' containment reference list.
	 * @see assignment_1.Assignment_1Package#getSemester_Coursegroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCoursegroup();

} // Semester
