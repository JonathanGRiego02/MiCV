package dad.micv;

import dad.micv.model.CV;
import dad.micv.model.Email;
import dad.micv.model.Nivel;
import dad.micv.ui.MiCVApp;
import javafx.application.Application;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Main {

        public static void main(String[] args) throws IOException {
//            CV cv = new CV();
//            cv.getPersonal().setNombre("Jonathan");
//            cv.getPersonal().setApellidos("Gutierrez");
//            cv.getPersonal().setFechaNacimiento(LocalDate.of(2002, 12, 21));
//            cv.getPersonal().setIdentificacion("12345678Z");
//            cv.getPersonal().setPais("España");
//            cv.getContacto().getEmails().add(new Email("jonathangrclases@gmail.com"));
//
//            cv.save(new File("cv.json"));

            Application.launch(MiCVApp.class, args);
    }


}
