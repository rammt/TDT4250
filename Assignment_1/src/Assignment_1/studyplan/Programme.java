/**
 */
package Assignment_1.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment_1.studyplan.Programme#getName <em>Name</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Programme#getDuration <em>Duration</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Programme#getDegree <em>Degree</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link Assignment_1.studyplan.Programme#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see Assignment_1.studyplan.StudyplanPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Assignment_1.studyplan.StudyplanPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see Assignment_1.studyplan.StudyplanPackage#getProgramme_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Programme#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * The literals are from the enumeration {@link Assignment_1.studyplan.Degree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see Assignment_1.studyplan.Degree
	 * @see #setDegree(Degree)
	 * @see Assignment_1.studyplan.StudyplanPackage#getProgramme_Degree()
	 * @model
	 * @generated
	 */
	Degree getDegree();

	/**
	 * Sets the value of the '{@link Assignment_1.studyplan.Programme#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see Assignment_1.studyplan.Degree
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(Degree value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link Assignment_1.studyplan.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see Assignment_1.studyplan.StudyplanPackage#getProgramme_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link Assignment_1.studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see Assignment_1.studyplan.StudyplanPackage#getProgramme_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Programme
