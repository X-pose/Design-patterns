package observer_pattern;

/*
 * @author		- 	Thathsara Pramodya Thalangama
 *
 * @Category    -   behavioral pattern
 *
 * @description -	This implementation demonstrates how "Observer" design pattern works.
 *
 * @Usage 		- 	Utilize the Observer Pattern when you need to update the state of multiple observers based on a single object.
 *                  This specific interface handles observer updating part. Each observer should impliment their specific way of updating the observer.
 *
 * */


public interface ObserverInterface {
    void updateObserver(); // updateObserver() may have parameters. Depennds on the scenario.
}