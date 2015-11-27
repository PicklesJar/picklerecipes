package picklesjar.pickles.ut.recipes.sequence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import picklesjar.pickles.ut.recipes.MethodQueryString;

/**
 * 
 * 
 * 
 * @author PicklesCooker
 * 
 */
@Target( { ElementType.METHOD } )
@Retention( RetentionPolicy.SOURCE )
@Repeatable( ShouldBeAfters.class )
public @interface ShouldBeAfter {
	
	/**
	 * What's class within target.
	 * 
	 * @return
	 */
	public Class< ? > value();
	
	@MethodQueryString
	public String[] queries() default {};
	
}
