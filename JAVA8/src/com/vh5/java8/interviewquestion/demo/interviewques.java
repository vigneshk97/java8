package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class interviewques {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("Zudio","Max","Apple","H&M","java","spring");
		
		List<String> s = str.stream().sorted().collect(Collectors.toList());
		System.out.println("given string  sorted order.."+ s);
		
		List<String> s1 = str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
           System.out.println("given string stored ascending order"+s1);
           
           List<Integer> an = Arrays.asList(1,2,3,4,5,6);
           List<Integer> ans = an.stream().map(x->x*x).collect(Collectors.toList());
           System.out.println("find the given array to square."+ans);
           
           List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,7,9,9,9,10);
           
           List<Integer> distinctodd = num.stream().filter(x-> x%2 !=0).distinct().collect(Collectors.toList());
           System.out.println("find the distinct even no array"+distinctodd);
           
           List<Integer> distincteven = num.stream().filter(x->x%2 == 0).distinct().collect(Collectors.toList());
           System.out.println("find the distinct even no array"+distincteven);
           
           List<Integer> list1 = Arrays.asList(1,2,3,4,5);
           List<Integer> list2 = Arrays.asList(6,7,8,9,10);
           
           List<Integer> list = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
           System.out.println("union of 2 list "+list);
           
           List<Integer> ss = Arrays.asList(1,2,35,4,6,5,76,5);
           
           int k=5;
           
           int anss= ss.stream().sorted().skip(k-1).findFirst().get();
           System.out.println("find kth small value in array "+anss);
           
           List<String> non = Arrays.asList("12asc3","3d45sc","4red67");
           
          Pattern pattern = Pattern.compile("[^a-z]");
          
          List<String> nonRumeric = non.stream().map(x-> pattern.matcher(x).replaceAll("")).collect(Collectors.toList());
          System.out.println(nonRumeric);
          
          List<String> nn = Arrays.asList("123","asd","45","qw23");
          List<String>  numeric = nn.stream().filter(x->x.matches("\\d+")).collect(Collectors.toList());
          System.out.println(numeric);
          
          List<String> upp = Arrays.asList("abc","yts","breaking a piece");
          List<String> upperCase = upp.stream().map(String::toUpperCase).collect(Collectors.toList());
          System.out.println(upperCase);
          
          
          List<Integer> lis = Arrays.asList(1,2,3,4,5); 
          double average = lis.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
          System.out.println(average);
          
          List<Integer> list3 = Arrays.asList(1,2,3,4,5);
          List<Integer> list4 = Arrays.asList(2,4,5,9,10);
          
          List<Integer> commonValue = list3.stream().filter(list4::contains).collect(Collectors.toList());
          System.out.println(commonValue);
          
          List<String> str1 = Arrays.asList("Zudio","Max","Apple","H&M","java","spring");
          
          Map<Object, Long> dd= str1.stream().collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
          System.out.println(dd);
           
         String map= str1.stream().map(String::toUpperCase).reduce((e,f)-> e+" "+ f).orElse("");
          System.out.println(map);
           
           
	}
}
