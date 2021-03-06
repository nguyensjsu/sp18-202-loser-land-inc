package com.loserland.context;

import com.loserland.configs.ConfigFactory;

import java.io.Serializable;

public class GameState implements Serializable {

    private GameStage gameStage;
    private GameLevel gameLevel;
    private GameScore gameScore;
    private GameLives gameLives;



    private GamePaddle gamePaddle;

    public GameScore getGameScore() {
        return gameScore;
    }

    public GameState() {
        gameStage = GameStageLoader.getInstance().load();
        gameScore = new GameScore();
        gameLevel = new GameLevel();
        gameLives = new GameLives(ConfigFactory.getInstance().getConfig(GameContext.GAME_DEFAULT_CONFIG_FILENAME).get(Integer.class, GameContext.PLAYER_LIVES));
        gamePaddle = new GamePaddle();
    }

    public GameStage getGameStage() {
        return gameStage;
    }

    public void setGameStage(GameStage gameStage) {
        this.gameStage = gameStage;
    }

    public GameLevel getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }


    public GameLives getGameLives() {
        return gameLives;
    }

    public GamePaddle getGamePaddle() {
        return gamePaddle;
    }

    public void setGamePaddle(GamePaddle gamePaddle) {
        this.gamePaddle = gamePaddle;
    }
}
