package com.atc.jc.connectors;

import com.atc.jc.connectors.CoreRdbmsConnector;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("minimal-core-rdbms-connector")
@Qualifier("minimal-core-rdbms-connector")
public class NoOpCoreRdbmsConnector implements CoreRdbmsConnector {
}
