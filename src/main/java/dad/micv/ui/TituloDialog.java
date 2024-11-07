package dad.micv.ui;

import dad.micv.model.Telefono;
import dad.micv.model.Titulo;
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
import java.time.LocalDate;
import java.util.ResourceBundle;

public class TituloDialog extends Dialog<Titulo> implements Initializable {

    @FXML
    private TextField denominacionText;

    @FXML
    private DatePicker desdeDatePicker;

    @FXML
    private DatePicker hastaDatePicker;

    @FXML
    private TextField organizadorText;

    @FXML
    private GridPane root;

    // model
    private final StringProperty denominacion = new SimpleStringProperty();
    private final StringProperty organizador = new SimpleStringProperty();
    private final ObjectProperty<LocalDate> desdeDate = new SimpleObjectProperty<>();
    private final ObjectProperty<LocalDate> hastaDate = new SimpleObjectProperty<>();

    public TituloDialog() {
        super();
        // Load view
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/TituloDialogView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTitle("Nuevo título");
        setHeaderText("Introduce los datos del nuevo título");
        getDialogPane().setContent(root);

        getDialogPane().getButtonTypes().setAll(
                new ButtonType("Crear", ButtonBar.ButtonData.OK_DONE),
                ButtonType.CANCEL
        );
        setResultConverter(this::onResult);

        // Bindings
        denominacion.bind(denominacionText.textProperty());
        organizador.bind(organizadorText.textProperty());
        desdeDate.bind(desdeDatePicker.valueProperty());
        hastaDate.bind(hastaDatePicker.valueProperty());

    }

    private Titulo onResult(ButtonType buttonType) {
        if (buttonType.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
            Titulo titulo = new Titulo();
            titulo.setDenominacion(denominacion.get());
            titulo.setDesde(desdeDate.get());
            titulo.setHasta(hastaDate.get());
            titulo.setOrganizador(organizadorText.getText());
            return titulo;
        }
        return null;
    }

}
