package springboot.logging.logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {

		@RequestMapping("/")
		public String welcome() {
			return "Hello World";
		}
		
}
