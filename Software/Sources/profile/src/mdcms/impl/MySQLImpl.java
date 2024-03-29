/**
 */
package mdcms.impl;

import mdcms.MdcmsPackage;
import mdcms.MySQL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My SQL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.MySQLImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link mdcms.impl.MySQLImpl#getPackageVersion <em>Package Version</em>}</li>
 *   <li>{@link mdcms.impl.MySQLImpl#getRootPassword <em>Root Password</em>}</li>
 *   <li>{@link mdcms.impl.MySQLImpl#getInstallOptions <em>Install Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MySQLImpl extends DBEngineImpl implements MySQL {
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageVersion() <em>Package Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageVersion() <em>Package Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVersion()
	 * @generated
	 * @ordered
	 */
	protected String packageVersion = PACKAGE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootPassword() <em>Root Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootPassword() <em>Root Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPassword()
	 * @generated
	 * @ordered
	 */
	protected String rootPassword = ROOT_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstallOptions() <em>Install Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALL_OPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallOptions() <em>Install Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallOptions()
	 * @generated
	 * @ordered
	 */
	protected String installOptions = INSTALL_OPTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MySQLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.MY_SQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.MY_SQL__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageVersion() {
		return packageVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageVersion(String newPackageVersion) {
		String oldPackageVersion = packageVersion;
		packageVersion = newPackageVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.MY_SQL__PACKAGE_VERSION, oldPackageVersion, packageVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootPassword() {
		return rootPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootPassword(String newRootPassword) {
		String oldRootPassword = rootPassword;
		rootPassword = newRootPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.MY_SQL__ROOT_PASSWORD, oldRootPassword, rootPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstallOptions() {
		return installOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallOptions(String newInstallOptions) {
		String oldInstallOptions = installOptions;
		installOptions = newInstallOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.MY_SQL__INSTALL_OPTIONS, oldInstallOptions, installOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcmsPackage.MY_SQL__PACKAGE_NAME:
				return getPackageName();
			case MdcmsPackage.MY_SQL__PACKAGE_VERSION:
				return getPackageVersion();
			case MdcmsPackage.MY_SQL__ROOT_PASSWORD:
				return getRootPassword();
			case MdcmsPackage.MY_SQL__INSTALL_OPTIONS:
				return getInstallOptions();
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
			case MdcmsPackage.MY_SQL__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case MdcmsPackage.MY_SQL__PACKAGE_VERSION:
				setPackageVersion((String)newValue);
				return;
			case MdcmsPackage.MY_SQL__ROOT_PASSWORD:
				setRootPassword((String)newValue);
				return;
			case MdcmsPackage.MY_SQL__INSTALL_OPTIONS:
				setInstallOptions((String)newValue);
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
			case MdcmsPackage.MY_SQL__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case MdcmsPackage.MY_SQL__PACKAGE_VERSION:
				setPackageVersion(PACKAGE_VERSION_EDEFAULT);
				return;
			case MdcmsPackage.MY_SQL__ROOT_PASSWORD:
				setRootPassword(ROOT_PASSWORD_EDEFAULT);
				return;
			case MdcmsPackage.MY_SQL__INSTALL_OPTIONS:
				setInstallOptions(INSTALL_OPTIONS_EDEFAULT);
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
			case MdcmsPackage.MY_SQL__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case MdcmsPackage.MY_SQL__PACKAGE_VERSION:
				return PACKAGE_VERSION_EDEFAULT == null ? packageVersion != null : !PACKAGE_VERSION_EDEFAULT.equals(packageVersion);
			case MdcmsPackage.MY_SQL__ROOT_PASSWORD:
				return ROOT_PASSWORD_EDEFAULT == null ? rootPassword != null : !ROOT_PASSWORD_EDEFAULT.equals(rootPassword);
			case MdcmsPackage.MY_SQL__INSTALL_OPTIONS:
				return INSTALL_OPTIONS_EDEFAULT == null ? installOptions != null : !INSTALL_OPTIONS_EDEFAULT.equals(installOptions);
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
		result.append(" (PackageName: ");
		result.append(packageName);
		result.append(", PackageVersion: ");
		result.append(packageVersion);
		result.append(", RootPassword: ");
		result.append(rootPassword);
		result.append(", InstallOptions: ");
		result.append(installOptions);
		result.append(')');
		return result.toString();
	}

} //MySQLImpl
