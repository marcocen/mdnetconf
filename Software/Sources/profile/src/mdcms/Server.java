/**
 */
package mdcms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.Server#getProcessor <em>Processor</em>}</li>
 *   <li>{@link mdcms.Server#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link mdcms.Server#getDiskType <em>Disk Type</em>}</li>
 *   <li>{@link mdcms.Server#getDiskSpace <em>Disk Space</em>}</li>
 *   <li>{@link mdcms.Server#getRam <em>Ram</em>}</li>
 *   <li>{@link mdcms.Server#getRack <em>Rack</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends Physical {
	/**
	 * Returns the value of the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' attribute.
	 * @see #setProcessor(String)
	 * @see mdcms.MdcmsPackage#getServer_Processor()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getProcessor();

	/**
	 * Sets the value of the '{@link mdcms.Server#getProcessor <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' attribute.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(String value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(String)
	 * @see mdcms.MdcmsPackage#getServer_Architecture()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link mdcms.Server#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Disk Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Type</em>' attribute.
	 * @see #setDiskType(String)
	 * @see mdcms.MdcmsPackage#getServer_DiskType()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDiskType();

	/**
	 * Sets the value of the '{@link mdcms.Server#getDiskType <em>Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Type</em>' attribute.
	 * @see #getDiskType()
	 * @generated
	 */
	void setDiskType(String value);

	/**
	 * Returns the value of the '<em><b>Disk Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Space</em>' attribute.
	 * @see #setDiskSpace(String)
	 * @see mdcms.MdcmsPackage#getServer_DiskSpace()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDiskSpace();

	/**
	 * Sets the value of the '{@link mdcms.Server#getDiskSpace <em>Disk Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Space</em>' attribute.
	 * @see #getDiskSpace()
	 * @generated
	 */
	void setDiskSpace(String value);

	/**
	 * Returns the value of the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram</em>' attribute.
	 * @see #setRam(String)
	 * @see mdcms.MdcmsPackage#getServer_Ram()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getRam();

	/**
	 * Sets the value of the '{@link mdcms.Server#getRam <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' attribute.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(String value);

	/**
	 * Returns the value of the '<em><b>Rack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack</em>' attribute.
	 * @see #setRack(String)
	 * @see mdcms.MdcmsPackage#getServer_Rack()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getRack();

	/**
	 * Sets the value of the '{@link mdcms.Server#getRack <em>Rack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rack</em>' attribute.
	 * @see #getRack()
	 * @generated
	 */
	void setRack(String value);

} // Server
