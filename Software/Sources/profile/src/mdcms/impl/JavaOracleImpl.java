/**
 */
package mdcms.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import mdcms.JavaOracle;
import mdcms.MdcmsPackage;

import mdcms.util.MdcmsValidator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Oracle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.JavaOracleImpl#getVersionMajor <em>Version Major</em>}</li>
 *   <li>{@link mdcms.impl.JavaOracleImpl#getVersionMinor <em>Version Minor</em>}</li>
 *   <li>{@link mdcms.impl.JavaOracleImpl#getJavaSE <em>Java SE</em>}</li>
 *   <li>{@link mdcms.impl.JavaOracleImpl#getOracleURL <em>Oracle URL</em>}</li>
 *   <li>{@link mdcms.impl.JavaOracleImpl#getProxyServer <em>Proxy Server</em>}</li>
 *   <li>{@link mdcms.impl.JavaOracleImpl#getProxyType <em>Proxy Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaOracleImpl extends ConfigurationImpl implements JavaOracle {
	/**
	 * The default value of the '{@link #getVersionMajor() <em>Version Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMajor()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_MAJOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionMajor() <em>Version Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMajor()
	 * @generated
	 * @ordered
	 */
	protected String versionMajor = VERSION_MAJOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionMinor() <em>Version Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMinor()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_MINOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionMinor() <em>Version Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMinor()
	 * @generated
	 * @ordered
	 */
	protected String versionMinor = VERSION_MINOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaSE() <em>Java SE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaSE()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_SE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaSE() <em>Java SE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaSE()
	 * @generated
	 * @ordered
	 */
	protected String javaSE = JAVA_SE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOracleURL() <em>Oracle URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOracleURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ORACLE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOracleURL() <em>Oracle URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOracleURL()
	 * @generated
	 * @ordered
	 */
	protected String oracleURL = ORACLE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProxyServer() <em>Proxy Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyServer()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxyServer() <em>Proxy Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyServer()
	 * @generated
	 * @ordered
	 */
	protected String proxyServer = PROXY_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProxyType() <em>Proxy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxyType() <em>Proxy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyType()
	 * @generated
	 * @ordered
	 */
	protected String proxyType = PROXY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaOracleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.JAVA_ORACLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionMajor() {
		return versionMajor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionMajor(String newVersionMajor) {
		String oldVersionMajor = versionMajor;
		versionMajor = newVersionMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.JAVA_ORACLE__VERSION_MAJOR, oldVersionMajor, versionMajor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionMinor() {
		return versionMinor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionMinor(String newVersionMinor) {
		String oldVersionMinor = versionMinor;
		versionMinor = newVersionMinor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.JAVA_ORACLE__VERSION_MINOR, oldVersionMinor, versionMinor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaSE() {
		return javaSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaSE(String newJavaSE) {
		String oldJavaSE = javaSE;
		javaSE = newJavaSE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.JAVA_ORACLE__JAVA_SE, oldJavaSE, javaSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOracleURL() {
		return oracleURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOracleURL(String newOracleURL) {
		String oldOracleURL = oracleURL;
		oracleURL = newOracleURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.JAVA_ORACLE__ORACLE_URL, oldOracleURL, oracleURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProxyServer() {
		return proxyServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyServer(String newProxyServer) {
		String oldProxyServer = proxyServer;
		proxyServer = newProxyServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.JAVA_ORACLE__PROXY_SERVER, oldProxyServer, proxyServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProxyType() {
		return proxyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyType(String newProxyType) {
		String oldProxyType = proxyType;
		proxyType = newProxyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.JAVA_ORACLE__PROXY_TYPE, oldProxyType, proxyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ConstraintHTTP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MdcmsValidator.DIAGNOSTIC_SOURCE,
						 MdcmsValidator.JAVA_ORACLE__CONSTRAINT_HTTP,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConstraintHTTP", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcmsPackage.JAVA_ORACLE__VERSION_MAJOR:
				return getVersionMajor();
			case MdcmsPackage.JAVA_ORACLE__VERSION_MINOR:
				return getVersionMinor();
			case MdcmsPackage.JAVA_ORACLE__JAVA_SE:
				return getJavaSE();
			case MdcmsPackage.JAVA_ORACLE__ORACLE_URL:
				return getOracleURL();
			case MdcmsPackage.JAVA_ORACLE__PROXY_SERVER:
				return getProxyServer();
			case MdcmsPackage.JAVA_ORACLE__PROXY_TYPE:
				return getProxyType();
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
			case MdcmsPackage.JAVA_ORACLE__VERSION_MAJOR:
				setVersionMajor((String)newValue);
				return;
			case MdcmsPackage.JAVA_ORACLE__VERSION_MINOR:
				setVersionMinor((String)newValue);
				return;
			case MdcmsPackage.JAVA_ORACLE__JAVA_SE:
				setJavaSE((String)newValue);
				return;
			case MdcmsPackage.JAVA_ORACLE__ORACLE_URL:
				setOracleURL((String)newValue);
				return;
			case MdcmsPackage.JAVA_ORACLE__PROXY_SERVER:
				setProxyServer((String)newValue);
				return;
			case MdcmsPackage.JAVA_ORACLE__PROXY_TYPE:
				setProxyType((String)newValue);
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
			case MdcmsPackage.JAVA_ORACLE__VERSION_MAJOR:
				setVersionMajor(VERSION_MAJOR_EDEFAULT);
				return;
			case MdcmsPackage.JAVA_ORACLE__VERSION_MINOR:
				setVersionMinor(VERSION_MINOR_EDEFAULT);
				return;
			case MdcmsPackage.JAVA_ORACLE__JAVA_SE:
				setJavaSE(JAVA_SE_EDEFAULT);
				return;
			case MdcmsPackage.JAVA_ORACLE__ORACLE_URL:
				setOracleURL(ORACLE_URL_EDEFAULT);
				return;
			case MdcmsPackage.JAVA_ORACLE__PROXY_SERVER:
				setProxyServer(PROXY_SERVER_EDEFAULT);
				return;
			case MdcmsPackage.JAVA_ORACLE__PROXY_TYPE:
				setProxyType(PROXY_TYPE_EDEFAULT);
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
			case MdcmsPackage.JAVA_ORACLE__VERSION_MAJOR:
				return VERSION_MAJOR_EDEFAULT == null ? versionMajor != null : !VERSION_MAJOR_EDEFAULT.equals(versionMajor);
			case MdcmsPackage.JAVA_ORACLE__VERSION_MINOR:
				return VERSION_MINOR_EDEFAULT == null ? versionMinor != null : !VERSION_MINOR_EDEFAULT.equals(versionMinor);
			case MdcmsPackage.JAVA_ORACLE__JAVA_SE:
				return JAVA_SE_EDEFAULT == null ? javaSE != null : !JAVA_SE_EDEFAULT.equals(javaSE);
			case MdcmsPackage.JAVA_ORACLE__ORACLE_URL:
				return ORACLE_URL_EDEFAULT == null ? oracleURL != null : !ORACLE_URL_EDEFAULT.equals(oracleURL);
			case MdcmsPackage.JAVA_ORACLE__PROXY_SERVER:
				return PROXY_SERVER_EDEFAULT == null ? proxyServer != null : !PROXY_SERVER_EDEFAULT.equals(proxyServer);
			case MdcmsPackage.JAVA_ORACLE__PROXY_TYPE:
				return PROXY_TYPE_EDEFAULT == null ? proxyType != null : !PROXY_TYPE_EDEFAULT.equals(proxyType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MdcmsPackage.JAVA_ORACLE___CONSTRAINT_HTTP__DIAGNOSTICCHAIN_MAP:
				return ConstraintHTTP((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (VersionMajor: ");
		result.append(versionMajor);
		result.append(", VersionMinor: ");
		result.append(versionMinor);
		result.append(", JavaSE: ");
		result.append(javaSE);
		result.append(", OracleURL: ");
		result.append(oracleURL);
		result.append(", ProxyServer: ");
		result.append(proxyServer);
		result.append(", ProxyType: ");
		result.append(proxyType);
		result.append(')');
		return result.toString();
	}

} //JavaOracleImpl
