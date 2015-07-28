package fr.schawnndev;

/**
 * Example class
 *
 * @author SchawnnDev
 * Created on 28/07/2015 21:02
 */

public class Example {

    public static void main(String[] args) {
        ServerStatus serverStatus = new ServerStatus("play.uhcgames.com");

        System.out.println("Server motd: " + serverStatus.getServerStatus(StatusType.MOTD));
        System.out.println("Server motd with colors " + serverStatus.getServerStatus(StatusType.MOTD_RAW));
        System.out.println("Server players: " + serverStatus.getServerStatus(StatusType.PLAYERS));
        System.out.println("Server player limit : " + serverStatus.getServerStatus(StatusType.MAX_PLAYERS));
        System.out.println("Server ping (from the website host server) : " + serverStatus.getServerStatus(StatusType.PING));
    }

}
