package ru.luvas.rmcs.api;

import ru.luvas.rmcs.api.sql.DatabaseConnectionHolder;

/**
 * Created by RINES on 04.05.2018.
 */
public interface DatabaseAPI {

    /**
     * Подключиться к базе данных.
     * Этот метод должен использоваться единожды и его результат нужно хранить, как зеницу ока.
     * @param host адрес
     * @param port порт
     * @param username имя пользователя
     * @param password пароль
     * @param databaseName имя базы данных
     * @param threads максимальное количество потоков, которое может использоваться для асинхронного доступа
     *                к базе данных. Этот параметр может быть проигнорирован на серверах, где мы не предусматриваем
     *                многопоточного доступа к базе данных.
     *                Если не уверены, что сюда ставить, пишите двойку.
     * @return держатель подключения к базе данных.
     */
    DatabaseConnectionHolder getDatabaseConnection(String host, int port, String username, String password, String databaseName, int threads);

}
