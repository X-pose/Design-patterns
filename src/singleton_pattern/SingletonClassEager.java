package singleton_pattern;


/*
 * @author		- 	Thathsara Pramodya Thalangama
 *
 * @Category    -   Creational pattern
 *
 * @description -	This implementation demonstrates how "Singleton" design pattern works.
 *
 * @Usage 		- 	Utilize the Singleton Pattern when you need to ensure that only one object of that class should be created.
 * 					For an example, use this pattern in resources heavy object such as database connections. In here only when it's guranteed to use the singleton object
 *
 * @Type 		- 	Eager initialization.
 *
 * */

public class SingletonClassEager {

    private SingletonClassEager();
    private static SingletonClassEager singletonInstance = new SingletonClassEager();

    public static getInstance(){
        return singletonInstance;
    }
}