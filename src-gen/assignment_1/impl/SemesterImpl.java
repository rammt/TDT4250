/**
 */
package assignment_1.impl;

import assignment_1.Assignment_1Package;
import assignment_1.CourseGroup;
import assignment_1.Semester;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.impl.SemesterImpl#getSemesterNr <em>Semester Nr</em>}</li>
 *   <li>{@link assignment_1.impl.SemesterImpl#getSemesterCredits <em>Semester Credits</em>}</li>
 *   <li>{@link assignment_1.impl.SemesterImpl#getCoursegroup <em>Coursegroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemesterNr() <em>Semester Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNr()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTER_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesterNr() <em>Semester Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNr()
	 * @generated
	 * @ordered
	 */
	protected int semesterNr = SEMESTER_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemesterCredits() <em>Semester Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float SEMESTER_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSemesterCredits() <em>Semester Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterCredits()
	 * @generated
	 * @ordered
	 */
	protected float semesterCredits = SEMESTER_CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoursegroup() <em>Coursegroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursegroup()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> coursegroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment_1Package.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSemesterNr() {
		return semesterNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterNr(int newSemesterNr) {
		int oldSemesterNr = semesterNr;
		semesterNr = newSemesterNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.SEMESTER__SEMESTER_NR,
					oldSemesterNr, semesterNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSemesterCredits() {
		return semesterCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterCredits(float newSemesterCredits) {
		float oldSemesterCredits = semesterCredits;
		semesterCredits = newSemesterCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.SEMESTER__SEMESTER_CREDITS,
					oldSemesterCredits, semesterCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseGroup> getCoursegroup() {
		if (coursegroup == null) {
			coursegroup = new EObjectContainmentEList<CourseGroup>(CourseGroup.class, this,
					Assignment_1Package.SEMESTER__COURSEGROUP);
		}
		return coursegroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assignment_1Package.SEMESTER__COURSEGROUP:
			return ((InternalEList<?>) getCoursegroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment_1Package.SEMESTER__SEMESTER_NR:
			return getSemesterNr();
		case Assignment_1Package.SEMESTER__SEMESTER_CREDITS:
			return getSemesterCredits();
		case Assignment_1Package.SEMESTER__COURSEGROUP:
			return getCoursegroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Assignment_1Package.SEMESTER__SEMESTER_NR:
			setSemesterNr((Integer) newValue);
			return;
		case Assignment_1Package.SEMESTER__SEMESTER_CREDITS:
			setSemesterCredits((Float) newValue);
			return;
		case Assignment_1Package.SEMESTER__COURSEGROUP:
			getCoursegroup().clear();
			getCoursegroup().addAll((Collection<? extends CourseGroup>) newValue);
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
		case Assignment_1Package.SEMESTER__SEMESTER_NR:
			setSemesterNr(SEMESTER_NR_EDEFAULT);
			return;
		case Assignment_1Package.SEMESTER__SEMESTER_CREDITS:
			setSemesterCredits(SEMESTER_CREDITS_EDEFAULT);
			return;
		case Assignment_1Package.SEMESTER__COURSEGROUP:
			getCoursegroup().clear();
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
		case Assignment_1Package.SEMESTER__SEMESTER_NR:
			return semesterNr != SEMESTER_NR_EDEFAULT;
		case Assignment_1Package.SEMESTER__SEMESTER_CREDITS:
			return semesterCredits != SEMESTER_CREDITS_EDEFAULT;
		case Assignment_1Package.SEMESTER__COURSEGROUP:
			return coursegroup != null && !coursegroup.isEmpty();
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
		result.append(" (semesterNr: ");
		result.append(semesterNr);
		result.append(", semesterCredits: ");
		result.append(semesterCredits);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
