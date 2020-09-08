/**
 */
package assignment_1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.Student#getStudentNumber <em>Student Number</em>}</li>
 *   <li>{@link assignment_1.Student#getName <em>Name</em>}</li>
 *   <li>{@link assignment_1.Student#getStudyprogram <em>Studyprogram</em>}</li>
 * </ul>
 *
 * @see assignment_1.Assignment_1Package#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Student Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student Number</em>' attribute.
	 * @see #setStudentNumber(int)
	 * @see assignment_1.Assignment_1Package#getStudent_StudentNumber()
	 * @model
	 * @generated
	 */
	int getStudentNumber();

	/**
	 * Sets the value of the '{@link assignment_1.Student#getStudentNumber <em>Student Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student Number</em>' attribute.
	 * @see #getStudentNumber()
	 * @generated
	 */
	void setStudentNumber(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment_1.Assignment_1Package#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment_1.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Studyprogram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprogram</em>' reference.
	 * @see #setStudyprogram(StudyProgram)
	 * @see assignment_1.Assignment_1Package#getStudent_Studyprogram()
	 * @model
	 * @generated
	 */
	StudyProgram getStudyprogram();

	/**
	 * Sets the value of the '{@link assignment_1.Student#getStudyprogram <em>Studyprogram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studyprogram</em>' reference.
	 * @see #getStudyprogram()
	 * @generated
	 */
	void setStudyprogram(StudyProgram value);

} // Student
