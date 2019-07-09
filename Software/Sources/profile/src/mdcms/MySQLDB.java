/**
 */
package mdcms;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My SQLDB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdcms.MySQLDB#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @see mdcms.MdcmsPackage#getMySQLDB()
 * @model
 * @generated
 */
public interface MySQLDB extends Database {
	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see mdcms.MdcmsPackage#getMySQLDB_Charset()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link mdcms.MySQLDB#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_Artifact.oclAsType(DeployedArtifact).deploymentForArtifact.location.getStereotypeApplications()->exists(oclIsKindOf(mdcms::MySQL))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ConstraintMySQL(DiagnosticChain diagnostics, Map<Object, Object> context);

} // MySQLDB
