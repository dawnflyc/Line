import line.DrawLine;
import util.ImageUtil;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <12; i++) {
           line();

        }
    }
    public static void line(){
        BufferedImage image= ImageUtil.createImage(108,108);
        image.getGraphics().fillRect(0,0,108,108);
        Random random=new Random();
        DrawLine drawLine=new DrawLine(random.nextInt(108),random.nextInt(108),random.nextInt(108),random.nextInt(108));
        //DrawLine drawLine=new DrawLine(20,48,12,58);
        System.out.println(drawLine.toString());
        while (true){
            if (!drawLine.isEnd()){
                drawLine.action();
                image.setRGB(drawLine.getRx(),drawLine.getRy(),0x56);
            }else {
                break;
            }
        }
        ImageUtil.randomSave(image,"./src/image","png");
    }
}
