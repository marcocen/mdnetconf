/**
 */
package mdcms.impl;

import mdcms.MdcmsPackage;
import mdcms.Physical;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Device;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.PhysicalImpl#getBase_Device <em>Base Device</em>}</li>
 *   <li>{@link mdcms.impl.PhysicalImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link mdcms.impl.PhysicalImpl#getIP <em>IP</em>}</li>
 *   <li>{@link mdcms.impl.PhysicalImpl#getMAC <em>MAC</em>}</li>
 *   <li>{@link mdcms.impl.PhysicalImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link mdcms.impl.PhysicalImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalImpl extends MinimalEObjectImpl.Container implements Physical {
	/**
	 * The cached value of the '{@link #getBase_Device() <em>Base Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Device()
	 * @generated
	 * @ordered
	 */
	protected Device base_Device;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAC() <em>MAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAC()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMAC() <em>MAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAC()
	 * @generated
	 * @ordered
	 */
	protected String mac = MAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.PHYSICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getBase_Device() {
		if (base_Device != null && base_Device.eIsProxy()) {
			InternalEObject oldBase_Device = (InternalEObject)base_Device;
			base_Device = (Device)eResolveProxy(oldBase_Device);
			if (base_Device != oldBase_Device) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdcmsPackage.PHYSICAL__BASE_DEVICE, oldBase_Device, base_Device));
			}
		}
		return base_Device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetBase_Device() {
		return base_Device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Device(Device newBase_Device) {
		Device oldBase_Device = base_Device;
		base_Device = newBase_Device;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PHYSICAL__BASE_DEVICE, oldBase_Device, base_Device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PHYSICAL__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIP() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIP(String newIP) {
		String oldIP = ip;
		ip = newIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PHYSICAL__IP, oldIP, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMAC() {
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMAC(String newMAC) {
		String oldMAC = mac;
		mac = newMAC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PHYSICAL__MAC, oldMAC, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PHYSICAL__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PHYSICAL__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcmsPackage.PHYSICAL__BASE_DEVICE:
				if (resolve) return getBase_Device();
				return basicGetBase_Device();
			case MdcmsPackage.PHYSICAL__LOCATION:
				return getLocation();
			case MdcmsPackage.PHYSICAL__IP:
				return getIP();
			case MdcmsPackage.PHYSICAL__MAC:
				return getMAC();
			case MdcmsPackage.PHYSICAL__MANUFACTURER:
				return getManufacturer();
			case MdcmsPackage.PHYSICAL__MODEL:
				return getModel();
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
			case MdcmsPackage.PHYSICAL__BASE_DEVICE:
				setBase_Device((Device)newValue);
				return;
			case MdcmsPackage.PHYSICAL__LOCATION:
				setLocation((String)newValue);
				return;
			case MdcmsPackage.PHYSICAL__IP:
				setIP((String)newValue);
				return;
			case MdcmsPackage.PHYSICAL__MAC:
				setMAC((String)newValue);
				return;
			case MdcmsPackage.PHYSICAL__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case MdcmsPackage.PHYSICAL__MODEL:
				setModel((String)newValue);
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
			case MdcmsPackage.PHYSICAL__BASE_DEVICE:
				setBase_Device((Device)null);
				return;
			case MdcmsPackage.PHYSICAL__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case MdcmsPackage.PHYSICAL__IP:
				setIP(IP_EDEFAULT);
				return;
			case MdcmsPackage.PHYSICAL__MAC:
				setMAC(MAC_EDEFAULT);
				return;
			case MdcmsPackage.PHYSICAL__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case MdcmsPackage.PHYSICAL__MODEL:
				setModel(MODEL_EDEFAULT);
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
			case MdcmsPackage.PHYSICAL__BASE_DEVICE:
				return base_Device != null;
			case MdcmsPackage.PHYSICAL__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case MdcmsPackage.PHYSICAL__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case MdcmsPackage.PHYSICAL__MAC:
				return MAC_EDEFAULT == null ? mac != null : !MAC_EDEFAULT.equals(mac);
			case MdcmsPackage.PHYSICAL__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case MdcmsPackage.PHYSICAL__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
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
		result.append(" (Location: ");
		result.append(location);
		result.append(", IP: ");
		result.append(ip);
		result.append(", MAC: ");
		result.append(mac);
		result.append(", Manufacturer: ");
		result.append(manufacturer);
		result.append(", Model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //PhysicalImpl
