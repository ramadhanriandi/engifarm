import javax.swing.*;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

import java.util.*;
import player.*;
import product.*;
import cell.*;
import linkedlist.*;
import point.*;
import render.*;
import animal.*;

public class DrawUI {

  JLabel[][] lbl;
  public DrawUI()  {

    lbl = new JLabel[11][11];

    for (int i = 0; i < 11; i++)  {
      for (int j = 0; j < 11; j++)  {
        lbl[i][j] = new JLabel();
      }
    }
  }

  public JLabel[][] getLabel()  {
    return lbl;
  }

  public void UpdateUI(char[][] draw,MatrixOfCell m)  {
    for (int i = 0; i < 11; i++)  {
      for (int j = 0; j < 11; j++)  {
        String filename = "txt";
        if (draw[i][j]=='P')  {
          if(m.getCell(i,j).getIsGrassland()) {
            filename= "sprite/Grassland_Player.png";
          }
          else if(m.getCell(i,j).getIsBarn()) {
            filename= "sprite/Barn_Player.png";
          }
          else {
            filename= "sprite/Coop_Player.png";
          }
        }
        else if (draw[i][j]=='B')  {
          filename = "sprite/Buffalo.png";
        }
        else if(draw[i][j]=='O')  {
          filename = "sprite/Cow.png";
        }
        else if(draw[i][j]=='C')  {
          filename = "sprite/Cat.png";
        }
        else if(draw[i][j]=='E')  {
          filename = "sprite/Eagle.png";
        }
        else if(draw[i][j]=='R')  {
          filename = "sprite/Rabbit.png";
        }
        else if(draw[i][j]=='H')  {
          filename = "sprite/Chicken.png";
        }
        else if(draw[i][j]=='D')  {
          filename = "sprite/Duck.png";
        }
        else if(draw[i][j]=='M')  {
          filename = "sprite/Mixer.png";
        }
        else if(draw[i][j]=='T')  {
          filename = "sprite/Truck.png";
        }
        else if(draw[i][j]=='W')  {
          filename = "sprite/Well.png";
        }
        else if(draw[i][j]=='@')  {
          filename = "sprite/Barn_Grass.png";
        }
        else if(draw[i][j]=='x')  {
          filename = "sprite/Barn.png";
        }
        else if(draw[i][j]=='*')  {
          filename = "sprite/Coop_Grass.png";
        }
        else if(draw[i][j]=='o')  {
          filename = "sprite/Coop.png";
        }
        else if(draw[i][j]=='#')  {
          filename = "sprite/Grassland_Grass.png";
        }
        else if(draw[i][j]=='-')  {
          filename = "sprite/Grassland.png";
        }

        else {
          filename = "green.jpg";
        }
        try{
          BufferedImage bf = ImageIO.read(new File(filename));
          ImageIcon icon = new ImageIcon(bf);
          lbl[i][j].setIcon(icon);
        }
        catch(IOException e){
        }
      }
    }
  }

}
