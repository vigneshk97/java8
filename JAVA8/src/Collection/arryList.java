package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class arryList {

	public static void main(String[] args) {
		
		employee e1 = new employee("vignesh", "vignesh@gmail.com", "28");
		employee e2  = new employee("kannan", "kannan@yopmail.com", "34");
		employee e3 = new employee("valli", "valli@gmail.com", "31");
		
		List<employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		

        Map<String, Long> domainCount = list.stream()
            .map(x -> x.getEmail().substring(x.getEmail().indexOf("@")))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(domainCount);

				
	}
}
