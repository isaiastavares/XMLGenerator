package br.ufg.inf.generator;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class XMLGeneratorMain extends Application {

	public static String idEmpresaDesenvolvedora = "empresaDesenvolvedora";
    public static String viewEmpresaDesenvolvedora = "EmpresaDesenvolvedora.fxml";
    public static String idOtc = "otc";
    public static String viewOtc = "Otc.fxml";
    public static String idLaudoFinal = "laudoFinal";
    public static String viewLaudoFinal = "LaudoFinal.fxml";

	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(idEmpresaDesenvolvedora, viewEmpresaDesenvolvedora);
        mainContainer.loadScreen(idOtc, viewOtc);
        mainContainer.loadScreen(idLaudoFinal, viewLaudoFinal);

        mainContainer.setScreen(idEmpresaDesenvolvedora);

        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}
