/**
 */
package mdcms.impl;

import mdcms.Apache;
import mdcms.ApacheVhost;
import mdcms.Configuration;
import mdcms.Database;
import mdcms.File;
import mdcms.Firewall;
import mdcms.FirewallRule;
import mdcms.Firmware;
import mdcms.FreeForm;
import mdcms.Java;
import mdcms.JavaOracle;
import mdcms.Logical;
import mdcms.MdcmsFactory;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdcmsFactoryImpl extends EFactoryImpl implements MdcmsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MdcmsFactory init() {
		try {
			MdcmsFactory theMdcmsFactory = (MdcmsFactory)EPackage.Registry.INSTANCE.getEFactory(MdcmsPackage.eNS_URI);
			if (theMdcmsFactory != null) {
				return theMdcmsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MdcmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdcmsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MdcmsPackage.LOGICAL: return createLogical();
			case MdcmsPackage.MY_SQL: return createMySQL();
			case MdcmsPackage.JAVA: return createJava();
			case MdcmsPackage.FIREWALL: return createFirewall();
			case MdcmsPackage.FIRMWARE: return createFirmware();
			case MdcmsPackage.POSTGRE_SQL: return createPostgreSQL();
			case MdcmsPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case MdcmsPackage.TOMCAT: return createTomcat();
			case MdcmsPackage.APACHE: return createApache();
			case MdcmsPackage.PC: return createPC();
			case MdcmsPackage.PHYSICAL: return createPhysical();
			case MdcmsPackage.SWITCH: return createSwitch();
			case MdcmsPackage.NETWORK_DEVICE: return createNetworkDevice();
			case MdcmsPackage.ROUTER: return createRouter();
			case MdcmsPackage.SERVER: return createServer();
			case MdcmsPackage.DATABASE: return createDatabase();
			case MdcmsPackage.CONFIGURATION: return createConfiguration();
			case MdcmsPackage.FILE: return createFile();
			case MdcmsPackage.REGISTRY_ENTRY: return createRegistryEntry();
			case MdcmsPackage.FREE_FORM: return createFreeForm();
			case MdcmsPackage.TOMCAT_APP: return createTomcatApp();
			case MdcmsPackage.JAVA_ORACLE: return createJavaOracle();
			case MdcmsPackage.FIREWALL_RULE: return createFirewallRule();
			case MdcmsPackage.APACHE_VHOST: return createApacheVhost();
			case MdcmsPackage.MY_SQLDB: return createMySQLDB();
			case MdcmsPackage.PSQLDB: return createPSQLDB();
			case MdcmsPackage.PERIPHERAL: return createPeripheral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical createLogical() {
		LogicalImpl logical = new LogicalImpl();
		return logical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MySQL createMySQL() {
		MySQLImpl mySQL = new MySQLImpl();
		return mySQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java createJava() {
		JavaImpl java = new JavaImpl();
		return java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Firewall createFirewall() {
		FirewallImpl firewall = new FirewallImpl();
		return firewall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Firmware createFirmware() {
		FirmwareImpl firmware = new FirmwareImpl();
		return firmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostgreSQL createPostgreSQL() {
		PostgreSQLImpl postgreSQL = new PostgreSQLImpl();
		return postgreSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tomcat createTomcat() {
		TomcatImpl tomcat = new TomcatImpl();
		return tomcat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apache createApache() {
		ApacheImpl apache = new ApacheImpl();
		return apache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PC createPC() {
		PCImpl pc = new PCImpl();
		return pc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Physical createPhysical() {
		PhysicalImpl physical = new PhysicalImpl();
		return physical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDevice createNetworkDevice() {
		NetworkDeviceImpl networkDevice = new NetworkDeviceImpl();
		return networkDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router createRouter() {
		RouterImpl router = new RouterImpl();
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryEntry createRegistryEntry() {
		RegistryEntryImpl registryEntry = new RegistryEntryImpl();
		return registryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeForm createFreeForm() {
		FreeFormImpl freeForm = new FreeFormImpl();
		return freeForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TomcatApp createTomcatApp() {
		TomcatAppImpl tomcatApp = new TomcatAppImpl();
		return tomcatApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaOracle createJavaOracle() {
		JavaOracleImpl javaOracle = new JavaOracleImpl();
		return javaOracle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirewallRule createFirewallRule() {
		FirewallRuleImpl firewallRule = new FirewallRuleImpl();
		return firewallRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApacheVhost createApacheVhost() {
		ApacheVhostImpl apacheVhost = new ApacheVhostImpl();
		return apacheVhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MySQLDB createMySQLDB() {
		MySQLDBImpl mySQLDB = new MySQLDBImpl();
		return mySQLDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSQLDB createPSQLDB() {
		PSQLDBImpl psqldb = new PSQLDBImpl();
		return psqldb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peripheral createPeripheral() {
		PeripheralImpl peripheral = new PeripheralImpl();
		return peripheral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdcmsPackage getMdcmsPackage() {
		return (MdcmsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MdcmsPackage getPackage() {
		return MdcmsPackage.eINSTANCE;
	}

} //MdcmsFactoryImpl
