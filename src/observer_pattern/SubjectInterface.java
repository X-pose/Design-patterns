package observer_pattern;

/*
 * @author		- 	Thathsara Pramodya Thalangama
 *
 * @Category    -   behavioral pattern
 *
 * @description -	This implementation demonstrates how "Observer" design pattern works.
 *
 * @Usage 		- 	Utilize the Observer Pattern when you need to update the state of multiple observers based on a single object.
 *                  This specific interface handles observer registering, removing, and notifying the observers
 *
 * @Note        -   When creating the interfaces it's mandatory to use interfaces as parameters instead of concrete classes.
 *                  This will enforce both loos coupling and dependancy inversion principle in SOLID principles
 *
 * */

public interface SubjectInterface {

    void registerObserver(ObserverInterface observerObj);
    void removeObserver(ObserverInterface observerObj);

    void notifyObservers();
}