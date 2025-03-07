/*
 * (c) 2020 Open Source Geospatial Foundation - all rights reserved This code is licensed under the
 * GPL 2.0 license, available at the root application directory.
 */
package org.geoserver.cloud.integration.catalog;

import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Simple configuration to be referred to by integration tests that relied on auto-configuration to
 * set up the context
 */
@Configuration
@EnableAutoConfiguration(
        exclude = {
            SecurityAutoConfiguration.class,
            UserDetailsServiceAutoConfiguration.class,
            ManagementWebSecurityAutoConfiguration.class
        })
public class IntegrationTestConfiguration {}
