package keyboard.parent;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PavNum extends Parent {

	private ArrayList<Touche> lesTouches;

	public PavNum() {

		Rectangle fond = new Rectangle();
		fond.setWidth(300);
		fond.setHeight(300);
		fond.setFill(Color.BLACK);
		fond.setArcHeight(50);
		fond.setArcWidth(50);

		this.getChildren().add(fond);

		this.setTranslateX(100);
		this.setTranslateY(100);

		int size = 100;

		this.lesTouches = new ArrayList<Touche>();
		lesTouches.add(new Touche("7", 0, 0, size));
		lesTouches.add(new Touche("8", 100, 0, size));
		lesTouches.add(new Touche("9", 200, 0, size));
		lesTouches.add(new Touche("4", 0, 100, size));
		lesTouches.add(new Touche("5", 100, 100, size));
		lesTouches.add(new Touche("6", 200, 100, size));
		lesTouches.add(new Touche("1", 0, 200, size));
		lesTouches.add(new Touche("2", 100, 200, size));
		lesTouches.add(new Touche("3", 200, 200, size));
		lesTouches.add(new Touche("0", 100, 300, size));

		for (Touche t : lesTouches)
			this.getChildren().add(t);

		this.setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				for (Touche t : lesTouches) {
					if (event.getText().equals(t.getLettre()))
						t.appuyer();
				}
			}
		});

		this.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				for (Touche t : lesTouches) {
					if (event.getText().equals(t.getLettre()))
						t.relacher();
				}
			}
		});
	}

}
