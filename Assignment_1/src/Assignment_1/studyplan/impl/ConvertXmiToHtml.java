package Assignment_1.studyplan.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Assignment_1.studyplan.Course;
import Assignment_1.studyplan.CourseGroup;
import Assignment_1.studyplan.Semester;
import Assignment_1.studyplan.Specialization;
import Assignment_1.studyplan.Programme;
import Assignment_1.studyplan.Department;
import Assignment_1.studyplan.StudyplanPackage;

public class ConvertXmiToHtml {
	
	private Resource instance;
	
	public ConvertXmiToHtml(String resource) {
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
		
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyplanPackage.eNS_URI, StudyplanPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		instance = resSet.getResource(URI.createURI(ConvertXmiToHtml.class.getResource(resource).toString()), true);
	}
	
	private void newHtmlfile(String name) {
		try {
			File htmlFile = new File(name + ".html");
			if(htmlFile.createNewFile()) {
				System.out.println("Created file: " + htmlFile.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException error) {
			System.out.println("Error occurred.");
			error.printStackTrace();
		}
	}
	
	private void writeToHtmlFile(String name, String content) {
		try {
			File htmlFile = new File(name + ".html");
			if(htmlFile.createNewFile()) {
				System.out.println("Created file: " + htmlFile.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException error) {
			System.out.println("Error occurred.");
			error.printStackTrace();
		}
	}
	
	private void convertInstanceToHtml() {
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
