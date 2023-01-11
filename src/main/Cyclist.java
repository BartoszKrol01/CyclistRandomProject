package main;

public class Cyclist {

    public Direction direction;

    private int cyclistWidth = 30;
    private int cyclistHeight = 30;
    private int locationX;
    private int locationY;
    private int velX = 10;
    private int velY = 10;
    private int numberOfSteps;

    public Cyclist() {
        this.locationX = MyPanel.WINDOW_SIZE.width/2;
        this.locationY = MyPanel.WINDOW_SIZE.height/2;
    }

    public int getLocationX() {
        return locationX;
    }
    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }
    public int getLocationY() {
        return locationY;
    }
    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }
    public int getCyclistWidth() {
        return cyclistWidth;
    }

    public void setCyclistWidth(int cyclistWidth) {
        this.cyclistWidth = cyclistWidth;
    }

    public int getCyclistHeight() {
        return cyclistHeight;
    }

    public void setCyclistHeight(int cyclistHeight) {
        this.cyclistHeight = cyclistHeight;
    }

    public int getVelX() {
        return velX;
    }

    public int getVelY() {
        return velY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }
}
