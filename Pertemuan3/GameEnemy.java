/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sabrina
 */
public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    GameEnemy(){
        
    }
    
    GameEnemy (double widht, double height){
    }
    
    
    GameEnemy (double widht, double height, int positionX, int positionY){
    }

    public void setDimension (double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void setPosition (int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double grtX (){
        return this.positionX;
    }
    
    public double getY (){
        return this.positionY;
    }
    
    public void Run(){
        System.out.println("Player is running");
    }
    public void Run(int incrementX) {
        incrementX = positionX + incrementX;
        System.out.println("Player still running...current X position = "+incrementX) ;
    }
}
