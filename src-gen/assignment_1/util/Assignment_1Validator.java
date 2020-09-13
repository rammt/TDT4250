/**
 */
package assignment_1.util;

import assignment_1.*;

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
 * @see assignment_1.Assignment_1Package
 * @generated
 */
public class Assignment_1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Assignment_1Validator INSTANCE = new Assignment_1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "assignment_1";

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
	public Assignment_1Validator() {
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
		return Assignment_1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Assignment_1Package.STUDY_PLAN:
			return validateStudyPlan((StudyPlan) value, diagnostics, context);
		case Assignment_1Package.STUDY_START:
			return validateStudyStart((StudyStart) value, diagnostics, context);
		case Assignment_1Package.PROGRAMME:
			return validateProgramme((Programme) value, diagnostics, context);
		case Assignment_1Package.SPECIALIZATION:
			return validateSpecialization((Specialization) value, diagnostics, context);
		case Assignment_1Package.SEMESTER:
			return validateSemester((Semester) value, diagnostics, context);
		case Assignment_1Package.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case Assignment_1Package.COURSE_GROUP:
			return validateCourseGroup((CourseGroup) value, diagnostics, context);
		case Assignment_1Package.COURSE_LEVEL:
			return validateCourseLevel((CourseLevel) value, diagnostics, context);
		case Assignment_1Package.DEGREE:
			return validateDegree((Degree) value, diagnostics, context);
		case Assignment_1Package.COURSE_TYPE:
			return validateCourseType((CourseType) value, diagnostics, context);
		case Assignment_1Package.COURSE_START:
			return validateCourseStart((CourseStart) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyStart(StudyStart studyStart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyStart, diagnostics, context);
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
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSemester_requiresMin30Credits(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the requiresMin30Credits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__REQUIRES_MIN30_CREDITS__EEXPRESSION = "self.semesterCredits >= 30.0";

	/**
	 * Validates the requiresMin30Credits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_requiresMin30Credits(Semester semester, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Assignment_1Package.Literals.SEMESTER, semester, diagnostics, context,
				"http://www.eclipse.org/acceleo/query/1.0", "requiresMin30Credits",
				SEMESTER__REQUIRES_MIN30_CREDITS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCourse_maxCourseCredits(course, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxCourseCredits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE__MAX_COURSE_CREDITS__EEXPRESSION = "self.maxCourseCredits <= 30.0";

	/**
	 * Validates the maxCourseCredits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_maxCourseCredits(Course course, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Assignment_1Package.Literals.COURSE, course, diagnostics, context,
				"http://www.eclipse.org/acceleo/query/1.0", "maxCourseCredits", COURSE__MAX_COURSE_CREDITS__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup(CourseGroup courseGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
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
	public boolean validateCourseType(CourseType courseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseStart(CourseStart courseStart, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
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

} //Assignment_1Validator
