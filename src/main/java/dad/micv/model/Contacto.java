package dad.micv.model;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Contacto {
    private final ListProperty<Telefono> nacionalidades = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<Email> emails = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<Web> webs = new SimpleListProperty<>(FXCollections.observableArrayList());

    public ObservableList<Telefono> getNacionalidades() {
        return nacionalidades.get();
    }

    public ListProperty<Telefono> nacionalidadesProperty() {
        return nacionalidades;
    }

    public void setNacionalidades(ObservableList<Telefono> nacionalidades) {
        this.nacionalidades.set(nacionalidades);
    }

    public ObservableList<Email> getEmails() {
        return emails.get();
    }

    public ListProperty<Email> emailsProperty() {
        return emails;
    }

    public void setEmails(ObservableList<Email> emails) {
        this.emails.set(emails);
    }

    public ObservableList<Web> getWebs() {
        return webs.get();
    }

    public ListProperty<Web> websProperty() {
        return webs;
    }

    public void setWebs(ObservableList<Web> webs) {
        this.webs.set(webs);
    }
}
