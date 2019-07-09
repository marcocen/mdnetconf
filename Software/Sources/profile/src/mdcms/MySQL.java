/**
 */
package mdcms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My SQL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.MySQL#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link mdcms.MySQL#getPackageVersion <em>Package Version</em>}</li>
 *   <li>{@link mdcms.MySQL#getRootPassword <em>Root Password</em>}</li>
 *   <li>{@link mdcms.MySQL#getInstallOptions <em>Install Options</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getMySQL()
 * @model
 * @generated
 */
public interface MySQL extends DBEngine {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see mdcms.MdcmsPackage#getMySQL_PackageName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link mdcms.MySQL#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Package Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Version</em>' attribute.
	 * @see #setPackageVersion(String)
	 * @see mdcms.MdcmsPackage#getMySQL_PackageVersion()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPackageVersion();

	/**
	 * Sets the value of the '{@link mdcms.MySQL#getPackageVersion <em>Package Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Version</em>' attribute.
	 * @see #getPackageVersion()
	 * @generated
	 */
	void setPackageVersion(String value);

	/**
	 * Returns the value of the '<em><b>Root Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Password</em>' attribute.
	 * @see #setRootPassword(String)
	 * @see mdcms.MdcmsPackage#getMySQL_RootPassword()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getRootPassword();

	/**
	 * Sets the value of the '{@link mdcms.MySQL#getRootPassword <em>Root Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Password</em>' attribute.
	 * @see #getRootPassword()
	 * @generated
	 */
	void setRootPassword(String value);

	/**
	 * Returns the value of the '<em><b>Install Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Install Options</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install Options</em>' attribute.
	 * @see #setInstallOptions(String)
	 * @see mdcms.MdcmsPackage#getMySQL_InstallOptions()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getInstallOptions();

	/**
	 * Sets the value of the '{@link mdcms.MySQL#getInstallOptions <em>Install Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Options</em>' attribute.
	 * @see #getInstallOptions()
	 * @generated
	 */
	void setInstallOptions(String value);

} // MySQL
