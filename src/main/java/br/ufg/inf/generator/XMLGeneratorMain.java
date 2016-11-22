package br.ufg.inf.generator;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class XMLGeneratorMain extends Application {

	public static final String ID_EMPRESA_DESENVOLVEDORA = "empresaDesenvolvedora";
    public static final String VIEW_EMPRESA_DESENVOLVEDORA = "EmpresaDesenvolvedora.fxml";
    public static final String ID_OTC = "otc";
    public static final String VIEW_OTC = "Otc.fxml";
    public static final String ID_LAUDO_FINAL = "laudoFinal";
    public static final String VIEW_LAUDO_FINAL = "LaudoFinal.fxml";

	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(ID_EMPRESA_DESENVOLVEDORA, VIEW_EMPRESA_DESENVOLVEDORA);
        mainContainer.loadScreen(ID_OTC, VIEW_OTC);
        mainContainer.loadScreen(ID_LAUDO_FINAL, VIEW_LAUDO_FINAL);

        mainContainer.setScreen(ID_EMPRESA_DESENVOLVEDORA);

        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}
