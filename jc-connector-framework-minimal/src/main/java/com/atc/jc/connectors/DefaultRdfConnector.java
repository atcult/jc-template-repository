package com.atc.jc.connectors;

import com.atc.jc.connectors.RdfConnector;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("rdf-connector")
@Qualifier("rdf-connector")
public class DefaultRdfConnector implements RdfConnector {
}