package com.training.tests;

import com.training.TestBase;
import com.training.dragdrop.DragDrop;
import com.training.home.Home;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragDropTest extends TestBase {

    public Home home;
    public DragDrop dragdrop;

    @BeforeClass
    public void init(){
        home = new Home(driver);
        dragdrop = new DragDrop(driver);
    }

    @Test
    public void dragdropTestCase() throws InterruptedException {

        home.goTodragdropOption();

        System.out.println("Before Drag and Drop --> ");

        Assert.assertFalse(dragdrop.dragdropAction());

    }
}