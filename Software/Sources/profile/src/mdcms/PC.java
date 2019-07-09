/**
 */
package mdcms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.PC#getProcessor <em>Processor</em>}</li>
 *   <li>{@link mdcms.PC#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link mdcms.PC#getDiskType <em>Disk Type</em>}</li>
 *   <li>{@link mdcms.PC#getDiskSpace <em>Disk Space</em>}</li>
 *   <li>{@link mdcms.PC#getRam <em>Ram</em>}</li>
 *   <li>{@link mdcms.PC#getMotherboard <em>Motherboard</em>}</li>
 *   <li>{@link mdcms.PC#getGraphicCard <em>Graphic Card</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getPC()
 * @model
 * @generated
 */
public interface PC extends Physical {
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
	 * @see mdcms.MdcmsPackage#getPC_Processor()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getProcessor();

	/**
	 * Sets the value of the '{@link mdcms.PC#getProcessor <em>Processor</em>}' attribute.
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
	 * @see mdcms.MdcmsPackage#getPC_Architecture()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link mdcms.PC#getArchitecture <em>Architecture</em>}' attribute.
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
	 * @see mdcms.MdcmsPackage#getPC_DiskType()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDiskType();

	/**
	 * Sets the value of the '{@link mdcms.PC#getDiskType <em>Disk Type</em>}' attribute.
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
	 * @see mdcms.MdcmsPackage#getPC_DiskSpace()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDiskSpace();

	/**
	 * Sets the value of the '{@link mdcms.PC#getDiskSpace <em>Disk Space</em>}' attribute.
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
	 * @see mdcms.MdcmsPackage#getPC_Ram()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getRam();

	/**
	 * Sets the value of the '{@link mdcms.PC#getRam <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' attribute.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(String value);

	/**
	 * Returns the value of the '<em><b>Motherboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motherboard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motherboard</em>' attribute.
	 * @see #setMotherboard(String)
	 * @see mdcms.MdcmsPackage#getPC_Motherboard()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getMotherboard();

	/**
	 * Sets the value of the '{@link mdcms.PC#getMotherboard <em>Motherboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motherboard</em>' attribute.
	 * @see #getMotherboard()
	 * @generated
	 */
	void setMotherboard(String value);

	/**
	 * Returns the value of the '<em><b>Graphic Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphic Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Card</em>' attribute.
	 * @see #setGraphicCard(String)
	 * @see mdcms.MdcmsPackage#getPC_GraphicCard()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getGraphicCard();

	/**
	 * Sets the value of the '{@link mdcms.PC#getGraphicCard <em>Graphic Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Card</em>' attribute.
	 * @see #getGraphicCard()
	 * @generated
	 */
	void setGraphicCard(String value);

} // PC
