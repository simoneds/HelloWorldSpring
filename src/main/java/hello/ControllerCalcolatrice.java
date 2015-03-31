package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerCalcolatrice {

    @RequestMapping("/form_calcolatrice")
    public String calcolatriceBean (CalcolatriceBean calcolatriceBean) {
        System.out.println("Bean=" + calcolatriceBean);
        return "form_calcolatrice";
    }

    @RequestMapping("/invia")
    public String invia(CalcolatriceBean calcolatriceBean) {
        System.out.println("il risultato è" + calcolatriceBean);
        return "risultato_calcolatrice";
    }
}