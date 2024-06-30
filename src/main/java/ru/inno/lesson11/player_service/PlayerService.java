package ru.inno.lesson11.player_service;

import java.util.Map;

public interface PlayerService {

    int addPoints(int playerId, int points);

    int addPlayer(String name);

    String removePlayer(int id);

    Map<String, Integer> getLeaderBoard();
}
