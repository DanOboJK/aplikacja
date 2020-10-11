package Logowanie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
    @Autowired
    public UczestnikRepository uczestnikRepository;

    @RequestMapping("/db")
    @ResponseBody
    public String testMethod() {
        StringBuilder response = new StringBuilder();

        Uczestnik uczestnik = new Uczestnik()
                .withName("Daniel")
                .withSurname("Oborski")
                .withAge(12)
                .withPartnerName("Ania")
                .withDecision(true);
       uczestnikRepository.save(uczestnik);

        for(Uczestnik i: uczestnikRepository.findAll()) {
            response.append(i).append("<br>");
        }

        return response.toString();
    }

    @RequestMapping("/db2")
    @ResponseBody
    public String testMethod2() {
        StringBuilder response = new StringBuilder();

        response.append("Tasks with done set to true:<br>");
        for(Uczestnik i: uczestnikRepository.findByDone(true)) {
            response.append(i).append("<br>");
        }

        response.append("Tasks with done set to false:<br>");
        for(Uczestnik i: uczestnikRepository.findByDone(false)) {
            response.append(i).append("<br>");
        }

        response.append("Tasks with \"Do\" in description:<br>");
        for(Uczestnik i: uczestnikRepository.getByImieLike("Do")) {
            response.append(i).append("<br>");
        }

        return response.toString();
    }
}