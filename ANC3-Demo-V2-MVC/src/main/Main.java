package main;

import ctrl.Ctrl;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Text;
import view.View;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text();   
        Ctrl ctrl = new Ctrl(text);
        View view = new View(primaryStage, ctrl);
        text.addObserver(view);
        text.notif(Text.TypeNotif.INIT);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
