package restaurant.project.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class NewRestController {

    @Value("${appetizer.1}")
    private String appetizer1;
    @Value("${appetizer.2}")
    private String appetizer2;
    @Value("${appetizer.3}")
    private String appetizer3;
    @Value("${appetizer.1.discounted}")
    private String appetizer1discounted;
    @Value("${appetizer.2.discounted}")
    private String appetizer2discounted;
    @Value("${appetizer.3.discounted}")
    private String appetizer3discounted;



    @GetMapping("/appetizer")
    public String getAppetizerInfo() {
        return "Appetizer 1: " + appetizer1 +
                ", Appetizer 2: " + appetizer2 +
                ", Appetizer 3: " + appetizer3;
    }
    @GetMapping("/appetizerDiscount")
    public String getDiscountInfo () {
        return  "Appetizer 1: " + appetizer1discounted +
                ", Appetizer 2: " + appetizer2discounted +
                ", Appetizer 3: " + appetizer3discounted;

    }

}
