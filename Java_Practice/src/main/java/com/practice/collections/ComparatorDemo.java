package com.practice.collections;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.practice.entity.User;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<>();
		userList.add(new User(1, "Jack", LocalDate.of(2014, Month.DECEMBER, 12)));
		userList.add(new User(2, "Tom", LocalDate.of(2018, Month.MARCH, 8)));
		userList.add(new User(3, "Mike", LocalDate.of(2012, Month.DECEMBER, 12)));

		sortListByOrder(userList, 2).stream().forEach(System.out::println);
	}
	
	private static List<User> sortListByOrder(List<User> userList, int order) {
		
		Collections.sort(userList, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				
				if(order == 1) {
				   
					return (o1.getJoinedOn().compareTo(o2.getJoinedOn()));
				} else {
					
					return (o2.getJoinedOn().compareTo(o1.getJoinedOn()));
				}
			}
			
		});
		
		return userList;		
	}
	
}
