package com.example.day0717;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) // 언제까지 이 어노테이션이 살아있을지를 결정하는 것
public @interface LogExecutionTime {

}
