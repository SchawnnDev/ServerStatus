package fr.schawnndev;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * ServerStatus class
 *
 * @author SchawnnDev
 * Created on 28/07/2015 19:35
 */

public class ServerStatus {
    private String address;
    private int port;

    /**
     * Create a new ServerStatus instance with the default port 25565
     *
     * @param address Address of the server
     */

    public ServerStatus(String address) {
        this(address, 25565);
    }

    /**
     * Create a new ServerStatus intance
     *
     * @param address Address of the server
     * @param port    Port of the server
     */

    public ServerStatus(String address, int port) {
        this.address = address;
        this.port = port;
    }

    /**
     * Convert data of server from website to JSONObject
     *
     * @return JSONObject of the server data
     */

    private JSONObject getJsonObject() throws ParseException {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new URL("http://www.schawnndev.fr/lib/serverstatus.php?address=" + this.address + "&port=" + port).openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String json = "";

        while (scanner.hasNext())
            json += scanner.nextLine();

        scanner.close();

        return (JSONObject) new JSONParser().parse(json);
    }

    /**
     * Get the value of StatusType
     *
     * @param statusType The StatusType
     * @return The value from StatusType
     */

    public Object getServerStatus(StatusType statusType) {
        JSONObject jsonObject = null;

        try {
            jsonObject = getJsonObject();
        } catch (ParseException e){
            e.printStackTrace();
        }

        if (jsonObject == null)
            return false;

        return jsonObject.get(statusType.getName());
    }

    /**
     * @return The port of the server
     */

    public int getPort() {
        return port;
    }

    /**
     * Set the port of the server
     *
     * @param port The port of the server
     */

    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return The address of the server
     */

    public String getAddress() {
        return address;
    }

    /**
     * Set the address of the server
     *
     * @param address The address of the server
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Recreate new ServerStatus instance with the same data
     *
     * @return A new ServerStatus
     */

    public ServerStatus clone() {
        return new ServerStatus(this.address, this.port);
    }

}