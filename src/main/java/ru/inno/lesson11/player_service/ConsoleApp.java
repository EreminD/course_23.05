package ru.inno.lesson11.player_service;

import java.util.Map;
import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {

        DbHelper dbH = new DbHelper();
        DataHelper dataHelper = new DbHelper();


        System.out.println("Укажите источник: ");
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();

        DataHelper dh = null;

        if (source.startsWith("x")){
            dh = new XmlHelper();
        }

        if (source.startsWith("j")){
            dh = new JsonHelper();
        }

        if (source.startsWith("d")){
            dh = new DbHelper();
        }

        PlayerService playerService = new PlayerServiceImpl(dh);

        String command = scanner.nextLine();

        if (command.equalsIgnoreCase("leaderboard")){
            Map<String, Integer> leaderBoard = playerService.getLeaderBoard();
            /// как вывести в консоль игроков

        }

    }
}
