package com.example.oppgavemedspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};

    @GetMapping("/month")
    public int finnTemp(String month){
        switch (month){
            case "Mars":
                return tempArray[1];
            case "April":
                return tempArray[2];
        }
        return 0;
    }
}
