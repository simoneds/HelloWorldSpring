package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/form")
    public String form(Somma somma) {
        return "form";
    }

    @RequestMapping("/formAction")
    public String formAction(Somma somma) {
        System.out.println("La somma è:" + somma);

        return "risultato";
    }

    @RequestMapping("/moltiplica")
    public String moltiplica(Prodotto prodotto) {
        return "moltiplica";
    }

    @RequestMapping("/metodoAzione")
    public String metodoAzione(Prodotto prodotto) {
        return "risultatoprodotto";
    }

    @RequestMapping("/sommamoltiplica")
    public String operazione(Operazione operazione) {
        System.out.println("operazione=" + operazione);
        return "sommamoltiplica";
    }

    @RequestMapping("/esegui")
    public String esegui(Operazione operazione) {
        operazione.getType();
        if (operazione.type) = "somma") {
            return "risultatosomma";
        }
        return "risultatomoltiplica";
    }
}
