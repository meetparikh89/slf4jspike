/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.demo.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author meet
 */
public class MyClass {

    private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

    public void bar() {

        String name = "lordofthejars";

        logger.info("Hello from Bar. - {}.",name);
        logger.error("Fake error ;)");
        logger.info("Logging is so easy !!!!");
        logger.info("I love my mother !!!!");

        logger.debug("In bar my name is {}.", name);

    }
    
    public static void main(String[] args) {
        new MyClass().bar();
    }

}
