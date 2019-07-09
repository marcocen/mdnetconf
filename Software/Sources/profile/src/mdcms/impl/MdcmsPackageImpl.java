/**
 */
package mdcms.impl;

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
import mdcms.MdcmsFactory;
import mdcms.MdcmsPackage;
import mdcms.MySQL;
import mdcms.MySQLDB;
import mdcms.NetworkDevice;
import mdcms.OperatingSystem;
import mdcms.Peripheral;
import mdcms.Physical;
import mdcms.PostgreSQL;
import mdcms.RegistryEntry;
import mdcms.Router;
import mdcms.Server;
import mdcms.Switch;
import mdcms.Tomcat;
import mdcms.TomcatApp;

import mdcms.util.MdcmsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdcmsPackageImpl extends EPackageImpl implements MdcmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mySQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firewallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postgreSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tomcatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tomcatAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaOracleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firewallRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apacheVhostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mySQLDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psqldbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peripheralEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mdcms.MdcmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MdcmsPackageImpl() {
		super(eNS_URI, MdcmsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MdcmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MdcmsPackage init() {
		if (isInited) return (MdcmsPackage)EPackage.Registry.INSTANCE.getEPackage(MdcmsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMdcmsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MdcmsPackageImpl theMdcmsPackage = registeredMdcmsPackage instanceof MdcmsPackageImpl ? (MdcmsPackageImpl)registeredMdcmsPackage : new MdcmsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMdcmsPackage.createPackageContents();

		// Initialize created meta-data
		theMdcmsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMdcmsPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MdcmsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMdcmsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MdcmsPackage.eNS_URI, theMdcmsPackage);
		return theMdcmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntime() {
		return runtimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogical() {
		return logicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogical_Base_ExecutionEnvironment() {
		return (EReference)logicalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMySQL() {
		return mySQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMySQL_PackageName() {
		return (EAttribute)mySQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMySQL_PackageVersion() {
		return (EAttribute)mySQLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMySQL_RootPassword() {
		return (EAttribute)mySQLEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMySQL_InstallOptions() {
		return (EAttribute)mySQLEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBEngine() {
		return dbEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJava() {
		return javaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJava_Distribution() {
		return (EAttribute)javaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJava_Package() {
		return (EAttribute)javaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJava_Version() {
		return (EAttribute)javaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirewall() {
		return firewallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewall_ServiceName() {
		return (EAttribute)firewallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewall_PackageName() {
		return (EAttribute)firewallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmware() {
		return firmwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmware_Type() {
		return (EAttribute)firmwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmware_Version() {
		return (EAttribute)firmwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPServer() {
		return httpServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostgreSQL() {
		return postgreSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostgreSQL_Version() {
		return (EAttribute)postgreSQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostgreSQL_Encoding() {
		return (EAttribute)postgreSQLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostgreSQL_Locale() {
		return (EAttribute)postgreSQLEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationServer() {
		return applicationServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_Distribution() {
		return (EAttribute)operatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_Version() {
		return (EAttribute)operatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_Architecture() {
		return (EAttribute)operatingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTomcat() {
		return tomcatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcat_InstallDir() {
		return (EAttribute)tomcatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcat_SourceURL() {
		return (EAttribute)tomcatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApache() {
		return apacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApache_Version() {
		return (EAttribute)apacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApache_ServerName() {
		return (EAttribute)apacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApache_ConfigDir() {
		return (EAttribute)apacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApache_Docroot() {
		return (EAttribute)apacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApache_Logroot() {
		return (EAttribute)apacheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApache_LibPath() {
		return (EAttribute)apacheEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApache_DefaultVhost() {
		return (EAttribute)apacheEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApache_VhostDir() {
		return (EAttribute)apacheEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPC() {
		return pcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPC_Processor() {
		return (EAttribute)pcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPC_Architecture() {
		return (EAttribute)pcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPC_DiskType() {
		return (EAttribute)pcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPC_DiskSpace() {
		return (EAttribute)pcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPC_Ram() {
		return (EAttribute)pcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPC_Motherboard() {
		return (EAttribute)pcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPC_GraphicCard() {
		return (EAttribute)pcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysical() {
		return physicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysical_Base_Device() {
		return (EReference)physicalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysical_Location() {
		return (EAttribute)physicalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysical_IP() {
		return (EAttribute)physicalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysical_MAC() {
		return (EAttribute)physicalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysical_Manufacturer() {
		return (EAttribute)physicalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysical_Model() {
		return (EAttribute)physicalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_Speed() {
		return (EAttribute)switchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_PowerW() {
		return (EAttribute)switchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkDevice() {
		return networkDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkDevice_Throughput() {
		return (EAttribute)networkDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkDevice_Ports() {
		return (EAttribute)networkDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouter() {
		return routerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_SO() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_FormFactor() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_NetworkInterfaceSlots() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_ServiceModuleSlots() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Processor() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Architecture() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_DiskType() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_DiskSpace() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Ram() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Rack() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Name() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_User() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Password() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Host() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Port() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Base_Artifact() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Path() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Ensure() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Content() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Backup() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Mode() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Group() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Owner() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Replace() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Force() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_CreationTime() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_ModificationTime() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistryEntry() {
		return registryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntry_Path() {
		return (EAttribute)registryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntry_Ensure() {
		return (EAttribute)registryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntry_Type() {
		return (EAttribute)registryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistryEntry_Data() {
		return (EAttribute)registryEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeForm() {
		return freeFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeForm_Description() {
		return (EAttribute)freeFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTomcatApp() {
		return tomcatAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcatApp_Parameters() {
		return (EAttribute)tomcatAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcatApp_CatalinaHome() {
		return (EAttribute)tomcatAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcatApp_CatalinaBase() {
		return (EAttribute)tomcatAppEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcatApp_Address() {
		return (EAttribute)tomcatAppEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcatApp_Port() {
		return (EAttribute)tomcatAppEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcatApp_ServerConfig() {
		return (EAttribute)tomcatAppEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcatApp_ClassName() {
		return (EAttribute)tomcatAppEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTomcatApp_AdditionalAttributes() {
		return (EAttribute)tomcatAppEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTomcatApp__ConstraintTomcat__DiagnosticChain_Map() {
		return tomcatAppEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaOracle() {
		return javaOracleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaOracle_VersionMajor() {
		return (EAttribute)javaOracleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaOracle_VersionMinor() {
		return (EAttribute)javaOracleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaOracle_JavaSE() {
		return (EAttribute)javaOracleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaOracle_OracleURL() {
		return (EAttribute)javaOracleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaOracle_ProxyServer() {
		return (EAttribute)javaOracleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaOracle_ProxyType() {
		return (EAttribute)javaOracleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJavaOracle__ConstraintHTTP__DiagnosticChain_Map() {
		return javaOracleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirewallRule() {
		return firewallRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_Name() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_Action() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_Protocol() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_Source() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_SourceRange() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_Destination() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_DestinationRange() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_DestinationPort() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_InputInterface() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_OutputInterface() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_State() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_TCPFlags() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallRule_Provider() {
		return (EAttribute)firewallRuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallRule__ConstraintFirewall__DiagnosticChain_Map() {
		return firewallRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApacheVhost() {
		return apacheVhostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApacheVhost_VhostName() {
		return (EAttribute)apacheVhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApacheVhost_ServerName() {
		return (EAttribute)apacheVhostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApacheVhost_IP() {
		return (EAttribute)apacheVhostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApacheVhost_Port() {
		return (EAttribute)apacheVhostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApacheVhost_Docroot() {
		return (EAttribute)apacheVhostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApacheVhost_DocrootOwner() {
		return (EAttribute)apacheVhostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApacheVhost_DocrootGroup() {
		return (EAttribute)apacheVhostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApacheVhost_SSL() {
		return (EAttribute)apacheVhostEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApacheVhost_ServerAliases() {
		return (EAttribute)apacheVhostEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApacheVhost__ConstrainApache__DiagnosticChain_Map() {
		return apacheVhostEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMySQLDB() {
		return mySQLDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMySQLDB_Charset() {
		return (EAttribute)mySQLDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMySQLDB__ConstraintMySQL__DiagnosticChain_Map() {
		return mySQLDBEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSQLDB() {
		return psqldbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSQLDB_Template() {
		return (EAttribute)psqldbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSQLDB_Owner() {
		return (EAttribute)psqldbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPSQLDB__ConstraintPSQL__DiagnosticChain_Map() {
		return psqldbEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeripheral() {
		return peripheralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeripheral_Type() {
		return (EAttribute)peripheralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdcmsFactory getMdcmsFactory() {
		return (MdcmsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		runtimeEClass = createEClass(RUNTIME);

		logicalEClass = createEClass(LOGICAL);
		createEReference(logicalEClass, LOGICAL__BASE_EXECUTION_ENVIRONMENT);

		mySQLEClass = createEClass(MY_SQL);
		createEAttribute(mySQLEClass, MY_SQL__PACKAGE_NAME);
		createEAttribute(mySQLEClass, MY_SQL__PACKAGE_VERSION);
		createEAttribute(mySQLEClass, MY_SQL__ROOT_PASSWORD);
		createEAttribute(mySQLEClass, MY_SQL__INSTALL_OPTIONS);

		dbEngineEClass = createEClass(DB_ENGINE);

		javaEClass = createEClass(JAVA);
		createEAttribute(javaEClass, JAVA__DISTRIBUTION);
		createEAttribute(javaEClass, JAVA__PACKAGE);
		createEAttribute(javaEClass, JAVA__VERSION);

		firewallEClass = createEClass(FIREWALL);
		createEAttribute(firewallEClass, FIREWALL__SERVICE_NAME);
		createEAttribute(firewallEClass, FIREWALL__PACKAGE_NAME);

		firmwareEClass = createEClass(FIRMWARE);
		createEAttribute(firmwareEClass, FIRMWARE__TYPE);
		createEAttribute(firmwareEClass, FIRMWARE__VERSION);

		httpServerEClass = createEClass(HTTP_SERVER);

		postgreSQLEClass = createEClass(POSTGRE_SQL);
		createEAttribute(postgreSQLEClass, POSTGRE_SQL__VERSION);
		createEAttribute(postgreSQLEClass, POSTGRE_SQL__ENCODING);
		createEAttribute(postgreSQLEClass, POSTGRE_SQL__LOCALE);

		applicationServerEClass = createEClass(APPLICATION_SERVER);

		operatingSystemEClass = createEClass(OPERATING_SYSTEM);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__DISTRIBUTION);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__VERSION);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__ARCHITECTURE);

		tomcatEClass = createEClass(TOMCAT);
		createEAttribute(tomcatEClass, TOMCAT__INSTALL_DIR);
		createEAttribute(tomcatEClass, TOMCAT__SOURCE_URL);

		apacheEClass = createEClass(APACHE);
		createEAttribute(apacheEClass, APACHE__VERSION);
		createEAttribute(apacheEClass, APACHE__SERVER_NAME);
		createEAttribute(apacheEClass, APACHE__CONFIG_DIR);
		createEAttribute(apacheEClass, APACHE__DOCROOT);
		createEAttribute(apacheEClass, APACHE__LOGROOT);
		createEAttribute(apacheEClass, APACHE__LIB_PATH);
		createEAttribute(apacheEClass, APACHE__DEFAULT_VHOST);
		createEAttribute(apacheEClass, APACHE__VHOST_DIR);

		pcEClass = createEClass(PC);
		createEAttribute(pcEClass, PC__PROCESSOR);
		createEAttribute(pcEClass, PC__ARCHITECTURE);
		createEAttribute(pcEClass, PC__DISK_TYPE);
		createEAttribute(pcEClass, PC__DISK_SPACE);
		createEAttribute(pcEClass, PC__RAM);
		createEAttribute(pcEClass, PC__MOTHERBOARD);
		createEAttribute(pcEClass, PC__GRAPHIC_CARD);

		physicalEClass = createEClass(PHYSICAL);
		createEReference(physicalEClass, PHYSICAL__BASE_DEVICE);
		createEAttribute(physicalEClass, PHYSICAL__LOCATION);
		createEAttribute(physicalEClass, PHYSICAL__IP);
		createEAttribute(physicalEClass, PHYSICAL__MAC);
		createEAttribute(physicalEClass, PHYSICAL__MANUFACTURER);
		createEAttribute(physicalEClass, PHYSICAL__MODEL);

		switchEClass = createEClass(SWITCH);
		createEAttribute(switchEClass, SWITCH__SPEED);
		createEAttribute(switchEClass, SWITCH__POWER_W);

		networkDeviceEClass = createEClass(NETWORK_DEVICE);
		createEAttribute(networkDeviceEClass, NETWORK_DEVICE__THROUGHPUT);
		createEAttribute(networkDeviceEClass, NETWORK_DEVICE__PORTS);

		routerEClass = createEClass(ROUTER);
		createEAttribute(routerEClass, ROUTER__SO);
		createEAttribute(routerEClass, ROUTER__FORM_FACTOR);
		createEAttribute(routerEClass, ROUTER__NETWORK_INTERFACE_SLOTS);
		createEAttribute(routerEClass, ROUTER__SERVICE_MODULE_SLOTS);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__PROCESSOR);
		createEAttribute(serverEClass, SERVER__ARCHITECTURE);
		createEAttribute(serverEClass, SERVER__DISK_TYPE);
		createEAttribute(serverEClass, SERVER__DISK_SPACE);
		createEAttribute(serverEClass, SERVER__RAM);
		createEAttribute(serverEClass, SERVER__RACK);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__NAME);
		createEAttribute(databaseEClass, DATABASE__USER);
		createEAttribute(databaseEClass, DATABASE__PASSWORD);
		createEAttribute(databaseEClass, DATABASE__HOST);
		createEAttribute(databaseEClass, DATABASE__PORT);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__BASE_ARTIFACT);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__PATH);
		createEAttribute(fileEClass, FILE__ENSURE);
		createEAttribute(fileEClass, FILE__CONTENT);
		createEAttribute(fileEClass, FILE__BACKUP);
		createEAttribute(fileEClass, FILE__MODE);
		createEAttribute(fileEClass, FILE__GROUP);
		createEAttribute(fileEClass, FILE__OWNER);
		createEAttribute(fileEClass, FILE__REPLACE);
		createEAttribute(fileEClass, FILE__FORCE);
		createEAttribute(fileEClass, FILE__CREATION_TIME);
		createEAttribute(fileEClass, FILE__MODIFICATION_TIME);

		registryEntryEClass = createEClass(REGISTRY_ENTRY);
		createEAttribute(registryEntryEClass, REGISTRY_ENTRY__PATH);
		createEAttribute(registryEntryEClass, REGISTRY_ENTRY__ENSURE);
		createEAttribute(registryEntryEClass, REGISTRY_ENTRY__TYPE);
		createEAttribute(registryEntryEClass, REGISTRY_ENTRY__DATA);

		freeFormEClass = createEClass(FREE_FORM);
		createEAttribute(freeFormEClass, FREE_FORM__DESCRIPTION);

		tomcatAppEClass = createEClass(TOMCAT_APP);
		createEAttribute(tomcatAppEClass, TOMCAT_APP__PARAMETERS);
		createEAttribute(tomcatAppEClass, TOMCAT_APP__CATALINA_HOME);
		createEAttribute(tomcatAppEClass, TOMCAT_APP__CATALINA_BASE);
		createEAttribute(tomcatAppEClass, TOMCAT_APP__ADDRESS);
		createEAttribute(tomcatAppEClass, TOMCAT_APP__PORT);
		createEAttribute(tomcatAppEClass, TOMCAT_APP__SERVER_CONFIG);
		createEAttribute(tomcatAppEClass, TOMCAT_APP__CLASS_NAME);
		createEAttribute(tomcatAppEClass, TOMCAT_APP__ADDITIONAL_ATTRIBUTES);
		createEOperation(tomcatAppEClass, TOMCAT_APP___CONSTRAINT_TOMCAT__DIAGNOSTICCHAIN_MAP);

		javaOracleEClass = createEClass(JAVA_ORACLE);
		createEAttribute(javaOracleEClass, JAVA_ORACLE__VERSION_MAJOR);
		createEAttribute(javaOracleEClass, JAVA_ORACLE__VERSION_MINOR);
		createEAttribute(javaOracleEClass, JAVA_ORACLE__JAVA_SE);
		createEAttribute(javaOracleEClass, JAVA_ORACLE__ORACLE_URL);
		createEAttribute(javaOracleEClass, JAVA_ORACLE__PROXY_SERVER);
		createEAttribute(javaOracleEClass, JAVA_ORACLE__PROXY_TYPE);
		createEOperation(javaOracleEClass, JAVA_ORACLE___CONSTRAINT_HTTP__DIAGNOSTICCHAIN_MAP);

		firewallRuleEClass = createEClass(FIREWALL_RULE);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__NAME);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__ACTION);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__PROTOCOL);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__SOURCE);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__SOURCE_RANGE);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__DESTINATION);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__DESTINATION_RANGE);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__DESTINATION_PORT);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__INPUT_INTERFACE);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__OUTPUT_INTERFACE);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__STATE);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__TCP_FLAGS);
		createEAttribute(firewallRuleEClass, FIREWALL_RULE__PROVIDER);
		createEOperation(firewallRuleEClass, FIREWALL_RULE___CONSTRAINT_FIREWALL__DIAGNOSTICCHAIN_MAP);

		apacheVhostEClass = createEClass(APACHE_VHOST);
		createEAttribute(apacheVhostEClass, APACHE_VHOST__VHOST_NAME);
		createEAttribute(apacheVhostEClass, APACHE_VHOST__SERVER_NAME);
		createEAttribute(apacheVhostEClass, APACHE_VHOST__IP);
		createEAttribute(apacheVhostEClass, APACHE_VHOST__PORT);
		createEAttribute(apacheVhostEClass, APACHE_VHOST__DOCROOT);
		createEAttribute(apacheVhostEClass, APACHE_VHOST__DOCROOT_OWNER);
		createEAttribute(apacheVhostEClass, APACHE_VHOST__DOCROOT_GROUP);
		createEAttribute(apacheVhostEClass, APACHE_VHOST__SSL);
		createEAttribute(apacheVhostEClass, APACHE_VHOST__SERVER_ALIASES);
		createEOperation(apacheVhostEClass, APACHE_VHOST___CONSTRAIN_APACHE__DIAGNOSTICCHAIN_MAP);

		mySQLDBEClass = createEClass(MY_SQLDB);
		createEAttribute(mySQLDBEClass, MY_SQLDB__CHARSET);
		createEOperation(mySQLDBEClass, MY_SQLDB___CONSTRAINT_MY_SQL__DIAGNOSTICCHAIN_MAP);

		psqldbEClass = createEClass(PSQLDB);
		createEAttribute(psqldbEClass, PSQLDB__TEMPLATE);
		createEAttribute(psqldbEClass, PSQLDB__OWNER);
		createEOperation(psqldbEClass, PSQLDB___CONSTRAINT_PSQL__DIAGNOSTICCHAIN_MAP);

		peripheralEClass = createEClass(PERIPHERAL);
		createEAttribute(peripheralEClass, PERIPHERAL__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runtimeEClass.getESuperTypes().add(this.getLogical());
		mySQLEClass.getESuperTypes().add(this.getDBEngine());
		dbEngineEClass.getESuperTypes().add(this.getLogical());
		javaEClass.getESuperTypes().add(this.getRuntime());
		firewallEClass.getESuperTypes().add(this.getLogical());
		firmwareEClass.getESuperTypes().add(this.getLogical());
		httpServerEClass.getESuperTypes().add(this.getLogical());
		postgreSQLEClass.getESuperTypes().add(this.getDBEngine());
		applicationServerEClass.getESuperTypes().add(this.getLogical());
		operatingSystemEClass.getESuperTypes().add(this.getLogical());
		tomcatEClass.getESuperTypes().add(this.getApplicationServer());
		apacheEClass.getESuperTypes().add(this.getHTTPServer());
		pcEClass.getESuperTypes().add(this.getPhysical());
		switchEClass.getESuperTypes().add(this.getNetworkDevice());
		networkDeviceEClass.getESuperTypes().add(this.getPhysical());
		routerEClass.getESuperTypes().add(this.getNetworkDevice());
		serverEClass.getESuperTypes().add(this.getPhysical());
		databaseEClass.getESuperTypes().add(this.getConfiguration());
		fileEClass.getESuperTypes().add(this.getConfiguration());
		registryEntryEClass.getESuperTypes().add(this.getConfiguration());
		freeFormEClass.getESuperTypes().add(this.getConfiguration());
		tomcatAppEClass.getESuperTypes().add(this.getConfiguration());
		javaOracleEClass.getESuperTypes().add(this.getConfiguration());
		firewallRuleEClass.getESuperTypes().add(this.getConfiguration());
		apacheVhostEClass.getESuperTypes().add(this.getConfiguration());
		mySQLDBEClass.getESuperTypes().add(this.getDatabase());
		psqldbEClass.getESuperTypes().add(this.getDatabase());
		peripheralEClass.getESuperTypes().add(this.getPhysical());

		// Initialize classes, features, and operations; add parameters
		initEClass(runtimeEClass, mdcms.Runtime.class, "Runtime", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalEClass, Logical.class, "Logical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogical_Base_ExecutionEnvironment(), theUMLPackage.getExecutionEnvironment(), null, "base_ExecutionEnvironment", null, 1, 1, Logical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mySQLEClass, MySQL.class, "MySQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMySQL_PackageName(), theTypesPackage.getString(), "PackageName", null, 0, 1, MySQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMySQL_PackageVersion(), theTypesPackage.getString(), "PackageVersion", null, 0, 1, MySQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMySQL_RootPassword(), theTypesPackage.getString(), "RootPassword", null, 0, 1, MySQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMySQL_InstallOptions(), theTypesPackage.getString(), "InstallOptions", null, 0, 1, MySQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dbEngineEClass, DBEngine.class, "DBEngine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaEClass, Java.class, "Java", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJava_Distribution(), theTypesPackage.getString(), "Distribution", null, 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJava_Package(), theTypesPackage.getString(), "Package", null, 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJava_Version(), theTypesPackage.getString(), "Version", null, 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(firewallEClass, Firewall.class, "Firewall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirewall_ServiceName(), theTypesPackage.getString(), "ServiceName", null, 0, 1, Firewall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewall_PackageName(), theTypesPackage.getString(), "PackageName", null, 0, 1, Firewall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(firmwareEClass, Firmware.class, "Firmware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirmware_Type(), theTypesPackage.getString(), "Type", null, 0, 1, Firmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirmware_Version(), theTypesPackage.getString(), "Version", null, 0, 1, Firmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(httpServerEClass, HTTPServer.class, "HTTPServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postgreSQLEClass, PostgreSQL.class, "PostgreSQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostgreSQL_Version(), theTypesPackage.getString(), "Version", null, 0, 1, PostgreSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPostgreSQL_Encoding(), theTypesPackage.getString(), "Encoding", null, 0, 1, PostgreSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPostgreSQL_Locale(), theTypesPackage.getString(), "Locale", null, 0, 1, PostgreSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applicationServerEClass, ApplicationServer.class, "ApplicationServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatingSystem_Distribution(), theTypesPackage.getString(), "Distribution", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperatingSystem_Version(), theTypesPackage.getString(), "Version", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperatingSystem_Architecture(), theTypesPackage.getString(), "Architecture", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tomcatEClass, Tomcat.class, "Tomcat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTomcat_InstallDir(), theTypesPackage.getString(), "InstallDir", null, 0, 1, Tomcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTomcat_SourceURL(), theTypesPackage.getString(), "SourceURL", null, 0, 1, Tomcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(apacheEClass, Apache.class, "Apache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApache_Version(), theTypesPackage.getString(), "Version", null, 0, 1, Apache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApache_ServerName(), theTypesPackage.getString(), "ServerName", null, 0, 1, Apache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApache_ConfigDir(), theTypesPackage.getString(), "ConfigDir", null, 0, 1, Apache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApache_Docroot(), theTypesPackage.getString(), "Docroot", null, 0, 1, Apache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApache_Logroot(), theTypesPackage.getString(), "Logroot", null, 0, 1, Apache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApache_LibPath(), theTypesPackage.getString(), "LibPath", null, 0, 1, Apache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApache_DefaultVhost(), theTypesPackage.getString(), "DefaultVhost", null, 0, 1, Apache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApache_VhostDir(), theTypesPackage.getString(), "VhostDir", null, 0, 1, Apache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pcEClass, mdcms.PC.class, "PC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPC_Processor(), theTypesPackage.getString(), "Processor", null, 0, 1, mdcms.PC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPC_Architecture(), theTypesPackage.getString(), "Architecture", null, 0, 1, mdcms.PC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPC_DiskType(), theTypesPackage.getString(), "DiskType", null, 0, 1, mdcms.PC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPC_DiskSpace(), theTypesPackage.getString(), "DiskSpace", null, 0, 1, mdcms.PC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPC_Ram(), theTypesPackage.getString(), "Ram", null, 0, 1, mdcms.PC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPC_Motherboard(), theTypesPackage.getString(), "Motherboard", null, 0, 1, mdcms.PC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPC_GraphicCard(), theTypesPackage.getString(), "GraphicCard", null, 0, 1, mdcms.PC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(physicalEClass, Physical.class, "Physical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysical_Base_Device(), theUMLPackage.getDevice(), null, "base_Device", null, 1, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_Location(), theTypesPackage.getString(), "Location", null, 0, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_IP(), theTypesPackage.getString(), "IP", null, 0, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_MAC(), theTypesPackage.getString(), "MAC", null, 0, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_Manufacturer(), theTypesPackage.getString(), "Manufacturer", null, 0, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_Model(), theTypesPackage.getString(), "Model", null, 0, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitch_Speed(), theTypesPackage.getString(), "Speed", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitch_PowerW(), theTypesPackage.getString(), "PowerW", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkDeviceEClass, NetworkDevice.class, "NetworkDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkDevice_Throughput(), theTypesPackage.getString(), "Throughput", null, 0, 1, NetworkDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNetworkDevice_Ports(), theTypesPackage.getInteger(), "Ports", null, 0, 1, NetworkDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouter_SO(), theTypesPackage.getString(), "SO", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRouter_FormFactor(), theTypesPackage.getString(), "FormFactor", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRouter_NetworkInterfaceSlots(), theTypesPackage.getInteger(), "NetworkInterfaceSlots", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRouter_ServiceModuleSlots(), theTypesPackage.getInteger(), "ServiceModuleSlots", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_Processor(), theTypesPackage.getString(), "Processor", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServer_Architecture(), theTypesPackage.getString(), "Architecture", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServer_DiskType(), theTypesPackage.getString(), "DiskType", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServer_DiskSpace(), theTypesPackage.getString(), "DiskSpace", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServer_Ram(), theTypesPackage.getString(), "Ram", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServer_Rack(), theTypesPackage.getString(), "Rack", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Name(), theTypesPackage.getString(), "Name", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatabase_User(), theTypesPackage.getString(), "User", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatabase_Password(), theTypesPackage.getString(), "Password", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatabase_Host(), theTypesPackage.getString(), "Host", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatabase_Port(), theTypesPackage.getString(), "Port", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Path(), theTypesPackage.getString(), "Path", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Ensure(), theTypesPackage.getString(), "Ensure", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Content(), theTypesPackage.getString(), "Content", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Backup(), theTypesPackage.getString(), "Backup", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Mode(), theTypesPackage.getString(), "Mode", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Group(), theTypesPackage.getString(), "Group", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Owner(), theTypesPackage.getString(), "Owner", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Replace(), theTypesPackage.getString(), "Replace", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Force(), theTypesPackage.getString(), "Force", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_CreationTime(), theTypesPackage.getString(), "CreationTime", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_ModificationTime(), theTypesPackage.getString(), "ModificationTime", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(registryEntryEClass, RegistryEntry.class, "RegistryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistryEntry_Path(), theTypesPackage.getString(), "Path", null, 0, 1, RegistryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRegistryEntry_Ensure(), theTypesPackage.getString(), "Ensure", null, 0, 1, RegistryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRegistryEntry_Type(), theTypesPackage.getString(), "Type", null, 0, 1, RegistryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRegistryEntry_Data(), theTypesPackage.getString(), "Data", null, 0, 1, RegistryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(freeFormEClass, FreeForm.class, "FreeForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeForm_Description(), theTypesPackage.getString(), "Description", null, 0, 1, FreeForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tomcatAppEClass, TomcatApp.class, "TomcatApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTomcatApp_Parameters(), theTypesPackage.getString(), "Parameters", null, 0, 1, TomcatApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTomcatApp_CatalinaHome(), theTypesPackage.getString(), "CatalinaHome", null, 0, 1, TomcatApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTomcatApp_CatalinaBase(), theTypesPackage.getString(), "CatalinaBase", null, 0, 1, TomcatApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTomcatApp_Address(), theTypesPackage.getString(), "Address", null, 0, 1, TomcatApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTomcatApp_Port(), theTypesPackage.getString(), "Port", null, 0, 1, TomcatApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTomcatApp_ServerConfig(), theTypesPackage.getString(), "ServerConfig", null, 0, 1, TomcatApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTomcatApp_ClassName(), theTypesPackage.getString(), "ClassName", null, 0, 1, TomcatApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTomcatApp_AdditionalAttributes(), theTypesPackage.getString(), "AdditionalAttributes", null, 0, 1, TomcatApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getTomcatApp__ConstraintTomcat__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ConstraintTomcat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(javaOracleEClass, JavaOracle.class, "JavaOracle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaOracle_VersionMajor(), theTypesPackage.getString(), "VersionMajor", null, 0, 1, JavaOracle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJavaOracle_VersionMinor(), theTypesPackage.getString(), "VersionMinor", null, 0, 1, JavaOracle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJavaOracle_JavaSE(), theTypesPackage.getString(), "JavaSE", null, 0, 1, JavaOracle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJavaOracle_OracleURL(), theTypesPackage.getString(), "OracleURL", null, 0, 1, JavaOracle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJavaOracle_ProxyServer(), theTypesPackage.getString(), "ProxyServer", null, 0, 1, JavaOracle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJavaOracle_ProxyType(), theTypesPackage.getString(), "ProxyType", null, 0, 1, JavaOracle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getJavaOracle__ConstraintHTTP__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ConstraintHTTP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(firewallRuleEClass, FirewallRule.class, "FirewallRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirewallRule_Name(), theTypesPackage.getString(), "Name", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_Action(), theTypesPackage.getString(), "Action", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_Protocol(), theTypesPackage.getString(), "Protocol", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_Source(), theTypesPackage.getString(), "Source", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_SourceRange(), theTypesPackage.getString(), "SourceRange", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_Destination(), theTypesPackage.getString(), "Destination", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_DestinationRange(), theTypesPackage.getString(), "DestinationRange", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_DestinationPort(), theTypesPackage.getString(), "DestinationPort", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_InputInterface(), theTypesPackage.getString(), "InputInterface", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_OutputInterface(), theTypesPackage.getString(), "OutputInterface", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_State(), theTypesPackage.getString(), "State", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_TCPFlags(), theTypesPackage.getString(), "TCPFlags", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFirewallRule_Provider(), theTypesPackage.getString(), "Provider", null, 0, 1, FirewallRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getFirewallRule__ConstraintFirewall__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ConstraintFirewall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(apacheVhostEClass, ApacheVhost.class, "ApacheVhost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApacheVhost_VhostName(), theTypesPackage.getString(), "VhostName", null, 0, 1, ApacheVhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApacheVhost_ServerName(), theTypesPackage.getString(), "ServerName", null, 0, 1, ApacheVhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApacheVhost_IP(), theTypesPackage.getString(), "IP", null, 0, 1, ApacheVhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApacheVhost_Port(), theTypesPackage.getString(), "Port", null, 0, 1, ApacheVhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApacheVhost_Docroot(), theTypesPackage.getString(), "Docroot", null, 0, 1, ApacheVhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApacheVhost_DocrootOwner(), theTypesPackage.getString(), "DocrootOwner", null, 0, 1, ApacheVhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApacheVhost_DocrootGroup(), theTypesPackage.getString(), "DocrootGroup", null, 0, 1, ApacheVhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApacheVhost_SSL(), theTypesPackage.getBoolean(), "SSL", null, 0, 1, ApacheVhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApacheVhost_ServerAliases(), theTypesPackage.getString(), "ServerAliases", null, 0, -1, ApacheVhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getApacheVhost__ConstrainApache__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ConstrainApache", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mySQLDBEClass, MySQLDB.class, "MySQLDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMySQLDB_Charset(), theTypesPackage.getString(), "Charset", null, 0, 1, MySQLDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMySQLDB__ConstraintMySQL__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ConstraintMySQL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(psqldbEClass, mdcms.PSQLDB.class, "PSQLDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSQLDB_Template(), theTypesPackage.getString(), "Template", null, 0, 1, mdcms.PSQLDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPSQLDB_Owner(), theTypesPackage.getString(), "Owner", null, 0, 1, mdcms.PSQLDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPSQLDB__ConstraintPSQL__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ConstraintPSQL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(peripheralEClass, Peripheral.class, "Peripheral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeripheral_Type(), theTypesPackage.getString(), "Type", null, 0, 1, Peripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (getSwitch_PowerW(),
		   source,
		   new String[] {
			   "originalName", "Power(W)"
		   });
	}

} //MdcmsPackageImpl
