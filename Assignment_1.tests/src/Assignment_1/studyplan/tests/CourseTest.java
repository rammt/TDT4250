/**
 */
package Assignment_1.studyplan.tests;

import Assignment_1.studyplan.Course;
import Assignment_1.studyplan.StudyplanFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link Assignment_1.studyplan.Course#getTitle() <em>Title</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CourseTest extends TestCase {

	/**
	 * The fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Course fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseTest.class);
	}

	/**
	 * Constructs a new Course test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Course fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Course getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyplanFactory.eINSTANCE.createCourse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link Assignment_1.studyplan.Course#getTitle() <em>Title</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assignment_1.studyplan.Course#getTitle()
	 * @generated NOT
	 */
	public void testGetTitle() {
		Course course = StudyplanFactory.eINSTANCE.createCourse();
		course.setCode("TDT4250");
		course.setName("Advanced Software Design");
		assertEquals("TDT4250 - Advanced Software Design", course.getTitle());
	}

} //CourseTest
