package com.atc.jc.it;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

/**
 * Supertype layer for integration tests.
 *
 * @author agazzarini
 * @since 1.0
 */
public abstract class BaseIntegrationTest {
    protected static String EMPTY_STRING = "";

    @Autowired
    protected DataSource datasource;

    @LocalServerPort
    protected int port;

    @Autowired
    protected RestTemplate restTemplate;

    @BeforeClass
    public static void init() throws Exception {
        prepareStorageArea();
    }

    private static void prepareStorageArea() throws Exception {
    }

    @AfterClass
    public static void shutdown() throws Exception {
        removeAllTestFiles();
    }

    /**
     * Removes all test files created during this test.
     */
    private static void removeAllTestFiles()  throws Exception {
    }
}