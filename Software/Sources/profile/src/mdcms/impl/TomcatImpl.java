/**
 */
package mdcms.impl;

import mdcms.MdcmsPackage;
import mdcms.Tomcat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tomcat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.TomcatImpl#getInstallDir <em>Install Dir</em>}</li>
 *   <li>{@link mdcms.impl.TomcatImpl#getSourceURL <em>Source URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TomcatImpl extends ApplicationServerImpl implements Tomcat {
	/**
	 * The default value of the '{@link #getInstallDir() <em>Install Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallDir()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALL_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallDir() <em>Install Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallDir()
	 * @generated
	 * @ordered
	 */
	protected String installDir = INSTALL_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceURL() <em>Source URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceURL() <em>Source URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceURL()
	 * @generated
	 * @ordered
	 */
	protected String sourceURL = SOURCE_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TomcatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.TOMCAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstallDir() {
		return installDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallDir(String newInstallDir) {
		String oldInstallDir = installDir;
		installDir = newInstallDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT__INSTALL_DIR, oldInstallDir, installDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceURL() {
		return sourceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceURL(String newSourceURL) {
		String oldSourceURL = sourceURL;
		sourceURL = newSourceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT__SOURCE_URL, oldSourceURL, sourceURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcmsPackage.TOMCAT__INSTALL_DIR:
				return getInstallDir();
			case MdcmsPackage.TOMCAT__SOURCE_URL:
				return getSourceURL();
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
			case MdcmsPackage.TOMCAT__INSTALL_DIR:
				setInstallDir((String)newValue);
				return;
			case MdcmsPackage.TOMCAT__SOURCE_URL:
				setSourceURL((String)newValue);
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
			case MdcmsPackage.TOMCAT__INSTALL_DIR:
				setInstallDir(INSTALL_DIR_EDEFAULT);
				return;
			case MdcmsPackage.TOMCAT__SOURCE_URL:
				setSourceURL(SOURCE_URL_EDEFAULT);
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
			case MdcmsPackage.TOMCAT__INSTALL_DIR:
				return INSTALL_DIR_EDEFAULT == null ? installDir != null : !INSTALL_DIR_EDEFAULT.equals(installDir);
			case MdcmsPackage.TOMCAT__SOURCE_URL:
				return SOURCE_URL_EDEFAULT == null ? sourceURL != null : !SOURCE_URL_EDEFAULT.equals(sourceURL);
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
		result.append(" (InstallDir: ");
		result.append(installDir);
		result.append(", SourceURL: ");
		result.append(sourceURL);
		result.append(')');
		return result.toString();
	}

} //TomcatImpl
