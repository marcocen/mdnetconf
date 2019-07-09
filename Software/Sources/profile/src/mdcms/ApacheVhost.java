/**
 */
package mdcms;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apache Vhost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.ApacheVhost#getVhostName <em>Vhost Name</em>}</li>
 *   <li>{@link mdcms.ApacheVhost#getServerName <em>Server Name</em>}</li>
 *   <li>{@link mdcms.ApacheVhost#getIP <em>IP</em>}</li>
 *   <li>{@link mdcms.ApacheVhost#getPort <em>Port</em>}</li>
 *   <li>{@link mdcms.ApacheVhost#getDocroot <em>Docroot</em>}</li>
 *   <li>{@link mdcms.ApacheVhost#getDocrootOwner <em>Docroot Owner</em>}</li>
 *   <li>{@link mdcms.ApacheVhost#getDocrootGroup <em>Docroot Group</em>}</li>
 *   <li>{@link mdcms.ApacheVhost#isSSL <em>SSL</em>}</li>
 *   <li>{@link mdcms.ApacheVhost#getServerAliases <em>Server Aliases</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getApacheVhost()
 * @model
 * @generated
 */
public interface ApacheVhost extends Configuration {
	/**
	 * Returns the value of the '<em><b>Vhost Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vhost Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vhost Name</em>' attribute.
	 * @see #setVhostName(String)
	 * @see mdcms.MdcmsPackage#getApacheVhost_VhostName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVhostName();

	/**
	 * Sets the value of the '{@link mdcms.ApacheVhost#getVhostName <em>Vhost Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vhost Name</em>' attribute.
	 * @see #getVhostName()
	 * @generated
	 */
	void setVhostName(String value);

	/**
	 * Returns the value of the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Name</em>' attribute.
	 * @see #setServerName(String)
	 * @see mdcms.MdcmsPackage#getApacheVhost_ServerName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getServerName();

	/**
	 * Sets the value of the '{@link mdcms.ApacheVhost#getServerName <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Name</em>' attribute.
	 * @see #getServerName()
	 * @generated
	 */
	void setServerName(String value);

	/**
	 * Returns the value of the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP</em>' attribute.
	 * @see #setIP(String)
	 * @see mdcms.MdcmsPackage#getApacheVhost_IP()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getIP();

	/**
	 * Sets the value of the '{@link mdcms.ApacheVhost#getIP <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP</em>' attribute.
	 * @see #getIP()
	 * @generated
	 */
	void setIP(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see mdcms.MdcmsPackage#getApacheVhost_Port()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link mdcms.ApacheVhost#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Docroot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docroot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docroot</em>' attribute.
	 * @see #setDocroot(String)
	 * @see mdcms.MdcmsPackage#getApacheVhost_Docroot()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDocroot();

	/**
	 * Sets the value of the '{@link mdcms.ApacheVhost#getDocroot <em>Docroot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docroot</em>' attribute.
	 * @see #getDocroot()
	 * @generated
	 */
	void setDocroot(String value);

	/**
	 * Returns the value of the '<em><b>Docroot Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docroot Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docroot Owner</em>' attribute.
	 * @see #setDocrootOwner(String)
	 * @see mdcms.MdcmsPackage#getApacheVhost_DocrootOwner()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDocrootOwner();

	/**
	 * Sets the value of the '{@link mdcms.ApacheVhost#getDocrootOwner <em>Docroot Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docroot Owner</em>' attribute.
	 * @see #getDocrootOwner()
	 * @generated
	 */
	void setDocrootOwner(String value);

	/**
	 * Returns the value of the '<em><b>Docroot Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docroot Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docroot Group</em>' attribute.
	 * @see #setDocrootGroup(String)
	 * @see mdcms.MdcmsPackage#getApacheVhost_DocrootGroup()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDocrootGroup();

	/**
	 * Sets the value of the '{@link mdcms.ApacheVhost#getDocrootGroup <em>Docroot Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docroot Group</em>' attribute.
	 * @see #getDocrootGroup()
	 * @generated
	 */
	void setDocrootGroup(String value);

	/**
	 * Returns the value of the '<em><b>SSL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SSL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SSL</em>' attribute.
	 * @see #setSSL(boolean)
	 * @see mdcms.MdcmsPackage#getApacheVhost_SSL()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isSSL();

	/**
	 * Sets the value of the '{@link mdcms.ApacheVhost#isSSL <em>SSL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSL</em>' attribute.
	 * @see #isSSL()
	 * @generated
	 */
	void setSSL(boolean value);

	/**
	 * Returns the value of the '<em><b>Server Aliases</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Aliases</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Aliases</em>' attribute list.
	 * @see mdcms.MdcmsPackage#getApacheVhost_ServerAliases()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getServerAliases();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_Artifact.oclAsType(DeployedArtifact).deploymentForArtifact.location.getStereotypeApplications()->exists(oclIsKindOf(mdcms::Apache))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ConstrainApache(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ApacheVhost
