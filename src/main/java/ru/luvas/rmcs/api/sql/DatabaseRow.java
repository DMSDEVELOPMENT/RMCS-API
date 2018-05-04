package ru.luvas.rmcs.api.sql;

/**
 * Created by RINES on 04.05.2018.
 */
public interface DatabaseRow {

    int getInt(int index);

    int getInt(String columnName);

    long getLong(int index);

    long getLong(String columnName);

    float getFloat(int index);

    float getFloat(String columnName);

    boolean getBoolean(int index);

    boolean getBoolean(String columnName);

    byte[] getBytes(int index);

    byte[] getBytes(String columnName);

    String getString(int index);

    String getString(String columnName);

    Object getObject(int index);

    Object getObject(String columnName);

}
