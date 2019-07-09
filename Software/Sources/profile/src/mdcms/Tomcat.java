/**
 */
package mdcms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tomcat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.Tomcat#getInstallDir <em>Install Dir</em>}</li>
 *   <li>{@link mdcms.Tomcat#getSourceURL <em>Source URL</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getTomcat()
 * @model
 * @generated
 */
public interface Tomcat extends ApplicationServer {
	/**
	 * Returns the value of the '<em><b>Install Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Install Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install Dir</em>' attribute.
	 * @see #setInstallDir(String)
	 * @see mdcms.MdcmsPackage#getTomcat_InstallDir()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getInstallDir();

	/**
	 * Sets the value of the '{@link mdcms.Tomcat#getInstallDir <em>Install Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Dir</em>' attribute.
	 * @see #getInstallDir()
	 * @generated
	 */
	void setInstallDir(String value);

	/**
	 * Returns the value of the '<em><b>Source URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source URL</em>' attribute.
	 * @see #setSourceURL(String)
	 * @see mdcms.MdcmsPackage#getTomcat_SourceURL()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSourceURL();

	/**
	 * Sets the value of the '{@link mdcms.Tomcat#getSourceURL <em>Source URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source URL</em>' attribute.
	 * @see #getSourceURL()
	 * @generated
	 */
	void setSourceURL(String value);

} // Tomcat
