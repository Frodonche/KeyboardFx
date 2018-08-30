package keyboard.parent;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Touche extends Parent{

	private Rectangle fond;
	private String lettre;

	public Touche(String lettre, int x, int y, int size){
		fond = new Rectangle(size, size, Color.FLORALWHITE);
		fond.setArcHeight(50);
		fond.setArcWidth(50);
		this.getChildren().add(fond);

		Text lettreText = new Text(lettre);
		lettreText.setFont(new Font(25));
		lettreText.setFill(Color.GRAY);

		lettreText.setX(size*40/100); // pour centrer : 40% en x et 55% en y
		lettreText.setY(size*55/100);

		this.getChildren().add(lettreText);

		this.setTranslateX(x);
		this.setTranslateY(y);

		this.lettre = lettre;

	}

	public String getLettre(){
		return lettre;
	}

	public void appuyer(){
        fond.setFill(Color.AQUAMARINE);
    }

    public void relacher(){
    	fond.setFill(Color.FLORALWHITE);
    }

}
