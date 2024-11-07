package dad.micv.ui;

import dad.micv.model.Telefono;
import dad.micv.model.Titulo;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class MiCVApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        TextInputDialog nameDialog = new TextInputDialog();
//       // nameDialog.initOwner(primaryStage);
//        nameDialog.setHeaderText("Introduce tu nombre");
//        nameDialog.setContentText("Nombre:");
//        Optional<String> result = nameDialog.showAndWait();
//        if (result.isPresent()) {
//            System.out.println(result.get());
//        }
//
//        ButtonType hombre = new ButtonType("Hombre");
//        ButtonType mujer = new ButtonType("Mujer");
//        ButtonType mucho = new ButtonType("Mucho");
//        ButtonType poco = new ButtonType("Poco");
//        ButtonType nullp = new ButtonType("NullPointer");
//
//
//        Alert sexoAlert = new Alert(Alert.AlertType.CONFIRMATION);
//        sexoAlert.setHeaderText("Sexo");
//        sexoAlert.getButtonTypes().setAll(hombre, mujer, mucho, poco, nullp);
//        Optional<ButtonType> button = sexoAlert.showAndWait();
//
//        if (button.isPresent() && button.get() == nullp) {
//            System.out.println("Buscate una piba");
//        }

        TelefonoDialog dialog = new TelefonoDialog();
        // dialog.initOwner(primaryStage);
        Optional<Telefono> result = dialog.showAndWait();
        if (result.isPresent()) {
            Telefono tel = result.get();
            System.out.println(tel.getNumero() + " - " + tel.getTipo());
        }

        TituloDialog dialogTitulo = new TituloDialog();
        // dialog.initOwner(primaryStage);
        Optional<Titulo> resultTitulo = dialogTitulo.showAndWait();
        if (result.isPresent()) {
            Titulo title = resultTitulo.get();
            System.out.println(title.getDenominacion());
            System.out.println(title.getOrganizador());
            System.out.println(title.getDesde());
            System.out.println(title.getHasta());
        }
    }
}
