/**
 */
package mdcms;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Device;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.Physical#getBase_Device <em>Base Device</em>}</li>
 *   <li>{@link mdcms.Physical#getLocation <em>Location</em>}</li>
 *   <li>{@link mdcms.Physical#getIP <em>IP</em>}</li>
 *   <li>{@link mdcms.Physical#getMAC <em>MAC</em>}</li>
 *   <li>{@link mdcms.Physical#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link mdcms.Physical#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getPhysical()
 * @model
 * @generated
 */
public interface Physical extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Device</em>' reference.
	 * @see #setBase_Device(Device)
	 * @see mdcms.MdcmsPackage#getPhysical_Base_Device()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Device getBase_Device();

	/**
	 * Sets the value of the '{@link mdcms.Physical#getBase_Device <em>Base Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Device</em>' reference.
	 * @see #getBase_Device()
	 * @generated
	 */
	void setBase_Device(Device value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see mdcms.MdcmsPackage#getPhysical_Location()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link mdcms.Physical#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

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
	 * @see mdcms.MdcmsPackage#getPhysical_IP()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getIP();

	/**
	 * Sets the value of the '{@link mdcms.Physical#getIP <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP</em>' attribute.
	 * @see #getIP()
	 * @generated
	 */
	void setIP(String value);

	/**
	 * Returns the value of the '<em><b>MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAC</em>' attribute.
	 * @see #setMAC(String)
	 * @see mdcms.MdcmsPackage#getPhysical_MAC()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getMAC();

	/**
	 * Sets the value of the '{@link mdcms.Physical#getMAC <em>MAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAC</em>' attribute.
	 * @see #getMAC()
	 * @generated
	 */
	void setMAC(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see mdcms.MdcmsPackage#getPhysical_Manufacturer()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link mdcms.Physical#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see mdcms.MdcmsPackage#getPhysical_Model()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link mdcms.Physical#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

} // Physical
