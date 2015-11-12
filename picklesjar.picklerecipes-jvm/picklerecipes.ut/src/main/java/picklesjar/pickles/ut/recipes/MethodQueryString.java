package picklesjar.pickles.ut.recipes;

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
@Target( { ElementType.TYPE_USE } )
@Retention( RetentionPolicy.SOURCE )
public @interface MethodQueryString {}
