package dad.micv.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Telefono {
    private final StringProperty numero = new SimpleStringProperty();
    private final ObjectProperty<TipoTelefono> tipo = new SimpleObjectProperty<>();

    public String getNumero() {
        return numero.get();
    }

    public StringProperty numeroProperty() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero.set(numero);
    }

    public TipoTelefono getTipo() {
        return tipo.get();
    }

    public ObjectProperty<TipoTelefono> tipoProperty() {
        return tipo;
    }

    public void setTipo(TipoTelefono tipo) {
        this.tipo.set(tipo);
    }
}
