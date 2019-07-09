/**
 */
package mdcms.impl;

import mdcms.MdcmsPackage;
import mdcms.PC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.PCImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link mdcms.impl.PCImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link mdcms.impl.PCImpl#getDiskType <em>Disk Type</em>}</li>
 *   <li>{@link mdcms.impl.PCImpl#getDiskSpace <em>Disk Space</em>}</li>
 *   <li>{@link mdcms.impl.PCImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link mdcms.impl.PCImpl#getMotherboard <em>Motherboard</em>}</li>
 *   <li>{@link mdcms.impl.PCImpl#getGraphicCard <em>Graphic Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCImpl extends PhysicalImpl implements PC {
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
	 * The default value of the '{@link #getMotherboard() <em>Motherboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotherboard()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTHERBOARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotherboard() <em>Motherboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotherboard()
	 * @generated
	 * @ordered
	 */
	protected String motherboard = MOTHERBOARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraphicCard() <em>Graphic Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicCard()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPHIC_CARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphicCard() <em>Graphic Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicCard()
	 * @generated
	 * @ordered
	 */
	protected String graphicCard = GRAPHIC_CARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.PC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PC__PROCESSOR, oldProcessor, processor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PC__ARCHITECTURE, oldArchitecture, architecture));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PC__DISK_TYPE, oldDiskType, diskType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PC__DISK_SPACE, oldDiskSpace, diskSpace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PC__RAM, oldRam, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotherboard() {
		return motherboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotherboard(String newMotherboard) {
		String oldMotherboard = motherboard;
		motherboard = newMotherboard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PC__MOTHERBOARD, oldMotherboard, motherboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraphicCard() {
		return graphicCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicCard(String newGraphicCard) {
		String oldGraphicCard = graphicCard;
		graphicCard = newGraphicCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.PC__GRAPHIC_CARD, oldGraphicCard, graphicCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcmsPackage.PC__PROCESSOR:
				return getProcessor();
			case MdcmsPackage.PC__ARCHITECTURE:
				return getArchitecture();
			case MdcmsPackage.PC__DISK_TYPE:
				return getDiskType();
			case MdcmsPackage.PC__DISK_SPACE:
				return getDiskSpace();
			case MdcmsPackage.PC__RAM:
				return getRam();
			case MdcmsPackage.PC__MOTHERBOARD:
				return getMotherboard();
			case MdcmsPackage.PC__GRAPHIC_CARD:
				return getGraphicCard();
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
			case MdcmsPackage.PC__PROCESSOR:
				setProcessor((String)newValue);
				return;
			case MdcmsPackage.PC__ARCHITECTURE:
				setArchitecture((String)newValue);
				return;
			case MdcmsPackage.PC__DISK_TYPE:
				setDiskType((String)newValue);
				return;
			case MdcmsPackage.PC__DISK_SPACE:
				setDiskSpace((String)newValue);
				return;
			case MdcmsPackage.PC__RAM:
				setRam((String)newValue);
				return;
			case MdcmsPackage.PC__MOTHERBOARD:
				setMotherboard((String)newValue);
				return;
			case MdcmsPackage.PC__GRAPHIC_CARD:
				setGraphicCard((String)newValue);
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
			case MdcmsPackage.PC__PROCESSOR:
				setProcessor(PROCESSOR_EDEFAULT);
				return;
			case MdcmsPackage.PC__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case MdcmsPackage.PC__DISK_TYPE:
				setDiskType(DISK_TYPE_EDEFAULT);
				return;
			case MdcmsPackage.PC__DISK_SPACE:
				setDiskSpace(DISK_SPACE_EDEFAULT);
				return;
			case MdcmsPackage.PC__RAM:
				setRam(RAM_EDEFAULT);
				return;
			case MdcmsPackage.PC__MOTHERBOARD:
				setMotherboard(MOTHERBOARD_EDEFAULT);
				return;
			case MdcmsPackage.PC__GRAPHIC_CARD:
				setGraphicCard(GRAPHIC_CARD_EDEFAULT);
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
			case MdcmsPackage.PC__PROCESSOR:
				return PROCESSOR_EDEFAULT == null ? processor != null : !PROCESSOR_EDEFAULT.equals(processor);
			case MdcmsPackage.PC__ARCHITECTURE:
				return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
			case MdcmsPackage.PC__DISK_TYPE:
				return DISK_TYPE_EDEFAULT == null ? diskType != null : !DISK_TYPE_EDEFAULT.equals(diskType);
			case MdcmsPackage.PC__DISK_SPACE:
				return DISK_SPACE_EDEFAULT == null ? diskSpace != null : !DISK_SPACE_EDEFAULT.equals(diskSpace);
			case MdcmsPackage.PC__RAM:
				return RAM_EDEFAULT == null ? ram != null : !RAM_EDEFAULT.equals(ram);
			case MdcmsPackage.PC__MOTHERBOARD:
				return MOTHERBOARD_EDEFAULT == null ? motherboard != null : !MOTHERBOARD_EDEFAULT.equals(motherboard);
			case MdcmsPackage.PC__GRAPHIC_CARD:
				return GRAPHIC_CARD_EDEFAULT == null ? graphicCard != null : !GRAPHIC_CARD_EDEFAULT.equals(graphicCard);
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
		result.append(", Motherboard: ");
		result.append(motherboard);
		result.append(", GraphicCard: ");
		result.append(graphicCard);
		result.append(')');
		return result.toString();
	}

} //PCImpl
