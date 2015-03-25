import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Hi {
    @RequestMapping("/")
    String hi() { "Hi!" }
}
