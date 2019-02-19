/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.testpackage.walgreens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author sstani1
 */
public class Online {
    public static void main(String args[]) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sstani1\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Thread.sleep(2000);
       // driver.close();
}
}