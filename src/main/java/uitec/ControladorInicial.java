package uitec;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by campitos on 22/07/15.
 */

@RestController
@RequestMapping("/")
public class ControladorInicial {

    @RequestMapping("/resources")
    String hola(){
        return "index";
    }

    @RequestMapping("/resources/dos")
    String hola2(){
        return "dos";
    }
}
