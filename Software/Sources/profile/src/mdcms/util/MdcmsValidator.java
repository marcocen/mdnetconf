/**
 */
package mdcms.util;

import java.util.Map;

import mdcms.Apache;
import mdcms.ApacheVhost;
import mdcms.ApplicationServer;
import mdcms.Configuration;
import mdcms.DBEngine;
import mdcms.Database;
import mdcms.File;
import mdcms.Firewall;
import mdcms.FirewallRule;
import mdcms.Firmware;
import mdcms.FreeForm;
import mdcms.HTTPServer;
import mdcms.Java;
import mdcms.JavaOracle;
import mdcms.Logical;
import mdcms.MdcmsPackage;
import mdcms.MySQL;
import mdcms.MySQLDB;
import mdcms.NetworkDevice;
import mdcms.OperatingSystem;
import mdcms.PC;
import mdcms.PSQLDB;
import mdcms.Peripheral;
import mdcms.Physical;
import mdcms.PostgreSQL;
import mdcms.RegistryEntry;
import mdcms.Router;
import mdcms.Server;
import mdcms.Switch;
import mdcms.Tomcat;
import mdcms.TomcatApp;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mdcms.MdcmsPackage
 * @generated
 */
public class MdcmsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MdcmsValidator INSTANCE = new MdcmsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mdcms";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint Tomcat' of 'Tomcat App'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOMCAT_APP__CONSTRAINT_TOMCAT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint HTTP' of 'Java Oracle'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JAVA_ORACLE__CONSTRAINT_HTTP = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint Firewall' of 'Firewall Rule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FIREWALL_RULE__CONSTRAINT_FIREWALL = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constrain Apache' of 'Apache Vhost'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APACHE_VHOST__CONSTRAIN_APACHE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint My SQL' of 'My SQLDB'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SQLDB__CONSTRAINT_MY_SQL = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint PSQL' of 'PSQLDB'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSQLDB__CONSTRAINT_PSQL = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdcmsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MdcmsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MdcmsPackage.RUNTIME:
				return validateRuntime((mdcms.Runtime)value, diagnostics, context);
			case MdcmsPackage.LOGICAL:
				return validateLogical((Logical)value, diagnostics, context);
			case MdcmsPackage.MY_SQL:
				return validateMySQL((MySQL)value, diagnostics, context);
			case MdcmsPackage.DB_ENGINE:
				return validateDBEngine((DBEngine)value, diagnostics, context);
			case MdcmsPackage.JAVA:
				return validateJava((Java)value, diagnostics, context);
			case MdcmsPackage.FIREWALL:
				return validateFirewall((Firewall)value, diagnostics, context);
			case MdcmsPackage.FIRMWARE:
				return validateFirmware((Firmware)value, diagnostics, context);
			case MdcmsPackage.HTTP_SERVER:
				return validateHTTPServer((HTTPServer)value, diagnostics, context);
			case MdcmsPackage.POSTGRE_SQL:
				return validatePostgreSQL((PostgreSQL)value, diagnostics, context);
			case MdcmsPackage.APPLICATION_SERVER:
				return validateApplicationServer((ApplicationServer)value, diagnostics, context);
			case MdcmsPackage.OPERATING_SYSTEM:
				return validateOperatingSystem((OperatingSystem)value, diagnostics, context);
			case MdcmsPackage.TOMCAT:
				return validateTomcat((Tomcat)value, diagnostics, context);
			case MdcmsPackage.APACHE:
				return validateApache((Apache)value, diagnostics, context);
			case MdcmsPackage.PC:
				return validatePC((PC)value, diagnostics, context);
			case MdcmsPackage.PHYSICAL:
				return validatePhysical((Physical)value, diagnostics, context);
			case MdcmsPackage.SWITCH:
				return validateSwitch((Switch)value, diagnostics, context);
			case MdcmsPackage.NETWORK_DEVICE:
				return validateNetworkDevice((NetworkDevice)value, diagnostics, context);
			case MdcmsPackage.ROUTER:
				return validateRouter((Router)value, diagnostics, context);
			case MdcmsPackage.SERVER:
				return validateServer((Server)value, diagnostics, context);
			case MdcmsPackage.DATABASE:
				return validateDatabase((Database)value, diagnostics, context);
			case MdcmsPackage.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case MdcmsPackage.FILE:
				return validateFile((File)value, diagnostics, context);
			case MdcmsPackage.REGISTRY_ENTRY:
				return validateRegistryEntry((RegistryEntry)value, diagnostics, context);
			case MdcmsPackage.FREE_FORM:
				return validateFreeForm((FreeForm)value, diagnostics, context);
			case MdcmsPackage.TOMCAT_APP:
				return validateTomcatApp((TomcatApp)value, diagnostics, context);
			case MdcmsPackage.JAVA_ORACLE:
				return validateJavaOracle((JavaOracle)value, diagnostics, context);
			case MdcmsPackage.FIREWALL_RULE:
				return validateFirewallRule((FirewallRule)value, diagnostics, context);
			case MdcmsPackage.APACHE_VHOST:
				return validateApacheVhost((ApacheVhost)value, diagnostics, context);
			case MdcmsPackage.MY_SQLDB:
				return validateMySQLDB((MySQLDB)value, diagnostics, context);
			case MdcmsPackage.PSQLDB:
				return validatePSQLDB((PSQLDB)value, diagnostics, context);
			case MdcmsPackage.PERIPHERAL:
				return validatePeripheral((Peripheral)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntime(mdcms.Runtime runtime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogical(Logical logical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logical, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySQL(MySQL mySQL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mySQL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDBEngine(DBEngine dbEngine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dbEngine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJava(Java java, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(java, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirewall(Firewall firewall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firewall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirmware(Firmware firmware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firmware, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPServer(HTTPServer httpServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostgreSQL(PostgreSQL postgreSQL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postgreSQL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationServer(ApplicationServer applicationServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatingSystem(OperatingSystem operatingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operatingSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTomcat(Tomcat tomcat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tomcat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApache(Apache apache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(apache, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePC(PC pc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysical(Physical physical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physical, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitch(Switch switch_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(switch_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkDevice(NetworkDevice networkDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRouter(Router router, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(router, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(server, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabase(Database database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(database, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configuration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(file, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryEntry(RegistryEntry registryEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registryEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeForm(FreeForm freeForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freeForm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTomcatApp(TomcatApp tomcatApp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tomcatApp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tomcatApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tomcatApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tomcatApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tomcatApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tomcatApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tomcatApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tomcatApp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tomcatApp, diagnostics, context);
		if (result || diagnostics != null) result &= validateTomcatApp_ConstraintTomcat(tomcatApp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConstraintTomcat constraint of '<em>Tomcat App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTomcatApp_ConstraintTomcat(TomcatApp tomcatApp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tomcatApp.ConstraintTomcat(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaOracle(JavaOracle javaOracle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaOracle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaOracle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaOracle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaOracle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaOracle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaOracle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaOracle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaOracle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaOracle, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaOracle_ConstraintHTTP(javaOracle, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConstraintHTTP constraint of '<em>Java Oracle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaOracle_ConstraintHTTP(JavaOracle javaOracle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return javaOracle.ConstraintHTTP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirewallRule(FirewallRule firewallRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(firewallRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(firewallRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(firewallRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(firewallRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(firewallRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(firewallRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(firewallRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(firewallRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(firewallRule, diagnostics, context);
		if (result || diagnostics != null) result &= validateFirewallRule_ConstraintFirewall(firewallRule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConstraintFirewall constraint of '<em>Firewall Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirewallRule_ConstraintFirewall(FirewallRule firewallRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return firewallRule.ConstraintFirewall(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApacheVhost(ApacheVhost apacheVhost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apacheVhost, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apacheVhost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apacheVhost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apacheVhost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apacheVhost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apacheVhost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apacheVhost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apacheVhost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apacheVhost, diagnostics, context);
		if (result || diagnostics != null) result &= validateApacheVhost_ConstrainApache(apacheVhost, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConstrainApache constraint of '<em>Apache Vhost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApacheVhost_ConstrainApache(ApacheVhost apacheVhost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return apacheVhost.ConstrainApache(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySQLDB(MySQLDB mySQLDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mySQLDB, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mySQLDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mySQLDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mySQLDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mySQLDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mySQLDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mySQLDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mySQLDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mySQLDB, diagnostics, context);
		if (result || diagnostics != null) result &= validateMySQLDB_ConstraintMySQL(mySQLDB, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConstraintMySQL constraint of '<em>My SQLDB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySQLDB_ConstraintMySQL(MySQLDB mySQLDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySQLDB.ConstraintMySQL(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePSQLDB(PSQLDB psqldb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(psqldb, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(psqldb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(psqldb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(psqldb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(psqldb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(psqldb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(psqldb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(psqldb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(psqldb, diagnostics, context);
		if (result || diagnostics != null) result &= validatePSQLDB_ConstraintPSQL(psqldb, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConstraintPSQL constraint of '<em>PSQLDB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePSQLDB_ConstraintPSQL(PSQLDB psqldb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return psqldb.ConstraintPSQL(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeripheral(Peripheral peripheral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(peripheral, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MdcmsValidator
