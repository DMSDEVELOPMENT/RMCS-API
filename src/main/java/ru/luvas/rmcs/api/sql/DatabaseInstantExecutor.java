package ru.luvas.rmcs.api.sql;

import java.sql.SQLException;

/**
 * Created by RINES on 04.05.2018.
 */
public interface DatabaseInstantExecutor {

    /**
     * Выполнить prepared-запрос, заменив prepared-аргументы в нем на указанные (в переданном порядке)
     * @param args аргументы для подстановки в запрос
     * @return результат исполнения (можно проигнорировать)
     * @throws SQLException если что-то пошло не так с запросом
     */
    DatabaseResult execute(Object... args) throws SQLException;

    /**
     * Выполнить prepared-запрос, заменив prepared-аргументы в нем на указанные (при учете, что все строки)
     * Выполняется быстрее execute(), т.к. не нужно производить приведение типов
     * @param args аргументы для подстановки в запрос
     * @return результат исполнения (можно проигнорировать)
     * @throws SQLException если что-то пошло не так с запросом
     */
    DatabaseResult executeString(String... args) throws SQLException;

    /**
     * Выполнить prepared-запрос, заменив prepared-аргументы в нем на указанные (при учете, что все целочисленные)
     * Выполняется быстрее execute(), т.к. не нужно производить приведение типов
     * @param args аргументы для подстановки в запрос
     * @return результат исполнения (можно проигнорировать)
     * @throws SQLException если что-то пошло не так с запросом
     */
    DatabaseResult executeInt(int... args) throws SQLException;

}
