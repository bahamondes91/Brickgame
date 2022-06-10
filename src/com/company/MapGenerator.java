package com.company;

import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int brichWidth;
    public int brickHeight;
    public MapGenerator(int row, int col){
        map = new int[row][col];
        for (int i = 0; i < map.length; i++){
            for (int j=0; j < map[0].length; j++){
                map[i][j] = 1;
            }
        }
        brichWidth = 540/col;
        brickHeight = 150/row;
    }

    public void draw(Graphics2D g){
        for (int i = 0; i < map.length; i++){
            for (int j=0; j < map[0].length; j++){
               if (map[i][j] > 0){
                   g.setColor(Color.white);
                   g.fillRect( j * brichWidth + 80, i * brickHeight + 50, brichWidth, brickHeight);

                   g.setStroke(new BasicStroke(3));
                   g.setColor(Color.black);
                  g.drawRect( j * brichWidth + 80, i * brickHeight + 50, brichWidth, brickHeight);
               }
            }
        }
    }

    public void setBrickValue(int value, int row,int col){
        map[row][col] = value;
    }

}