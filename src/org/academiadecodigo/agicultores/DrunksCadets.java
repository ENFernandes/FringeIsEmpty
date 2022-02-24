package org.academiadecodigo.agicultores;

import java.util.Observable;
import java.util.Observer;

public class DrunksCadets implements Observer {

    /**
     * Esta class é a class dos cadet que recebe a notificação da alteração do estado do frigorifico
     *
     * @param frigorifico
     * @param comunicaçãoFrigurifico
     */
    @Override
    public void update(Observable frigorifico, Object comunicaçãoFrigurifico) {
        if (frigorifico instanceof Search) {
            System.out.println((String) comunicaçãoFrigurifico);
        }
    }
}
