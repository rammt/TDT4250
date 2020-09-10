/**
 */
package assignment_1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link assignment_1.Course#getCourseCredit <em>Course Credit</em>}</li>
 *   <li>{@link assignment_1.Course#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link assignment_1.Course#getCourceLevel <em>Cource Level</em>}</li>
 * </ul>
 *
 * @see assignment_1.Assignment_1Package#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see assignment_1.Assignment_1Package#getCourse_CourseCode()
	 * @model
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link assignment_1.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Course Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Credit</em>' attribute.
	 * @see #setCourseCredit(float)
	 * @see assignment_1.Assignment_1Package#getCourse_CourseCredit()
	 * @model
	 * @generated
	 */
	float getCourseCredit();

	/**
	 * Sets the value of the '{@link assignment_1.Course#getCourseCredit <em>Course Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Credit</em>' attribute.
	 * @see #getCourseCredit()
	 * @generated
	 */
	void setCourseCredit(float value);

	/**
	 * Returns the value of the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Name</em>' attribute.
	 * @see #setCourseName(String)
	 * @see assignment_1.Assignment_1Package#getCourse_CourseName()
	 * @model
	 * @generated
	 */
	String getCourseName();

	/**
	 * Sets the value of the '{@link assignment_1.Course#getCourseName <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Name</em>' attribute.
	 * @see #getCourseName()
	 * @generated
	 */
	void setCourseName(String value);

	/**
	 * Returns the value of the '<em><b>Cource Level</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment_1.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cource Level</em>' attribute.
	 * @see assignment_1.CourseLevel
	 * @see #setCourceLevel(CourseLevel)
	 * @see assignment_1.Assignment_1Package#getCourse_CourceLevel()
	 * @model
	 * @generated
	 */
	CourseLevel getCourceLevel();

	/**
	 * Sets the value of the '{@link assignment_1.Course#getCourceLevel <em>Cource Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cource Level</em>' attribute.
	 * @see assignment_1.CourseLevel
	 * @see #getCourceLevel()
	 * @generated
	 */
	void setCourceLevel(CourseLevel value);

} // Course
