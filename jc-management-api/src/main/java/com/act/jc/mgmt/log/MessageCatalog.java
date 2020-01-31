package com.act.jc.mgmt.log;

/**
 * JCRICKET message catalog.
 */
public interface MessageCatalog {
    String MODULE_NAME = "JCRICKET-MGMT-API";
    String PREFIX = "<" + MODULE_NAME + "-";

    // Example message
    String _000001_READ_RESOURCE_REQUEST = PREFIX + "000001 : %s : Received a new Read request for resource %s";
    String _000024_SYSTEM_INTERNAL_FAILURE =  PREFIX + "00024 : System internal failure. See the stacktrace below for further details.";

}
