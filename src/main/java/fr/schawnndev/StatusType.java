package fr.schawnndev;

/**
 * StatusType enum
 *
 * @author SchawnnDev
 * Created on 28/07/2015 20:00
 */

public enum StatusType {

    PING(1, "ping"),

    MOTD(2, "motd"),

    MOTD_RAW(3, "motd_raw"),

    PLAYERS(4, "players"),

    MAX_PLAYERS(5, "maxplayers");

    private int id;
    private String name;

    private StatusType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
