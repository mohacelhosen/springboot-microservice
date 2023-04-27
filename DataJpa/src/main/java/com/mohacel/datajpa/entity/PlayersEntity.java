package com.mohacel.datajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CRICKET_PLAYERS_TAB")
public class PlayersEntity {
    @Id
    @Column(name = "PLAYER_ID_COL")
    private Integer playerId;
    @Column(name = "PLAYER_NAME_COL")
    private String playerName;
    @Column(name = "PLAYER_AGE_COL")
    private Integer playerAge;
    private String location;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(Integer playerAge) {
        this.playerAge = playerAge;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Players{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", playerAge=" + playerAge +
                ", location='" + location + '\'' +
                '}';
    }
}
