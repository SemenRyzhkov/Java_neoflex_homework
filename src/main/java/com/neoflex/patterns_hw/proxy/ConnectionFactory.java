package com.neoflex.patterns_hw.proxy;

public class ConnectionFactory {
    private DatabaseManager manager;

    public ConnectionFactory(DatabaseManager manager) {
        this.manager = manager;
    }

    public void connect() {
        String connection = manager.getConnection().split(" ")[2];
        String url = "localhost:port/";
        System.out.printf("Connection to %s%s%n", url, connection);
    }
}
