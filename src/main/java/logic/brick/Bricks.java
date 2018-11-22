package logic.brick;

import logic.level.Level;

import java.util.Observable;

public abstract class Bricks extends Observable implements Brick{

    protected int brickScore;
    protected int totalHits;

    public Bricks(Level level){
        this.addObserver(level);
    }

    public void hit(){
        if (!isDestroyed()){
            int aux = this.totalHits - 1;
            this.totalHits = aux;
        }

    }

    public boolean isDestroyed(){
        return (this.totalHits == 0);
    }

    public int getScore(){
        return this.brickScore;
    }

    public int remainingHits(){
        return totalHits;
    }
}
