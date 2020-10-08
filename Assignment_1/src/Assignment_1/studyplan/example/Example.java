package Assignment_1.studyplan.example;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Assignment_1.studyplan.Department;
import Assignment_1.studyplan.StudyplanPackage;
import Assignment_1.studyplan.Course;


public class Example {

	public static void main(String[] args) {
		// From lecture 1 01:05:00
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyplanPackage.eNS_URI, StudyplanPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(Example.class.getResource("Department.xmi").toString()), true);
		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = allContents.next();
			System.out.println(eObject);
		}
		
		System.out.println("==========================================");
		
		Department dep = (Department) resource.getContents().get(0);
		for (Course course : dep.getCourses()) {
			System.out.println(course);
		}
	}
}
