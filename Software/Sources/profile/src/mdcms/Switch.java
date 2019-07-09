/**
 */
package mdcms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.Switch#getSpeed <em>Speed</em>}</li>
 *   <li>{@link mdcms.Switch#getPowerW <em>Power W</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends NetworkDevice {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(String)
	 * @see mdcms.MdcmsPackage#getSwitch_Speed()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSpeed();

	/**
	 * Sets the value of the '{@link mdcms.Switch#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(String value);

	/**
	 * Returns the value of the '<em><b>Power W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power W</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power W</em>' attribute.
	 * @see #setPowerW(String)
	 * @see mdcms.MdcmsPackage#getSwitch_PowerW()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Power(W)'"
	 * @generated
	 */
	String getPowerW();

	/**
	 * Sets the value of the '{@link mdcms.Switch#getPowerW <em>Power W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power W</em>' attribute.
	 * @see #getPowerW()
	 * @generated
	 */
	void setPowerW(String value);

} // Switch
