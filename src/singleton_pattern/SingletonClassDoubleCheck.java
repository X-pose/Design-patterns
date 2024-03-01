package singleton_pattern;

/*
 * @author		- 	Thathsara Pramodya Thalangama
 *
 * @Category    -   Creational pattern
 * @description -	This implementation demonstrates how "Singleton" design pattern works.
 *
 * @Usage 		- 	Utilize the Singleton Pattern when you need to ensure that only one object of that class should be created.
 * 					For an example, use this pattern in resources heavy object such as database connections. In here use this method for better performance in a multi-thread environment. This is often better than a lazy initialization in a Multi-thread environment
 *
 * @Type 		- 	Double checked locking initialization.
 *
 * */
public class SingletonClassDoubleCheck {

    private SingletonClassDoubleCheck() {}

    private static volatile SingletonClassDoubleCheck uniqueInstance = null;

    public static  SingletonClassDoubleCheck getInstance(){
        if(uniqueInstance == null){
            synchronized (SingletonClassDoubleCheck.class){
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonClassDoubleCheck();
                }
            }
        }
        return uniqueInstance;
    }
}