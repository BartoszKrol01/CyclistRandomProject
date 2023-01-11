package main;

public class MyThread implements Runnable {

    public static int time = 200;

    private Cyclist cyclist;
    private MyPanel panel;

    public MyThread(Cyclist cyclist, MyPanel panel) {
        this.cyclist = cyclist;
        this.panel = panel;
    }
    //800, 600
    @Override
    public void run() {
        do {
            cyclist.setNumberOfSteps((int)(Math.random() * 21));
        }while(cyclist.getNumberOfSteps()<5);

        cyclist.setDirection(Direction.values()[(int)(Math.random()*Direction.values().length)]);

        if(cyclist.getVelX()<0) {
            cyclist.setVelX(-cyclist.getVelX());
        }
        if(cyclist.getVelY()<0) {
            cyclist.setVelY(-cyclist.getVelY());
        }
        for(int i=0; i<cyclist.getNumberOfSteps(); i++) {

            if(cyclist.direction.equals(Direction.NORTH)) {
                if(cyclist.getLocationY()-cyclist.getVelY()<0) {
                    cyclist.setVelY(-cyclist.getVelY());
                }
                cyclist.setLocationY(cyclist.getLocationY()-cyclist.getVelY());
            }
            else if(cyclist.direction.equals(Direction.SOUTH)) {
                if(cyclist.getLocationY()+cyclist.getVelY()>MyPanel.WINDOW_SIZE.height - cyclist.getCyclistHeight()) {
                    cyclist.setVelY(-cyclist.getVelY());
                }
                cyclist.setLocationY(cyclist.getLocationY()+cyclist.getVelY());
            }
            else if(cyclist.direction.equals(Direction.EAST)) {
                if(cyclist.getLocationX()+cyclist.getVelX()>MyPanel.WINDOW_SIZE.width) {
                    cyclist.setVelX(-cyclist.getVelX());
                }
                cyclist.setLocationX(cyclist.getLocationX()+cyclist.getVelX());
            }
            else {
                if(cyclist.getLocationX()-cyclist.getVelX()<0 + cyclist.getCyclistWidth()) {
                    cyclist.setVelX(-cyclist.getVelX());
                }
                cyclist.setLocationX(cyclist.getLocationX()-cyclist.getVelX());
            }

            panel.repaint();
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
