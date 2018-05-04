package ru.luvas.rmcs.api.sql;

import java.sql.SQLException;

/**
 * Created by RINES on 04.05.2018.
 */
public interface DatabaseInstantConnector {

    /**
     * Приготовить запрос к единоразовому блокирующему исполнению
     * Единоразовому - значит, на полученном экзекуторе можно будет использовать любой из execute() всего один раз
     * @param query prepared-запрос
     * @return экзекутор для работы с prepared-запросом
     */
    DatabaseInstantExecutor prepare(String query);

    /**
     * Блокирующе выполнить полный (не-prepared) запрос
     * @param query запрос
     * @return результат исполнения (можно проигнорировать)
     * @throws SQLException если что-то пошло не так с запросом
     */
    @Deprecated
    DatabaseResult execute(String query) throws SQLException;

}
