package observer_pattern;

/*
 * @author		- 	Thathsara Pramodya Thalangama
 *
 * @Category    -   behavioral pattern
 *
 * @description -	This implementation demonstrates how "Observer" design pattern works.
 *
 * @Usage 		- 	Utilize the Observer Pattern when you need to update the state of multiple observers based on a single object.
 *                  This specific class handles the subject part. The object is the one that updates based on subject. Object can register itself in a subject.
 *                  Object updates through the updateObject() method when the subject calls the notifyObject() method .
 *
 * @Note        -   When implimenting the interfaces it's mandatory to use interfaces as parameters instead of concrete classes.
 *                  This will enforce both loos coupling and dependancy inversion principle in SOLID principles
 *
 *
 * */
public class ConcreteObserver implements observerInterface{

    //Attributes goes here.
    private ConcreteSubjecct subject;

    public ConcreteObserver(SubjectInterface subjectObj){
        subjectObj.registerObserver(this);
    }
    public void updateObserver(){
        //Implimentation related to the observer should be implimented here
    }

}