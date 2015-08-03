package uitec;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by campitos on 22/07/15.
 */

@RestController
@RequestMapping("/")
public class ControladorInicial {

    @RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello mundo malo");
        return model;
    }

    @RequestMapping("/resources/dos")
    String hola2(){
        return "dos";
    }
}
