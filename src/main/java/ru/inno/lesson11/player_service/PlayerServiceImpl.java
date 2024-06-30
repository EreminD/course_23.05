package ru.inno.lesson11.player_service;

import java.util.Map;

public class PlayerServiceImpl implements PlayerService{

    private Map<String, Integer> storage;
    private DataHelper dataHelper;

    public PlayerServiceImpl(DataHelper dh) {
        this.dataHelper = dh;
        this.storage = dataHelper.load();
    }

    @Override
    public int addPoints(int playerId, int points) {

        dataHelper.save(storage);
        return 0;
    }

    @Override
    public int addPlayer(String name) {
        dataHelper.save(storage);
        return 0;
    }

    @Override
    public String removePlayer(int id) {
        dataHelper.save(storage);
        return null;
    }

    @Override
    public Map<String, Integer> getLeaderBoard() {
        return null;
    }
}
