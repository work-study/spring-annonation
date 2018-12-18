package com.netease.kaola.spring.annotation.ioc.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter{

    /**
     * metadataReader:读取到正在扫描的类信息
     * metadataReaderFactory：可以获取其他类的任何信息
     * */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //当前类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //当前类资源
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();

        return className.contains("vice");
    }
}
