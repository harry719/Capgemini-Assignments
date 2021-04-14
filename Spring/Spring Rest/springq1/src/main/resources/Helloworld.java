







@Controller
public class Helloworld {
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hellow world!mvc");
	}

}

