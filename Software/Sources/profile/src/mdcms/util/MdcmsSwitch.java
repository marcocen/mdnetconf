/**
 */
package mdcms.util;

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
import mdcms.Tomcat;
import mdcms.TomcatApp;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mdcms.MdcmsPackage
 * @generated
 */
public class MdcmsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MdcmsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdcmsSwitch() {
		if (modelPackage == null) {
			modelPackage = MdcmsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MdcmsPackage.RUNTIME: {
				mdcms.Runtime runtime = (mdcms.Runtime)theEObject;
				T result = caseRuntime(runtime);
				if (result == null) result = caseLogical(runtime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.LOGICAL: {
				Logical logical = (Logical)theEObject;
				T result = caseLogical(logical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.MY_SQL: {
				MySQL mySQL = (MySQL)theEObject;
				T result = caseMySQL(mySQL);
				if (result == null) result = caseDBEngine(mySQL);
				if (result == null) result = caseLogical(mySQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.DB_ENGINE: {
				DBEngine dbEngine = (DBEngine)theEObject;
				T result = caseDBEngine(dbEngine);
				if (result == null) result = caseLogical(dbEngine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.JAVA: {
				Java java = (Java)theEObject;
				T result = caseJava(java);
				if (result == null) result = caseRuntime(java);
				if (result == null) result = caseLogical(java);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.FIREWALL: {
				Firewall firewall = (Firewall)theEObject;
				T result = caseFirewall(firewall);
				if (result == null) result = caseLogical(firewall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.FIRMWARE: {
				Firmware firmware = (Firmware)theEObject;
				T result = caseFirmware(firmware);
				if (result == null) result = caseLogical(firmware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.HTTP_SERVER: {
				HTTPServer httpServer = (HTTPServer)theEObject;
				T result = caseHTTPServer(httpServer);
				if (result == null) result = caseLogical(httpServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.POSTGRE_SQL: {
				PostgreSQL postgreSQL = (PostgreSQL)theEObject;
				T result = casePostgreSQL(postgreSQL);
				if (result == null) result = caseDBEngine(postgreSQL);
				if (result == null) result = caseLogical(postgreSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.APPLICATION_SERVER: {
				ApplicationServer applicationServer = (ApplicationServer)theEObject;
				T result = caseApplicationServer(applicationServer);
				if (result == null) result = caseLogical(applicationServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.OPERATING_SYSTEM: {
				OperatingSystem operatingSystem = (OperatingSystem)theEObject;
				T result = caseOperatingSystem(operatingSystem);
				if (result == null) result = caseLogical(operatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.TOMCAT: {
				Tomcat tomcat = (Tomcat)theEObject;
				T result = caseTomcat(tomcat);
				if (result == null) result = caseApplicationServer(tomcat);
				if (result == null) result = caseLogical(tomcat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.APACHE: {
				Apache apache = (Apache)theEObject;
				T result = caseApache(apache);
				if (result == null) result = caseHTTPServer(apache);
				if (result == null) result = caseLogical(apache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.PC: {
				PC pc = (PC)theEObject;
				T result = casePC(pc);
				if (result == null) result = casePhysical(pc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.PHYSICAL: {
				Physical physical = (Physical)theEObject;
				T result = casePhysical(physical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.SWITCH: {
				mdcms.Switch switch_ = (mdcms.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseNetworkDevice(switch_);
				if (result == null) result = casePhysical(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.NETWORK_DEVICE: {
				NetworkDevice networkDevice = (NetworkDevice)theEObject;
				T result = caseNetworkDevice(networkDevice);
				if (result == null) result = casePhysical(networkDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.ROUTER: {
				Router router = (Router)theEObject;
				T result = caseRouter(router);
				if (result == null) result = caseNetworkDevice(router);
				if (result == null) result = casePhysical(router);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = casePhysical(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseConfiguration(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseConfiguration(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.REGISTRY_ENTRY: {
				RegistryEntry registryEntry = (RegistryEntry)theEObject;
				T result = caseRegistryEntry(registryEntry);
				if (result == null) result = caseConfiguration(registryEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.FREE_FORM: {
				FreeForm freeForm = (FreeForm)theEObject;
				T result = caseFreeForm(freeForm);
				if (result == null) result = caseConfiguration(freeForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.TOMCAT_APP: {
				TomcatApp tomcatApp = (TomcatApp)theEObject;
				T result = caseTomcatApp(tomcatApp);
				if (result == null) result = caseConfiguration(tomcatApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.JAVA_ORACLE: {
				JavaOracle javaOracle = (JavaOracle)theEObject;
				T result = caseJavaOracle(javaOracle);
				if (result == null) result = caseConfiguration(javaOracle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.FIREWALL_RULE: {
				FirewallRule firewallRule = (FirewallRule)theEObject;
				T result = caseFirewallRule(firewallRule);
				if (result == null) result = caseConfiguration(firewallRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.APACHE_VHOST: {
				ApacheVhost apacheVhost = (ApacheVhost)theEObject;
				T result = caseApacheVhost(apacheVhost);
				if (result == null) result = caseConfiguration(apacheVhost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.MY_SQLDB: {
				MySQLDB mySQLDB = (MySQLDB)theEObject;
				T result = caseMySQLDB(mySQLDB);
				if (result == null) result = caseDatabase(mySQLDB);
				if (result == null) result = caseConfiguration(mySQLDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.PSQLDB: {
				PSQLDB psqldb = (PSQLDB)theEObject;
				T result = casePSQLDB(psqldb);
				if (result == null) result = caseDatabase(psqldb);
				if (result == null) result = caseConfiguration(psqldb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MdcmsPackage.PERIPHERAL: {
				Peripheral peripheral = (Peripheral)theEObject;
				T result = casePeripheral(peripheral);
				if (result == null) result = casePhysical(peripheral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntime(mdcms.Runtime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogical(Logical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMySQL(MySQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBEngine(DBEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJava(Java object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firewall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firewall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirewall(Firewall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmware(Firmware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPServer(HTTPServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postgre SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postgre SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostgreSQL(PostgreSQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationServer(ApplicationServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingSystem(OperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tomcat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tomcat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTomcat(Tomcat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApache(Apache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePC(PC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysical(Physical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(mdcms.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDevice(NetworkDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Router</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouter(Router object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registry Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registry Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistryEntry(RegistryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeForm(FreeForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tomcat App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tomcat App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTomcatApp(TomcatApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Oracle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Oracle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaOracle(JavaOracle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firewall Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firewall Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirewallRule(FirewallRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apache Vhost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apache Vhost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApacheVhost(ApacheVhost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My SQLDB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My SQLDB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMySQLDB(MySQLDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSQLDB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSQLDB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSQLDB(PSQLDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peripheral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peripheral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeripheral(Peripheral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MdcmsSwitch
