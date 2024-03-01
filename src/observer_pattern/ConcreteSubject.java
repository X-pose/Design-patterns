package observer_pattern;

import java.util.ArrayList;
import java.util.List;

/*
 * @author		- 	Thathsara Pramodya Thalangama
 *
 * @Category    -   behavioral pattern
 *
 * @description -	This implementation demonstrates how "Observer" design pattern works.
 *
 * @Usage 		- 	Utilize the Observer Pattern when you need to update the state of multiple observers based on a single object.
 *                  This specific class handles the subject part. The subject is the one that changes. When changed it notifies the observers about the chnage.
 *
 * @Note        -   When implimenting the interfaces it's mandatory to use interfaces as parameters instead of concrete classes.
 *                  This will enforce both loos coupling and dependancy inversion principle in SOLID principles
 *
 *
 * */

public class ConcreteSubject implements SubjectInterface{

    //Attributes goes here
    private List<ObserverInterface> observerList = new ArrayList<>();

   public ConcreteSubject(){
        //Constructor
    }

    public void stateChanged(){
       //Some code that changes the state of the object.

        notifyObservers(); //Notifies the observer when state is changed.
    }

    public void registerObserver(ObserverInterface observerObj){

       observerList.add(observerObj);
    }

    public void removeObserver(ObserverInterface observerObj){
       observerList.remove(observerObj);
    }

    public void notifyObservers(){
       for(ObserverInterface observerEach : observerList){
           observerEach.updateObserver();
       }
    }
}