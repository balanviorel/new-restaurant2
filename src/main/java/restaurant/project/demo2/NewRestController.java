package restaurant.project.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class NewRestController {

    @Value("${appetizer.1}")
    private int appetizer1;
    @Value("${appetizer.2}")
    private int appetizer2;
    @Value("${appetizer.3}")
    private int appetizer3;
    @Value("${appetizer.1.discounted}")
    private int appetizer1discounted;
    @Value("${appetizer.2.discounted}")
    private int appetizer2discounted;
    @Value("${appetizer.3.discounted}")
    private int appetizer3discounted;



    @GetMapping("/appetizer")
    public String getAppetizerInfo() {
        return "Appetizer 1: " + appetizer1 +
                ", Appetizer 2: " + appetizer2 +
                ", Appetizer 3: " + appetizer3;
    }
    @GetMapping("/appetizerDiscount")
    public String getDiscountInfo () {
        return  "Appetizer 1 discounted: " + (appetizer1)/2 +
                ", Appetizer 2 discounted: " + (appetizer2)/2 +
                ", Appetizer 3 discounted: " + (appetizer3)/2;

    }

}
