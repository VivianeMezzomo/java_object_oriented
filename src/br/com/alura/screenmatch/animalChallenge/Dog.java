package br.com.alura.screenmatch.animalChallenge;

public class Dog extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Cachorro emite som.");
    }

    public void abanarRabo(){
        System.out.println("O cachorro abana o rabo.");
    }
}
