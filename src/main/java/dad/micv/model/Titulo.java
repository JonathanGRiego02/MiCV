package dad.micv.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Titulo {
    private final ObjectProperty<LocalDate> desde = new SimpleObjectProperty<LocalDate>();
    private final ObjectProperty<LocalDate> hasta = new SimpleObjectProperty<LocalDate>();
    private final StringProperty denominacion = new SimpleStringProperty();
    private final StringProperty organizador = new SimpleStringProperty();


    public LocalDate getDesde() {
        return desde.get();
    }

    public ObjectProperty<LocalDate> desdeProperty() {
        return desde;
    }

    public void setDesde(LocalDate desde) {
        this.desde.set(desde);
    }

    public LocalDate getHasta() {
        return hasta.get();
    }

    public ObjectProperty<LocalDate> hastaProperty() {
        return hasta;
    }

    public void setHasta(LocalDate hasta) {
        this.hasta.set(hasta);
    }

    public String getDenominacion() {
        return denominacion.get();
    }

    public StringProperty denominacionProperty() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion.set(denominacion);
    }

    public String getOrganizador() {
        return organizador.get();
    }

    public StringProperty organizadorProperty() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador.set(organizador);
    }
}
