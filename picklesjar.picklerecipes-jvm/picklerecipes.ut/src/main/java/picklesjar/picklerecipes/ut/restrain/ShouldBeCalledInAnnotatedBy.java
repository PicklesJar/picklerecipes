package picklesjar.picklerecipes.ut.restrain;

import java.lang.annotation.ElementType;
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
public @interface ShouldBeCalledInAnnotatedBy {
	
	public Class< ? >[] value();
}
