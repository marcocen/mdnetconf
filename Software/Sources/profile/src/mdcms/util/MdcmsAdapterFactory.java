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
import mdcms.Switch;
import mdcms.Tomcat;
import mdcms.TomcatApp;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mdcms.MdcmsPackage
 * @generated
 */
public class MdcmsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MdcmsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdcmsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MdcmsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MdcmsSwitch<Adapter> modelSwitch =
		new MdcmsSwitch<Adapter>() {
			@Override
			public Adapter caseRuntime(mdcms.Runtime object) {
				return createRuntimeAdapter();
			}
			@Override
			public Adapter caseLogical(Logical object) {
				return createLogicalAdapter();
			}
			@Override
			public Adapter caseMySQL(MySQL object) {
				return createMySQLAdapter();
			}
			@Override
			public Adapter caseDBEngine(DBEngine object) {
				return createDBEngineAdapter();
			}
			@Override
			public Adapter caseJava(Java object) {
				return createJavaAdapter();
			}
			@Override
			public Adapter caseFirewall(Firewall object) {
				return createFirewallAdapter();
			}
			@Override
			public Adapter caseFirmware(Firmware object) {
				return createFirmwareAdapter();
			}
			@Override
			public Adapter caseHTTPServer(HTTPServer object) {
				return createHTTPServerAdapter();
			}
			@Override
			public Adapter casePostgreSQL(PostgreSQL object) {
				return createPostgreSQLAdapter();
			}
			@Override
			public Adapter caseApplicationServer(ApplicationServer object) {
				return createApplicationServerAdapter();
			}
			@Override
			public Adapter caseOperatingSystem(OperatingSystem object) {
				return createOperatingSystemAdapter();
			}
			@Override
			public Adapter caseTomcat(Tomcat object) {
				return createTomcatAdapter();
			}
			@Override
			public Adapter caseApache(Apache object) {
				return createApacheAdapter();
			}
			@Override
			public Adapter casePC(PC object) {
				return createPCAdapter();
			}
			@Override
			public Adapter casePhysical(Physical object) {
				return createPhysicalAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object) {
				return createSwitchAdapter();
			}
			@Override
			public Adapter caseNetworkDevice(NetworkDevice object) {
				return createNetworkDeviceAdapter();
			}
			@Override
			public Adapter caseRouter(Router object) {
				return createRouterAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseRegistryEntry(RegistryEntry object) {
				return createRegistryEntryAdapter();
			}
			@Override
			public Adapter caseFreeForm(FreeForm object) {
				return createFreeFormAdapter();
			}
			@Override
			public Adapter caseTomcatApp(TomcatApp object) {
				return createTomcatAppAdapter();
			}
			@Override
			public Adapter caseJavaOracle(JavaOracle object) {
				return createJavaOracleAdapter();
			}
			@Override
			public Adapter caseFirewallRule(FirewallRule object) {
				return createFirewallRuleAdapter();
			}
			@Override
			public Adapter caseApacheVhost(ApacheVhost object) {
				return createApacheVhostAdapter();
			}
			@Override
			public Adapter caseMySQLDB(MySQLDB object) {
				return createMySQLDBAdapter();
			}
			@Override
			public Adapter casePSQLDB(PSQLDB object) {
				return createPSQLDBAdapter();
			}
			@Override
			public Adapter casePeripheral(Peripheral object) {
				return createPeripheralAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Runtime
	 * @generated
	 */
	public Adapter createRuntimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Logical <em>Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Logical
	 * @generated
	 */
	public Adapter createLogicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.MySQL <em>My SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.MySQL
	 * @generated
	 */
	public Adapter createMySQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.DBEngine <em>DB Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.DBEngine
	 * @generated
	 */
	public Adapter createDBEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Java
	 * @generated
	 */
	public Adapter createJavaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Firewall <em>Firewall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Firewall
	 * @generated
	 */
	public Adapter createFirewallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Firmware <em>Firmware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Firmware
	 * @generated
	 */
	public Adapter createFirmwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.HTTPServer <em>HTTP Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.HTTPServer
	 * @generated
	 */
	public Adapter createHTTPServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.PostgreSQL <em>Postgre SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.PostgreSQL
	 * @generated
	 */
	public Adapter createPostgreSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.ApplicationServer <em>Application Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.ApplicationServer
	 * @generated
	 */
	public Adapter createApplicationServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.OperatingSystem
	 * @generated
	 */
	public Adapter createOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Tomcat <em>Tomcat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Tomcat
	 * @generated
	 */
	public Adapter createTomcatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Apache <em>Apache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Apache
	 * @generated
	 */
	public Adapter createApacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.PC <em>PC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.PC
	 * @generated
	 */
	public Adapter createPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Physical
	 * @generated
	 */
	public Adapter createPhysicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.NetworkDevice <em>Network Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.NetworkDevice
	 * @generated
	 */
	public Adapter createNetworkDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Router
	 * @generated
	 */
	public Adapter createRouterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.RegistryEntry <em>Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.RegistryEntry
	 * @generated
	 */
	public Adapter createRegistryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.FreeForm <em>Free Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.FreeForm
	 * @generated
	 */
	public Adapter createFreeFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.TomcatApp <em>Tomcat App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.TomcatApp
	 * @generated
	 */
	public Adapter createTomcatAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.JavaOracle <em>Java Oracle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.JavaOracle
	 * @generated
	 */
	public Adapter createJavaOracleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.FirewallRule <em>Firewall Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.FirewallRule
	 * @generated
	 */
	public Adapter createFirewallRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.ApacheVhost <em>Apache Vhost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.ApacheVhost
	 * @generated
	 */
	public Adapter createApacheVhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.MySQLDB <em>My SQLDB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.MySQLDB
	 * @generated
	 */
	public Adapter createMySQLDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.PSQLDB <em>PSQLDB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.PSQLDB
	 * @generated
	 */
	public Adapter createPSQLDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdcms.Peripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdcms.Peripheral
	 * @generated
	 */
	public Adapter createPeripheralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MdcmsAdapterFactory
