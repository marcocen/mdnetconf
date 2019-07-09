/**
 */
package mdcms.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import mdcms.MdcmsPackage;
import mdcms.TomcatApp;

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
 * An implementation of the model object '<em><b>Tomcat App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.TomcatAppImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link mdcms.impl.TomcatAppImpl#getCatalinaHome <em>Catalina Home</em>}</li>
 *   <li>{@link mdcms.impl.TomcatAppImpl#getCatalinaBase <em>Catalina Base</em>}</li>
 *   <li>{@link mdcms.impl.TomcatAppImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link mdcms.impl.TomcatAppImpl#getPort <em>Port</em>}</li>
 *   <li>{@link mdcms.impl.TomcatAppImpl#getServerConfig <em>Server Config</em>}</li>
 *   <li>{@link mdcms.impl.TomcatAppImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link mdcms.impl.TomcatAppImpl#getAdditionalAttributes <em>Additional Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TomcatAppImpl extends ConfigurationImpl implements TomcatApp {
	/**
	 * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected String parameters = PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalinaHome() <em>Catalina Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalinaHome()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALINA_HOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalinaHome() <em>Catalina Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalinaHome()
	 * @generated
	 * @ordered
	 */
	protected String catalinaHome = CATALINA_HOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalinaBase() <em>Catalina Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalinaBase()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALINA_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalinaBase() <em>Catalina Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalinaBase()
	 * @generated
	 * @ordered
	 */
	protected String catalinaBase = CATALINA_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

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
	 * The default value of the '{@link #getServerConfig() <em>Server Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerConfig() <em>Server Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerConfig()
	 * @generated
	 * @ordered
	 */
	protected String serverConfig = SERVER_CONFIG_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalAttributes() <em>Additional Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_ATTRIBUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalAttributes() <em>Additional Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalAttributes()
	 * @generated
	 * @ordered
	 */
	protected String additionalAttributes = ADDITIONAL_ATTRIBUTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TomcatAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.TOMCAT_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(String newParameters) {
		String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT_APP__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalinaHome() {
		return catalinaHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalinaHome(String newCatalinaHome) {
		String oldCatalinaHome = catalinaHome;
		catalinaHome = newCatalinaHome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT_APP__CATALINA_HOME, oldCatalinaHome, catalinaHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalinaBase() {
		return catalinaBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalinaBase(String newCatalinaBase) {
		String oldCatalinaBase = catalinaBase;
		catalinaBase = newCatalinaBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT_APP__CATALINA_BASE, oldCatalinaBase, catalinaBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT_APP__ADDRESS, oldAddress, address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT_APP__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerConfig() {
		return serverConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerConfig(String newServerConfig) {
		String oldServerConfig = serverConfig;
		serverConfig = newServerConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT_APP__SERVER_CONFIG, oldServerConfig, serverConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT_APP__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalAttributes() {
		return additionalAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalAttributes(String newAdditionalAttributes) {
		String oldAdditionalAttributes = additionalAttributes;
		additionalAttributes = newAdditionalAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.TOMCAT_APP__ADDITIONAL_ATTRIBUTES, oldAdditionalAttributes, additionalAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ConstraintTomcat(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 MdcmsValidator.TOMCAT_APP__CONSTRAINT_TOMCAT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConstraintTomcat", EObjectValidator.getObjectLabel(this, context) }),
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
			case MdcmsPackage.TOMCAT_APP__PARAMETERS:
				return getParameters();
			case MdcmsPackage.TOMCAT_APP__CATALINA_HOME:
				return getCatalinaHome();
			case MdcmsPackage.TOMCAT_APP__CATALINA_BASE:
				return getCatalinaBase();
			case MdcmsPackage.TOMCAT_APP__ADDRESS:
				return getAddress();
			case MdcmsPackage.TOMCAT_APP__PORT:
				return getPort();
			case MdcmsPackage.TOMCAT_APP__SERVER_CONFIG:
				return getServerConfig();
			case MdcmsPackage.TOMCAT_APP__CLASS_NAME:
				return getClassName();
			case MdcmsPackage.TOMCAT_APP__ADDITIONAL_ATTRIBUTES:
				return getAdditionalAttributes();
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
			case MdcmsPackage.TOMCAT_APP__PARAMETERS:
				setParameters((String)newValue);
				return;
			case MdcmsPackage.TOMCAT_APP__CATALINA_HOME:
				setCatalinaHome((String)newValue);
				return;
			case MdcmsPackage.TOMCAT_APP__CATALINA_BASE:
				setCatalinaBase((String)newValue);
				return;
			case MdcmsPackage.TOMCAT_APP__ADDRESS:
				setAddress((String)newValue);
				return;
			case MdcmsPackage.TOMCAT_APP__PORT:
				setPort((String)newValue);
				return;
			case MdcmsPackage.TOMCAT_APP__SERVER_CONFIG:
				setServerConfig((String)newValue);
				return;
			case MdcmsPackage.TOMCAT_APP__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case MdcmsPackage.TOMCAT_APP__ADDITIONAL_ATTRIBUTES:
				setAdditionalAttributes((String)newValue);
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
			case MdcmsPackage.TOMCAT_APP__PARAMETERS:
				setParameters(PARAMETERS_EDEFAULT);
				return;
			case MdcmsPackage.TOMCAT_APP__CATALINA_HOME:
				setCatalinaHome(CATALINA_HOME_EDEFAULT);
				return;
			case MdcmsPackage.TOMCAT_APP__CATALINA_BASE:
				setCatalinaBase(CATALINA_BASE_EDEFAULT);
				return;
			case MdcmsPackage.TOMCAT_APP__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case MdcmsPackage.TOMCAT_APP__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case MdcmsPackage.TOMCAT_APP__SERVER_CONFIG:
				setServerConfig(SERVER_CONFIG_EDEFAULT);
				return;
			case MdcmsPackage.TOMCAT_APP__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case MdcmsPackage.TOMCAT_APP__ADDITIONAL_ATTRIBUTES:
				setAdditionalAttributes(ADDITIONAL_ATTRIBUTES_EDEFAULT);
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
			case MdcmsPackage.TOMCAT_APP__PARAMETERS:
				return PARAMETERS_EDEFAULT == null ? parameters != null : !PARAMETERS_EDEFAULT.equals(parameters);
			case MdcmsPackage.TOMCAT_APP__CATALINA_HOME:
				return CATALINA_HOME_EDEFAULT == null ? catalinaHome != null : !CATALINA_HOME_EDEFAULT.equals(catalinaHome);
			case MdcmsPackage.TOMCAT_APP__CATALINA_BASE:
				return CATALINA_BASE_EDEFAULT == null ? catalinaBase != null : !CATALINA_BASE_EDEFAULT.equals(catalinaBase);
			case MdcmsPackage.TOMCAT_APP__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case MdcmsPackage.TOMCAT_APP__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case MdcmsPackage.TOMCAT_APP__SERVER_CONFIG:
				return SERVER_CONFIG_EDEFAULT == null ? serverConfig != null : !SERVER_CONFIG_EDEFAULT.equals(serverConfig);
			case MdcmsPackage.TOMCAT_APP__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case MdcmsPackage.TOMCAT_APP__ADDITIONAL_ATTRIBUTES:
				return ADDITIONAL_ATTRIBUTES_EDEFAULT == null ? additionalAttributes != null : !ADDITIONAL_ATTRIBUTES_EDEFAULT.equals(additionalAttributes);
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
			case MdcmsPackage.TOMCAT_APP___CONSTRAINT_TOMCAT__DIAGNOSTICCHAIN_MAP:
				return ConstraintTomcat((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (Parameters: ");
		result.append(parameters);
		result.append(", CatalinaHome: ");
		result.append(catalinaHome);
		result.append(", CatalinaBase: ");
		result.append(catalinaBase);
		result.append(", Address: ");
		result.append(address);
		result.append(", Port: ");
		result.append(port);
		result.append(", ServerConfig: ");
		result.append(serverConfig);
		result.append(", ClassName: ");
		result.append(className);
		result.append(", AdditionalAttributes: ");
		result.append(additionalAttributes);
		result.append(')');
		return result.toString();
	}

} //TomcatAppImpl
