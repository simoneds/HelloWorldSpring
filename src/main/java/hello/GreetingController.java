package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

    @RequestMapping("/pippo")
    public String metodo() {
        return "pluto";
    }

    @RequestMapping("/form")
    public String form(Somma somma) {
        return "form";
    }

    @RequestMapping("/formAction")
    public String formAction(Somma somma) {
        System.out.println("La somma è:"+somma);
        return "risultato";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
