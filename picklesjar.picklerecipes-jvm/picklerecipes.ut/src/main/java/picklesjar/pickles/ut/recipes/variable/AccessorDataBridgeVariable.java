package picklesjar.pickles.ut.recipes.variable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import picklesjar.pickles.ut.recipes.MethodQueryString;

@Target( { ElementType.FIELD } )
@Retention( RetentionPolicy.RUNTIME )
public @interface AccessorDataBridgeVariable {
	
	/**
	 * If set "", default setter name.
	 * 
	 * @return
	 */
	@MethodQueryString
	public String setter() default "";
	
	/**
	 * If set "", default getter name.
	 * 
	 * @return
	 */
	@MethodQueryString
	public String getter() default "";
	
	@MethodQueryString
	public String[] editableMethods() default {};
	
}
