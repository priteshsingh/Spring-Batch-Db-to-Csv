package com.example.springboot_batch_DbToCsv.processor;

import org.springframework.batch.item.ItemProcessor;

import com.example.springboot_batch_DbToCsv.model.User;

public class UserItemProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User user) throws Exception {

		return user;
	}

}
