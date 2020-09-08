/**
 */
package assignment_1.impl;

import assignment_1.Assignment_1Package;
import assignment_1.Student;
import assignment_1.StudyProgram;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.impl.StudentImpl#getStudentNumber <em>Student Number</em>}</li>
 *   <li>{@link assignment_1.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment_1.impl.StudentImpl#getStudyprogram <em>Studyprogram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The default value of the '{@link #getStudentNumber() <em>Student Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int STUDENT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStudentNumber() <em>Student Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentNumber()
	 * @generated
	 * @ordered
	 */
	protected int studentNumber = STUDENT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudyprogram() <em>Studyprogram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyprogram()
	 * @generated
	 * @ordered
	 */
	protected StudyProgram studyprogram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment_1Package.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudentNumber(int newStudentNumber) {
		int oldStudentNumber = studentNumber;
		studentNumber = newStudentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.STUDENT__STUDENT_NUMBER,
					oldStudentNumber, studentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyProgram getStudyprogram() {
		if (studyprogram != null && studyprogram.eIsProxy()) {
			InternalEObject oldStudyprogram = (InternalEObject) studyprogram;
			studyprogram = (StudyProgram) eResolveProxy(oldStudyprogram);
			if (studyprogram != oldStudyprogram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment_1Package.STUDENT__STUDYPROGRAM,
							oldStudyprogram, studyprogram));
			}
		}
		return studyprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgram basicGetStudyprogram() {
		return studyprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyprogram(StudyProgram newStudyprogram) {
		StudyProgram oldStudyprogram = studyprogram;
		studyprogram = newStudyprogram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.STUDENT__STUDYPROGRAM,
					oldStudyprogram, studyprogram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment_1Package.STUDENT__STUDENT_NUMBER:
			return getStudentNumber();
		case Assignment_1Package.STUDENT__NAME:
			return getName();
		case Assignment_1Package.STUDENT__STUDYPROGRAM:
			if (resolve)
				return getStudyprogram();
			return basicGetStudyprogram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Assignment_1Package.STUDENT__STUDENT_NUMBER:
			setStudentNumber((Integer) newValue);
			return;
		case Assignment_1Package.STUDENT__NAME:
			setName((String) newValue);
			return;
		case Assignment_1Package.STUDENT__STUDYPROGRAM:
			setStudyprogram((StudyProgram) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Assignment_1Package.STUDENT__STUDENT_NUMBER:
			setStudentNumber(STUDENT_NUMBER_EDEFAULT);
			return;
		case Assignment_1Package.STUDENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assignment_1Package.STUDENT__STUDYPROGRAM:
			setStudyprogram((StudyProgram) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Assignment_1Package.STUDENT__STUDENT_NUMBER:
			return studentNumber != STUDENT_NUMBER_EDEFAULT;
		case Assignment_1Package.STUDENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assignment_1Package.STUDENT__STUDYPROGRAM:
			return studyprogram != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (StudentNumber: ");
		result.append(studentNumber);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
