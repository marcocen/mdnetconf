/**
 */
package mdcms.impl;

import mdcms.MdcmsPackage;
import mdcms.Server;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.ServerImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link mdcms.impl.ServerImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link mdcms.impl.ServerImpl#getDiskType <em>Disk Type</em>}</li>
 *   <li>{@link mdcms.impl.ServerImpl#getDiskSpace <em>Disk Space</em>}</li>
 *   <li>{@link mdcms.impl.ServerImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link mdcms.impl.ServerImpl#getRack <em>Rack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends PhysicalImpl implements Server {
	/**
	 * The default value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected String processor = PROCESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskType() <em>Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskType()
	 * @generated
	 * @ordered
	 */
	protected static final String DISK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskType() <em>Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskType()
	 * @generated
	 * @ordered
	 */
	protected String diskType = DISK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSpace() <em>Disk Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String DISK_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskSpace() <em>Disk Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSpace()
	 * @generated
	 * @ordered
	 */
	protected String diskSpace = DISK_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected static final String RAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected String ram = RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRack() <em>Rack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRack()
	 * @generated
	 * @ordered
	 */
	protected static final String RACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRack() <em>Rack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRack()
	 * @generated
	 * @ordered
	 */
	protected String rack = RACK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(String newProcessor) {
		String oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.SERVER__PROCESSOR, oldProcessor, processor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(String newArchitecture) {
		String oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.SERVER__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiskType() {
		return diskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskType(String newDiskType) {
		String oldDiskType = diskType;
		diskType = newDiskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.SERVER__DISK_TYPE, oldDiskType, diskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiskSpace() {
		return diskSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskSpace(String newDiskSpace) {
		String oldDiskSpace = diskSpace;
		diskSpace = newDiskSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.SERVER__DISK_SPACE, oldDiskSpace, diskSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRam() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRam(String newRam) {
		String oldRam = ram;
		ram = newRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.SERVER__RAM, oldRam, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRack() {
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRack(String newRack) {
		String oldRack = rack;
		rack = newRack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.SERVER__RACK, oldRack, rack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcmsPackage.SERVER__PROCESSOR:
				return getProcessor();
			case MdcmsPackage.SERVER__ARCHITECTURE:
				return getArchitecture();
			case MdcmsPackage.SERVER__DISK_TYPE:
				return getDiskType();
			case MdcmsPackage.SERVER__DISK_SPACE:
				return getDiskSpace();
			case MdcmsPackage.SERVER__RAM:
				return getRam();
			case MdcmsPackage.SERVER__RACK:
				return getRack();
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
			case MdcmsPackage.SERVER__PROCESSOR:
				setProcessor((String)newValue);
				return;
			case MdcmsPackage.SERVER__ARCHITECTURE:
				setArchitecture((String)newValue);
				return;
			case MdcmsPackage.SERVER__DISK_TYPE:
				setDiskType((String)newValue);
				return;
			case MdcmsPackage.SERVER__DISK_SPACE:
				setDiskSpace((String)newValue);
				return;
			case MdcmsPackage.SERVER__RAM:
				setRam((String)newValue);
				return;
			case MdcmsPackage.SERVER__RACK:
				setRack((String)newValue);
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
			case MdcmsPackage.SERVER__PROCESSOR:
				setProcessor(PROCESSOR_EDEFAULT);
				return;
			case MdcmsPackage.SERVER__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case MdcmsPackage.SERVER__DISK_TYPE:
				setDiskType(DISK_TYPE_EDEFAULT);
				return;
			case MdcmsPackage.SERVER__DISK_SPACE:
				setDiskSpace(DISK_SPACE_EDEFAULT);
				return;
			case MdcmsPackage.SERVER__RAM:
				setRam(RAM_EDEFAULT);
				return;
			case MdcmsPackage.SERVER__RACK:
				setRack(RACK_EDEFAULT);
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
			case MdcmsPackage.SERVER__PROCESSOR:
				return PROCESSOR_EDEFAULT == null ? processor != null : !PROCESSOR_EDEFAULT.equals(processor);
			case MdcmsPackage.SERVER__ARCHITECTURE:
				return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
			case MdcmsPackage.SERVER__DISK_TYPE:
				return DISK_TYPE_EDEFAULT == null ? diskType != null : !DISK_TYPE_EDEFAULT.equals(diskType);
			case MdcmsPackage.SERVER__DISK_SPACE:
				return DISK_SPACE_EDEFAULT == null ? diskSpace != null : !DISK_SPACE_EDEFAULT.equals(diskSpace);
			case MdcmsPackage.SERVER__RAM:
				return RAM_EDEFAULT == null ? ram != null : !RAM_EDEFAULT.equals(ram);
			case MdcmsPackage.SERVER__RACK:
				return RACK_EDEFAULT == null ? rack != null : !RACK_EDEFAULT.equals(rack);
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
		result.append(" (Processor: ");
		result.append(processor);
		result.append(", Architecture: ");
		result.append(architecture);
		result.append(", DiskType: ");
		result.append(diskType);
		result.append(", DiskSpace: ");
		result.append(diskSpace);
		result.append(", Ram: ");
		result.append(ram);
		result.append(", Rack: ");
		result.append(rack);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
