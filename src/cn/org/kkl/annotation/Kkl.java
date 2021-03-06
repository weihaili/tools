package cn.org.kkl.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD,ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Kkl {
	
	String name() default "";
	
	int age() default 0;
	
	int id() default -1;
	
	String[] schools() default {"nj","hf","qh","bd"};

}
