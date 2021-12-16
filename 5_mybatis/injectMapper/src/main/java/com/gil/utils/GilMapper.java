package com.gil.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScannerRegistrar;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface GilMapper{
}
