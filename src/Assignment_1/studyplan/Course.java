/**
 */
package Assignment_1.studyplan;

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
 *   <li>{@link Assignment_1.studyplan.Course#getCode <em>Code</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Course#getName <em>Name</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Course#getStart <em>Start</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Course#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see Assignment_1.studyplan.StudyplanPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maximumCredits'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link Assignment_1.studyplan.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see Assignment_1.studyplan.CourseLevel
	 * @see #setLevel(CourseLevel)
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	CourseLevel getLevel();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see Assignment_1.studyplan.CourseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(CourseLevel value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * The literals are from the enumeration {@link Assignment_1.studyplan.CourseStart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see Assignment_1.studyplan.CourseStart
	 * @see #setStart(CourseStart)
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourse_Start()
	 * @model
	 * @generated
	 */
	CourseStart getStart();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Course#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see Assignment_1.studyplan.CourseStart
	 * @see #getStart()
	 * @generated
	 */
	void setStart(CourseStart value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see Assignment_1.studyplan.StudyplanPackage#getCourse_Title()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	String getTitle();

} // Course
