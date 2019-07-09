/**
 */
package mdcms.impl;

import mdcms.MdcmsPackage;
import mdcms.Router;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.RouterImpl#getSO <em>SO</em>}</li>
 *   <li>{@link mdcms.impl.RouterImpl#getFormFactor <em>Form Factor</em>}</li>
 *   <li>{@link mdcms.impl.RouterImpl#getNetworkInterfaceSlots <em>Network Interface Slots</em>}</li>
 *   <li>{@link mdcms.impl.RouterImpl#getServiceModuleSlots <em>Service Module Slots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouterImpl extends NetworkDeviceImpl implements Router {
	/**
	 * The default value of the '{@link #getSO() <em>SO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSO()
	 * @generated
	 * @ordered
	 */
	protected static final String SO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSO() <em>SO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSO()
	 * @generated
	 * @ordered
	 */
	protected String so = SO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormFactor() <em>Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormFactor() <em>Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFactor()
	 * @generated
	 * @ordered
	 */
	protected String formFactor = FORM_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkInterfaceSlots() <em>Network Interface Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterfaceSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int NETWORK_INTERFACE_SLOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNetworkInterfaceSlots() <em>Network Interface Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterfaceSlots()
	 * @generated
	 * @ordered
	 */
	protected int networkInterfaceSlots = NETWORK_INTERFACE_SLOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceModuleSlots() <em>Service Module Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceModuleSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_MODULE_SLOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServiceModuleSlots() <em>Service Module Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceModuleSlots()
	 * @generated
	 * @ordered
	 */
	protected int serviceModuleSlots = SERVICE_MODULE_SLOTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.ROUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSO() {
		return so;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSO(String newSO) {
		String oldSO = so;
		so = newSO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.ROUTER__SO, oldSO, so));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormFactor() {
		return formFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormFactor(String newFormFactor) {
		String oldFormFactor = formFactor;
		formFactor = newFormFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.ROUTER__FORM_FACTOR, oldFormFactor, formFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNetworkInterfaceSlots() {
		return networkInterfaceSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkInterfaceSlots(int newNetworkInterfaceSlots) {
		int oldNetworkInterfaceSlots = networkInterfaceSlots;
		networkInterfaceSlots = newNetworkInterfaceSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.ROUTER__NETWORK_INTERFACE_SLOTS, oldNetworkInterfaceSlots, networkInterfaceSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServiceModuleSlots() {
		return serviceModuleSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceModuleSlots(int newServiceModuleSlots) {
		int oldServiceModuleSlots = serviceModuleSlots;
		serviceModuleSlots = newServiceModuleSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.ROUTER__SERVICE_MODULE_SLOTS, oldServiceModuleSlots, serviceModuleSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcmsPackage.ROUTER__SO:
				return getSO();
			case MdcmsPackage.ROUTER__FORM_FACTOR:
				return getFormFactor();
			case MdcmsPackage.ROUTER__NETWORK_INTERFACE_SLOTS:
				return getNetworkInterfaceSlots();
			case MdcmsPackage.ROUTER__SERVICE_MODULE_SLOTS:
				return getServiceModuleSlots();
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
			case MdcmsPackage.ROUTER__SO:
				setSO((String)newValue);
				return;
			case MdcmsPackage.ROUTER__FORM_FACTOR:
				setFormFactor((String)newValue);
				return;
			case MdcmsPackage.ROUTER__NETWORK_INTERFACE_SLOTS:
				setNetworkInterfaceSlots((Integer)newValue);
				return;
			case MdcmsPackage.ROUTER__SERVICE_MODULE_SLOTS:
				setServiceModuleSlots((Integer)newValue);
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
			case MdcmsPackage.ROUTER__SO:
				setSO(SO_EDEFAULT);
				return;
			case MdcmsPackage.ROUTER__FORM_FACTOR:
				setFormFactor(FORM_FACTOR_EDEFAULT);
				return;
			case MdcmsPackage.ROUTER__NETWORK_INTERFACE_SLOTS:
				setNetworkInterfaceSlots(NETWORK_INTERFACE_SLOTS_EDEFAULT);
				return;
			case MdcmsPackage.ROUTER__SERVICE_MODULE_SLOTS:
				setServiceModuleSlots(SERVICE_MODULE_SLOTS_EDEFAULT);
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
			case MdcmsPackage.ROUTER__SO:
				return SO_EDEFAULT == null ? so != null : !SO_EDEFAULT.equals(so);
			case MdcmsPackage.ROUTER__FORM_FACTOR:
				return FORM_FACTOR_EDEFAULT == null ? formFactor != null : !FORM_FACTOR_EDEFAULT.equals(formFactor);
			case MdcmsPackage.ROUTER__NETWORK_INTERFACE_SLOTS:
				return networkInterfaceSlots != NETWORK_INTERFACE_SLOTS_EDEFAULT;
			case MdcmsPackage.ROUTER__SERVICE_MODULE_SLOTS:
				return serviceModuleSlots != SERVICE_MODULE_SLOTS_EDEFAULT;
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
		result.append(" (SO: ");
		result.append(so);
		result.append(", FormFactor: ");
		result.append(formFactor);
		result.append(", NetworkInterfaceSlots: ");
		result.append(networkInterfaceSlots);
		result.append(", ServiceModuleSlots: ");
		result.append(serviceModuleSlots);
		result.append(')');
		return result.toString();
	}

} //RouterImpl
