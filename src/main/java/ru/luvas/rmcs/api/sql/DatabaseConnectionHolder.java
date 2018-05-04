package ru.luvas.rmcs.api.sql;

/**
 * Created by RINES on 04.05.2018.
 */
public interface DatabaseConnectionHolder {

    DatabaseInstantConnector instant();

    DatabaseDelayedConnector delayed();

}
