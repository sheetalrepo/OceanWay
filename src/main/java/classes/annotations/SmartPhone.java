package classes.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Multi Value Annotations
 * Single Value Annotation : In case there is one fields
 * 
 * Target: define this annotation will work at what level
 *        like class, method, constructor etc
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone {
	String os() default "android";
	int version() default 1;	
}
