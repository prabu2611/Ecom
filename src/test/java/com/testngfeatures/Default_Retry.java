package com.testngfeatures;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Default_Retry implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		 annotation.setRetryAnalyzer(Retry_Count.class);
	}
	
	//IannotationTransformer - interface

}
