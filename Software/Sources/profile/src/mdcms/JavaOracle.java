/**
 */
package mdcms;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Oracle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.JavaOracle#getVersionMajor <em>Version Major</em>}</li>
 *   <li>{@link mdcms.JavaOracle#getVersionMinor <em>Version Minor</em>}</li>
 *   <li>{@link mdcms.JavaOracle#getJavaSE <em>Java SE</em>}</li>
 *   <li>{@link mdcms.JavaOracle#getOracleURL <em>Oracle URL</em>}</li>
 *   <li>{@link mdcms.JavaOracle#getProxyServer <em>Proxy Server</em>}</li>
 *   <li>{@link mdcms.JavaOracle#getProxyType <em>Proxy Type</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getJavaOracle()
 * @model
 * @generated
 */
public interface JavaOracle extends Configuration {
	/**
	 * Returns the value of the '<em><b>Version Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Major</em>' attribute.
	 * @see #setVersionMajor(String)
	 * @see mdcms.MdcmsPackage#getJavaOracle_VersionMajor()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersionMajor();

	/**
	 * Sets the value of the '{@link mdcms.JavaOracle#getVersionMajor <em>Version Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Major</em>' attribute.
	 * @see #getVersionMajor()
	 * @generated
	 */
	void setVersionMajor(String value);

	/**
	 * Returns the value of the '<em><b>Version Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Minor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Minor</em>' attribute.
	 * @see #setVersionMinor(String)
	 * @see mdcms.MdcmsPackage#getJavaOracle_VersionMinor()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersionMinor();

	/**
	 * Sets the value of the '{@link mdcms.JavaOracle#getVersionMinor <em>Version Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Minor</em>' attribute.
	 * @see #getVersionMinor()
	 * @generated
	 */
	void setVersionMinor(String value);

	/**
	 * Returns the value of the '<em><b>Java SE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java SE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java SE</em>' attribute.
	 * @see #setJavaSE(String)
	 * @see mdcms.MdcmsPackage#getJavaOracle_JavaSE()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getJavaSE();

	/**
	 * Sets the value of the '{@link mdcms.JavaOracle#getJavaSE <em>Java SE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java SE</em>' attribute.
	 * @see #getJavaSE()
	 * @generated
	 */
	void setJavaSE(String value);

	/**
	 * Returns the value of the '<em><b>Oracle URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oracle URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oracle URL</em>' attribute.
	 * @see #setOracleURL(String)
	 * @see mdcms.MdcmsPackage#getJavaOracle_OracleURL()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOracleURL();

	/**
	 * Sets the value of the '{@link mdcms.JavaOracle#getOracleURL <em>Oracle URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oracle URL</em>' attribute.
	 * @see #getOracleURL()
	 * @generated
	 */
	void setOracleURL(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Server</em>' attribute.
	 * @see #setProxyServer(String)
	 * @see mdcms.MdcmsPackage#getJavaOracle_ProxyServer()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getProxyServer();

	/**
	 * Sets the value of the '{@link mdcms.JavaOracle#getProxyServer <em>Proxy Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Server</em>' attribute.
	 * @see #getProxyServer()
	 * @generated
	 */
	void setProxyServer(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Type</em>' attribute.
	 * @see #setProxyType(String)
	 * @see mdcms.MdcmsPackage#getJavaOracle_ProxyType()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getProxyType();

	/**
	 * Sets the value of the '{@link mdcms.JavaOracle#getProxyType <em>Proxy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Type</em>' attribute.
	 * @see #getProxyType()
	 * @generated
	 */
	void setProxyType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_Artifact.oclAsType(DeployedArtifact).deploymentForArtifact.location.getStereotypeApplications()->exists(oclIsKindOf(mdcms::Runtime))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ConstraintHTTP(DiagnosticChain diagnostics, Map<Object, Object> context);

} // JavaOracle
