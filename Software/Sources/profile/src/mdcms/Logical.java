/**
 */
package mdcms;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.Logical#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getLogical()
 * @model
 * @generated
 */
public interface Logical extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Execution Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Execution Environment</em>' reference.
	 * @see #setBase_ExecutionEnvironment(ExecutionEnvironment)
	 * @see mdcms.MdcmsPackage#getLogical_Base_ExecutionEnvironment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionEnvironment getBase_ExecutionEnvironment();

	/**
	 * Sets the value of the '{@link mdcms.Logical#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Execution Environment</em>' reference.
	 * @see #getBase_ExecutionEnvironment()
	 * @generated
	 */
	void setBase_ExecutionEnvironment(ExecutionEnvironment value);

} // Logical
