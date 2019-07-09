/**
 */
package mdcms;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Firewall Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.FirewallRule#getName <em>Name</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getAction <em>Action</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getSource <em>Source</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getDestination <em>Destination</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getDestinationRange <em>Destination Range</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getDestinationPort <em>Destination Port</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getInputInterface <em>Input Interface</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getOutputInterface <em>Output Interface</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getState <em>State</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getTCPFlags <em>TCP Flags</em>}</li>
 *   <li>{@link mdcms.FirewallRule#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getFirewallRule()
 * @model
 * @generated
 */
public interface FirewallRule extends Configuration {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_Action()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_Protocol()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_Source()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Source Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Range</em>' attribute.
	 * @see #setSourceRange(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_SourceRange()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSourceRange();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getSourceRange <em>Source Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Range</em>' attribute.
	 * @see #getSourceRange()
	 * @generated
	 */
	void setSourceRange(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_Destination()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Destination Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Range</em>' attribute.
	 * @see #setDestinationRange(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_DestinationRange()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDestinationRange();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getDestinationRange <em>Destination Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Range</em>' attribute.
	 * @see #getDestinationRange()
	 * @generated
	 */
	void setDestinationRange(String value);

	/**
	 * Returns the value of the '<em><b>Destination Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Port</em>' attribute.
	 * @see #setDestinationPort(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_DestinationPort()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDestinationPort();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getDestinationPort <em>Destination Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Port</em>' attribute.
	 * @see #getDestinationPort()
	 * @generated
	 */
	void setDestinationPort(String value);

	/**
	 * Returns the value of the '<em><b>Input Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Interface</em>' attribute.
	 * @see #setInputInterface(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_InputInterface()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getInputInterface();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getInputInterface <em>Input Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Interface</em>' attribute.
	 * @see #getInputInterface()
	 * @generated
	 */
	void setInputInterface(String value);

	/**
	 * Returns the value of the '<em><b>Output Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Interface</em>' attribute.
	 * @see #setOutputInterface(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_OutputInterface()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOutputInterface();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getOutputInterface <em>Output Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Interface</em>' attribute.
	 * @see #getOutputInterface()
	 * @generated
	 */
	void setOutputInterface(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_State()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>TCP Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TCP Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TCP Flags</em>' attribute.
	 * @see #setTCPFlags(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_TCPFlags()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTCPFlags();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getTCPFlags <em>TCP Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TCP Flags</em>' attribute.
	 * @see #getTCPFlags()
	 * @generated
	 */
	void setTCPFlags(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see mdcms.MdcmsPackage#getFirewallRule_Provider()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link mdcms.FirewallRule#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_Artifact.oclAsType(DeployedArtifact).deploymentForArtifact.location.getStereotypeApplications()->exists(oclIsKindOf(mdcms::Firewall))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ConstraintFirewall(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FirewallRule
