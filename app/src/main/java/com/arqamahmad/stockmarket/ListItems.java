package com.arqamahmad.stockmarket;

import android.icu.util.ULocale;

/**
 * Created by B on 8/20/2016.
 */
public class ListItems {

    //Informations that each stock will have
    String title;
    String message;
    private ULocale.Category category;

    public enum Category{
        PERSONAL, TECHNOLOGY, FINANCE, MEDICAL
    }

    
}
