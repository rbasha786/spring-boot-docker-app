package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

    public WelcomeRestController() {
        logger.info("***** WelcomeRestController::Constructor *****");
    }

    @GetMapping
    public String welcomeMsg() {
        logger.info("***** welcomeMsg() execution start *****");
        String msg = "Welcome to SrimanIT - Visit our website: https://srimanit.com/";
        logger.info("***** welcomeMsg() execution end *****");
        return msg;
    }
}
