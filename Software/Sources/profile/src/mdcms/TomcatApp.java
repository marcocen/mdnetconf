/**
 */
package mdcms;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tomcat App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.TomcatApp#getParameters <em>Parameters</em>}</li>
 *   <li>{@link mdcms.TomcatApp#getCatalinaHome <em>Catalina Home</em>}</li>
 *   <li>{@link mdcms.TomcatApp#getCatalinaBase <em>Catalina Base</em>}</li>
 *   <li>{@link mdcms.TomcatApp#getAddress <em>Address</em>}</li>
 *   <li>{@link mdcms.TomcatApp#getPort <em>Port</em>}</li>
 *   <li>{@link mdcms.TomcatApp#getServerConfig <em>Server Config</em>}</li>
 *   <li>{@link mdcms.TomcatApp#getClassName <em>Class Name</em>}</li>
 *   <li>{@link mdcms.TomcatApp#getAdditionalAttributes <em>Additional Attributes</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getTomcatApp()
 * @model
 * @generated
 */
public interface TomcatApp extends Configuration {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see mdcms.MdcmsPackage#getTomcatApp_Parameters()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link mdcms.TomcatApp#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Catalina Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalina Home</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalina Home</em>' attribute.
	 * @see #setCatalinaHome(String)
	 * @see mdcms.MdcmsPackage#getTomcatApp_CatalinaHome()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCatalinaHome();

	/**
	 * Sets the value of the '{@link mdcms.TomcatApp#getCatalinaHome <em>Catalina Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalina Home</em>' attribute.
	 * @see #getCatalinaHome()
	 * @generated
	 */
	void setCatalinaHome(String value);

	/**
	 * Returns the value of the '<em><b>Catalina Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalina Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalina Base</em>' attribute.
	 * @see #setCatalinaBase(String)
	 * @see mdcms.MdcmsPackage#getTomcatApp_CatalinaBase()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCatalinaBase();

	/**
	 * Sets the value of the '{@link mdcms.TomcatApp#getCatalinaBase <em>Catalina Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalina Base</em>' attribute.
	 * @see #getCatalinaBase()
	 * @generated
	 */
	void setCatalinaBase(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see mdcms.MdcmsPackage#getTomcatApp_Address()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link mdcms.TomcatApp#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

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
	 * @see mdcms.MdcmsPackage#getTomcatApp_Port()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link mdcms.TomcatApp#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Server Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Config</em>' attribute.
	 * @see #setServerConfig(String)
	 * @see mdcms.MdcmsPackage#getTomcatApp_ServerConfig()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getServerConfig();

	/**
	 * Sets the value of the '{@link mdcms.TomcatApp#getServerConfig <em>Server Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Config</em>' attribute.
	 * @see #getServerConfig()
	 * @generated
	 */
	void setServerConfig(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see mdcms.MdcmsPackage#getTomcatApp_ClassName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link mdcms.TomcatApp#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Additional Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Attributes</em>' attribute.
	 * @see #setAdditionalAttributes(String)
	 * @see mdcms.MdcmsPackage#getTomcatApp_AdditionalAttributes()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAdditionalAttributes();

	/**
	 * Sets the value of the '{@link mdcms.TomcatApp#getAdditionalAttributes <em>Additional Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Attributes</em>' attribute.
	 * @see #getAdditionalAttributes()
	 * @generated
	 */
	void setAdditionalAttributes(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_Artifact.oclAsType(DeployedArtifact).deploymentForArtifact.location.getStereotypeApplications()->exists(oclIsKindOf(mdcms::Tomcat))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ConstraintTomcat(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TomcatApp
