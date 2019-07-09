/**
 */
package mdcms.impl;

import mdcms.File;
import mdcms.MdcmsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdcms.impl.FileImpl#getPath <em>Path</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getEnsure <em>Ensure</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getContent <em>Content</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getBackup <em>Backup</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getReplace <em>Replace</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getForce <em>Force</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link mdcms.impl.FileImpl#getModificationTime <em>Modification Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends ConfigurationImpl implements File {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnsure() <em>Ensure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsure()
	 * @generated
	 * @ordered
	 */
	protected static final String ENSURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnsure() <em>Ensure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsure()
	 * @generated
	 * @ordered
	 */
	protected String ensure = ENSURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackup() <em>Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackup()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackup() <em>Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackup()
	 * @generated
	 * @ordered
	 */
	protected String backup = BACKUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplace() <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplace() <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected String replace = REPLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce()
	 * @generated
	 * @ordered
	 */
	protected String force = FORCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected String creationTime = CREATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModificationTime() <em>Modification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationTime()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFICATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificationTime() <em>Modification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationTime()
	 * @generated
	 * @ordered
	 */
	protected String modificationTime = MODIFICATION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcmsPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnsure() {
		return ensure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnsure(String newEnsure) {
		String oldEnsure = ensure;
		ensure = newEnsure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__ENSURE, oldEnsure, ensure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackup() {
		return backup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackup(String newBackup) {
		String oldBackup = backup;
		backup = newBackup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__BACKUP, oldBackup, backup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplace() {
		return replace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplace(String newReplace) {
		String oldReplace = replace;
		replace = newReplace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__REPLACE, oldReplace, replace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForce() {
		return force;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForce(String newForce) {
		String oldForce = force;
		force = newForce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__FORCE, oldForce, force));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(String newCreationTime) {
		String oldCreationTime = creationTime;
		creationTime = newCreationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__CREATION_TIME, oldCreationTime, creationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModificationTime() {
		return modificationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationTime(String newModificationTime) {
		String oldModificationTime = modificationTime;
		modificationTime = newModificationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcmsPackage.FILE__MODIFICATION_TIME, oldModificationTime, modificationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcmsPackage.FILE__PATH:
				return getPath();
			case MdcmsPackage.FILE__ENSURE:
				return getEnsure();
			case MdcmsPackage.FILE__CONTENT:
				return getContent();
			case MdcmsPackage.FILE__BACKUP:
				return getBackup();
			case MdcmsPackage.FILE__MODE:
				return getMode();
			case MdcmsPackage.FILE__GROUP:
				return getGroup();
			case MdcmsPackage.FILE__OWNER:
				return getOwner();
			case MdcmsPackage.FILE__REPLACE:
				return getReplace();
			case MdcmsPackage.FILE__FORCE:
				return getForce();
			case MdcmsPackage.FILE__CREATION_TIME:
				return getCreationTime();
			case MdcmsPackage.FILE__MODIFICATION_TIME:
				return getModificationTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdcmsPackage.FILE__PATH:
				setPath((String)newValue);
				return;
			case MdcmsPackage.FILE__ENSURE:
				setEnsure((String)newValue);
				return;
			case MdcmsPackage.FILE__CONTENT:
				setContent((String)newValue);
				return;
			case MdcmsPackage.FILE__BACKUP:
				setBackup((String)newValue);
				return;
			case MdcmsPackage.FILE__MODE:
				setMode((String)newValue);
				return;
			case MdcmsPackage.FILE__GROUP:
				setGroup((String)newValue);
				return;
			case MdcmsPackage.FILE__OWNER:
				setOwner((String)newValue);
				return;
			case MdcmsPackage.FILE__REPLACE:
				setReplace((String)newValue);
				return;
			case MdcmsPackage.FILE__FORCE:
				setForce((String)newValue);
				return;
			case MdcmsPackage.FILE__CREATION_TIME:
				setCreationTime((String)newValue);
				return;
			case MdcmsPackage.FILE__MODIFICATION_TIME:
				setModificationTime((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MdcmsPackage.FILE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case MdcmsPackage.FILE__ENSURE:
				setEnsure(ENSURE_EDEFAULT);
				return;
			case MdcmsPackage.FILE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case MdcmsPackage.FILE__BACKUP:
				setBackup(BACKUP_EDEFAULT);
				return;
			case MdcmsPackage.FILE__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case MdcmsPackage.FILE__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case MdcmsPackage.FILE__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case MdcmsPackage.FILE__REPLACE:
				setReplace(REPLACE_EDEFAULT);
				return;
			case MdcmsPackage.FILE__FORCE:
				setForce(FORCE_EDEFAULT);
				return;
			case MdcmsPackage.FILE__CREATION_TIME:
				setCreationTime(CREATION_TIME_EDEFAULT);
				return;
			case MdcmsPackage.FILE__MODIFICATION_TIME:
				setModificationTime(MODIFICATION_TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MdcmsPackage.FILE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case MdcmsPackage.FILE__ENSURE:
				return ENSURE_EDEFAULT == null ? ensure != null : !ENSURE_EDEFAULT.equals(ensure);
			case MdcmsPackage.FILE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case MdcmsPackage.FILE__BACKUP:
				return BACKUP_EDEFAULT == null ? backup != null : !BACKUP_EDEFAULT.equals(backup);
			case MdcmsPackage.FILE__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case MdcmsPackage.FILE__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case MdcmsPackage.FILE__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case MdcmsPackage.FILE__REPLACE:
				return REPLACE_EDEFAULT == null ? replace != null : !REPLACE_EDEFAULT.equals(replace);
			case MdcmsPackage.FILE__FORCE:
				return FORCE_EDEFAULT == null ? force != null : !FORCE_EDEFAULT.equals(force);
			case MdcmsPackage.FILE__CREATION_TIME:
				return CREATION_TIME_EDEFAULT == null ? creationTime != null : !CREATION_TIME_EDEFAULT.equals(creationTime);
			case MdcmsPackage.FILE__MODIFICATION_TIME:
				return MODIFICATION_TIME_EDEFAULT == null ? modificationTime != null : !MODIFICATION_TIME_EDEFAULT.equals(modificationTime);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Path: ");
		result.append(path);
		result.append(", Ensure: ");
		result.append(ensure);
		result.append(", Content: ");
		result.append(content);
		result.append(", Backup: ");
		result.append(backup);
		result.append(", Mode: ");
		result.append(mode);
		result.append(", Group: ");
		result.append(group);
		result.append(", Owner: ");
		result.append(owner);
		result.append(", Replace: ");
		result.append(replace);
		result.append(", Force: ");
		result.append(force);
		result.append(", CreationTime: ");
		result.append(creationTime);
		result.append(", ModificationTime: ");
		result.append(modificationTime);
		result.append(')');
		return result.toString();
	}

} //FileImpl
