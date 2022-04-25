package java8.Parallel_Streams;

import java.util.List;
import java.util.stream.Collectors;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class ParallelStreamUsecase {

	public static void main(String[] args) {
		
		System.out.println(getHobbiesBySequential());
		System.out.println(getHobbiesByParallel());
		

	}
	
	static List<String> getHobbiesBySequential(){
		long start= System.currentTimeMillis();
		List<String> hobbies = PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.collect(Collectors.toList());
		long end= System.currentTimeMillis();
		System.out.println("Seq Duration : "+(end-start));
		return hobbies;
	}
	static List<String> getHobbiesByParallel(){
		long start= System.currentTimeMillis();
		List<String> hobbies= PersonRepository.getAllPersons()
				.parallelStream()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.collect(Collectors.toList());
		long end= System.currentTimeMillis();
		System.out.println("par Duration : "+(end-start));
		return hobbies;
	}

}
