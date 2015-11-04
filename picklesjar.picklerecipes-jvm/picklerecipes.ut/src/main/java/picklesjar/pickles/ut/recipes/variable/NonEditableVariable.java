package picklesjar.pickles.ut.recipes.variable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( { ElementType.METHOD } )
@Retention( RetentionPolicy.SOURCE )
public @interface NonEditableVariable {
	
	public String setter() default "";
	
	public String getter() default "";
	
}
