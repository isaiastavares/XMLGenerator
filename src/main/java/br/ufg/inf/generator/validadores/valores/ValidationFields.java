package br.ufg.inf.generator.validadores.valores;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.util.Duration;

/**
 * Classe Utilitária para validar campos.
 *
 * @author Isaias Tavares
 *
 */
public class ValidationFields {

    private static final Logger LOG = Logger.getLogger(ValidationFields.class);

    private static final String STYLE_BORDER_VALIDATION = "-fx-border-color: #FF0000";
    private static final String STYLE_TOOLTIP = "-fx-background-color: linear-gradient(#FF6B6B , #FFA6A6 );"
            + " -fx-font-weight: bold;";
    private static final Tooltip TOOLTIP = new Tooltip("Esse campo é obrigatório!");
    private static final String TITULO_VALIDACAO_CAMPO_OBRIGATORIO = "Ops! Campo obrigat\u00f3rio n\u00e3o preenchido!";
    private static final String TITULO_VALIDACAO = "Validação";

    /**
     * Valida se os campos passados por parâmetro estão preenchidos.
     *
     * Atualmente está validando apenas TextField, ComboBox e TextArea.
     *
     * @param itemToCheck campo a ser verificado
     * @return true se estiverem válidos e false caso contrário
     */
    public static boolean checkEmptyFields(Node... itemToCheck) {
        List<Node> failedFields = new ArrayList<>();
        TOOLTIP.setStyle(STYLE_TOOLTIP);
        hackTooltipStartTiming(TOOLTIP);
        for (Node componente : arrayToList(itemToCheck)) {
            if (componente instanceof TextField) {
                TextField textField = (TextField) componente;
                textField.textProperty().addListener((observable, oldValue, newValue)
                        -> removeToolTipAndBorderColor(textField, TOOLTIP));
                if (StringUtils.isBlank(textField.getText())) {
                    failedFields.add(componente);
                    addToolTipAndBorderColor(textField, TOOLTIP);
                } else {
                    removeToolTipAndBorderColor(textField, TOOLTIP);
                }
            } else if (componente instanceof ComboBox) {
                ComboBox comboBox = (ComboBox) componente;
                comboBox.valueProperty().addListener((observable, oldValue, newValue)
                        -> removeToolTipAndBorderColor(comboBox, TOOLTIP));
                if (comboBox.getValue() == null) {
                    failedFields.add(componente);
                    addToolTipAndBorderColor(comboBox, TOOLTIP);
                } else {
                    removeToolTipAndBorderColor(comboBox, TOOLTIP);
                }
            } else if (componente instanceof TextArea) {
                TextArea textArea = (TextArea) componente;
                textArea.textProperty().addListener((observable, oldValue, newValue)
                        -> removeToolTipAndBorderColor(textArea, TOOLTIP));
                if (StringUtils.isBlank(textArea.getText())) {
                    failedFields.add(componente);
                    addToolTipAndBorderColor(textArea, TOOLTIP);
                } else {
                    removeToolTipAndBorderColor(textArea, TOOLTIP);
                }
            }
        }
        return failedFields.isEmpty();
    }

    private static void addToolTipAndBorderColor(Node n, Tooltip t) {
        Tooltip.install(n, t);
        n.setStyle(STYLE_BORDER_VALIDATION);
    }

    private static void removeToolTipAndBorderColor(Node n, Tooltip t) {
        Tooltip.uninstall(n, t);
        n.setStyle(null);
    }

    private static List<Node> arrayToList(Node[] nodes) {
        List<Node> listItems = new ArrayList<>();
        for (Node node : nodes) {
            listItems.add(node);
        }
        return listItems;
    }

    private static void hackTooltipStartTiming(Tooltip tooltip) {
        try {
            Field fieldBehavior = tooltip.getClass().getDeclaredField("BEHAVIOR");
            fieldBehavior.setAccessible(true);
            Object objBehavior = fieldBehavior.get(tooltip);

            Field fieldTimer = objBehavior.getClass().getDeclaredField("activationTimer");
            fieldTimer.setAccessible(true);
            Timeline objTimer = (Timeline) fieldTimer.get(objBehavior);

            objTimer.getKeyFrames().clear();
            objTimer.getKeyFrames().add(new KeyFrame(new Duration(5)));
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    public static void validacao(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(TITULO_VALIDACAO);
        alert.setHeaderText(TITULO_VALIDACAO_CAMPO_OBRIGATORIO);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
