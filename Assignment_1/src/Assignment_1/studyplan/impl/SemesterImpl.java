/**
 */
package Assignment_1.studyplan.impl;

import Assignment_1.studyplan.CourseGroup;
import Assignment_1.studyplan.CourseStart;
import Assignment_1.studyplan.Semester;
import Assignment_1.studyplan.StudyplanPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assignment_1.studyplan.impl.SemesterImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link Assignment_1.studyplan.impl.SemesterImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link Assignment_1.studyplan.impl.SemesterImpl#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link Assignment_1.studyplan.impl.SemesterImpl#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseGroups() <em>Course Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> courseGroups;

	/**
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final CourseStart SEASON_EDEFAULT = CourseStart.AUTUMN;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected CourseStart season = SEASON_EDEFAULT;

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
		return StudyplanPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseGroup> getCourseGroups() {
		if (courseGroups == null) {
			courseGroups = new EObjectContainmentWithInverseEList<CourseGroup>(CourseGroup.class, this, StudyplanPackage.SEMESTER__COURSE_GROUPS, StudyplanPackage.COURSE_GROUP__SEMESTER);
		}
		return courseGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CourseStart getSeason() {
		CourseStart season;
		int semester = this.getNumber();
		
		// Odd semester
		if (semester % 2 == 1) {
			season = CourseStart.AUTUMN;
		}
		// Even semester
		else {
			season = CourseStart.SPRING;
		}
		
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(CourseStart newSeason) {
		CourseStart oldSeason = season;
		season = newSeason == null ? SEASON_EDEFAULT : newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SEMESTER__SEASON, oldSeason, season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER__COURSE_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourseGroups()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SEMESTER__COURSE_GROUPS:
				return ((InternalEList<?>)getCourseGroups()).basicRemove(otherEnd, msgs);
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
			case StudyplanPackage.SEMESTER__NUMBER:
				return getNumber();
			case StudyplanPackage.SEMESTER__CREDITS:
				return getCredits();
			case StudyplanPackage.SEMESTER__COURSE_GROUPS:
				return getCourseGroups();
			case StudyplanPackage.SEMESTER__SEASON:
				return getSeason();
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
			case StudyplanPackage.SEMESTER__NUMBER:
				setNumber((Integer)newValue);
				return;
			case StudyplanPackage.SEMESTER__CREDITS:
				setCredits((Float)newValue);
				return;
			case StudyplanPackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				getCourseGroups().addAll((Collection<? extends CourseGroup>)newValue);
				return;
			case StudyplanPackage.SEMESTER__SEASON:
				setSeason((CourseStart)newValue);
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
			case StudyplanPackage.SEMESTER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case StudyplanPackage.SEMESTER__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case StudyplanPackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				return;
			case StudyplanPackage.SEMESTER__SEASON:
				setSeason(SEASON_EDEFAULT);
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
			case StudyplanPackage.SEMESTER__NUMBER:
				return number != NUMBER_EDEFAULT;
			case StudyplanPackage.SEMESTER__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case StudyplanPackage.SEMESTER__COURSE_GROUPS:
				return courseGroups != null && !courseGroups.isEmpty();
			case StudyplanPackage.SEMESTER__SEASON:
				return season != SEASON_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (number: ");
		result.append(number);
		result.append(", credits: ");
		result.append(credits);
		result.append(", season: ");
		result.append(this.getSeason());
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
