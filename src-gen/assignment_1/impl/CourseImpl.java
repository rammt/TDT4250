/**
 */
package assignment_1.impl;

import assignment_1.Assignment_1Package;
import assignment_1.Course;
import assignment_1.CourseLevel;
import assignment_1.CourseStart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.impl.CourseImpl#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link assignment_1.impl.CourseImpl#getCourseCredit <em>Course Credit</em>}</li>
 *   <li>{@link assignment_1.impl.CourseImpl#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link assignment_1.impl.CourseImpl#getCourseLevel <em>Course Level</em>}</li>
 *   <li>{@link assignment_1.impl.CourseImpl#getCourseStart <em>Course Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected String courseCode = COURSE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseCredit() <em>Course Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCredit()
	 * @generated
	 * @ordered
	 */
	protected static final float COURSE_CREDIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCourseCredit() <em>Course Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCredit()
	 * @generated
	 * @ordered
	 */
	protected float courseCredit = COURSE_CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected String courseName = COURSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseLevel() <em>Course Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CourseLevel COURSE_LEVEL_EDEFAULT = CourseLevel.LEVEL_1;

	/**
	 * The cached value of the '{@link #getCourseLevel() <em>Course Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseLevel()
	 * @generated
	 * @ordered
	 */
	protected CourseLevel courseLevel = COURSE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseStart() <em>Course Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseStart()
	 * @generated
	 * @ordered
	 */
	protected static final CourseStart COURSE_START_EDEFAULT = CourseStart.AUTUMN;

	/**
	 * The cached value of the '{@link #getCourseStart() <em>Course Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseStart()
	 * @generated
	 * @ordered
	 */
	protected CourseStart courseStart = COURSE_START_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment_1Package.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseCode(String newCourseCode) {
		String oldCourseCode = courseCode;
		courseCode = newCourseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.COURSE__COURSE_CODE,
					oldCourseCode, courseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCourseCredit() {
		return courseCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseCredit(float newCourseCredit) {
		float oldCourseCredit = courseCredit;
		courseCredit = newCourseCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.COURSE__COURSE_CREDIT,
					oldCourseCredit, courseCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourseName() {
		return courseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseName(String newCourseName) {
		String oldCourseName = courseName;
		courseName = newCourseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.COURSE__COURSE_NAME,
					oldCourseName, courseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseLevel getCourseLevel() {
		return courseLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseLevel(CourseLevel newCourseLevel) {
		CourseLevel oldCourseLevel = courseLevel;
		courseLevel = newCourseLevel == null ? COURSE_LEVEL_EDEFAULT : newCourseLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.COURSE__COURSE_LEVEL,
					oldCourseLevel, courseLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseStart getCourseStart() {
		return courseStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseStart(CourseStart newCourseStart) {
		CourseStart oldCourseStart = courseStart;
		courseStart = newCourseStart == null ? COURSE_START_EDEFAULT : newCourseStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.COURSE__COURSE_START,
					oldCourseStart, courseStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment_1Package.COURSE__COURSE_CODE:
			return getCourseCode();
		case Assignment_1Package.COURSE__COURSE_CREDIT:
			return getCourseCredit();
		case Assignment_1Package.COURSE__COURSE_NAME:
			return getCourseName();
		case Assignment_1Package.COURSE__COURSE_LEVEL:
			return getCourseLevel();
		case Assignment_1Package.COURSE__COURSE_START:
			return getCourseStart();
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
		case Assignment_1Package.COURSE__COURSE_CODE:
			setCourseCode((String) newValue);
			return;
		case Assignment_1Package.COURSE__COURSE_CREDIT:
			setCourseCredit((Float) newValue);
			return;
		case Assignment_1Package.COURSE__COURSE_NAME:
			setCourseName((String) newValue);
			return;
		case Assignment_1Package.COURSE__COURSE_LEVEL:
			setCourseLevel((CourseLevel) newValue);
			return;
		case Assignment_1Package.COURSE__COURSE_START:
			setCourseStart((CourseStart) newValue);
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
		case Assignment_1Package.COURSE__COURSE_CODE:
			setCourseCode(COURSE_CODE_EDEFAULT);
			return;
		case Assignment_1Package.COURSE__COURSE_CREDIT:
			setCourseCredit(COURSE_CREDIT_EDEFAULT);
			return;
		case Assignment_1Package.COURSE__COURSE_NAME:
			setCourseName(COURSE_NAME_EDEFAULT);
			return;
		case Assignment_1Package.COURSE__COURSE_LEVEL:
			setCourseLevel(COURSE_LEVEL_EDEFAULT);
			return;
		case Assignment_1Package.COURSE__COURSE_START:
			setCourseStart(COURSE_START_EDEFAULT);
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
		case Assignment_1Package.COURSE__COURSE_CODE:
			return COURSE_CODE_EDEFAULT == null ? courseCode != null : !COURSE_CODE_EDEFAULT.equals(courseCode);
		case Assignment_1Package.COURSE__COURSE_CREDIT:
			return courseCredit != COURSE_CREDIT_EDEFAULT;
		case Assignment_1Package.COURSE__COURSE_NAME:
			return COURSE_NAME_EDEFAULT == null ? courseName != null : !COURSE_NAME_EDEFAULT.equals(courseName);
		case Assignment_1Package.COURSE__COURSE_LEVEL:
			return courseLevel != COURSE_LEVEL_EDEFAULT;
		case Assignment_1Package.COURSE__COURSE_START:
			return courseStart != COURSE_START_EDEFAULT;
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
		result.append(" (courseCode: ");
		result.append(courseCode);
		result.append(", courseCredit: ");
		result.append(courseCredit);
		result.append(", courseName: ");
		result.append(courseName);
		result.append(", courseLevel: ");
		result.append(courseLevel);
		result.append(", courseStart: ");
		result.append(courseStart);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
