package fr.ekinci.models.theory;

import fr.ekinci.annotations.theory.*;

/**
 * @author Gokan EKINCI
 */
@MyTypeAnnotation
@MyTypeUseAnnotation
public class MyTrainingClass {


	@MyFieldAnnotation
	@MyTypeUseAnnotation
	private String myAttribute;

	@MyConstructorAnnotation
	@MyTypeUseAnnotation
	public MyTrainingClass(
		@MyParameterAnnotation
		@MyTypeUseAnnotation
		Object parameter1
	) {

	}

	@MyMethodAnnotation
	@MyTypeUseAnnotation
	public Object myMethod(
		@MyParameterAnnotation
		@MyTypeUseAnnotation
		Object parameter1
	) {
		@MyLocalVariableAnnotation
		@MyTypeUseAnnotation
		Object localVariable = null;
		return null;
	}
}
