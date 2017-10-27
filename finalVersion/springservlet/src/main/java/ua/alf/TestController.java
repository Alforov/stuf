package ua.alf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mikhail_alferov on 27.10.2017.
 */
@RestController
@RequestMapping({"/path"})
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1() {
        return "test.html";
    }
}
