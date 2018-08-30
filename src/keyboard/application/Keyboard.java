package keyboard.application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import keyboard.parent.PavNum;

public class Keyboard extends Application{

	public static void main(String[] args) {
        Application.launch(Keyboard.class, args);
    }


	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("KeyboardFX");

		Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.BLANCHEDALMOND);

        PavNum monPavNum = new PavNum();
        root.getChildren().add(monPavNum);

        primaryStage.setScene(scene);

        primaryStage.setResizable(false);
        primaryStage.show();

        monPavNum.requestFocus();
	}

}
