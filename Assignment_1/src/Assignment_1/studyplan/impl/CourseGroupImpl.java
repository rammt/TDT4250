/**
 */
package Assignment_1.studyplan.impl;

import Assignment_1.studyplan.Course;
import Assignment_1.studyplan.CourseGroup;
import Assignment_1.studyplan.CourseType;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assignment_1.studyplan.impl.CourseGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link Assignment_1.studyplan.impl.CourseGroupImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link Assignment_1.studyplan.impl.CourseGroupImpl#getMandatoryCredits <em>Mandatory Credits</em>}</li>
 *   <li>{@link Assignment_1.studyplan.impl.CourseGroupImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseType TYPE_EDEFAULT = CourseType.O;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CourseType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The default value of the '{@link #getMandatoryCredits() <em>Mandatory Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float MANDATORY_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMandatoryCredits() <em>Mandatory Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCredits()
	 * @generated
	 * @ordered
	 */
	protected float mandatoryCredits = MANDATORY_CREDITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CourseType newType) {
		CourseType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE_GROUP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, StudyplanPackage.COURSE_GROUP__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMandatoryCredits() {
		return mandatoryCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatoryCredits(float newMandatoryCredits) {
		float oldMandatoryCredits = mandatoryCredits;
		mandatoryCredits = newMandatoryCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE_GROUP__MANDATORY_CREDITS, oldMandatoryCredits, mandatoryCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemester() {
		if (eContainerFeatureID() != StudyplanPackage.COURSE_GROUP__SEMESTER) return null;
		return (Semester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemester, StudyplanPackage.COURSE_GROUP__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer() || (eContainerFeatureID() != StudyplanPackage.COURSE_GROUP__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, StudyplanPackage.SEMESTER__COURSE_GROUPS, Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE_GROUP__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemester((Semester)otherEnd, msgs);
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
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				return basicSetSemester(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				return eInternalContainer().eInverseRemove(this, StudyplanPackage.SEMESTER__COURSE_GROUPS, Semester.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyplanPackage.COURSE_GROUP__TYPE:
				return getType();
			case StudyplanPackage.COURSE_GROUP__COURSES:
				return getCourses();
			case StudyplanPackage.COURSE_GROUP__MANDATORY_CREDITS:
				return getMandatoryCredits();
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				return getSemester();
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
			case StudyplanPackage.COURSE_GROUP__TYPE:
				setType((CourseType)newValue);
				return;
			case StudyplanPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyplanPackage.COURSE_GROUP__MANDATORY_CREDITS:
				setMandatoryCredits((Float)newValue);
				return;
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				setSemester((Semester)newValue);
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
			case StudyplanPackage.COURSE_GROUP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StudyplanPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				return;
			case StudyplanPackage.COURSE_GROUP__MANDATORY_CREDITS:
				setMandatoryCredits(MANDATORY_CREDITS_EDEFAULT);
				return;
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				setSemester((Semester)null);
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
			case StudyplanPackage.COURSE_GROUP__TYPE:
				return type != TYPE_EDEFAULT;
			case StudyplanPackage.COURSE_GROUP__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyplanPackage.COURSE_GROUP__MANDATORY_CREDITS:
				return mandatoryCredits != MANDATORY_CREDITS_EDEFAULT;
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				return getSemester() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", mandatoryCredits: ");
		result.append(mandatoryCredits);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
