import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class App extends Application {

    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));//Instanciamos o loader para termos a tela do mainView
            ScrollPane scrollPane = loader.load();

            scrollPane.setFitToHeight(true);
            scrollPane.setFitToWidth(true);//Mete o menu direito, mete na dimensao direita

            Scene mainScene = new Scene(scrollPane);
            primaryStage.setScene(mainScene);//Definimos uma scene
            primaryStage.setTitle("Sample JavaFX application");//Titulo do palco
            primaryStage.show();//Damos show do palco
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
