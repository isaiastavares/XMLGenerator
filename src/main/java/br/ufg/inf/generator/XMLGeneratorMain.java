package br.ufg.inf.generator;

import br.ufg.inf.generator.controller.IScreens;
import br.ufg.inf.generator.controller.ScreensController;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class XMLGeneratorMain extends Application {

	private static final String TITLE_XML_GENERATOR = "XML Generator";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    	ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(IScreens.ID_LAUDO_INICIAL, IScreens.VIEW_LAUDO_INICIAL);
        mainContainer.loadScreen(IScreens.ID_EMPRESA_DESENVOLVEDORA, IScreens.VIEW_EMPRESA_DESENVOLVEDORA);

        mainContainer.setScreen(IScreens.ID_LAUDO_INICIAL);

        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root, Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setTitle(TITLE_XML_GENERATOR);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
