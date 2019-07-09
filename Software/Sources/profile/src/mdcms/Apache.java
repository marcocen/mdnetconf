/**
 */
package mdcms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.Apache#getVersion <em>Version</em>}</li>
 *   <li>{@link mdcms.Apache#getServerName <em>Server Name</em>}</li>
 *   <li>{@link mdcms.Apache#getConfigDir <em>Config Dir</em>}</li>
 *   <li>{@link mdcms.Apache#getDocroot <em>Docroot</em>}</li>
 *   <li>{@link mdcms.Apache#getLogroot <em>Logroot</em>}</li>
 *   <li>{@link mdcms.Apache#getLibPath <em>Lib Path</em>}</li>
 *   <li>{@link mdcms.Apache#getDefaultVhost <em>Default Vhost</em>}</li>
 *   <li>{@link mdcms.Apache#getVhostDir <em>Vhost Dir</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getApache()
 * @model
 * @generated
 */
public interface Apache extends HTTPServer {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mdcms.MdcmsPackage#getApache_Version()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mdcms.Apache#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see mdcms.MdcmsPackage#getApache_ServerName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getServerName();

	/**
	 * Sets the value of the '{@link mdcms.Apache#getServerName <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Name</em>' attribute.
	 * @see #getServerName()
	 * @generated
	 */
	void setServerName(String value);

	/**
	 * Returns the value of the '<em><b>Config Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Dir</em>' attribute.
	 * @see #setConfigDir(String)
	 * @see mdcms.MdcmsPackage#getApache_ConfigDir()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getConfigDir();

	/**
	 * Sets the value of the '{@link mdcms.Apache#getConfigDir <em>Config Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Dir</em>' attribute.
	 * @see #getConfigDir()
	 * @generated
	 */
	void setConfigDir(String value);

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
	 * @see mdcms.MdcmsPackage#getApache_Docroot()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDocroot();

	/**
	 * Sets the value of the '{@link mdcms.Apache#getDocroot <em>Docroot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docroot</em>' attribute.
	 * @see #getDocroot()
	 * @generated
	 */
	void setDocroot(String value);

	/**
	 * Returns the value of the '<em><b>Logroot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logroot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logroot</em>' attribute.
	 * @see #setLogroot(String)
	 * @see mdcms.MdcmsPackage#getApache_Logroot()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLogroot();

	/**
	 * Sets the value of the '{@link mdcms.Apache#getLogroot <em>Logroot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logroot</em>' attribute.
	 * @see #getLogroot()
	 * @generated
	 */
	void setLogroot(String value);

	/**
	 * Returns the value of the '<em><b>Lib Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lib Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lib Path</em>' attribute.
	 * @see #setLibPath(String)
	 * @see mdcms.MdcmsPackage#getApache_LibPath()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLibPath();

	/**
	 * Sets the value of the '{@link mdcms.Apache#getLibPath <em>Lib Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lib Path</em>' attribute.
	 * @see #getLibPath()
	 * @generated
	 */
	void setLibPath(String value);

	/**
	 * Returns the value of the '<em><b>Default Vhost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Vhost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Vhost</em>' attribute.
	 * @see #setDefaultVhost(String)
	 * @see mdcms.MdcmsPackage#getApache_DefaultVhost()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDefaultVhost();

	/**
	 * Sets the value of the '{@link mdcms.Apache#getDefaultVhost <em>Default Vhost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Vhost</em>' attribute.
	 * @see #getDefaultVhost()
	 * @generated
	 */
	void setDefaultVhost(String value);

	/**
	 * Returns the value of the '<em><b>Vhost Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vhost Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vhost Dir</em>' attribute.
	 * @see #setVhostDir(String)
	 * @see mdcms.MdcmsPackage#getApache_VhostDir()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVhostDir();

	/**
	 * Sets the value of the '{@link mdcms.Apache#getVhostDir <em>Vhost Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vhost Dir</em>' attribute.
	 * @see #getVhostDir()
	 * @generated
	 */
	void setVhostDir(String value);

} // Apache
