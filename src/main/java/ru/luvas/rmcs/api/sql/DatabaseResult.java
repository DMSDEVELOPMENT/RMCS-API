package ru.luvas.rmcs.api.sql;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by RINES on 04.05.2018.
 */
public interface DatabaseResult {

    /**
     * Получить индекс столбца по имени
     * @param columnName имя столбца
     * @return индекс столбца
     */
    int getColumnIndex(String columnName);

    /**
     * Проверка на то, пуст ли результат
     * @return true, если в результате нет строк
     */
    default boolean isEmpty() {
        return getRowCount() == 0;
    }

    /**
     * Получить количество строк в результате
     * @return количество строк в рузельтате
     */
    int getRowCount();

    /**
     * Получить строки
     * @return строки результата
     */
    List<DatabaseRow> getRows();

    /**
     * Получить столбцы
     * @return столбцы результата
     */
    List<DatabaseColumn> getColumns();

    /**
     * Получить первую строку результата
     * @return первая строка результата
     * @throws NullPointerException если строк нет
     */
    DatabaseRow getFirst() throws NullPointerException;

    /**
     * Просто метод для удобства использования.
     * @param consumer обработчик результата
     */
    default void process(Consumer<DatabaseResult> consumer) {
        consumer.accept(this);
    }
}
