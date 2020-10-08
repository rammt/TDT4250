/**
 */
package Assignment_1.studyplan.util;

import Assignment_1.studyplan.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Assignment_1.studyplan.StudyplanPackage
 * @generated
 */
public class StudyplanValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyplanValidator INSTANCE = new StudyplanValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Assignment_1.studyplan";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyplanValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyplanPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyplanPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyplanPackage.COURSE_GROUP:
				return validateCourseGroup((CourseGroup)value, diagnostics, context);
			case StudyplanPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyplanPackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case StudyplanPackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case StudyplanPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case StudyplanPackage.DEGREE:
				return validateDegree((Degree)value, diagnostics, context);
			case StudyplanPackage.COURSE_LEVEL:
				return validateCourseLevel((CourseLevel)value, diagnostics, context);
			case StudyplanPackage.COURSE_TYPE:
				return validateCourseType((CourseType)value, diagnostics, context);
			case StudyplanPackage.COURSE_START:
				return validateCourseStart((CourseStart)value, diagnostics, context);
			case StudyplanPackage.CREDITS:
				return validateCredits((Float)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_maximumCredits(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the maximumCredits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourse_maximumCredits(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (course.getCredits() > 30.0) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "maximumCredits", getObjectLabel(course, context) },
						 new Object[] { course },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseGroup_maximumMandatoryCreditsInAllCourseGroupsSameSemester(courseGroup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maximumMandatoryCreditsInAllCourseGroupsSameSemester constraint of '<em>Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE_GROUP__MAXIMUM_MANDATORY_CREDITS_IN_ALL_COURSE_GROUPS_SAME_SEMESTER__EEXPRESSION = "self.semester.courseGroups.mandatoryCredits->sum() <= Sequence{self.semester.credits}->sum()";

	/**
	 * Validates the maximumMandatoryCreditsInAllCourseGroupsSameSemester constraint of '<em>Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup_maximumMandatoryCreditsInAllCourseGroupsSameSemester(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyplanPackage.Literals.COURSE_GROUP,
				 courseGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "maximumMandatoryCreditsInAllCourseGroupsSameSemester",
				 COURSE_GROUP__MAXIMUM_MANDATORY_CREDITS_IN_ALL_COURSE_GROUPS_SAME_SEMESTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the needsCoursesWithEnoughCredits constraint of '<em>Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseGroup_needsCoursesWithEnoughCredits(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		float sum = 0.0f;
		for (Course course : courseGroup.getCourses()) {
			sum += course.getCredits();
		}
		
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (sum < courseGroup.getMandatoryCredits()) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "needsCoursesWithEnoughCredits", getObjectLabel(courseGroup, context) },
						 new Object[] { courseGroup },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree(Degree degree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseType(CourseType courseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseStart(CourseStart courseStart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredits(float credits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCredits_Min(credits, diagnostics, context);
		if (result || diagnostics != null) result &= validateCredits_Max(credits, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCredits_Min
	 */
	public static final float CREDITS__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Credits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredits_Min(float credits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = credits > CREDITS__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(StudyplanPackage.Literals.CREDITS, credits, CREDITS__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCredits_Max
	 */
	public static final float CREDITS__MAX__VALUE = 30.0F;

	/**
	 * Validates the Max constraint of '<em>Credits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredits_Max(float credits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = credits <= CREDITS__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(StudyplanPackage.Literals.CREDITS, credits, CREDITS__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyplanValidator
