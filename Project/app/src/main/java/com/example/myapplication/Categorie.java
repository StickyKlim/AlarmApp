package com.example.myapplication;

public class Categorie {

    private String CategoryName;
    private String CategoryDesc;
    private String CategoryMethodTitle;
    private String Category;
    private int Thumbnail;

    public Categorie(String name, String categoryDesc, String categoryMethodTitle, String category, int thumbnail ) {
        CategoryName = name;
        CategoryDesc = categoryDesc;
        CategoryMethodTitle = categoryMethodTitle;
        Category = category;
        Thumbnail = thumbnail;
    }
    public String getCategoryName() {

        return CategoryName;
    }
    public String getCategoryDesc(){

        return CategoryDesc;
    }
    public String getCategoryMethodTitle(){

        return CategoryMethodTitle;
    }
    public String getCategory(){
        return Category;
    }
    public int getThumbnail(){

        return Thumbnail;
    }
}
