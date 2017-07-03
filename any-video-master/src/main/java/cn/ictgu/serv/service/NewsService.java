package cn.ictgu.serv.service;

import cn.ictgu.serv.model.Category;
import cn.ictgu.serv.model.CategoryItem;

import java.util.List;

public interface NewsService {

    public List<CategoryItem> getNewItems(Long userId);

    public List<Category> getAllCategories(Long userId);

}
