package page.springbootbertoti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class SpringBootBertotiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBertotiApplication.class, args);
    }

}

@RestController
@RequestMapping("/actresses")
class RestApiDemoController {
    private List<Oscar> actresses = new ArrayList<>();

    public RestApiDemoController() {
        actresses.addAll(List.of(
                new Oscar("Fernanda Torres"),
                new Oscar("Karla Sofía"),
                new Oscar("Mickey Madson"),
                new Oscar("Cynthia Erivo"),
                new Oscar("Demi Moore")
        ));
    }

    @GetMapping
    Iterable<Oscar> getCoffees() {
        return actresses;
    }

    @GetMapping("/{id}")
    Optional<Oscar> getCoffeeById(@PathVariable String id) {
        for (Oscar c : actresses) {
            if (c.getId().equals(id)) {
                return Optional.of(c);
            }
        }

        return Optional.empty();
    }
}
