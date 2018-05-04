package ru.luvas.rmcs.api;

import org.bukkit.plugin.java.JavaPlugin;
import ru.luvas.rmcs.api.inventory.InventoryAPI;
import ru.luvas.rmcs.api.kits.KitAPI;
import ru.luvas.rmcs.api.party.PartyAPI;
import ru.luvas.rmcs.api.player.RMCSPlayerManager;
import ru.luvas.rmcs.api.scoreboard.ScoreboardAPI;
import ru.luvas.rmcs.api.scoreboard.SideBoardAPI;
import ru.luvas.rmcs.api.table.TableAPI;

/**
 *
 * @author 0xC0deBabe
 */
public class RMCSAPI extends JavaPlugin {
    
    private static boolean loaded = false;
    
    private static BarAPI barAPI;
    
    private static TitleAPI titleAPI;
    
    private static RMCSPlayerManager playerManager;
    
    private static QueueAPI queueAPI;
    
    private static PartyAPI partyAPI;
    
    private static ScoreboardAPI scoreboardAPI;
    
    private static InventoryAPI inventoryAPI;
    
    private static ConfigurationAPI configurationAPI;
    
    private static DatabaseAPI databaseAPI;
    
    private static BungeeAPI bungeeAPI;

    private static KitAPI kitAPI;

    private static CommandsAPI commandsAPI;

    private static SideBoardAPI sideBoardAPI;

    private static TableAPI tableAPI;
    
    /**
     * Проверка, инициализировано ли API.
     * @return true, если API загружено, и его можно использовать.
     */
    public static boolean isLoaded() {
        return loaded;
    }
    
    /**
     * Получение BarAPI, с помощью которого можно работать с прогресс-барами.
     * @return реализацию интерфейса BarAPI.
     */
    public static BarAPI getBarAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return barAPI;
    }
    
    /**
     * Получение TitleAPI, с помощью которого можно работать с тайтлами и табом.
     * @return реализацию интерфейса TitleAPI.
     */
    public static TitleAPI getTitleAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return titleAPI;
    }
    
    /**
     * Получение менеджера игроков, с помощью которого можно получить для конкретного игрока класс
     * RMCSPlayer, содержащий полезную информацию о данном игроке и методы для работы с ней.
     * @return реализацию интерфейса RMCSPlayerManager.
     */
    public static RMCSPlayerManager getPlayerManager() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return playerManager;
    }
    
    /**
     * Получение QueueAPI, с помощью которого можно работать с очередями (добавлять/удалять из них сервер).
     * @return реализацию интерфейса QueueAPI.
     */
    public static QueueAPI getQueueAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return queueAPI;
    }
    
    /**
     * Получение PartyAPI, с помощью которого можно работать с группами.
     * @return реализацию интерфейса PartyAPI.
     */
    public static PartyAPI getPartyAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return partyAPI;
    }
    
    /**
     * Получение ScoreboardAPI, с помощью которого можно создавать
     * ненагрущающие скорборды, работающие на пакетах, для игроков.
     * @return реализацию интерфейса ScoreboardAPI.
     */
    public static ScoreboardAPI getScoreboardAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return scoreboardAPI;
    }
    
    /**
     * Получение InventoryAPI, с помощью которого можно создавать инвентари
     * с кликабельными слотами.
     * @return реализацию интерфейса InventoryAPI.
     */
    public static InventoryAPI getInventoryAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return inventoryAPI;
    }
    
    /**
     * Получение ConfigurationAPI, которое упрощает работу с файлами конфигурации.
     * @return реализацию интерфейса ConfigurationAPI.
     */
    public static ConfigurationAPI getConfigurationAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return configurationAPI;
    }
    
    /**
     * Получение DatabaseAPI для работы с базой данных.
     * @return реализацию интерфейса DatabaseAPI.
     */
    public static DatabaseAPI getDatabaseAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return databaseAPI;
    }
    
    /**
     * Получение BungeeAPI, с помощью которого можно узнать bungee-информацию
     * о данном сервере, о лобби-сервере данного режима, а также перебросить
     * игроков с данного сервера в лобби.
     * @return реализацию интерфейса BungeeAPI.
     */
    public static BungeeAPI getBungeeAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return bungeeAPI;
    }

    /**
     * Получение KitAPI, с помощью которого можно получать различного рода
     * информацию по наборам, доступным игрокам по команде /kit.
     * @return реализацию интерфейса KitAPI.
     */
    public static KitAPI getKitAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return kitAPI;
    }

    /**
     * Получение CommandsAPI, с помощью которого можно регистрировать
     * новые команды (без добавления в plugin.yml).
     * @return реализацию интерфейса CommandsAPI.
     */
    public static CommandsAPI getCommandsAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return commandsAPI;
    }

    /**
     * Получение SideBoardAPI, с помощью которого можно работать с
     * альтернативой скорбордов - сайдбордами.
     * @return реализацию интерфейса SideBoardAPI.
     */
    public static SideBoardAPI getSideBoardAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return sideBoardAPI;
    }

    /**
     * Получение TableAPI, с помощью которого можно работать с
     * двумерно-проецируемыми таблицами.
     * @return реализацию интерфейса TableAPI.
     */
    public static TableAPI getTableAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return tableAPI;
    }
    
}
