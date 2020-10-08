/**
 */
package Assignment_1.studyplan;

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
 *   <li>{@link Assignment_1.studyplan.CourseGroup#getType <em>Type</em>}</li>
 *   <li>{@link Assignment_1.studyplan.CourseGroup#getCourses <em>Courses</em>}</li>
 *   <li>{@link Assignment_1.studyplan.CourseGroup#getMandatoryCredits <em>Mandatory Credits</em>}</li>
 *   <li>{@link Assignment_1.studyplan.CourseGroup#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see Assignment_1.studyplan.StudyplanPackage#getCourseGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maximumMandatoryCreditsInAllCourseGroupsSameSemester'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 maximumMandatoryCreditsInAllCourseGroupsSameSemester='self.semester.courseGroups.mandatoryCredits-&gt;sum() &lt;= Sequence{self.semester.credits}-&gt;sum()'"
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Assignment_1.studyplan.CourseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Assignment_1.studyplan.CourseType
	 * @see #setType(CourseType)
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourseGroup_Type()
	 * @model
	 * @generated
	 */
	CourseType getType();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.CourseGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Assignment_1.studyplan.CourseType
	 * @see #getType()
	 * @generated
	 */
	void setType(CourseType value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link Assignment_1.studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourseGroup_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Mandatory Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Credits</em>' attribute.
	 * @see #setMandatoryCredits(float)
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourseGroup_MandatoryCredits()
	 * @model
	 * @generated
	 */
	float getMandatoryCredits();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.CourseGroup#getMandatoryCredits <em>Mandatory Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Credits</em>' attribute.
	 * @see #getMandatoryCredits()
	 * @generated
	 */
	void setMandatoryCredits(float value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Assignment_1.studyplan.Semester#getCourseGroups <em>Course Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourseGroup_Semester()
	 * @see Assignment_1.studyplan.Semester#getCourseGroups
	 * @model opposite="courseGroups" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.CourseGroup#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

} // CourseGroup
