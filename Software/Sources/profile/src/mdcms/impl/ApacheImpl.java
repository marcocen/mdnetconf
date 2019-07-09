/**
 */
package mdcms.impl;

import mdcms.Apache;
import mdcms.MdcmsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.ApacheImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mdcms.impl.ApacheImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link mdcms.impl.ApacheImpl#getConfigDir <em>Config Dir</em>}</li>
 *   <li>{@link mdcms.impl.ApacheImpl#getDocroot <em>Docroot</em>}</li>
 *   <li>{@link mdcms.impl.ApacheImpl#getLogroot <em>Logroot</em>}</li>
 *   <li>{@link mdcms.impl.ApacheImpl#getLibPath <em>Lib Path</em>}</li>
 *   <li>{@link mdcms.impl.ApacheImpl#getDefaultVhost <em>Default Vhost</em>}</li>
 *   <li>{@link mdcms.impl.ApacheImpl#getVhostDir <em>Vhost Dir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApacheImpl extends HTTPServerImpl implements Apache {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected String serverName = SERVER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigDir() <em>Config Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigDir()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigDir() <em>Config Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigDir()
	 * @generated
	 * @ordered
	 */
	protected String configDir = CONFIG_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocroot() <em>Docroot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocroot()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocroot() <em>Docroot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocroot()
	 * @generated
	 * @ordered
	 */
	protected String docroot = DOCROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogroot() <em>Logroot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogroot()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogroot() <em>Logroot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogroot()
	 * @generated
	 * @ordered
	 */
	protected String logroot = LOGROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibPath() <em>Lib Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibPath()
	 * @generated
	 * @ordered
	 */
	protected static final String LIB_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibPath() <em>Lib Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibPath()
	 * @generated
	 * @ordered
	 */
	protected String libPath = LIB_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultVhost() <em>Default Vhost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultVhost()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VHOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultVhost() <em>Default Vhost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultVhost()
	 * @generated
	 * @ordered
	 */
	protected String defaultVhost = DEFAULT_VHOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVhostDir() <em>Vhost Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVhostDir()
	 * @generated
	 * @ordered
	 */
	protected static final String VHOST_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVhostDir() <em>Vhost Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVhostDir()
	 * @generated
	 * @ordered
	 */
	protected String vhostDir = VHOST_DIR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.APACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerName() {
		return serverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerName(String newServerName) {
		String oldServerName = serverName;
		serverName = newServerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE__SERVER_NAME, oldServerName, serverName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigDir() {
		return configDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigDir(String newConfigDir) {
		String oldConfigDir = configDir;
		configDir = newConfigDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE__CONFIG_DIR, oldConfigDir, configDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocroot() {
		return docroot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocroot(String newDocroot) {
		String oldDocroot = docroot;
		docroot = newDocroot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE__DOCROOT, oldDocroot, docroot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogroot() {
		return logroot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogroot(String newLogroot) {
		String oldLogroot = logroot;
		logroot = newLogroot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE__LOGROOT, oldLogroot, logroot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibPath() {
		return libPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibPath(String newLibPath) {
		String oldLibPath = libPath;
		libPath = newLibPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE__LIB_PATH, oldLibPath, libPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultVhost() {
		return defaultVhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultVhost(String newDefaultVhost) {
		String oldDefaultVhost = defaultVhost;
		defaultVhost = newDefaultVhost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE__DEFAULT_VHOST, oldDefaultVhost, defaultVhost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVhostDir() {
		return vhostDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVhostDir(String newVhostDir) {
		String oldVhostDir = vhostDir;
		vhostDir = newVhostDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE__VHOST_DIR, oldVhostDir, vhostDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcmsPackage.APACHE__VERSION:
				return getVersion();
			case MdcmsPackage.APACHE__SERVER_NAME:
				return getServerName();
			case MdcmsPackage.APACHE__CONFIG_DIR:
				return getConfigDir();
			case MdcmsPackage.APACHE__DOCROOT:
				return getDocroot();
			case MdcmsPackage.APACHE__LOGROOT:
				return getLogroot();
			case MdcmsPackage.APACHE__LIB_PATH:
				return getLibPath();
			case MdcmsPackage.APACHE__DEFAULT_VHOST:
				return getDefaultVhost();
			case MdcmsPackage.APACHE__VHOST_DIR:
				return getVhostDir();
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
			case MdcmsPackage.APACHE__VERSION:
				setVersion((String)newValue);
				return;
			case MdcmsPackage.APACHE__SERVER_NAME:
				setServerName((String)newValue);
				return;
			case MdcmsPackage.APACHE__CONFIG_DIR:
				setConfigDir((String)newValue);
				return;
			case MdcmsPackage.APACHE__DOCROOT:
				setDocroot((String)newValue);
				return;
			case MdcmsPackage.APACHE__LOGROOT:
				setLogroot((String)newValue);
				return;
			case MdcmsPackage.APACHE__LIB_PATH:
				setLibPath((String)newValue);
				return;
			case MdcmsPackage.APACHE__DEFAULT_VHOST:
				setDefaultVhost((String)newValue);
				return;
			case MdcmsPackage.APACHE__VHOST_DIR:
				setVhostDir((String)newValue);
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
			case MdcmsPackage.APACHE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MdcmsPackage.APACHE__SERVER_NAME:
				setServerName(SERVER_NAME_EDEFAULT);
				return;
			case MdcmsPackage.APACHE__CONFIG_DIR:
				setConfigDir(CONFIG_DIR_EDEFAULT);
				return;
			case MdcmsPackage.APACHE__DOCROOT:
				setDocroot(DOCROOT_EDEFAULT);
				return;
			case MdcmsPackage.APACHE__LOGROOT:
				setLogroot(LOGROOT_EDEFAULT);
				return;
			case MdcmsPackage.APACHE__LIB_PATH:
				setLibPath(LIB_PATH_EDEFAULT);
				return;
			case MdcmsPackage.APACHE__DEFAULT_VHOST:
				setDefaultVhost(DEFAULT_VHOST_EDEFAULT);
				return;
			case MdcmsPackage.APACHE__VHOST_DIR:
				setVhostDir(VHOST_DIR_EDEFAULT);
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
			case MdcmsPackage.APACHE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MdcmsPackage.APACHE__SERVER_NAME:
				return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
			case MdcmsPackage.APACHE__CONFIG_DIR:
				return CONFIG_DIR_EDEFAULT == null ? configDir != null : !CONFIG_DIR_EDEFAULT.equals(configDir);
			case MdcmsPackage.APACHE__DOCROOT:
				return DOCROOT_EDEFAULT == null ? docroot != null : !DOCROOT_EDEFAULT.equals(docroot);
			case MdcmsPackage.APACHE__LOGROOT:
				return LOGROOT_EDEFAULT == null ? logroot != null : !LOGROOT_EDEFAULT.equals(logroot);
			case MdcmsPackage.APACHE__LIB_PATH:
				return LIB_PATH_EDEFAULT == null ? libPath != null : !LIB_PATH_EDEFAULT.equals(libPath);
			case MdcmsPackage.APACHE__DEFAULT_VHOST:
				return DEFAULT_VHOST_EDEFAULT == null ? defaultVhost != null : !DEFAULT_VHOST_EDEFAULT.equals(defaultVhost);
			case MdcmsPackage.APACHE__VHOST_DIR:
				return VHOST_DIR_EDEFAULT == null ? vhostDir != null : !VHOST_DIR_EDEFAULT.equals(vhostDir);
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
		result.append(" (Version: ");
		result.append(version);
		result.append(", ServerName: ");
		result.append(serverName);
		result.append(", ConfigDir: ");
		result.append(configDir);
		result.append(", Docroot: ");
		result.append(docroot);
		result.append(", Logroot: ");
		result.append(logroot);
		result.append(", LibPath: ");
		result.append(libPath);
		result.append(", DefaultVhost: ");
		result.append(defaultVhost);
		result.append(", VhostDir: ");
		result.append(vhostDir);
		result.append(')');
		return result.toString();
	}

} //ApacheImpl
