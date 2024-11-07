package dad.micv.ui;

import dad.micv.model.Telefono;
import dad.micv.model.TipoTelefono;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TelefonoDialog extends Dialog<Telefono> implements Initializable {

    @FXML
    private TextField numeroText;

    @FXML
    private GridPane root;

    @FXML
    private ComboBox<TipoTelefono> tipoCombo;

    // model
    private final StringProperty numero = new SimpleStringProperty();
    private final ObjectProperty<TipoTelefono> tipo = new SimpleObjectProperty<>();

    public TelefonoDialog() {
        super();
        // Load view
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TelefonoDialogView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Init dialog
        setTitle("Nuevo teléfono");
        setHeaderText("Introduce los datos del nuevo teléfono");
        getDialogPane().setContent(root);
        getDialogPane().getButtonTypes().setAll(
                new ButtonType("Crear", ButtonBar.ButtonData.OK_DONE),
                ButtonType.CANCEL
        );
        setResultConverter(this::onResult);
        // bindings

        numero.bind(numeroText.textProperty());
        tipo.bind(tipoCombo.getSelectionModel().selectedItemProperty());

        // populate combo

        tipoCombo.getItems().setAll(TipoTelefono.values());
    }

    private Telefono onResult(ButtonType buttonType) {
        if (buttonType.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
            Telefono telefono = new Telefono();
            telefono.setNumero(numero.get());
            telefono.setTipo(tipo.get());
            return telefono;
        }
        return null;
    }
}
