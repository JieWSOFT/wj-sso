package com.wj.sso.common.tool.validator.annotation;

import com.wj.sso.common.tool.validator.Validator;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidateParam {

    Validator[] value() default {};

    String name() default "";
}
