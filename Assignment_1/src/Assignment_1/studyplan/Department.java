/**
 */
package Assignment_1.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment_1.studyplan.Department#getStudies <em>Studies</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Department#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see Assignment_1.studyplan.StudyplanPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Studies</b></em>' containment reference list.
	 * The list contents are of type {@link Assignment_1.studyplan.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studies</em>' containment reference list.
	 * @see Assignment_1.studyplan.StudyplanPackage#getDepartment_Studies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getStudies();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link Assignment_1.studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see Assignment_1.studyplan.StudyplanPackage#getDepartment_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Department
