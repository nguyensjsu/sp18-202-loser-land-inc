package com.loserland.context;



import com.loserland.actors.PowerGenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GameStage implements Serializable{
    private List<GameBrick> bricks;

    public GameStage() {
        bricks = new ArrayList<>();
        PowerGenerator.reset();
    }

    public List<GameBrick> getBricks() {
        return bricks;
    }

    public void addBrick(GameBrick brick){
        bricks.add(brick);
    }
    public void setBricks(List<GameBrick> bricks) {
        this.bricks = bricks;
    }

    @Override
    public String toString() {
        String string = "";
        for(GameBrick brick: bricks){
            string +=  "(" + brick.getX() + "," + brick.getY() + ")\n";
        }
        return string;
    }
}
