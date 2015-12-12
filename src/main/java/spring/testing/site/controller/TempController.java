package spring.testing.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/temp")
public class TempController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getTemp(ModelMap model) {

        return "<h1>Temp controller</h1>";
    }
}
