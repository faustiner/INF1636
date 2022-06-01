package view;

import java.awt.*;
import java.io.*;
import javax.imageio.*;

public class Dices {

    Image []dices = new Image[6];
	
	public Dices() {
		try {
			dices[0] = ImageIO.read(new File("src/view/images/die_face_1.png"));
			dices[1] = ImageIO.read(new File("src/view/images/die_face_2.png"));
			dices[2] = ImageIO.read(new File("src/view/images/die_face_3.png"));
			dices[3] = ImageIO.read(new File("src/view/images/die_face_4.png"));
			dices[4] = ImageIO.read(new File("src/view/images/die_face_5.png"));
			dices[5] = ImageIO.read(new File("src/view/images/die_face_6.png"));
			

		  } catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
	
	}
	public Image Dice(int value) {
		return dices[value];
	}
}
