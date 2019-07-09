/**
 */
package mdcms.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import mdcms.FirewallRule;
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
 * An implementation of the model object '<em><b>Firewall Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getAction <em>Action</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getDestinationRange <em>Destination Range</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getDestinationPort <em>Destination Port</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getInputInterface <em>Input Interface</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getOutputInterface <em>Output Interface</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getState <em>State</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getTCPFlags <em>TCP Flags</em>}</li>
 *   <li>{@link mdcms.impl.FirewallRuleImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirewallRuleImpl extends ConfigurationImpl implements FirewallRule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceRange() <em>Source Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRange()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRange() <em>Source Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRange()
	 * @generated
	 * @ordered
	 */
	protected String sourceRange = SOURCE_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationRange() <em>Destination Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationRange()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationRange() <em>Destination Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationRange()
	 * @generated
	 * @ordered
	 */
	protected String destinationRange = DESTINATION_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationPort() <em>Destination Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationPort()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationPort() <em>Destination Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationPort()
	 * @generated
	 * @ordered
	 */
	protected String destinationPort = DESTINATION_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputInterface() <em>Input Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputInterface() <em>Input Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputInterface()
	 * @generated
	 * @ordered
	 */
	protected String inputInterface = INPUT_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputInterface() <em>Output Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputInterface() <em>Output Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputInterface()
	 * @generated
	 * @ordered
	 */
	protected String outputInterface = OUTPUT_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTCPFlags() <em>TCP Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCPFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String TCP_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTCPFlags() <em>TCP Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCPFlags()
	 * @generated
	 * @ordered
	 */
	protected String tcpFlags = TCP_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirewallRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.FIREWALL_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRange() {
		return sourceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRange(String newSourceRange) {
		String oldSourceRange = sourceRange;
		sourceRange = newSourceRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__SOURCE_RANGE, oldSourceRange, sourceRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationRange() {
		return destinationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationRange(String newDestinationRange) {
		String oldDestinationRange = destinationRange;
		destinationRange = newDestinationRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__DESTINATION_RANGE, oldDestinationRange, destinationRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationPort() {
		return destinationPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationPort(String newDestinationPort) {
		String oldDestinationPort = destinationPort;
		destinationPort = newDestinationPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__DESTINATION_PORT, oldDestinationPort, destinationPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputInterface() {
		return inputInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputInterface(String newInputInterface) {
		String oldInputInterface = inputInterface;
		inputInterface = newInputInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__INPUT_INTERFACE, oldInputInterface, inputInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputInterface() {
		return outputInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputInterface(String newOutputInterface) {
		String oldOutputInterface = outputInterface;
		outputInterface = newOutputInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__OUTPUT_INTERFACE, oldOutputInterface, outputInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTCPFlags() {
		return tcpFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCPFlags(String newTCPFlags) {
		String oldTCPFlags = tcpFlags;
		tcpFlags = newTCPFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__TCP_FLAGS, oldTCPFlags, tcpFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FIREWALL_RULE__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ConstraintFirewall(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 MdcmsValidator.FIREWALL_RULE__CONSTRAINT_FIREWALL,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConstraintFirewall", EObjectValidator.getObjectLabel(this, context) }),
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
			case MdcmsPackage.FIREWALL_RULE__NAME:
				return getName();
			case MdcmsPackage.FIREWALL_RULE__ACTION:
				return getAction();
			case MdcmsPackage.FIREWALL_RULE__PROTOCOL:
				return getProtocol();
			case MdcmsPackage.FIREWALL_RULE__SOURCE:
				return getSource();
			case MdcmsPackage.FIREWALL_RULE__SOURCE_RANGE:
				return getSourceRange();
			case MdcmsPackage.FIREWALL_RULE__DESTINATION:
				return getDestination();
			case MdcmsPackage.FIREWALL_RULE__DESTINATION_RANGE:
				return getDestinationRange();
			case MdcmsPackage.FIREWALL_RULE__DESTINATION_PORT:
				return getDestinationPort();
			case MdcmsPackage.FIREWALL_RULE__INPUT_INTERFACE:
				return getInputInterface();
			case MdcmsPackage.FIREWALL_RULE__OUTPUT_INTERFACE:
				return getOutputInterface();
			case MdcmsPackage.FIREWALL_RULE__STATE:
				return getState();
			case MdcmsPackage.FIREWALL_RULE__TCP_FLAGS:
				return getTCPFlags();
			case MdcmsPackage.FIREWALL_RULE__PROVIDER:
				return getProvider();
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
			case MdcmsPackage.FIREWALL_RULE__NAME:
				setName((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__ACTION:
				setAction((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__SOURCE:
				setSource((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__SOURCE_RANGE:
				setSourceRange((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__DESTINATION:
				setDestination((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__DESTINATION_RANGE:
				setDestinationRange((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__DESTINATION_PORT:
				setDestinationPort((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__INPUT_INTERFACE:
				setInputInterface((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__OUTPUT_INTERFACE:
				setOutputInterface((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__STATE:
				setState((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__TCP_FLAGS:
				setTCPFlags((String)newValue);
				return;
			case MdcmsPackage.FIREWALL_RULE__PROVIDER:
				setProvider((String)newValue);
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
			case MdcmsPackage.FIREWALL_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__SOURCE_RANGE:
				setSourceRange(SOURCE_RANGE_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__DESTINATION_RANGE:
				setDestinationRange(DESTINATION_RANGE_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__DESTINATION_PORT:
				setDestinationPort(DESTINATION_PORT_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__INPUT_INTERFACE:
				setInputInterface(INPUT_INTERFACE_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__OUTPUT_INTERFACE:
				setOutputInterface(OUTPUT_INTERFACE_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__TCP_FLAGS:
				setTCPFlags(TCP_FLAGS_EDEFAULT);
				return;
			case MdcmsPackage.FIREWALL_RULE__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
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
			case MdcmsPackage.FIREWALL_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MdcmsPackage.FIREWALL_RULE__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case MdcmsPackage.FIREWALL_RULE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case MdcmsPackage.FIREWALL_RULE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case MdcmsPackage.FIREWALL_RULE__SOURCE_RANGE:
				return SOURCE_RANGE_EDEFAULT == null ? sourceRange != null : !SOURCE_RANGE_EDEFAULT.equals(sourceRange);
			case MdcmsPackage.FIREWALL_RULE__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case MdcmsPackage.FIREWALL_RULE__DESTINATION_RANGE:
				return DESTINATION_RANGE_EDEFAULT == null ? destinationRange != null : !DESTINATION_RANGE_EDEFAULT.equals(destinationRange);
			case MdcmsPackage.FIREWALL_RULE__DESTINATION_PORT:
				return DESTINATION_PORT_EDEFAULT == null ? destinationPort != null : !DESTINATION_PORT_EDEFAULT.equals(destinationPort);
			case MdcmsPackage.FIREWALL_RULE__INPUT_INTERFACE:
				return INPUT_INTERFACE_EDEFAULT == null ? inputInterface != null : !INPUT_INTERFACE_EDEFAULT.equals(inputInterface);
			case MdcmsPackage.FIREWALL_RULE__OUTPUT_INTERFACE:
				return OUTPUT_INTERFACE_EDEFAULT == null ? outputInterface != null : !OUTPUT_INTERFACE_EDEFAULT.equals(outputInterface);
			case MdcmsPackage.FIREWALL_RULE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case MdcmsPackage.FIREWALL_RULE__TCP_FLAGS:
				return TCP_FLAGS_EDEFAULT == null ? tcpFlags != null : !TCP_FLAGS_EDEFAULT.equals(tcpFlags);
			case MdcmsPackage.FIREWALL_RULE__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
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
			case MdcmsPackage.FIREWALL_RULE___CONSTRAINT_FIREWALL__DIAGNOSTICCHAIN_MAP:
				return ConstraintFirewall((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Action: ");
		result.append(action);
		result.append(", Protocol: ");
		result.append(protocol);
		result.append(", Source: ");
		result.append(source);
		result.append(", SourceRange: ");
		result.append(sourceRange);
		result.append(", Destination: ");
		result.append(destination);
		result.append(", DestinationRange: ");
		result.append(destinationRange);
		result.append(", DestinationPort: ");
		result.append(destinationPort);
		result.append(", InputInterface: ");
		result.append(inputInterface);
		result.append(", OutputInterface: ");
		result.append(outputInterface);
		result.append(", State: ");
		result.append(state);
		result.append(", TCPFlags: ");
		result.append(tcpFlags);
		result.append(", Provider: ");
		result.append(provider);
		result.append(')');
		return result.toString();
	}

} //FirewallRuleImpl
