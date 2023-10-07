package interfaces.able;

public class Student implements IPlay,ICode{

    @Override
    public void code() {
        System.out.println("This student can write codes.");
    }

    @Override
    public void play() {
        System.out.println("This student can play the piano.");
    }
}
