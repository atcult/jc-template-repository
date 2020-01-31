package com.atc.jc.connectors;

import com.atc.jc.connectors.CoreRdbmsConnector;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("full-core-rdbms-connector")
@Qualifier("full-core-rdbms-connector")
public class DefaultCoreRdbmsConnector implements CoreRdbmsConnector {
}
