package course.intermediate.topic.interfaces.example;

public class MoodEmotionsRun {
    /*
    Enum declaration cannot use an extends clause (extends implicity)
    But is valid implements interfaces.

    Enum debe implementar apropiadamente los metodos abstractos
    que están declarados en la interface.

    Enum no puede ser abstract.
    Enum no puede ser subclase usando la sintaxis "extends".

     */
    public static void main(String[] args) {
        System.out.println("Good mood, laughing "+Mood.GOOD);
        System.out.println("Good mood, laughing "+Emotion.LAUGHING);
    }
}
