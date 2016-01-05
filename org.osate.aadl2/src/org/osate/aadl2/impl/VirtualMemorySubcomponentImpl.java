/**
 * <copyright>
 * Copyright  2011 by Carnegie Mellon University, all rights reserved.
 * 
 * Use of the Open Source AADL Tool Environment (OSATE) is subject to the terms of the license set forth
 * at http://www.eclipse.org/org/documents/epl-v10.html.
 * 
 * NO WARRANTY
 * 
 * ANY INFORMATION, MATERIALS, SERVICES, INTELLECTUAL PROPERTY OR OTHER PROPERTY OR RIGHTS GRANTED OR PROVIDED BY
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE ''DELIVERABLES'') ARE ON AN ''AS-IS'' BASIS.
 * CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, INFORMATIONAL CONTENT,
 * NONINFRINGEMENT, OR ERROR-FREE OPERATION. CARNEGIE MELLON UNIVERSITY SHALL NOT BE LIABLE FOR INDIRECT, SPECIAL OR
 * CONSEQUENTIAL DAMAGES, SUCH AS LOSS OF PROFITS OR INABILITY TO USE SAID INTELLECTUAL PROPERTY, UNDER THIS LICENSE,
 * REGARDLESS OF WHETHER SUCH PARTY WAS AWARE OF THE POSSIBILITY OF SUCH DAMAGES. LICENSEE AGREES THAT IT WILL NOT
 * MAKE ANY WARRANTY ON BEHALF OF CARNEGIE MELLON UNIVERSITY, EXPRESS OR IMPLIED, TO ANY PERSON CONCERNING THE
 * APPLICATION OF OR THE RESULTS TO BE OBTAINED WITH THE DELIVERABLES UNDER THIS LICENSE.
 * 
 * Licensee hereby agrees to defend, indemnify, and hold harmless Carnegie Mellon University, its trustees, officers,
 * employees, and agents from all claims or demands made against them (and any related losses, expenses, or
 * attorney's fees) arising out of, or relating to Licensee's and/or its sub licensees' negligent use or willful
 * misuse of or negligent conduct or willful misconduct regarding the Software, facilities, or other rights or
 * assistance granted by Carnegie Mellon University under this License, including, but not limited to, any claims of
 * product liability, personal injury, death, damage to property, or violation of any laws or regulations.
 * 
 * Carnegie Mellon University Software Engineering Institute authored documents are sponsored by the U.S. Department
 * of Defense under Contract F19628-00-C-0003. Carnegie Mellon University retains copyrights in all material produced
 * under this contract. The U.S. Government retains a non-exclusive, royalty-free license to publish or reproduce these
 * documents, or allow others to do so, for U.S. Government purposes only pursuant to the copyright license
 * under the contract clause at 252.227.7013.
 * </copyright>
 * 
 */
package org.osate.aadl2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.ComponentCategory;
import org.osate.aadl2.SubcomponentType;
import org.osate.aadl2.VirtualMemorySubcomponent;
import org.osate.aadl2.VirtualMemorySubcomponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Memory Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadl2.impl.VirtualMemorySubcomponentImpl#getSubcomponentType <em>Subcomponent Type</em>}</li>
 *   <li>{@link org.osate.aadl2.impl.VirtualMemorySubcomponentImpl#getVirtualMemorySubcomponentType <em>Virtual Memory Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMemorySubcomponentImpl extends SubcomponentImpl implements VirtualMemorySubcomponent {
	/**
	 * The cached value of the '{@link #getVirtualMemorySubcomponentType() <em>Virtual Memory Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualMemorySubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected VirtualMemorySubcomponentType virtualMemorySubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMemorySubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getVirtualMemorySubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubcomponentType getSubcomponentType() {
		SubcomponentType subcomponentType = basicGetSubcomponentType();
		return subcomponentType != null && ((EObject) subcomponentType).eIsProxy()
				? (SubcomponentType) eResolveProxy((InternalEObject) subcomponentType) : subcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubcomponentType basicGetSubcomponentType() {
		if (eIsSet(Aadl2Package.VIRTUAL_MEMORY_SUBCOMPONENT__VIRTUAL_MEMORY_SUBCOMPONENT_TYPE)) {
			return basicGetVirtualMemorySubcomponentType();
		}
		return super.basicGetSubcomponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualMemorySubcomponentType getVirtualMemorySubcomponentType() {
		if (virtualMemorySubcomponentType != null && ((EObject) virtualMemorySubcomponentType).eIsProxy()) {
			InternalEObject oldVirtualMemorySubcomponentType = (InternalEObject) virtualMemorySubcomponentType;
			virtualMemorySubcomponentType = (VirtualMemorySubcomponentType) eResolveProxy(
					oldVirtualMemorySubcomponentType);
			if (virtualMemorySubcomponentType != oldVirtualMemorySubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Aadl2Package.VIRTUAL_MEMORY_SUBCOMPONENT__VIRTUAL_MEMORY_SUBCOMPONENT_TYPE,
							oldVirtualMemorySubcomponentType, virtualMemorySubcomponentType));
			}
		}
		return virtualMemorySubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMemorySubcomponentType basicGetVirtualMemorySubcomponentType() {
		return virtualMemorySubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualMemorySubcomponentType(VirtualMemorySubcomponentType newVirtualMemorySubcomponentType) {
		VirtualMemorySubcomponentType oldVirtualMemorySubcomponentType = virtualMemorySubcomponentType;
		virtualMemorySubcomponentType = newVirtualMemorySubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Aadl2Package.VIRTUAL_MEMORY_SUBCOMPONENT__VIRTUAL_MEMORY_SUBCOMPONENT_TYPE,
					oldVirtualMemorySubcomponentType, virtualMemorySubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Aadl2Package.VIRTUAL_MEMORY_SUBCOMPONENT__VIRTUAL_MEMORY_SUBCOMPONENT_TYPE:
			if (resolve)
				return getVirtualMemorySubcomponentType();
			return basicGetVirtualMemorySubcomponentType();
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
		case Aadl2Package.VIRTUAL_MEMORY_SUBCOMPONENT__VIRTUAL_MEMORY_SUBCOMPONENT_TYPE:
			setVirtualMemorySubcomponentType((VirtualMemorySubcomponentType) newValue);
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
		case Aadl2Package.VIRTUAL_MEMORY_SUBCOMPONENT__VIRTUAL_MEMORY_SUBCOMPONENT_TYPE:
			setVirtualMemorySubcomponentType((VirtualMemorySubcomponentType) null);
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
		case Aadl2Package.VIRTUAL_MEMORY_SUBCOMPONENT__SUBCOMPONENT_TYPE:
			return isSetSubcomponentType();
		case Aadl2Package.VIRTUAL_MEMORY_SUBCOMPONENT__VIRTUAL_MEMORY_SUBCOMPONENT_TYPE:
			return virtualMemorySubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSubcomponentType() {
		return super.isSetSubcomponentType()
				|| eIsSet(Aadl2Package.VIRTUAL_MEMORY_SUBCOMPONENT__VIRTUAL_MEMORY_SUBCOMPONENT_TYPE);
	}

	@Override
	public ComponentCategory getCategory() {
		return ComponentCategory.VIRTUAL_MEMORY;
	}
} //VirtualMemorySubcomponentImpl
