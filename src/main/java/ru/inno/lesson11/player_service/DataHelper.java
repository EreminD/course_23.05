package ru.inno.lesson11.player_service;

import java.util.Map;

public interface DataHelper {
    void save(Map<String, Integer> info);

    Map<String, Integer> load();
}
