package org.academiadecodigo.agicultores;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /**
         *  Instanciação dos (Observer)DrunksCadets e (Observable)Frigorifico
         */
        Frigorificos frigorificos= new Frigorificos();
        DrunksCadets cadets = new DrunksCadets();
        DrunksCadets cadets2 = new DrunksCadets();
        DrunksCadets cadets3 = new DrunksCadets();
        DrunksCadets cadets4 = new DrunksCadets();
        DrunksCadets cadets5 = new DrunksCadets();

        /**
         * Registo de (Observer)DrunksCadets na List
         */
        frigorificos.registrar(cadets);
        frigorificos.registrar(cadets2);
        frigorificos.registrar(cadets3);
        frigorificos.registrar(cadets4);
        frigorificos.registrar(cadets5);


        /**
         * Comunicação do (Observable)Frigorifico
         */
        frigorificos.comunicarBeer("Já há Super artistas");
        Thread.sleep(3000);
        frigorificos.comunicarBeer("Já só temos 5");
        Thread.sleep(3000);
        frigorificos.comunicarBeer("Já só temos 4");
        Thread.sleep(3000);
        frigorificos.comunicarBeer("Amigo ja te avisei que esta a acabar já so restam 3");
        Thread.sleep(3000);
        frigorificos.comunicarBeer("Vais passar sedeeee, faltam 2");
        Thread.sleep(3000);
        frigorificos.comunicarBeer("É que nem quero ouvir-te chora ... já só temos mais 1");
        Thread.sleep(3000);
        frigorificos.comunicarBeer("Olha já foste seu Tone, eu não te avisei que estavam a acabar?\n" +
                " agora bebe merdinha tá?.");
    }
}
