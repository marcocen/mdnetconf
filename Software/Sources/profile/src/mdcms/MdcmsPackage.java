/**
 */
package mdcms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mdcms.MdcmsFactory
 * @model kind="package"
 * @generated
 */
public interface MdcmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mdcms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fing.edu.uy/mdcms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mdcms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdcmsPackage eINSTANCE = mdcms.impl.MdcmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link mdcms.impl.LogicalImpl <em>Logical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.LogicalImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getLogical()
	 * @generated
	 */
	int LOGICAL = 1;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL__BASE_EXECUTION_ENVIRONMENT = 0;

	/**
	 * The number of structural features of the '<em>Logical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.RuntimeImpl <em>Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.RuntimeImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getRuntime()
	 * @generated
	 */
	int RUNTIME = 0;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__BASE_EXECUTION_ENVIRONMENT = LOGICAL__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FEATURE_COUNT = LOGICAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_OPERATION_COUNT = LOGICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.DBEngineImpl <em>DB Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.DBEngineImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getDBEngine()
	 * @generated
	 */
	int DB_ENGINE = 3;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ENGINE__BASE_EXECUTION_ENVIRONMENT = LOGICAL__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>DB Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ENGINE_FEATURE_COUNT = LOGICAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DB Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ENGINE_OPERATION_COUNT = LOGICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.MySQLImpl <em>My SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.MySQLImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getMySQL()
	 * @generated
	 */
	int MY_SQL = 2;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL__BASE_EXECUTION_ENVIRONMENT = DB_ENGINE__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL__PACKAGE_NAME = DB_ENGINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL__PACKAGE_VERSION = DB_ENGINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL__ROOT_PASSWORD = DB_ENGINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Install Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL__INSTALL_OPTIONS = DB_ENGINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>My SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL_FEATURE_COUNT = DB_ENGINE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>My SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL_OPERATION_COUNT = DB_ENGINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.JavaImpl <em>Java</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.JavaImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getJava()
	 * @generated
	 */
	int JAVA = 4;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__BASE_EXECUTION_ENVIRONMENT = RUNTIME__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__DISTRIBUTION = RUNTIME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__PACKAGE = RUNTIME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__VERSION = RUNTIME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FEATURE_COUNT = RUNTIME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATION_COUNT = RUNTIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.FirewallImpl <em>Firewall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.FirewallImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getFirewall()
	 * @generated
	 */
	int FIREWALL = 5;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL__BASE_EXECUTION_ENVIRONMENT = LOGICAL__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL__SERVICE_NAME = LOGICAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL__PACKAGE_NAME = LOGICAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Firewall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_FEATURE_COUNT = LOGICAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Firewall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_OPERATION_COUNT = LOGICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.FirmwareImpl <em>Firmware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.FirmwareImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getFirmware()
	 * @generated
	 */
	int FIRMWARE = 6;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE__BASE_EXECUTION_ENVIRONMENT = LOGICAL__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE__TYPE = LOGICAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE__VERSION = LOGICAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Firmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_FEATURE_COUNT = LOGICAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Firmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_OPERATION_COUNT = LOGICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.HTTPServerImpl <em>HTTP Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.HTTPServerImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getHTTPServer()
	 * @generated
	 */
	int HTTP_SERVER = 7;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_SERVER__BASE_EXECUTION_ENVIRONMENT = LOGICAL__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>HTTP Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_SERVER_FEATURE_COUNT = LOGICAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HTTP Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_SERVER_OPERATION_COUNT = LOGICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.PostgreSQLImpl <em>Postgre SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.PostgreSQLImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getPostgreSQL()
	 * @generated
	 */
	int POSTGRE_SQL = 8;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL__BASE_EXECUTION_ENVIRONMENT = DB_ENGINE__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL__VERSION = DB_ENGINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL__ENCODING = DB_ENGINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL__LOCALE = DB_ENGINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Postgre SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_FEATURE_COUNT = DB_ENGINE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Postgre SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_OPERATION_COUNT = DB_ENGINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.ApplicationServerImpl <em>Application Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.ApplicationServerImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getApplicationServer()
	 * @generated
	 */
	int APPLICATION_SERVER = 9;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVER__BASE_EXECUTION_ENVIRONMENT = LOGICAL__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Application Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVER_FEATURE_COUNT = LOGICAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVER_OPERATION_COUNT = LOGICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.OperatingSystemImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__BASE_EXECUTION_ENVIRONMENT = LOGICAL__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__DISTRIBUTION = LOGICAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__VERSION = LOGICAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__ARCHITECTURE = LOGICAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = LOGICAL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_OPERATION_COUNT = LOGICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.TomcatImpl <em>Tomcat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.TomcatImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getTomcat()
	 * @generated
	 */
	int TOMCAT = 11;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT__BASE_EXECUTION_ENVIRONMENT = APPLICATION_SERVER__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Install Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT__INSTALL_DIR = APPLICATION_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT__SOURCE_URL = APPLICATION_SERVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tomcat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_FEATURE_COUNT = APPLICATION_SERVER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tomcat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_OPERATION_COUNT = APPLICATION_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.ApacheImpl <em>Apache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.ApacheImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getApache()
	 * @generated
	 */
	int APACHE = 12;

	/**
	 * The feature id for the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE__BASE_EXECUTION_ENVIRONMENT = HTTP_SERVER__BASE_EXECUTION_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE__VERSION = HTTP_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE__SERVER_NAME = HTTP_SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE__CONFIG_DIR = HTTP_SERVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Docroot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE__DOCROOT = HTTP_SERVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logroot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE__LOGROOT = HTTP_SERVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lib Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE__LIB_PATH = HTTP_SERVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Vhost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE__DEFAULT_VHOST = HTTP_SERVER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vhost Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE__VHOST_DIR = HTTP_SERVER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Apache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_FEATURE_COUNT = HTTP_SERVER_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Apache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_OPERATION_COUNT = HTTP_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.PhysicalImpl <em>Physical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.PhysicalImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getPhysical()
	 * @generated
	 */
	int PHYSICAL = 14;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__BASE_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__IP = 2;

	/**
	 * The feature id for the '<em><b>MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__MAC = 3;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__MANUFACTURER = 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__MODEL = 5;

	/**
	 * The number of structural features of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.PCImpl <em>PC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.PCImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getPC()
	 * @generated
	 */
	int PC = 13;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__BASE_DEVICE = PHYSICAL__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__LOCATION = PHYSICAL__LOCATION;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__IP = PHYSICAL__IP;

	/**
	 * The feature id for the '<em><b>MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__MAC = PHYSICAL__MAC;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__MANUFACTURER = PHYSICAL__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__MODEL = PHYSICAL__MODEL;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__PROCESSOR = PHYSICAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__ARCHITECTURE = PHYSICAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disk Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__DISK_TYPE = PHYSICAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disk Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__DISK_SPACE = PHYSICAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__RAM = PHYSICAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Motherboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__MOTHERBOARD = PHYSICAL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Graphic Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__GRAPHIC_CARD = PHYSICAL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_FEATURE_COUNT = PHYSICAL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_OPERATION_COUNT = PHYSICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.NetworkDeviceImpl <em>Network Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.NetworkDeviceImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getNetworkDevice()
	 * @generated
	 */
	int NETWORK_DEVICE = 16;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__BASE_DEVICE = PHYSICAL__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__LOCATION = PHYSICAL__LOCATION;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__IP = PHYSICAL__IP;

	/**
	 * The feature id for the '<em><b>MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__MAC = PHYSICAL__MAC;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__MANUFACTURER = PHYSICAL__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__MODEL = PHYSICAL__MODEL;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__THROUGHPUT = PHYSICAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__PORTS = PHYSICAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Network Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE_FEATURE_COUNT = PHYSICAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Network Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE_OPERATION_COUNT = PHYSICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.SwitchImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 15;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__BASE_DEVICE = NETWORK_DEVICE__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__LOCATION = NETWORK_DEVICE__LOCATION;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__IP = NETWORK_DEVICE__IP;

	/**
	 * The feature id for the '<em><b>MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MAC = NETWORK_DEVICE__MAC;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MANUFACTURER = NETWORK_DEVICE__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MODEL = NETWORK_DEVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__THROUGHPUT = NETWORK_DEVICE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PORTS = NETWORK_DEVICE__PORTS;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SPEED = NETWORK_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__POWER_W = NETWORK_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = NETWORK_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = NETWORK_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.RouterImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 17;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__BASE_DEVICE = NETWORK_DEVICE__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__LOCATION = NETWORK_DEVICE__LOCATION;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__IP = NETWORK_DEVICE__IP;

	/**
	 * The feature id for the '<em><b>MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MAC = NETWORK_DEVICE__MAC;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MANUFACTURER = NETWORK_DEVICE__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MODEL = NETWORK_DEVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__THROUGHPUT = NETWORK_DEVICE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__PORTS = NETWORK_DEVICE__PORTS;

	/**
	 * The feature id for the '<em><b>SO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__SO = NETWORK_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Form Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__FORM_FACTOR = NETWORK_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Network Interface Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NETWORK_INTERFACE_SLOTS = NETWORK_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Module Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__SERVICE_MODULE_SLOTS = NETWORK_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = NETWORK_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = NETWORK_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.ServerImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 18;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__BASE_DEVICE = PHYSICAL__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__LOCATION = PHYSICAL__LOCATION;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__IP = PHYSICAL__IP;

	/**
	 * The feature id for the '<em><b>MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MAC = PHYSICAL__MAC;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MANUFACTURER = PHYSICAL__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MODEL = PHYSICAL__MODEL;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PROCESSOR = PHYSICAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ARCHITECTURE = PHYSICAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disk Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DISK_TYPE = PHYSICAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disk Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DISK_SPACE = PHYSICAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__RAM = PHYSICAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__RACK = PHYSICAL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = PHYSICAL_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = PHYSICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.ConfigurationImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 20;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BASE_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.DatabaseImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 19;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__BASE_ARTIFACT = CONFIGURATION__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USER = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PASSWORD = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__HOST = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORT = CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.FileImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 21;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__BASE_ARTIFACT = CONFIGURATION__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ensure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ENSURE = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTENT = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Backup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__BACKUP = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MODE = CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__GROUP = CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNER = CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__REPLACE = CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FORCE = CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CREATION_TIME = CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MODIFICATION_TIME = CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.RegistryEntryImpl <em>Registry Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.RegistryEntryImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getRegistryEntry()
	 * @generated
	 */
	int REGISTRY_ENTRY = 22;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY__BASE_ARTIFACT = CONFIGURATION__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY__PATH = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ensure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY__ENSURE = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY__TYPE = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY__DATA = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Registry Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Registry Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_ENTRY_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.FreeFormImpl <em>Free Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.FreeFormImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getFreeForm()
	 * @generated
	 */
	int FREE_FORM = 23;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_FORM__BASE_ARTIFACT = CONFIGURATION__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_FORM__DESCRIPTION = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Free Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_FORM_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Free Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_FORM_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdcms.impl.TomcatAppImpl <em>Tomcat App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.TomcatAppImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getTomcatApp()
	 * @generated
	 */
	int TOMCAT_APP = 24;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP__BASE_ARTIFACT = CONFIGURATION__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP__PARAMETERS = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catalina Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP__CATALINA_HOME = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catalina Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP__CATALINA_BASE = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP__ADDRESS = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP__PORT = CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Server Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP__SERVER_CONFIG = CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP__CLASS_NAME = CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Additional Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP__ADDITIONAL_ATTRIBUTES = CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tomcat App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Constraint Tomcat</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP___CONSTRAINT_TOMCAT__DIAGNOSTICCHAIN_MAP = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tomcat App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMCAT_APP_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdcms.impl.JavaOracleImpl <em>Java Oracle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.JavaOracleImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getJavaOracle()
	 * @generated
	 */
	int JAVA_ORACLE = 25;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE__BASE_ARTIFACT = CONFIGURATION__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Version Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE__VERSION_MAJOR = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE__VERSION_MINOR = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Java SE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE__JAVA_SE = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Oracle URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE__ORACLE_URL = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Proxy Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE__PROXY_SERVER = CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Proxy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE__PROXY_TYPE = CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Java Oracle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Constraint HTTP</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE___CONSTRAINT_HTTP__DIAGNOSTICCHAIN_MAP = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Java Oracle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ORACLE_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdcms.impl.FirewallRuleImpl <em>Firewall Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.FirewallRuleImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getFirewallRule()
	 * @generated
	 */
	int FIREWALL_RULE = 26;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__BASE_ARTIFACT = CONFIGURATION__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__NAME = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__ACTION = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__PROTOCOL = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__SOURCE = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__SOURCE_RANGE = CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__DESTINATION = CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Destination Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__DESTINATION_RANGE = CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Destination Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__DESTINATION_PORT = CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Input Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__INPUT_INTERFACE = CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Output Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__OUTPUT_INTERFACE = CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__STATE = CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>TCP Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__TCP_FLAGS = CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__PROVIDER = CONFIGURATION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Firewall Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Constraint Firewall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE___CONSTRAINT_FIREWALL__DIAGNOSTICCHAIN_MAP = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Firewall Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdcms.impl.ApacheVhostImpl <em>Apache Vhost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.ApacheVhostImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getApacheVhost()
	 * @generated
	 */
	int APACHE_VHOST = 27;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__BASE_ARTIFACT = CONFIGURATION__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Vhost Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__VHOST_NAME = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__SERVER_NAME = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__IP = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__PORT = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Docroot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__DOCROOT = CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Docroot Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__DOCROOT_OWNER = CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Docroot Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__DOCROOT_GROUP = CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>SSL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__SSL = CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Server Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST__SERVER_ALIASES = CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Apache Vhost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Constrain Apache</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST___CONSTRAIN_APACHE__DIAGNOSTICCHAIN_MAP = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apache Vhost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_VHOST_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdcms.impl.MySQLDBImpl <em>My SQLDB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.MySQLDBImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getMySQLDB()
	 * @generated
	 */
	int MY_SQLDB = 28;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB__BASE_ARTIFACT = DATABASE__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB__USER = DATABASE__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB__PASSWORD = DATABASE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB__HOST = DATABASE__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB__PORT = DATABASE__PORT;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB__CHARSET = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My SQLDB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Constraint My SQL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB___CONSTRAINT_MY_SQL__DIAGNOSTICCHAIN_MAP = DATABASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>My SQLDB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQLDB_OPERATION_COUNT = DATABASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdcms.impl.PSQLDBImpl <em>PSQLDB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.PSQLDBImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getPSQLDB()
	 * @generated
	 */
	int PSQLDB = 29;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB__BASE_ARTIFACT = DATABASE__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB__USER = DATABASE__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB__PASSWORD = DATABASE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB__HOST = DATABASE__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB__PORT = DATABASE__PORT;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB__TEMPLATE = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB__OWNER = DATABASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PSQLDB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Constraint PSQL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB___CONSTRAINT_PSQL__DIAGNOSTICCHAIN_MAP = DATABASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>PSQLDB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSQLDB_OPERATION_COUNT = DATABASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdcms.impl.PeripheralImpl <em>Peripheral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdcms.impl.PeripheralImpl
	 * @see mdcms.impl.MdcmsPackageImpl#getPeripheral()
	 * @generated
	 */
	int PERIPHERAL = 30;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__BASE_DEVICE = PHYSICAL__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__LOCATION = PHYSICAL__LOCATION;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__IP = PHYSICAL__IP;

	/**
	 * The feature id for the '<em><b>MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__MAC = PHYSICAL__MAC;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__MANUFACTURER = PHYSICAL__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__MODEL = PHYSICAL__MODEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__TYPE = PHYSICAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Peripheral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL_FEATURE_COUNT = PHYSICAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Peripheral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL_OPERATION_COUNT = PHYSICAL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link mdcms.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime</em>'.
	 * @see mdcms.Runtime
	 * @generated
	 */
	EClass getRuntime();

	/**
	 * Returns the meta object for class '{@link mdcms.Logical <em>Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical</em>'.
	 * @see mdcms.Logical
	 * @generated
	 */
	EClass getLogical();

	/**
	 * Returns the meta object for the reference '{@link mdcms.Logical#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Execution Environment</em>'.
	 * @see mdcms.Logical#getBase_ExecutionEnvironment()
	 * @see #getLogical()
	 * @generated
	 */
	EReference getLogical_Base_ExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link mdcms.MySQL <em>My SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My SQL</em>'.
	 * @see mdcms.MySQL
	 * @generated
	 */
	EClass getMySQL();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.MySQL#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see mdcms.MySQL#getPackageName()
	 * @see #getMySQL()
	 * @generated
	 */
	EAttribute getMySQL_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.MySQL#getPackageVersion <em>Package Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Version</em>'.
	 * @see mdcms.MySQL#getPackageVersion()
	 * @see #getMySQL()
	 * @generated
	 */
	EAttribute getMySQL_PackageVersion();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.MySQL#getRootPassword <em>Root Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Password</em>'.
	 * @see mdcms.MySQL#getRootPassword()
	 * @see #getMySQL()
	 * @generated
	 */
	EAttribute getMySQL_RootPassword();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.MySQL#getInstallOptions <em>Install Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install Options</em>'.
	 * @see mdcms.MySQL#getInstallOptions()
	 * @see #getMySQL()
	 * @generated
	 */
	EAttribute getMySQL_InstallOptions();

	/**
	 * Returns the meta object for class '{@link mdcms.DBEngine <em>DB Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Engine</em>'.
	 * @see mdcms.DBEngine
	 * @generated
	 */
	EClass getDBEngine();

	/**
	 * Returns the meta object for class '{@link mdcms.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java</em>'.
	 * @see mdcms.Java
	 * @generated
	 */
	EClass getJava();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Java#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see mdcms.Java#getDistribution()
	 * @see #getJava()
	 * @generated
	 */
	EAttribute getJava_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Java#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see mdcms.Java#getPackage()
	 * @see #getJava()
	 * @generated
	 */
	EAttribute getJava_Package();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Java#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mdcms.Java#getVersion()
	 * @see #getJava()
	 * @generated
	 */
	EAttribute getJava_Version();

	/**
	 * Returns the meta object for class '{@link mdcms.Firewall <em>Firewall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firewall</em>'.
	 * @see mdcms.Firewall
	 * @generated
	 */
	EClass getFirewall();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Firewall#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see mdcms.Firewall#getServiceName()
	 * @see #getFirewall()
	 * @generated
	 */
	EAttribute getFirewall_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Firewall#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see mdcms.Firewall#getPackageName()
	 * @see #getFirewall()
	 * @generated
	 */
	EAttribute getFirewall_PackageName();

	/**
	 * Returns the meta object for class '{@link mdcms.Firmware <em>Firmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmware</em>'.
	 * @see mdcms.Firmware
	 * @generated
	 */
	EClass getFirmware();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Firmware#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mdcms.Firmware#getType()
	 * @see #getFirmware()
	 * @generated
	 */
	EAttribute getFirmware_Type();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Firmware#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mdcms.Firmware#getVersion()
	 * @see #getFirmware()
	 * @generated
	 */
	EAttribute getFirmware_Version();

	/**
	 * Returns the meta object for class '{@link mdcms.HTTPServer <em>HTTP Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Server</em>'.
	 * @see mdcms.HTTPServer
	 * @generated
	 */
	EClass getHTTPServer();

	/**
	 * Returns the meta object for class '{@link mdcms.PostgreSQL <em>Postgre SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postgre SQL</em>'.
	 * @see mdcms.PostgreSQL
	 * @generated
	 */
	EClass getPostgreSQL();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PostgreSQL#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mdcms.PostgreSQL#getVersion()
	 * @see #getPostgreSQL()
	 * @generated
	 */
	EAttribute getPostgreSQL_Version();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PostgreSQL#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see mdcms.PostgreSQL#getEncoding()
	 * @see #getPostgreSQL()
	 * @generated
	 */
	EAttribute getPostgreSQL_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PostgreSQL#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see mdcms.PostgreSQL#getLocale()
	 * @see #getPostgreSQL()
	 * @generated
	 */
	EAttribute getPostgreSQL_Locale();

	/**
	 * Returns the meta object for class '{@link mdcms.ApplicationServer <em>Application Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Server</em>'.
	 * @see mdcms.ApplicationServer
	 * @generated
	 */
	EClass getApplicationServer();

	/**
	 * Returns the meta object for class '{@link mdcms.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see mdcms.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.OperatingSystem#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see mdcms.OperatingSystem#getDistribution()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.OperatingSystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mdcms.OperatingSystem#getVersion()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Version();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.OperatingSystem#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see mdcms.OperatingSystem#getArchitecture()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Architecture();

	/**
	 * Returns the meta object for class '{@link mdcms.Tomcat <em>Tomcat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tomcat</em>'.
	 * @see mdcms.Tomcat
	 * @generated
	 */
	EClass getTomcat();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Tomcat#getInstallDir <em>Install Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install Dir</em>'.
	 * @see mdcms.Tomcat#getInstallDir()
	 * @see #getTomcat()
	 * @generated
	 */
	EAttribute getTomcat_InstallDir();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Tomcat#getSourceURL <em>Source URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source URL</em>'.
	 * @see mdcms.Tomcat#getSourceURL()
	 * @see #getTomcat()
	 * @generated
	 */
	EAttribute getTomcat_SourceURL();

	/**
	 * Returns the meta object for class '{@link mdcms.Apache <em>Apache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apache</em>'.
	 * @see mdcms.Apache
	 * @generated
	 */
	EClass getApache();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Apache#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mdcms.Apache#getVersion()
	 * @see #getApache()
	 * @generated
	 */
	EAttribute getApache_Version();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Apache#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see mdcms.Apache#getServerName()
	 * @see #getApache()
	 * @generated
	 */
	EAttribute getApache_ServerName();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Apache#getConfigDir <em>Config Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Dir</em>'.
	 * @see mdcms.Apache#getConfigDir()
	 * @see #getApache()
	 * @generated
	 */
	EAttribute getApache_ConfigDir();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Apache#getDocroot <em>Docroot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docroot</em>'.
	 * @see mdcms.Apache#getDocroot()
	 * @see #getApache()
	 * @generated
	 */
	EAttribute getApache_Docroot();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Apache#getLogroot <em>Logroot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logroot</em>'.
	 * @see mdcms.Apache#getLogroot()
	 * @see #getApache()
	 * @generated
	 */
	EAttribute getApache_Logroot();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Apache#getLibPath <em>Lib Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lib Path</em>'.
	 * @see mdcms.Apache#getLibPath()
	 * @see #getApache()
	 * @generated
	 */
	EAttribute getApache_LibPath();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Apache#getDefaultVhost <em>Default Vhost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Vhost</em>'.
	 * @see mdcms.Apache#getDefaultVhost()
	 * @see #getApache()
	 * @generated
	 */
	EAttribute getApache_DefaultVhost();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Apache#getVhostDir <em>Vhost Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vhost Dir</em>'.
	 * @see mdcms.Apache#getVhostDir()
	 * @see #getApache()
	 * @generated
	 */
	EAttribute getApache_VhostDir();

	/**
	 * Returns the meta object for class '{@link mdcms.PC <em>PC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PC</em>'.
	 * @see mdcms.PC
	 * @generated
	 */
	EClass getPC();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PC#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor</em>'.
	 * @see mdcms.PC#getProcessor()
	 * @see #getPC()
	 * @generated
	 */
	EAttribute getPC_Processor();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PC#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see mdcms.PC#getArchitecture()
	 * @see #getPC()
	 * @generated
	 */
	EAttribute getPC_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PC#getDiskType <em>Disk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Type</em>'.
	 * @see mdcms.PC#getDiskType()
	 * @see #getPC()
	 * @generated
	 */
	EAttribute getPC_DiskType();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PC#getDiskSpace <em>Disk Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Space</em>'.
	 * @see mdcms.PC#getDiskSpace()
	 * @see #getPC()
	 * @generated
	 */
	EAttribute getPC_DiskSpace();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PC#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram</em>'.
	 * @see mdcms.PC#getRam()
	 * @see #getPC()
	 * @generated
	 */
	EAttribute getPC_Ram();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PC#getMotherboard <em>Motherboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motherboard</em>'.
	 * @see mdcms.PC#getMotherboard()
	 * @see #getPC()
	 * @generated
	 */
	EAttribute getPC_Motherboard();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PC#getGraphicCard <em>Graphic Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphic Card</em>'.
	 * @see mdcms.PC#getGraphicCard()
	 * @see #getPC()
	 * @generated
	 */
	EAttribute getPC_GraphicCard();

	/**
	 * Returns the meta object for class '{@link mdcms.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical</em>'.
	 * @see mdcms.Physical
	 * @generated
	 */
	EClass getPhysical();

	/**
	 * Returns the meta object for the reference '{@link mdcms.Physical#getBase_Device <em>Base Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Device</em>'.
	 * @see mdcms.Physical#getBase_Device()
	 * @see #getPhysical()
	 * @generated
	 */
	EReference getPhysical_Base_Device();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Physical#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see mdcms.Physical#getLocation()
	 * @see #getPhysical()
	 * @generated
	 */
	EAttribute getPhysical_Location();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Physical#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see mdcms.Physical#getIP()
	 * @see #getPhysical()
	 * @generated
	 */
	EAttribute getPhysical_IP();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Physical#getMAC <em>MAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAC</em>'.
	 * @see mdcms.Physical#getMAC()
	 * @see #getPhysical()
	 * @generated
	 */
	EAttribute getPhysical_MAC();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Physical#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see mdcms.Physical#getManufacturer()
	 * @see #getPhysical()
	 * @generated
	 */
	EAttribute getPhysical_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Physical#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see mdcms.Physical#getModel()
	 * @see #getPhysical()
	 * @generated
	 */
	EAttribute getPhysical_Model();

	/**
	 * Returns the meta object for class '{@link mdcms.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see mdcms.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Switch#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see mdcms.Switch#getSpeed()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_Speed();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Switch#getPowerW <em>Power W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power W</em>'.
	 * @see mdcms.Switch#getPowerW()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_PowerW();

	/**
	 * Returns the meta object for class '{@link mdcms.NetworkDevice <em>Network Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Device</em>'.
	 * @see mdcms.NetworkDevice
	 * @generated
	 */
	EClass getNetworkDevice();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.NetworkDevice#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see mdcms.NetworkDevice#getThroughput()
	 * @see #getNetworkDevice()
	 * @generated
	 */
	EAttribute getNetworkDevice_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.NetworkDevice#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ports</em>'.
	 * @see mdcms.NetworkDevice#getPorts()
	 * @see #getNetworkDevice()
	 * @generated
	 */
	EAttribute getNetworkDevice_Ports();

	/**
	 * Returns the meta object for class '{@link mdcms.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see mdcms.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Router#getSO <em>SO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SO</em>'.
	 * @see mdcms.Router#getSO()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_SO();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Router#getFormFactor <em>Form Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Factor</em>'.
	 * @see mdcms.Router#getFormFactor()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_FormFactor();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Router#getNetworkInterfaceSlots <em>Network Interface Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Interface Slots</em>'.
	 * @see mdcms.Router#getNetworkInterfaceSlots()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_NetworkInterfaceSlots();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Router#getServiceModuleSlots <em>Service Module Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Module Slots</em>'.
	 * @see mdcms.Router#getServiceModuleSlots()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_ServiceModuleSlots();

	/**
	 * Returns the meta object for class '{@link mdcms.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see mdcms.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Server#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor</em>'.
	 * @see mdcms.Server#getProcessor()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Processor();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Server#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see mdcms.Server#getArchitecture()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Server#getDiskType <em>Disk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Type</em>'.
	 * @see mdcms.Server#getDiskType()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_DiskType();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Server#getDiskSpace <em>Disk Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Space</em>'.
	 * @see mdcms.Server#getDiskSpace()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_DiskSpace();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Server#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram</em>'.
	 * @see mdcms.Server#getRam()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Ram();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Server#getRack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rack</em>'.
	 * @see mdcms.Server#getRack()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Rack();

	/**
	 * Returns the meta object for class '{@link mdcms.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see mdcms.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdcms.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Database#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see mdcms.Database#getUser()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_User();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Database#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see mdcms.Database#getPassword()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Password();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Database#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see mdcms.Database#getHost()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Host();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Database#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see mdcms.Database#getPort()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Port();

	/**
	 * Returns the meta object for class '{@link mdcms.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see mdcms.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference '{@link mdcms.Configuration#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see mdcms.Configuration#getBase_Artifact()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link mdcms.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see mdcms.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see mdcms.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getEnsure <em>Ensure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ensure</em>'.
	 * @see mdcms.File#getEnsure()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Ensure();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see mdcms.File#getContent()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Content();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getBackup <em>Backup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backup</em>'.
	 * @see mdcms.File#getBackup()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Backup();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see mdcms.File#getMode()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Mode();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see mdcms.File#getGroup()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Group();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see mdcms.File#getOwner()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Owner();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace</em>'.
	 * @see mdcms.File#getReplace()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Replace();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getForce <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force</em>'.
	 * @see mdcms.File#getForce()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Force();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see mdcms.File#getCreationTime()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.File#getModificationTime <em>Modification Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Time</em>'.
	 * @see mdcms.File#getModificationTime()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_ModificationTime();

	/**
	 * Returns the meta object for class '{@link mdcms.RegistryEntry <em>Registry Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Entry</em>'.
	 * @see mdcms.RegistryEntry
	 * @generated
	 */
	EClass getRegistryEntry();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.RegistryEntry#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see mdcms.RegistryEntry#getPath()
	 * @see #getRegistryEntry()
	 * @generated
	 */
	EAttribute getRegistryEntry_Path();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.RegistryEntry#getEnsure <em>Ensure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ensure</em>'.
	 * @see mdcms.RegistryEntry#getEnsure()
	 * @see #getRegistryEntry()
	 * @generated
	 */
	EAttribute getRegistryEntry_Ensure();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.RegistryEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mdcms.RegistryEntry#getType()
	 * @see #getRegistryEntry()
	 * @generated
	 */
	EAttribute getRegistryEntry_Type();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.RegistryEntry#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see mdcms.RegistryEntry#getData()
	 * @see #getRegistryEntry()
	 * @generated
	 */
	EAttribute getRegistryEntry_Data();

	/**
	 * Returns the meta object for class '{@link mdcms.FreeForm <em>Free Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Form</em>'.
	 * @see mdcms.FreeForm
	 * @generated
	 */
	EClass getFreeForm();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FreeForm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mdcms.FreeForm#getDescription()
	 * @see #getFreeForm()
	 * @generated
	 */
	EAttribute getFreeForm_Description();

	/**
	 * Returns the meta object for class '{@link mdcms.TomcatApp <em>Tomcat App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tomcat App</em>'.
	 * @see mdcms.TomcatApp
	 * @generated
	 */
	EClass getTomcatApp();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.TomcatApp#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see mdcms.TomcatApp#getParameters()
	 * @see #getTomcatApp()
	 * @generated
	 */
	EAttribute getTomcatApp_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.TomcatApp#getCatalinaHome <em>Catalina Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalina Home</em>'.
	 * @see mdcms.TomcatApp#getCatalinaHome()
	 * @see #getTomcatApp()
	 * @generated
	 */
	EAttribute getTomcatApp_CatalinaHome();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.TomcatApp#getCatalinaBase <em>Catalina Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalina Base</em>'.
	 * @see mdcms.TomcatApp#getCatalinaBase()
	 * @see #getTomcatApp()
	 * @generated
	 */
	EAttribute getTomcatApp_CatalinaBase();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.TomcatApp#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see mdcms.TomcatApp#getAddress()
	 * @see #getTomcatApp()
	 * @generated
	 */
	EAttribute getTomcatApp_Address();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.TomcatApp#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see mdcms.TomcatApp#getPort()
	 * @see #getTomcatApp()
	 * @generated
	 */
	EAttribute getTomcatApp_Port();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.TomcatApp#getServerConfig <em>Server Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Config</em>'.
	 * @see mdcms.TomcatApp#getServerConfig()
	 * @see #getTomcatApp()
	 * @generated
	 */
	EAttribute getTomcatApp_ServerConfig();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.TomcatApp#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see mdcms.TomcatApp#getClassName()
	 * @see #getTomcatApp()
	 * @generated
	 */
	EAttribute getTomcatApp_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.TomcatApp#getAdditionalAttributes <em>Additional Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Attributes</em>'.
	 * @see mdcms.TomcatApp#getAdditionalAttributes()
	 * @see #getTomcatApp()
	 * @generated
	 */
	EAttribute getTomcatApp_AdditionalAttributes();

	/**
	 * Returns the meta object for the '{@link mdcms.TomcatApp#ConstraintTomcat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint Tomcat</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint Tomcat</em>' operation.
	 * @see mdcms.TomcatApp#ConstraintTomcat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTomcatApp__ConstraintTomcat__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdcms.JavaOracle <em>Java Oracle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Oracle</em>'.
	 * @see mdcms.JavaOracle
	 * @generated
	 */
	EClass getJavaOracle();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.JavaOracle#getVersionMajor <em>Version Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Major</em>'.
	 * @see mdcms.JavaOracle#getVersionMajor()
	 * @see #getJavaOracle()
	 * @generated
	 */
	EAttribute getJavaOracle_VersionMajor();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.JavaOracle#getVersionMinor <em>Version Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Minor</em>'.
	 * @see mdcms.JavaOracle#getVersionMinor()
	 * @see #getJavaOracle()
	 * @generated
	 */
	EAttribute getJavaOracle_VersionMinor();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.JavaOracle#getJavaSE <em>Java SE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java SE</em>'.
	 * @see mdcms.JavaOracle#getJavaSE()
	 * @see #getJavaOracle()
	 * @generated
	 */
	EAttribute getJavaOracle_JavaSE();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.JavaOracle#getOracleURL <em>Oracle URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oracle URL</em>'.
	 * @see mdcms.JavaOracle#getOracleURL()
	 * @see #getJavaOracle()
	 * @generated
	 */
	EAttribute getJavaOracle_OracleURL();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.JavaOracle#getProxyServer <em>Proxy Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Server</em>'.
	 * @see mdcms.JavaOracle#getProxyServer()
	 * @see #getJavaOracle()
	 * @generated
	 */
	EAttribute getJavaOracle_ProxyServer();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.JavaOracle#getProxyType <em>Proxy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Type</em>'.
	 * @see mdcms.JavaOracle#getProxyType()
	 * @see #getJavaOracle()
	 * @generated
	 */
	EAttribute getJavaOracle_ProxyType();

	/**
	 * Returns the meta object for the '{@link mdcms.JavaOracle#ConstraintHTTP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint HTTP</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint HTTP</em>' operation.
	 * @see mdcms.JavaOracle#ConstraintHTTP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJavaOracle__ConstraintHTTP__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdcms.FirewallRule <em>Firewall Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firewall Rule</em>'.
	 * @see mdcms.FirewallRule
	 * @generated
	 */
	EClass getFirewallRule();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdcms.FirewallRule#getName()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see mdcms.FirewallRule#getAction()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_Action();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see mdcms.FirewallRule#getProtocol()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see mdcms.FirewallRule#getSource()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_Source();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getSourceRange <em>Source Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Range</em>'.
	 * @see mdcms.FirewallRule#getSourceRange()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_SourceRange();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see mdcms.FirewallRule#getDestination()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_Destination();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getDestinationRange <em>Destination Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Range</em>'.
	 * @see mdcms.FirewallRule#getDestinationRange()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_DestinationRange();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getDestinationPort <em>Destination Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Port</em>'.
	 * @see mdcms.FirewallRule#getDestinationPort()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_DestinationPort();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getInputInterface <em>Input Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Interface</em>'.
	 * @see mdcms.FirewallRule#getInputInterface()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_InputInterface();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getOutputInterface <em>Output Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Interface</em>'.
	 * @see mdcms.FirewallRule#getOutputInterface()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_OutputInterface();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see mdcms.FirewallRule#getState()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_State();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getTCPFlags <em>TCP Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TCP Flags</em>'.
	 * @see mdcms.FirewallRule#getTCPFlags()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_TCPFlags();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.FirewallRule#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see mdcms.FirewallRule#getProvider()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_Provider();

	/**
	 * Returns the meta object for the '{@link mdcms.FirewallRule#ConstraintFirewall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint Firewall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint Firewall</em>' operation.
	 * @see mdcms.FirewallRule#ConstraintFirewall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFirewallRule__ConstraintFirewall__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdcms.ApacheVhost <em>Apache Vhost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apache Vhost</em>'.
	 * @see mdcms.ApacheVhost
	 * @generated
	 */
	EClass getApacheVhost();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.ApacheVhost#getVhostName <em>Vhost Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vhost Name</em>'.
	 * @see mdcms.ApacheVhost#getVhostName()
	 * @see #getApacheVhost()
	 * @generated
	 */
	EAttribute getApacheVhost_VhostName();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.ApacheVhost#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see mdcms.ApacheVhost#getServerName()
	 * @see #getApacheVhost()
	 * @generated
	 */
	EAttribute getApacheVhost_ServerName();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.ApacheVhost#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see mdcms.ApacheVhost#getIP()
	 * @see #getApacheVhost()
	 * @generated
	 */
	EAttribute getApacheVhost_IP();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.ApacheVhost#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see mdcms.ApacheVhost#getPort()
	 * @see #getApacheVhost()
	 * @generated
	 */
	EAttribute getApacheVhost_Port();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.ApacheVhost#getDocroot <em>Docroot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docroot</em>'.
	 * @see mdcms.ApacheVhost#getDocroot()
	 * @see #getApacheVhost()
	 * @generated
	 */
	EAttribute getApacheVhost_Docroot();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.ApacheVhost#getDocrootOwner <em>Docroot Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docroot Owner</em>'.
	 * @see mdcms.ApacheVhost#getDocrootOwner()
	 * @see #getApacheVhost()
	 * @generated
	 */
	EAttribute getApacheVhost_DocrootOwner();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.ApacheVhost#getDocrootGroup <em>Docroot Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docroot Group</em>'.
	 * @see mdcms.ApacheVhost#getDocrootGroup()
	 * @see #getApacheVhost()
	 * @generated
	 */
	EAttribute getApacheVhost_DocrootGroup();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.ApacheVhost#isSSL <em>SSL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SSL</em>'.
	 * @see mdcms.ApacheVhost#isSSL()
	 * @see #getApacheVhost()
	 * @generated
	 */
	EAttribute getApacheVhost_SSL();

	/**
	 * Returns the meta object for the attribute list '{@link mdcms.ApacheVhost#getServerAliases <em>Server Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Server Aliases</em>'.
	 * @see mdcms.ApacheVhost#getServerAliases()
	 * @see #getApacheVhost()
	 * @generated
	 */
	EAttribute getApacheVhost_ServerAliases();

	/**
	 * Returns the meta object for the '{@link mdcms.ApacheVhost#ConstrainApache(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constrain Apache</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constrain Apache</em>' operation.
	 * @see mdcms.ApacheVhost#ConstrainApache(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApacheVhost__ConstrainApache__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdcms.MySQLDB <em>My SQLDB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My SQLDB</em>'.
	 * @see mdcms.MySQLDB
	 * @generated
	 */
	EClass getMySQLDB();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.MySQLDB#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see mdcms.MySQLDB#getCharset()
	 * @see #getMySQLDB()
	 * @generated
	 */
	EAttribute getMySQLDB_Charset();

	/**
	 * Returns the meta object for the '{@link mdcms.MySQLDB#ConstraintMySQL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint My SQL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint My SQL</em>' operation.
	 * @see mdcms.MySQLDB#ConstraintMySQL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMySQLDB__ConstraintMySQL__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdcms.PSQLDB <em>PSQLDB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSQLDB</em>'.
	 * @see mdcms.PSQLDB
	 * @generated
	 */
	EClass getPSQLDB();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PSQLDB#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see mdcms.PSQLDB#getTemplate()
	 * @see #getPSQLDB()
	 * @generated
	 */
	EAttribute getPSQLDB_Template();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.PSQLDB#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see mdcms.PSQLDB#getOwner()
	 * @see #getPSQLDB()
	 * @generated
	 */
	EAttribute getPSQLDB_Owner();

	/**
	 * Returns the meta object for the '{@link mdcms.PSQLDB#ConstraintPSQL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint PSQL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint PSQL</em>' operation.
	 * @see mdcms.PSQLDB#ConstraintPSQL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPSQLDB__ConstraintPSQL__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdcms.Peripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peripheral</em>'.
	 * @see mdcms.Peripheral
	 * @generated
	 */
	EClass getPeripheral();

	/**
	 * Returns the meta object for the attribute '{@link mdcms.Peripheral#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mdcms.Peripheral#getType()
	 * @see #getPeripheral()
	 * @generated
	 */
	EAttribute getPeripheral_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MdcmsFactory getMdcmsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mdcms.impl.RuntimeImpl <em>Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.RuntimeImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getRuntime()
		 * @generated
		 */
		EClass RUNTIME = eINSTANCE.getRuntime();

		/**
		 * The meta object literal for the '{@link mdcms.impl.LogicalImpl <em>Logical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.LogicalImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getLogical()
		 * @generated
		 */
		EClass LOGICAL = eINSTANCE.getLogical();

		/**
		 * The meta object literal for the '<em><b>Base Execution Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL__BASE_EXECUTION_ENVIRONMENT = eINSTANCE.getLogical_Base_ExecutionEnvironment();

		/**
		 * The meta object literal for the '{@link mdcms.impl.MySQLImpl <em>My SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.MySQLImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getMySQL()
		 * @generated
		 */
		EClass MY_SQL = eINSTANCE.getMySQL();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_SQL__PACKAGE_NAME = eINSTANCE.getMySQL_PackageName();

		/**
		 * The meta object literal for the '<em><b>Package Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_SQL__PACKAGE_VERSION = eINSTANCE.getMySQL_PackageVersion();

		/**
		 * The meta object literal for the '<em><b>Root Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_SQL__ROOT_PASSWORD = eINSTANCE.getMySQL_RootPassword();

		/**
		 * The meta object literal for the '<em><b>Install Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_SQL__INSTALL_OPTIONS = eINSTANCE.getMySQL_InstallOptions();

		/**
		 * The meta object literal for the '{@link mdcms.impl.DBEngineImpl <em>DB Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.DBEngineImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getDBEngine()
		 * @generated
		 */
		EClass DB_ENGINE = eINSTANCE.getDBEngine();

		/**
		 * The meta object literal for the '{@link mdcms.impl.JavaImpl <em>Java</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.JavaImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getJava()
		 * @generated
		 */
		EClass JAVA = eINSTANCE.getJava();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA__DISTRIBUTION = eINSTANCE.getJava_Distribution();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA__PACKAGE = eINSTANCE.getJava_Package();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA__VERSION = eINSTANCE.getJava_Version();

		/**
		 * The meta object literal for the '{@link mdcms.impl.FirewallImpl <em>Firewall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.FirewallImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getFirewall()
		 * @generated
		 */
		EClass FIREWALL = eINSTANCE.getFirewall();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL__SERVICE_NAME = eINSTANCE.getFirewall_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL__PACKAGE_NAME = eINSTANCE.getFirewall_PackageName();

		/**
		 * The meta object literal for the '{@link mdcms.impl.FirmwareImpl <em>Firmware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.FirmwareImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getFirmware()
		 * @generated
		 */
		EClass FIRMWARE = eINSTANCE.getFirmware();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRMWARE__TYPE = eINSTANCE.getFirmware_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRMWARE__VERSION = eINSTANCE.getFirmware_Version();

		/**
		 * The meta object literal for the '{@link mdcms.impl.HTTPServerImpl <em>HTTP Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.HTTPServerImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getHTTPServer()
		 * @generated
		 */
		EClass HTTP_SERVER = eINSTANCE.getHTTPServer();

		/**
		 * The meta object literal for the '{@link mdcms.impl.PostgreSQLImpl <em>Postgre SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.PostgreSQLImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getPostgreSQL()
		 * @generated
		 */
		EClass POSTGRE_SQL = eINSTANCE.getPostgreSQL();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL__VERSION = eINSTANCE.getPostgreSQL_Version();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL__ENCODING = eINSTANCE.getPostgreSQL_Encoding();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL__LOCALE = eINSTANCE.getPostgreSQL_Locale();

		/**
		 * The meta object literal for the '{@link mdcms.impl.ApplicationServerImpl <em>Application Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.ApplicationServerImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getApplicationServer()
		 * @generated
		 */
		EClass APPLICATION_SERVER = eINSTANCE.getApplicationServer();

		/**
		 * The meta object literal for the '{@link mdcms.impl.OperatingSystemImpl <em>Operating System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.OperatingSystemImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EClass OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__DISTRIBUTION = eINSTANCE.getOperatingSystem_Distribution();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__VERSION = eINSTANCE.getOperatingSystem_Version();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__ARCHITECTURE = eINSTANCE.getOperatingSystem_Architecture();

		/**
		 * The meta object literal for the '{@link mdcms.impl.TomcatImpl <em>Tomcat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.TomcatImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getTomcat()
		 * @generated
		 */
		EClass TOMCAT = eINSTANCE.getTomcat();

		/**
		 * The meta object literal for the '<em><b>Install Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT__INSTALL_DIR = eINSTANCE.getTomcat_InstallDir();

		/**
		 * The meta object literal for the '<em><b>Source URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT__SOURCE_URL = eINSTANCE.getTomcat_SourceURL();

		/**
		 * The meta object literal for the '{@link mdcms.impl.ApacheImpl <em>Apache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.ApacheImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getApache()
		 * @generated
		 */
		EClass APACHE = eINSTANCE.getApache();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE__VERSION = eINSTANCE.getApache_Version();

		/**
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE__SERVER_NAME = eINSTANCE.getApache_ServerName();

		/**
		 * The meta object literal for the '<em><b>Config Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE__CONFIG_DIR = eINSTANCE.getApache_ConfigDir();

		/**
		 * The meta object literal for the '<em><b>Docroot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE__DOCROOT = eINSTANCE.getApache_Docroot();

		/**
		 * The meta object literal for the '<em><b>Logroot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE__LOGROOT = eINSTANCE.getApache_Logroot();

		/**
		 * The meta object literal for the '<em><b>Lib Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE__LIB_PATH = eINSTANCE.getApache_LibPath();

		/**
		 * The meta object literal for the '<em><b>Default Vhost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE__DEFAULT_VHOST = eINSTANCE.getApache_DefaultVhost();

		/**
		 * The meta object literal for the '<em><b>Vhost Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE__VHOST_DIR = eINSTANCE.getApache_VhostDir();

		/**
		 * The meta object literal for the '{@link mdcms.impl.PCImpl <em>PC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.PCImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getPC()
		 * @generated
		 */
		EClass PC = eINSTANCE.getPC();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PC__PROCESSOR = eINSTANCE.getPC_Processor();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PC__ARCHITECTURE = eINSTANCE.getPC_Architecture();

		/**
		 * The meta object literal for the '<em><b>Disk Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PC__DISK_TYPE = eINSTANCE.getPC_DiskType();

		/**
		 * The meta object literal for the '<em><b>Disk Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PC__DISK_SPACE = eINSTANCE.getPC_DiskSpace();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PC__RAM = eINSTANCE.getPC_Ram();

		/**
		 * The meta object literal for the '<em><b>Motherboard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PC__MOTHERBOARD = eINSTANCE.getPC_Motherboard();

		/**
		 * The meta object literal for the '<em><b>Graphic Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PC__GRAPHIC_CARD = eINSTANCE.getPC_GraphicCard();

		/**
		 * The meta object literal for the '{@link mdcms.impl.PhysicalImpl <em>Physical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.PhysicalImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getPhysical()
		 * @generated
		 */
		EClass PHYSICAL = eINSTANCE.getPhysical();

		/**
		 * The meta object literal for the '<em><b>Base Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL__BASE_DEVICE = eINSTANCE.getPhysical_Base_Device();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL__LOCATION = eINSTANCE.getPhysical_Location();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL__IP = eINSTANCE.getPhysical_IP();

		/**
		 * The meta object literal for the '<em><b>MAC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL__MAC = eINSTANCE.getPhysical_MAC();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL__MANUFACTURER = eINSTANCE.getPhysical_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL__MODEL = eINSTANCE.getPhysical_Model();

		/**
		 * The meta object literal for the '{@link mdcms.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.SwitchImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__SPEED = eINSTANCE.getSwitch_Speed();

		/**
		 * The meta object literal for the '<em><b>Power W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__POWER_W = eINSTANCE.getSwitch_PowerW();

		/**
		 * The meta object literal for the '{@link mdcms.impl.NetworkDeviceImpl <em>Network Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.NetworkDeviceImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getNetworkDevice()
		 * @generated
		 */
		EClass NETWORK_DEVICE = eINSTANCE.getNetworkDevice();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DEVICE__THROUGHPUT = eINSTANCE.getNetworkDevice_Throughput();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DEVICE__PORTS = eINSTANCE.getNetworkDevice_Ports();

		/**
		 * The meta object literal for the '{@link mdcms.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.RouterImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>SO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__SO = eINSTANCE.getRouter_SO();

		/**
		 * The meta object literal for the '<em><b>Form Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__FORM_FACTOR = eINSTANCE.getRouter_FormFactor();

		/**
		 * The meta object literal for the '<em><b>Network Interface Slots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__NETWORK_INTERFACE_SLOTS = eINSTANCE.getRouter_NetworkInterfaceSlots();

		/**
		 * The meta object literal for the '<em><b>Service Module Slots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__SERVICE_MODULE_SLOTS = eINSTANCE.getRouter_ServiceModuleSlots();

		/**
		 * The meta object literal for the '{@link mdcms.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.ServerImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__PROCESSOR = eINSTANCE.getServer_Processor();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__ARCHITECTURE = eINSTANCE.getServer_Architecture();

		/**
		 * The meta object literal for the '<em><b>Disk Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__DISK_TYPE = eINSTANCE.getServer_DiskType();

		/**
		 * The meta object literal for the '<em><b>Disk Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__DISK_SPACE = eINSTANCE.getServer_DiskSpace();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__RAM = eINSTANCE.getServer_Ram();

		/**
		 * The meta object literal for the '<em><b>Rack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__RACK = eINSTANCE.getServer_Rack();

		/**
		 * The meta object literal for the '{@link mdcms.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.DatabaseImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__USER = eINSTANCE.getDatabase_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PASSWORD = eINSTANCE.getDatabase_Password();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__HOST = eINSTANCE.getDatabase_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PORT = eINSTANCE.getDatabase_Port();

		/**
		 * The meta object literal for the '{@link mdcms.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.ConfigurationImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BASE_ARTIFACT = eINSTANCE.getConfiguration_Base_Artifact();

		/**
		 * The meta object literal for the '{@link mdcms.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.FileImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '<em><b>Ensure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__ENSURE = eINSTANCE.getFile_Ensure();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CONTENT = eINSTANCE.getFile_Content();

		/**
		 * The meta object literal for the '<em><b>Backup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__BACKUP = eINSTANCE.getFile_Backup();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MODE = eINSTANCE.getFile_Mode();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__GROUP = eINSTANCE.getFile_Group();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__OWNER = eINSTANCE.getFile_Owner();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__REPLACE = eINSTANCE.getFile_Replace();

		/**
		 * The meta object literal for the '<em><b>Force</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FORCE = eINSTANCE.getFile_Force();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CREATION_TIME = eINSTANCE.getFile_CreationTime();

		/**
		 * The meta object literal for the '<em><b>Modification Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MODIFICATION_TIME = eINSTANCE.getFile_ModificationTime();

		/**
		 * The meta object literal for the '{@link mdcms.impl.RegistryEntryImpl <em>Registry Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.RegistryEntryImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getRegistryEntry()
		 * @generated
		 */
		EClass REGISTRY_ENTRY = eINSTANCE.getRegistryEntry();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY__PATH = eINSTANCE.getRegistryEntry_Path();

		/**
		 * The meta object literal for the '<em><b>Ensure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY__ENSURE = eINSTANCE.getRegistryEntry_Ensure();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY__TYPE = eINSTANCE.getRegistryEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_ENTRY__DATA = eINSTANCE.getRegistryEntry_Data();

		/**
		 * The meta object literal for the '{@link mdcms.impl.FreeFormImpl <em>Free Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.FreeFormImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getFreeForm()
		 * @generated
		 */
		EClass FREE_FORM = eINSTANCE.getFreeForm();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_FORM__DESCRIPTION = eINSTANCE.getFreeForm_Description();

		/**
		 * The meta object literal for the '{@link mdcms.impl.TomcatAppImpl <em>Tomcat App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.TomcatAppImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getTomcatApp()
		 * @generated
		 */
		EClass TOMCAT_APP = eINSTANCE.getTomcatApp();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT_APP__PARAMETERS = eINSTANCE.getTomcatApp_Parameters();

		/**
		 * The meta object literal for the '<em><b>Catalina Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT_APP__CATALINA_HOME = eINSTANCE.getTomcatApp_CatalinaHome();

		/**
		 * The meta object literal for the '<em><b>Catalina Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT_APP__CATALINA_BASE = eINSTANCE.getTomcatApp_CatalinaBase();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT_APP__ADDRESS = eINSTANCE.getTomcatApp_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT_APP__PORT = eINSTANCE.getTomcatApp_Port();

		/**
		 * The meta object literal for the '<em><b>Server Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT_APP__SERVER_CONFIG = eINSTANCE.getTomcatApp_ServerConfig();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT_APP__CLASS_NAME = eINSTANCE.getTomcatApp_ClassName();

		/**
		 * The meta object literal for the '<em><b>Additional Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMCAT_APP__ADDITIONAL_ATTRIBUTES = eINSTANCE.getTomcatApp_AdditionalAttributes();

		/**
		 * The meta object literal for the '<em><b>Constraint Tomcat</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOMCAT_APP___CONSTRAINT_TOMCAT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTomcatApp__ConstraintTomcat__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdcms.impl.JavaOracleImpl <em>Java Oracle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.JavaOracleImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getJavaOracle()
		 * @generated
		 */
		EClass JAVA_ORACLE = eINSTANCE.getJavaOracle();

		/**
		 * The meta object literal for the '<em><b>Version Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ORACLE__VERSION_MAJOR = eINSTANCE.getJavaOracle_VersionMajor();

		/**
		 * The meta object literal for the '<em><b>Version Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ORACLE__VERSION_MINOR = eINSTANCE.getJavaOracle_VersionMinor();

		/**
		 * The meta object literal for the '<em><b>Java SE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ORACLE__JAVA_SE = eINSTANCE.getJavaOracle_JavaSE();

		/**
		 * The meta object literal for the '<em><b>Oracle URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ORACLE__ORACLE_URL = eINSTANCE.getJavaOracle_OracleURL();

		/**
		 * The meta object literal for the '<em><b>Proxy Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ORACLE__PROXY_SERVER = eINSTANCE.getJavaOracle_ProxyServer();

		/**
		 * The meta object literal for the '<em><b>Proxy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ORACLE__PROXY_TYPE = eINSTANCE.getJavaOracle_ProxyType();

		/**
		 * The meta object literal for the '<em><b>Constraint HTTP</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA_ORACLE___CONSTRAINT_HTTP__DIAGNOSTICCHAIN_MAP = eINSTANCE.getJavaOracle__ConstraintHTTP__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdcms.impl.FirewallRuleImpl <em>Firewall Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.FirewallRuleImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getFirewallRule()
		 * @generated
		 */
		EClass FIREWALL_RULE = eINSTANCE.getFirewallRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__NAME = eINSTANCE.getFirewallRule_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__ACTION = eINSTANCE.getFirewallRule_Action();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__PROTOCOL = eINSTANCE.getFirewallRule_Protocol();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__SOURCE = eINSTANCE.getFirewallRule_Source();

		/**
		 * The meta object literal for the '<em><b>Source Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__SOURCE_RANGE = eINSTANCE.getFirewallRule_SourceRange();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__DESTINATION = eINSTANCE.getFirewallRule_Destination();

		/**
		 * The meta object literal for the '<em><b>Destination Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__DESTINATION_RANGE = eINSTANCE.getFirewallRule_DestinationRange();

		/**
		 * The meta object literal for the '<em><b>Destination Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__DESTINATION_PORT = eINSTANCE.getFirewallRule_DestinationPort();

		/**
		 * The meta object literal for the '<em><b>Input Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__INPUT_INTERFACE = eINSTANCE.getFirewallRule_InputInterface();

		/**
		 * The meta object literal for the '<em><b>Output Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__OUTPUT_INTERFACE = eINSTANCE.getFirewallRule_OutputInterface();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__STATE = eINSTANCE.getFirewallRule_State();

		/**
		 * The meta object literal for the '<em><b>TCP Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__TCP_FLAGS = eINSTANCE.getFirewallRule_TCPFlags();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__PROVIDER = eINSTANCE.getFirewallRule_Provider();

		/**
		 * The meta object literal for the '<em><b>Constraint Firewall</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIREWALL_RULE___CONSTRAINT_FIREWALL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFirewallRule__ConstraintFirewall__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdcms.impl.ApacheVhostImpl <em>Apache Vhost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.ApacheVhostImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getApacheVhost()
		 * @generated
		 */
		EClass APACHE_VHOST = eINSTANCE.getApacheVhost();

		/**
		 * The meta object literal for the '<em><b>Vhost Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE_VHOST__VHOST_NAME = eINSTANCE.getApacheVhost_VhostName();

		/**
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE_VHOST__SERVER_NAME = eINSTANCE.getApacheVhost_ServerName();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE_VHOST__IP = eINSTANCE.getApacheVhost_IP();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE_VHOST__PORT = eINSTANCE.getApacheVhost_Port();

		/**
		 * The meta object literal for the '<em><b>Docroot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE_VHOST__DOCROOT = eINSTANCE.getApacheVhost_Docroot();

		/**
		 * The meta object literal for the '<em><b>Docroot Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE_VHOST__DOCROOT_OWNER = eINSTANCE.getApacheVhost_DocrootOwner();

		/**
		 * The meta object literal for the '<em><b>Docroot Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE_VHOST__DOCROOT_GROUP = eINSTANCE.getApacheVhost_DocrootGroup();

		/**
		 * The meta object literal for the '<em><b>SSL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE_VHOST__SSL = eINSTANCE.getApacheVhost_SSL();

		/**
		 * The meta object literal for the '<em><b>Server Aliases</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACHE_VHOST__SERVER_ALIASES = eINSTANCE.getApacheVhost_ServerAliases();

		/**
		 * The meta object literal for the '<em><b>Constrain Apache</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APACHE_VHOST___CONSTRAIN_APACHE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApacheVhost__ConstrainApache__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdcms.impl.MySQLDBImpl <em>My SQLDB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.MySQLDBImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getMySQLDB()
		 * @generated
		 */
		EClass MY_SQLDB = eINSTANCE.getMySQLDB();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_SQLDB__CHARSET = eINSTANCE.getMySQLDB_Charset();

		/**
		 * The meta object literal for the '<em><b>Constraint My SQL</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_SQLDB___CONSTRAINT_MY_SQL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMySQLDB__ConstraintMySQL__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdcms.impl.PSQLDBImpl <em>PSQLDB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.PSQLDBImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getPSQLDB()
		 * @generated
		 */
		EClass PSQLDB = eINSTANCE.getPSQLDB();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSQLDB__TEMPLATE = eINSTANCE.getPSQLDB_Template();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSQLDB__OWNER = eINSTANCE.getPSQLDB_Owner();

		/**
		 * The meta object literal for the '<em><b>Constraint PSQL</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSQLDB___CONSTRAINT_PSQL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPSQLDB__ConstraintPSQL__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdcms.impl.PeripheralImpl <em>Peripheral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdcms.impl.PeripheralImpl
		 * @see mdcms.impl.MdcmsPackageImpl#getPeripheral()
		 * @generated
		 */
		EClass PERIPHERAL = eINSTANCE.getPeripheral();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIPHERAL__TYPE = eINSTANCE.getPeripheral_Type();

	}

} //MdcmsPackage
