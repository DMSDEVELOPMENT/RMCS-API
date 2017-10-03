package ru.luvas.rmcs.api.table;

import org.bukkit.Location;
import org.bukkit.World;
import ru.luvas.rmcs.api.RMCSAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RINES on 04.09.17.
 */
public class Table {

    private final int id;
    private World world;
    private double x, y, z;
    private float rx, ry, rz;
    private List<Column> columns = new ArrayList<>();
    private List<String[]> rows = new ArrayList<>();

    public Table(int id) {
        this.id = id;
    }

    public void setLocation(Location location) {
        this.world = location.getWorld();
        this.x = location.getX();
        this.y = location.getY();
        this.z = location.getZ();
        this.rx = 0F;
        this.ry = location.getYaw();
        this.rz = 0F;
    }

    public Table location(Location location) {
        setLocation(location);
        return this;
    }

    public Table column(String name, int width) {
        if(this.columns == null)
            this.columns = new ArrayList<>();
        this.columns.add(new Column(name, width));
        return this;
    }

    public Table row(String... args) {
        addRow(args);
        return this;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public void setRows(List<String[]> rows) {
        this.rows = rows;
    }

    public void addRow(String... args) {
        if(this.rows == null)
            this.rows = new ArrayList<>();
        this.rows.add(args);
    }

    public int getId() {
        return this.id;
    }

    public World getWorld() {
        return this.world;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public float getRx() {
        return this.rx;
    }

    public float getRy() {
        return this.ry;
    }

    public float getRz() {
        return this.rz;
    }

    public List<Column> getColumns() {
        return this.columns;
    }

    public List<String[]> getRows() {
        return this.rows;
    }

    /**
     * Создать данную таблицу.
     */
    public void create() {
        RMCSAPI.getTableAPI().create(this);
    }

    /**
     * Обновить строки данной таблицы.
     */
    public void update() {
        RMCSAPI.getTableAPI().update(this);
    }

    /**
     * Удалить данную таблицу.
     */
    public void delete() {
        RMCSAPI.getTableAPI().delete(this);
    }

}
