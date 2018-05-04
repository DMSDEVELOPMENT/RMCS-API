package ru.luvas.rmcs.api.sql;

import java.sql.SQLException;

/**
 * Created by RINES on 04.05.2018.
 */
public interface DatabaseDelayedConnector {

    /**
     * Приготовить запрос к единоразовому отложенному (неблокирующему) исполнению
     * Единоразовому - значит, на полученном экзекуторе можно будет использовать любой из execute() всего один раз
     * @param query prepared-запрос
     * @return экзекутор для работы с prepared-запросом
     */
    DatabaseDelayedExecutor prepare(String query);

    /**
     * Отложенно (неблокирующе) выполнить полный (не-prepared) запрос
     * Если во время исполнения запроса произойдет ошибка, она будет отмечена в логах.
     * @param query запрос
     */
    @Deprecated
    void execute(String query);

}
