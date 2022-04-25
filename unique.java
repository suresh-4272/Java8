package java8;

import java.util.*;
import java.util.stream.Collectors;

public class unique {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("sam","build","sam","contain");
		
		List<String> unique=new ArrayList<>();
		for(String name:names) {
			if(!unique.contains(name))
			{
				unique.add(name);
			}
		}
		System.out.println(unique);
		
		List<String> unique1= names.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(unique1);
	}

}
