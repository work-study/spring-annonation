package com.netease.kaola.spring.annotation.ioc.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

public class MySelectImport implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        annotationTypes.forEach(s->{
            System.out.println(s);
        });
        return new String[0];
    }
}
