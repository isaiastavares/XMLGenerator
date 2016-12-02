package br.ufg.inf.generator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class XMLGeneratorMain extends Application {

    public static final String ID_APLICACOES_ESPECIAIS = "aplicacoesEspeciais";
    public static final String VIEW_APLICACOES_ESPECIAIS = "AplicacoesEspeciaisPAF.fxml";
    public static final String ID_CARACTERISTICAS_PAF = "caracteristicasPaf";
    public static final String VIEW_CARACTERISTICAS_PAF = "CaracteristicasPaf.fxml";
    public static final String ID_EMPRESA_DESENVOLVEDORA = "empresaDesenvolvedora";
    public static final String VIEW_EMPRESA_DESENVOLVEDORA = "EmpresaDesenvolvedora.fxml";
    public static final String ID_LAUDO_INICIAL = "laudoInicial";
    public static final String VIEW_LAUDO_INICIAL = "LaudoInicial.fxml";
    public static final String ID_LAUDO_FINAL = "laudoFinal";
    public static final String VIEW_LAUDO_FINAL = "LaudoFinal.fxml";
    public static final String ID_OTC = "otc";
    public static final String VIEW_OTC = "Otc.fxml";
    public static final String ID_SISTEMAS_PAF = "sistemasPaf";
    public static final String VIEW_SISTEMAS_PAF = "SistemaPaf.fxml";

    public static void main(String[] args) {
        launch(args);
    }

    Button btnOk;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.DECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("LaudoInicial.fxml"));

        Scene scene = new Scene(root, Color.TRANSPARENT);

        primaryStage.setScene(scene);

        primaryStage.show();

//        btnOk.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent t) {
//                System.exit(0);
//            }
//        });
    }
}
