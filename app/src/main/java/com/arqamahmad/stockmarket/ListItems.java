package com.arqamahmad.stockmarket;

/**
 * Created by B on 8/20/2016.
 * Data Stricture for the variables used
 */
public class ListItems {

    // This class creates the methods that allows us to create a List Item. This is created before the ListItemsAdapter.


    // Every stock should have these 3 pieces of information
    private String title;
    private String message;
    private Category category;



    public enum Category {
        PERSONAL, TECHNOLOGY, FINANCE, MEDICAL
    }


    public ListItems(String title, String message, Category category) {
        this.title = title;
        this.message = message;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Category getCategory() {
        return category;
    }

    public int getAssociatedDrawable()
    {
        return categoryToDrawable(category);
    }



    // Personal (P icon), Technical (T icon), Finance (F icon), Medical (M icon).
    public static int categoryToDrawable(Category noteCategory)
    {
        switch (noteCategory)
        {
            case PERSONAL:
                return R.drawable.personal;
            case TECHNOLOGY:
                return R.drawable.technology;
            case FINANCE:
                return R.drawable.finance;
            case MEDICAL:
                return R.drawable.medical;

        }
        // default value
        return R.drawable.personal;
    }




}