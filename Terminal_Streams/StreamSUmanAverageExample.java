package java8.Terminal_Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamSUmanAverageExample {
	
	
	static Integer CountKids() {
		return PersonRepository.getAllPersons()
				.stream()
			   //.map(Person :: getKids)
				.collect(Collectors.summingInt(Person :: getKids));
				
	}
	static Double AverageHeight() {
		return PersonRepository.getAllPersons()
				.stream()
			//	.map(Person :: getKids)
				.collect(Collectors.averagingInt(Person :: getHeight));
				
	}

	public static void main(String[] args) {
		
		
     System.out.println(CountKids());
     System.out.println(AverageHeight());
     List<Integer> sumlist= Arrays.asList(1,2,3,4,5,6);
    IntSummaryStatistics sum = sumlist.stream().collect(Collectors.summarizingInt(Integer :: intValue));
     System.out.println(sum);
	}

}
