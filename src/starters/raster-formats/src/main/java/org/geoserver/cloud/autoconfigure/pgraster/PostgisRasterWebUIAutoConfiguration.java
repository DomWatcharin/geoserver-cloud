/*
 * (c) 2022 Open Source Geospatial Foundation - all rights reserved This code is licensed under the
 * GPL 2.0 license, available at the root application directory.
 */
package org.geoserver.cloud.autoconfigure.pgraster;

import org.geoserver.cloud.config.factory.FilteringXmlBeanDefinitionReader;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration(proxyBeanMethods = false)
@ConditionalOnPostgisRasterWebUI
@ImportResource( //
        reader = FilteringXmlBeanDefinitionReader.class, //
        locations = "jar:gs-pgraster-.*!/applicationContext.xml")
public class PostgisRasterWebUIAutoConfiguration {}
