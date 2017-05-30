package com.net.shoppingbackend.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.net.shoppingbackend.dao.CategoryDAO;
import com.net.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static
	{
		Category category = new Category();
		category.setId(1);
		category.setName("TV");
		category.setDescription("LG TV");
		category.setImageURL("some url");
		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Radio");
		category.setDescription("HMT Radio");
		category.setImageURL("some url");
		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Car");
		category.setDescription("Honda Car");
		category.setImageURL("some url");
		categories.add(category);

		category = new Category();
		category.setId(4);
		category.setName("Watch");
		category.setDescription("HMT Watch");
		category.setImageURL("some url");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		return categories;
	}

}
