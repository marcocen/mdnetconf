/**
 */
package mdcms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.NetworkDevice#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link mdcms.NetworkDevice#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getNetworkDevice()
 * @model
 * @generated
 */
public interface NetworkDevice extends Physical {
	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #setThroughput(String)
	 * @see mdcms.MdcmsPackage#getNetworkDevice_Throughput()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getThroughput();

	/**
	 * Sets the value of the '{@link mdcms.NetworkDevice#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' attribute.
	 * @see #setPorts(int)
	 * @see mdcms.MdcmsPackage#getNetworkDevice_Ports()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getPorts();

	/**
	 * Sets the value of the '{@link mdcms.NetworkDevice#getPorts <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' attribute.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(int value);

} // NetworkDevice
