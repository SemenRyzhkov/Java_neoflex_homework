package com.neoflex.patterns_hw.proxy;

public class DatabaseManager {
    private String dataBaseName;

    public DatabaseManager(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getConnection() {
        return "Connection to " + dataBaseName;
    }
}
