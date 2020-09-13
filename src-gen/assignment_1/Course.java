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
 *   <li>{@link assignment_1.Course#getCourseLevel <em>Course Level</em>}</li>
 *   <li>{@link assignment_1.Course#getCourseStart <em>Course Start</em>}</li>
 *   <li>{@link assignment_1.Course#getCourseTitle <em>Course Title</em>}</li>
 * </ul>
 *
 * @see assignment_1.Assignment_1Package#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxCourseCredits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 maxCourseCredits='self.maxCourseCredits &lt;= 30.0'"
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
	 * Returns the value of the '<em><b>Course Level</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment_1.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Level</em>' attribute.
	 * @see assignment_1.CourseLevel
	 * @see #setCourseLevel(CourseLevel)
	 * @see assignment_1.Assignment_1Package#getCourse_CourseLevel()
	 * @model
	 * @generated
	 */
	CourseLevel getCourseLevel();

	/**
	 * Sets the value of the '{@link assignment_1.Course#getCourseLevel <em>Course Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Level</em>' attribute.
	 * @see assignment_1.CourseLevel
	 * @see #getCourseLevel()
	 * @generated
	 */
	void setCourseLevel(CourseLevel value);

	/**
	 * Returns the value of the '<em><b>Course Start</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment_1.CourseStart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Start</em>' attribute.
	 * @see assignment_1.CourseStart
	 * @see #setCourseStart(CourseStart)
	 * @see assignment_1.Assignment_1Package#getCourse_CourseStart()
	 * @model
	 * @generated
	 */
	CourseStart getCourseStart();

	/**
	 * Sets the value of the '{@link assignment_1.Course#getCourseStart <em>Course Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Start</em>' attribute.
	 * @see assignment_1.CourseStart
	 * @see #getCourseStart()
	 * @generated
	 */
	void setCourseStart(CourseStart value);

	/**
	 * Returns the value of the '<em><b>Course Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Title</em>' attribute.
	 * @see assignment_1.Assignment_1Package#getCourse_CourseTitle()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	String getCourseTitle();

} // Course
