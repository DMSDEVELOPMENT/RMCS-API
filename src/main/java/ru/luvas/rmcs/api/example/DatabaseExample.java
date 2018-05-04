package ru.luvas.rmcs.api.example;

import ru.luvas.rmcs.api.RMCSAPI;
import ru.luvas.rmcs.api.sql.DatabaseConnectionHolder;

import java.sql.SQLException;

/**
 * Created by RINES on 04.05.2018.
 */
@Example
public class DatabaseExample {

    public static void load() {
        DatabaseConnectionHolder holder = RMCSAPI.getDatabaseAPI().getDatabaseConnection("localhost", 3306, "root", "root", "test_db", 2);
        try {
            //Исполняем блокирующие запросы, то есть для которых мы будем ожидать завершения и не пойдем дальше,
            // пока этого не случится:
            holder.insant().prepare("INSERT INTO permissions VALUES (?, ?)").executeString("RinesThaix", "OWNER"); //забиваем на результат
            holder.insant().prepare("SELECT * FROM permissions WHERE player_name=?").execute("RinesThaix").process(result -> {
                //Обрабатываем результат, причем это происходит в том же потоке, где мы и были
                String group = result.getFirst().getString("group");
                String playerName = result.getFirst().getString(1);
            });
            holder.insant().execute("SELECT * FROM permissions").process(result -> {
                result.getRows().forEach(row -> {
                    String group = row.getString(2);
                    String playerName = row.getString(1);
                });
            });
            holder.insant().execute("SELECT * FROM permissions WHERE player_name='RinesThaix'").process(result -> {
                String group = result.getFirst().getString(2);
            });
            //Исполняем неблокирующие запросы, то есть завершения исполнения которых мы дожидаться не будем:
            holder.delayed().prepare("INSERT INTO permissions VALUES (?, ?)").executeString("RinesThaix", "OWNER");
            holder.delayed().execute("INSERT INTO permissions VALUES ('RinesThaix', 'OWNER')");
        } catch(SQLException ex) {
            //Что-то пошло не так
            ex.printStackTrace();
        }
    }

}
