package com.tom.lottery;

import java.util.HashSet;
import java.util.Set;

public class GameTest {
    public static void main(String[] args) {
        NumberGame bigGame = new BigGame();
        NumberGame game539 = new Game539();
        Set<NumberGame> games = new HashSet<>();
        games.add(bigGame);
        games.add(game539);
        for(NumberGame game : games) {
            game.generate();
        }
    }
}
