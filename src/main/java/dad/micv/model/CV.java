package dad.micv.model;

import com.google.gson.Gson;
import dad.micv.adapters.LocalDateAdapter;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import org.hildan.fxgson.FxGson;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.LocalDate;

public class CV {

    private static final Gson GSON = FxGson.fullBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .create();

    private final ListProperty<Titulo> titulos = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<Experiencia> experiencias = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<Conocimiento> habilidades = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ObjectProperty<Contacto> contacto = new SimpleObjectProperty<>();
    private final ObjectProperty<Personal> personal = new SimpleObjectProperty<>();

    public CV() {
        personal.set(new Personal());
        contacto.set(new Contacto());
    }

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

    public void save(File cvFile) throws IOException {
        String json = GSON.toJson(this);
        Files.writeString(
                cvFile.toPath(),
                GSON.toJson(this),
                StandardCharsets.UTF_8
        );
    }

    public static CV load(File cvFile) throws IOException {
        String json = Files.readString(
                cvFile.toPath(),
                StandardCharsets.UTF_8
        );
        return GSON.fromJson(json, CV.class);
    }
}
