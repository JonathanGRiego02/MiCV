package dad.micv.model;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class Personal {
    private final StringProperty identificacion = new SimpleStringProperty();
    private final StringProperty nombre = new SimpleStringProperty();
    private final StringProperty apellidos = new SimpleStringProperty();
    private final ObjectProperty<LocalDate> fechaNacimiento = new SimpleObjectProperty<LocalDate>();
    private final StringProperty direccion = new SimpleStringProperty();
    private final StringProperty  codigoPostal= new SimpleStringProperty();
    private final StringProperty localidad = new SimpleStringProperty();
    private final StringProperty pais = new SimpleStringProperty();
    private final ListProperty<Nacionalidad> nacionalidades = new SimpleListProperty<>(FXCollections.observableArrayList());

    public String getIdentificacion() {
        return identificacion.get();
    }

    public StringProperty identificacionProperty() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion.set(identificacion);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellidos() {
        return apellidos.get();
    }

    public StringProperty apellidosProperty() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos.set(apellidos);
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento.get();
    }

    public ObjectProperty<LocalDate> fechaNacimientoProperty() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento.set(fechaNacimiento);
    }

    public String getDireccion() {
        return direccion.get();
    }

    public StringProperty direccionProperty() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }

    public String getCodigoPostal() {
        return codigoPostal.get();
    }

    public StringProperty codigoPostalProperty() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal.set(codigoPostal);
    }

    public String getLocalidad() {
        return localidad.get();
    }

    public StringProperty localidadProperty() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad.set(localidad);
    }

    public String getPais() {
        return pais.get();
    }

    public StringProperty paisProperty() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais.set(pais);
    }

    public ObservableList<Nacionalidad> getNacionalidades() {
        return nacionalidades.get();
    }

    public ListProperty<Nacionalidad> nacionalidadesProperty() {
        return nacionalidades;
    }

    public void setNacionalidades(ObservableList<Nacionalidad> nacionalidades) {
        this.nacionalidades.set(nacionalidades);
    }
}
