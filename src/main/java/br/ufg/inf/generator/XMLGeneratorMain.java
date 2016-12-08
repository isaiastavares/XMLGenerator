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
        mainContainer.loadScreen(IScreens.ID_OTC, IScreens.VIEW_OTC);
        mainContainer.loadScreen(IScreens.ID_SISTEMA_PAF, IScreens.VIEW_SISTEMA_PAF);
        mainContainer.loadScreen(IScreens.ID_CARACTERISTICAS_PAF, IScreens.VIEW_CARACTERISTICAS_PAF);
        mainContainer.loadScreen(IScreens.ID_APLICACOES_ESPECIAIS, IScreens.VIEW_APLICACOES_ESPECIAIS);
        mainContainer.loadScreen(IScreens.ID_HOMOLOGACAO_ECF, IScreens.VIEW_HOMOLOGACAO_ECF);
        mainContainer.loadScreen(IScreens.ID_QUANTIDADE_RETAGUARDA, IScreens.VIEW_QUANTIDADE_RETAGUARDA);

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
