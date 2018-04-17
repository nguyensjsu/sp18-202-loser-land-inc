package com.loserland.actors;

public class PowerSquareFactory {
    public enum PowerType {
        LARGE_PADDLE, SMALL_PADDLE, FAST_BALL, SLOW_BALL, FIRE_BALL, PYROBLAS_BALL, MULTI_BALL
    }

    public static PowerSquare makePowerSquare(PowerType type) {
        switch (type) {
            case FAST_BALL:
                return new SpeedUpPower();
            case SLOW_BALL:
                return new SpeedDownPower();
            case FIRE_BALL:
                return new FireBallPower();
            case MULTI_BALL:
                break;
            case PYROBLAS_BALL:
                break;
            case LARGE_PADDLE:
                return new LargePaddlePower();
            case SMALL_PADDLE:
                return new SmallPaddlePower();
            default:
                break;
        }
        return null;
    }

    public static int getNumberOfPowers() {
        return PowerType.values().length;
    }
}