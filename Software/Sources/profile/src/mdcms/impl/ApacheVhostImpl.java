/**
 */
package mdcms.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import mdcms.ApacheVhost;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apache Vhost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.ApacheVhostImpl#getVhostName <em>Vhost Name</em>}</li>
 *   <li>{@link mdcms.impl.ApacheVhostImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link mdcms.impl.ApacheVhostImpl#getIP <em>IP</em>}</li>
 *   <li>{@link mdcms.impl.ApacheVhostImpl#getPort <em>Port</em>}</li>
 *   <li>{@link mdcms.impl.ApacheVhostImpl#getDocroot <em>Docroot</em>}</li>
 *   <li>{@link mdcms.impl.ApacheVhostImpl#getDocrootOwner <em>Docroot Owner</em>}</li>
 *   <li>{@link mdcms.impl.ApacheVhostImpl#getDocrootGroup <em>Docroot Group</em>}</li>
 *   <li>{@link mdcms.impl.ApacheVhostImpl#isSSL <em>SSL</em>}</li>
 *   <li>{@link mdcms.impl.ApacheVhostImpl#getServerAliases <em>Server Aliases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApacheVhostImpl extends ConfigurationImpl implements ApacheVhost {
	/**
	 * The default value of the '{@link #getVhostName() <em>Vhost Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVhostName()
	 * @generated
	 * @ordered
	 */
	protected static final String VHOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVhostName() <em>Vhost Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVhostName()
	 * @generated
	 * @ordered
	 */
	protected String vhostName = VHOST_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

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
	 * The default value of the '{@link #getDocrootOwner() <em>Docroot Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocrootOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCROOT_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocrootOwner() <em>Docroot Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocrootOwner()
	 * @generated
	 * @ordered
	 */
	protected String docrootOwner = DOCROOT_OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocrootGroup() <em>Docroot Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocrootGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCROOT_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocrootGroup() <em>Docroot Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocrootGroup()
	 * @generated
	 * @ordered
	 */
	protected String docrootGroup = DOCROOT_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #isSSL() <em>SSL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSSL()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SSL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSSL() <em>SSL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSSL()
	 * @generated
	 * @ordered
	 */
	protected boolean ssl = SSL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServerAliases() <em>Server Aliases</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serverAliases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApacheVhostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.APACHE_VHOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVhostName() {
		return vhostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVhostName(String newVhostName) {
		String oldVhostName = vhostName;
		vhostName = newVhostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE_VHOST__VHOST_NAME, oldVhostName, vhostName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE_VHOST__SERVER_NAME, oldServerName, serverName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE_VHOST__IP, oldIP, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE_VHOST__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE_VHOST__DOCROOT, oldDocroot, docroot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocrootOwner() {
		return docrootOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocrootOwner(String newDocrootOwner) {
		String oldDocrootOwner = docrootOwner;
		docrootOwner = newDocrootOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE_VHOST__DOCROOT_OWNER, oldDocrootOwner, docrootOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocrootGroup() {
		return docrootGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocrootGroup(String newDocrootGroup) {
		String oldDocrootGroup = docrootGroup;
		docrootGroup = newDocrootGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE_VHOST__DOCROOT_GROUP, oldDocrootGroup, docrootGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSSL() {
		return ssl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSSL(boolean newSSL) {
		boolean oldSSL = ssl;
		ssl = newSSL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.APACHE_VHOST__SSL, oldSSL, ssl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServerAliases() {
		if (serverAliases == null) {
			serverAliases = new EDataTypeUniqueEList<String>(String.class, this, MdcmsPackage.APACHE_VHOST__SERVER_ALIASES);
		}
		return serverAliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ConstrainApache(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 MdcmsValidator.APACHE_VHOST__CONSTRAIN_APACHE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConstrainApache", EObjectValidator.getObjectLabel(this, context) }),
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
			case MdcmsPackage.APACHE_VHOST__VHOST_NAME:
				return getVhostName();
			case MdcmsPackage.APACHE_VHOST__SERVER_NAME:
				return getServerName();
			case MdcmsPackage.APACHE_VHOST__IP:
				return getIP();
			case MdcmsPackage.APACHE_VHOST__PORT:
				return getPort();
			case MdcmsPackage.APACHE_VHOST__DOCROOT:
				return getDocroot();
			case MdcmsPackage.APACHE_VHOST__DOCROOT_OWNER:
				return getDocrootOwner();
			case MdcmsPackage.APACHE_VHOST__DOCROOT_GROUP:
				return getDocrootGroup();
			case MdcmsPackage.APACHE_VHOST__SSL:
				return isSSL();
			case MdcmsPackage.APACHE_VHOST__SERVER_ALIASES:
				return getServerAliases();
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
			case MdcmsPackage.APACHE_VHOST__VHOST_NAME:
				setVhostName((String)newValue);
				return;
			case MdcmsPackage.APACHE_VHOST__SERVER_NAME:
				setServerName((String)newValue);
				return;
			case MdcmsPackage.APACHE_VHOST__IP:
				setIP((String)newValue);
				return;
			case MdcmsPackage.APACHE_VHOST__PORT:
				setPort((String)newValue);
				return;
			case MdcmsPackage.APACHE_VHOST__DOCROOT:
				setDocroot((String)newValue);
				return;
			case MdcmsPackage.APACHE_VHOST__DOCROOT_OWNER:
				setDocrootOwner((String)newValue);
				return;
			case MdcmsPackage.APACHE_VHOST__DOCROOT_GROUP:
				setDocrootGroup((String)newValue);
				return;
			case MdcmsPackage.APACHE_VHOST__SSL:
				setSSL((Boolean)newValue);
				return;
			case MdcmsPackage.APACHE_VHOST__SERVER_ALIASES:
				getServerAliases().clear();
				getServerAliases().addAll((Collection<? extends String>)newValue);
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
			case MdcmsPackage.APACHE_VHOST__VHOST_NAME:
				setVhostName(VHOST_NAME_EDEFAULT);
				return;
			case MdcmsPackage.APACHE_VHOST__SERVER_NAME:
				setServerName(SERVER_NAME_EDEFAULT);
				return;
			case MdcmsPackage.APACHE_VHOST__IP:
				setIP(IP_EDEFAULT);
				return;
			case MdcmsPackage.APACHE_VHOST__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case MdcmsPackage.APACHE_VHOST__DOCROOT:
				setDocroot(DOCROOT_EDEFAULT);
				return;
			case MdcmsPackage.APACHE_VHOST__DOCROOT_OWNER:
				setDocrootOwner(DOCROOT_OWNER_EDEFAULT);
				return;
			case MdcmsPackage.APACHE_VHOST__DOCROOT_GROUP:
				setDocrootGroup(DOCROOT_GROUP_EDEFAULT);
				return;
			case MdcmsPackage.APACHE_VHOST__SSL:
				setSSL(SSL_EDEFAULT);
				return;
			case MdcmsPackage.APACHE_VHOST__SERVER_ALIASES:
				getServerAliases().clear();
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
			case MdcmsPackage.APACHE_VHOST__VHOST_NAME:
				return VHOST_NAME_EDEFAULT == null ? vhostName != null : !VHOST_NAME_EDEFAULT.equals(vhostName);
			case MdcmsPackage.APACHE_VHOST__SERVER_NAME:
				return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
			case MdcmsPackage.APACHE_VHOST__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case MdcmsPackage.APACHE_VHOST__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case MdcmsPackage.APACHE_VHOST__DOCROOT:
				return DOCROOT_EDEFAULT == null ? docroot != null : !DOCROOT_EDEFAULT.equals(docroot);
			case MdcmsPackage.APACHE_VHOST__DOCROOT_OWNER:
				return DOCROOT_OWNER_EDEFAULT == null ? docrootOwner != null : !DOCROOT_OWNER_EDEFAULT.equals(docrootOwner);
			case MdcmsPackage.APACHE_VHOST__DOCROOT_GROUP:
				return DOCROOT_GROUP_EDEFAULT == null ? docrootGroup != null : !DOCROOT_GROUP_EDEFAULT.equals(docrootGroup);
			case MdcmsPackage.APACHE_VHOST__SSL:
				return ssl != SSL_EDEFAULT;
			case MdcmsPackage.APACHE_VHOST__SERVER_ALIASES:
				return serverAliases != null && !serverAliases.isEmpty();
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
			case MdcmsPackage.APACHE_VHOST___CONSTRAIN_APACHE__DIAGNOSTICCHAIN_MAP:
				return ConstrainApache((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (VhostName: ");
		result.append(vhostName);
		result.append(", ServerName: ");
		result.append(serverName);
		result.append(", IP: ");
		result.append(ip);
		result.append(", Port: ");
		result.append(port);
		result.append(", Docroot: ");
		result.append(docroot);
		result.append(", DocrootOwner: ");
		result.append(docrootOwner);
		result.append(", DocrootGroup: ");
		result.append(docrootGroup);
		result.append(", SSL: ");
		result.append(ssl);
		result.append(", ServerAliases: ");
		result.append(serverAliases);
		result.append(')');
		return result.toString();
	}

} //ApacheVhostImpl
