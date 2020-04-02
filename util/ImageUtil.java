package util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ImageUtil {

    public static void save(BufferedImage image,String path,String name,String suffix){

        try {
            ImageIO.write( image,suffix,new File(path+"\\"+name+"."+suffix));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void randomSave(BufferedImage image,String path,String suffix){
        Random random=new Random();
        save(image,path,random.nextInt()+"",suffix);
    }

    public static BufferedImage createImage(int widch,int heigth){
        return new BufferedImage(widch, heigth, BufferedImage.TYPE_INT_RGB);
    }

}
