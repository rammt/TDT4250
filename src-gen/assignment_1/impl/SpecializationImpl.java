/**
 */
package assignment_1.impl;

import assignment_1.Assignment_1Package;
import assignment_1.Semester;
import assignment_1.Specialization;

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
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment_1.impl.SpecializationImpl#getSubSpecialization <em>Sub Specialization</em>}</li>
 *   <li>{@link assignment_1.impl.SpecializationImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link assignment_1.impl.SpecializationImpl#getSpecializationCode <em>Specialization Code</em>}</li>
 *   <li>{@link assignment_1.impl.SpecializationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The cached value of the '{@link #getSubSpecialization() <em>Sub Specialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpecialization()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> subSpecialization;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semester;

	/**
	 * The default value of the '{@link #getSpecializationCode() <em>Specialization Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALIZATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecializationCode() <em>Specialization Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationCode()
	 * @generated
	 * @ordered
	 */
	protected String specializationCode = SPECIALIZATION_CODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment_1Package.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSubSpecialization() {
		if (subSpecialization == null) {
			subSpecialization = new EObjectContainmentEList<Specialization>(Specialization.class, this,
					Assignment_1Package.SPECIALIZATION__SUB_SPECIALIZATION);
		}
		return subSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemester() {
		if (semester == null) {
			semester = new EObjectContainmentEList<Semester>(Semester.class, this,
					Assignment_1Package.SPECIALIZATION__SEMESTER);
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecializationCode() {
		return specializationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecializationCode(String newSpecializationCode) {
		String oldSpecializationCode = specializationCode;
		specializationCode = newSpecializationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Assignment_1Package.SPECIALIZATION__SPECIALIZATION_CODE, oldSpecializationCode,
					specializationCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment_1Package.SPECIALIZATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assignment_1Package.SPECIALIZATION__SUB_SPECIALIZATION:
			return ((InternalEList<?>) getSubSpecialization()).basicRemove(otherEnd, msgs);
		case Assignment_1Package.SPECIALIZATION__SEMESTER:
			return ((InternalEList<?>) getSemester()).basicRemove(otherEnd, msgs);
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
		case Assignment_1Package.SPECIALIZATION__SUB_SPECIALIZATION:
			return getSubSpecialization();
		case Assignment_1Package.SPECIALIZATION__SEMESTER:
			return getSemester();
		case Assignment_1Package.SPECIALIZATION__SPECIALIZATION_CODE:
			return getSpecializationCode();
		case Assignment_1Package.SPECIALIZATION__NAME:
			return getName();
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
		case Assignment_1Package.SPECIALIZATION__SUB_SPECIALIZATION:
			getSubSpecialization().clear();
			getSubSpecialization().addAll((Collection<? extends Specialization>) newValue);
			return;
		case Assignment_1Package.SPECIALIZATION__SEMESTER:
			getSemester().clear();
			getSemester().addAll((Collection<? extends Semester>) newValue);
			return;
		case Assignment_1Package.SPECIALIZATION__SPECIALIZATION_CODE:
			setSpecializationCode((String) newValue);
			return;
		case Assignment_1Package.SPECIALIZATION__NAME:
			setName((String) newValue);
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
		case Assignment_1Package.SPECIALIZATION__SUB_SPECIALIZATION:
			getSubSpecialization().clear();
			return;
		case Assignment_1Package.SPECIALIZATION__SEMESTER:
			getSemester().clear();
			return;
		case Assignment_1Package.SPECIALIZATION__SPECIALIZATION_CODE:
			setSpecializationCode(SPECIALIZATION_CODE_EDEFAULT);
			return;
		case Assignment_1Package.SPECIALIZATION__NAME:
			setName(NAME_EDEFAULT);
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
		case Assignment_1Package.SPECIALIZATION__SUB_SPECIALIZATION:
			return subSpecialization != null && !subSpecialization.isEmpty();
		case Assignment_1Package.SPECIALIZATION__SEMESTER:
			return semester != null && !semester.isEmpty();
		case Assignment_1Package.SPECIALIZATION__SPECIALIZATION_CODE:
			return SPECIALIZATION_CODE_EDEFAULT == null ? specializationCode != null
					: !SPECIALIZATION_CODE_EDEFAULT.equals(specializationCode);
		case Assignment_1Package.SPECIALIZATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (specializationCode: ");
		result.append(specializationCode);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
