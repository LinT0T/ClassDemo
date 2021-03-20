package observe;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Observer> observers
            = new ArrayList<Observer>();
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
