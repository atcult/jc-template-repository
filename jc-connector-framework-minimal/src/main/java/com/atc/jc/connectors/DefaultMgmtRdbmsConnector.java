package com.atc.jc.connectors;

import com.atc.jc.connectors.CoreRdbmsConnector;
import com.atc.jc.connectors.MgmtRdbmsConnector;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mgmt-rdbms-connector")
@Qualifier("mgmt-rdbms-connector")
public class DefaultMgmtRdbmsConnector implements MgmtRdbmsConnector {
}
