package com.proximity.app.controller;

import com.proximity.app.model.Category;
import com.proximity.app.service.CategoryServiceImpl;
import com.proximity.app.service.RbacService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController extends GenericControllerImpl<CategoryServiceImpl, Category> {

    public CategoryController(CategoryServiceImpl service, RbacService rbacService) {
        super(service, rbacService);
    }
}
