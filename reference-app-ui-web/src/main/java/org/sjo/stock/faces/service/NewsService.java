package org.sjo.stock.faces.service;

import java.util.List;

import org.sjo.stock.faces.domain.NewsGroup;

public interface NewsService {

	public List<NewsGroup> fetchNews();
}
