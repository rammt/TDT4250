/**
 */
package assignment_1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.CourseGroup#getType <em>Type</em>}</li>
 *   <li>{@link assignment_1.CourseGroup#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see assignment_1.Assignment_1Package#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment_1.CourseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see assignment_1.CourseType
	 * @see #setType(CourseType)
	 * @see assignment_1.Assignment_1Package#getCourseGroup_Type()
	 * @model
	 * @generated
	 */
	CourseType getType();

	/**
	 * Sets the value of the '{@link assignment_1.CourseGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see assignment_1.CourseType
	 * @see #getType()
	 * @generated
	 */
	void setType(CourseType value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link assignment_1.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see assignment_1.Assignment_1Package#getCourseGroup_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

} // CourseGroup
