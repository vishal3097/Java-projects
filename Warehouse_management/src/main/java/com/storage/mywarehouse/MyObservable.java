
package com.storage.mywarehouse;

import java.util.Observable;



class MyObservable extends Observable {

    MyObservable() {
        super();
    }

    void changeData(Object data) {
        setChanged(); 
        notifyObservers(data);
    }
}
