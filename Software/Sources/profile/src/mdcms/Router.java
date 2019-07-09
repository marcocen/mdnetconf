/**
 */
package mdcms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.Router#getSO <em>SO</em>}</li>
 *   <li>{@link mdcms.Router#getFormFactor <em>Form Factor</em>}</li>
 *   <li>{@link mdcms.Router#getNetworkInterfaceSlots <em>Network Interface Slots</em>}</li>
 *   <li>{@link mdcms.Router#getServiceModuleSlots <em>Service Module Slots</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getRouter()
 * @model
 * @generated
 */
public interface Router extends NetworkDevice {
	/**
	 * Returns the value of the '<em><b>SO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SO</em>' attribute.
	 * @see #setSO(String)
	 * @see mdcms.MdcmsPackage#getRouter_SO()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSO();

	/**
	 * Sets the value of the '{@link mdcms.Router#getSO <em>SO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SO</em>' attribute.
	 * @see #getSO()
	 * @generated
	 */
	void setSO(String value);

	/**
	 * Returns the value of the '<em><b>Form Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Factor</em>' attribute.
	 * @see #setFormFactor(String)
	 * @see mdcms.MdcmsPackage#getRouter_FormFactor()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getFormFactor();

	/**
	 * Sets the value of the '{@link mdcms.Router#getFormFactor <em>Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Factor</em>' attribute.
	 * @see #getFormFactor()
	 * @generated
	 */
	void setFormFactor(String value);

	/**
	 * Returns the value of the '<em><b>Network Interface Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Interface Slots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Interface Slots</em>' attribute.
	 * @see #setNetworkInterfaceSlots(int)
	 * @see mdcms.MdcmsPackage#getRouter_NetworkInterfaceSlots()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNetworkInterfaceSlots();

	/**
	 * Sets the value of the '{@link mdcms.Router#getNetworkInterfaceSlots <em>Network Interface Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Interface Slots</em>' attribute.
	 * @see #getNetworkInterfaceSlots()
	 * @generated
	 */
	void setNetworkInterfaceSlots(int value);

	/**
	 * Returns the value of the '<em><b>Service Module Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Module Slots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Module Slots</em>' attribute.
	 * @see #setServiceModuleSlots(int)
	 * @see mdcms.MdcmsPackage#getRouter_ServiceModuleSlots()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getServiceModuleSlots();

	/**
	 * Sets the value of the '{@link mdcms.Router#getServiceModuleSlots <em>Service Module Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Module Slots</em>' attribute.
	 * @see #getServiceModuleSlots()
	 * @generated
	 */
	void setServiceModuleSlots(int value);

} // Router
