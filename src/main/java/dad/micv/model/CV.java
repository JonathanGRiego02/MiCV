package dad.micv.model;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CV {
    private final ListProperty<Titulo> titulos = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<Experiencia> experiencias = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<Conocimiento> habilidades = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ObjectProperty<Contacto> contacto = new SimpleObjectProperty<>();
    private final ObjectProperty<Personal> personal = new SimpleObjectProperty<>();

    public ObservableList<Titulo> getTitulos() {
        return titulos.get();
    }

    public ListProperty<Titulo> titulosProperty() {
        return titulos;
    }

    public void setTitulos(ObservableList<Titulo> titulos) {
        this.titulos.set(titulos);
    }

    public ObservableList<Experiencia> getExperiencias() {
        return experiencias.get();
    }

    public ListProperty<Experiencia> experienciasProperty() {
        return experiencias;
    }

    public void setExperiencias(ObservableList<Experiencia> experiencias) {
        this.experiencias.set(experiencias);
    }

    public ObservableList<Conocimiento> getHabilidades() {
        return habilidades.get();
    }

    public ListProperty<Conocimiento> habilidadesProperty() {
        return habilidades;
    }

    public void setHabilidades(ObservableList<Conocimiento> habilidades) {
        this.habilidades.set(habilidades);
    }

    public Contacto getContacto() {
        return contacto.get();
    }

    public ObjectProperty<Contacto> contactoProperty() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto.set(contacto);
    }

    public Personal getPersonal() {
        return personal.get();
    }

    public ObjectProperty<Personal> personalProperty() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal.set(personal);
    }
}
