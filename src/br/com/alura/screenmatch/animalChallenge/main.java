package br.com.alura.screenmatch.animalChallenge;

public class main {
    public static void main(String[] args) {
        /*Crie uma classe Animal com um método emitirSom().
        Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal.
        Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para
        indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos
        para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.*/

        Animal animal = new Animal();
        animal.emitirSom();

        Dog cachorro = new Dog();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Cat gato = new Cat();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
