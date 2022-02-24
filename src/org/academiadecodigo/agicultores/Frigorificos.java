package org.academiadecodigo.agicultores;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Frigorificos extends Observable implements Search {

    /**
     * A Lista dos bebados
     */
    private List<Observer> drunkCadets = new ArrayList<>();

    /**
     * Este método é o que ira comunicar os bebados da situação do (Observable)Frigorifico
     * @param newBeer
     */
    public void comunicarBeer(String newBeer) {
        notifyObservers(newBeer);
    }

    /**
     * A magia deste Design Pattens é este método, que faz a notificação
     * de alteração de estado.
     * @param newBeer
     */
    public void notifyObservers(String newBeer) {
        for (Observer observer : this.drunkCadets) {
            observer.update(this, newBeer);
        }
    }

    /**
     * Método para resgistar bebados e para ser notificados
     * @param observer
     */
    public void registrar(Observer observer) {
        drunkCadets.add(observer);
    }

}


