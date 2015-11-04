package picklesjar.pickles.ut.recipes.sequence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 
 * 
 * @author PicklesCooker
 * 
 */
@Target( { ElementType.METHOD } )
@Retention( RetentionPolicy.SOURCE )
@Repeatable( ShouldBeBefores.class )
public @interface ShouldBeBefore {
	
	/**
	 * What's class within target.
	 * 
	 * @return
	 */
	public Class< ? > value();
	
	public String[] queries() default {};
	
}
