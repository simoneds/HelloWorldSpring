package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ControllerCalcolatrice {


    @RequestMapping("/form_calcolatrice")
    public String calcolatriceBean (CalcolatriceBean calcolatriceBean) {
        return "form_calcolatrice";
    }

    @RequestMapping(value="/invia", method= RequestMethod.GET)
    public String invia(CalcolatriceBean calcolatriceBean, @RequestParam String action){
        calcolatriceBean.getSomma();
        calcolatriceBean.getProdotto();
        calcolatriceBean.getDivisione();
        calcolatriceBean.getSottrazione();

        if( action.equals("somma") ){
            System.out.println("la somma è" +calcolatriceBean.getSomma());
        }
        if( action.equals("sottrazione") ){
            System.out.println("la sottrazione è "+calcolatriceBean.getSottrazione());
        }
        if( action.equals("prodotto") ){
            System.out.println("il prodotto è " +calcolatriceBean.getProdotto());
        }
        else if( action.equals("divisione") ){
            System.out.println("la divisione è " +calcolatriceBean.getDivisione());
        }
    return "risultato_calcolatrice";
    }
}
