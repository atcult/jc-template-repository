package com.act.jc.mgmt.controllers;

import com.act.jc.mgmt.Application;
import com.atc.jc.connectors.CoreRdbmsConnector;
import com.atc.jc.connectors.MgmtRdbmsConnector;
import com.atc.jc.connectors.RdfConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(value = Application.BASE_URI, produces = "application/json")
public class ExampleController extends BaseController {

    private final ApplicationContext appContext;
    private final CoreRdbmsConnector coreRdbmsConnector;
    private final MgmtRdbmsConnector mgmtRdbmsConnector;
    private final RdfConnector rdfConnector;

    @Autowired
    public ExampleController(final ApplicationContext appContext) {
        this.appContext = appContext;
        this.coreRdbmsConnector = appContext.getBean(System.getProperty("env", "minimal") + "-core-rdbms-connector", CoreRdbmsConnector.class);
        this.mgmtRdbmsConnector = appContext.getBean("mgmt-rdbms-connector", MgmtRdbmsConnector.class);
        this.rdfConnector = appContext.getBean("rdf-connector", RdfConnector.class);
    }

    @GetMapping(path = "/work/{id}", consumes = "application/json")
    public Map<String, Object> getWork(@PathVariable String id) {
        // do something and return the requested resource
        return Collections.emptyMap();
    }
}