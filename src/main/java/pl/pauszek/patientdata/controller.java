package pl.pauszek.patientdata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {

    private List<Pacjent> pacjenci;

    public controller() {
        Pacjent pacjent1 = new Pacjent("Jan", "Kowalski", "183", "93.4","Gruźlica");
        Pacjent pacjent2 = new Pacjent("Agnieszka", "Brzoza", "171", "75.8","Astma");
        Pacjent pacjent3 = new Pacjent("Marian", "Buk", "170", "66.5","Złamany obojczyk");
        Pacjent pacjent4 = new Pacjent("Zofia", "Nowak", "166", "67.1","Zawał serca");

        pacjenci = new ArrayList<>();
        pacjenci.add(pacjent1);
        pacjenci.add(pacjent2);
        pacjenci.add(pacjent3);
        pacjenci.add(pacjent4);
    }

    @GetMapping("/pacjent")
    public String get(Model model){
        model.addAttribute("pacjenci", pacjenci );
        model.addAttribute("nowyPacjent", new Pacjent());
        return "pacjent";
    }

    @PostMapping("/add-pacjent")
    public String dodajPacjenta(@ModelAttribute Pacjent pacjent){
        pacjenci.add(pacjent);
        return "redirect:/pacjent";
    }
}
