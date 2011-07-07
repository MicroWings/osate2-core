package org.osate.xtext.aadl2.linking;


import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.CallContext;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.Connection;
import org.osate.aadl2.ConnectionEnd;
import org.osate.aadl2.Context;
import org.osate.aadl2.EndToEndFlow;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FlowSpecification;
import org.osate.aadl2.Mode;
import org.osate.aadl2.ModeTransition;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.Port;
import org.osate.aadl2.PortConnection;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyConstant;
import org.osate.aadl2.PropertySet;
import org.osate.aadl2.PropertyType;
import org.osate.aadl2.Prototype;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.SubprogramCall;
import org.osate.xtext.aadl2.properties.linking.NameResolver;


	public class MyLinkingService extends DefaultLinkingService {

		@Override
		public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node)
		throws IllegalNodeException
		{
//			List<EObject> l = super.getLinkedObjects(context, reference, node);
//			if (!l.isEmpty()) 
//			{
//				return l;
//			}
			final EClass requiredType = reference.getEReferenceType();
			if (requiredType == null)
				return Collections.<EObject> emptyList();
			final String s = getCrossRefNodeAsString(node);
			return NameResolver.getMyLinkedObject(context, reference, s);
		};
		

}
