import javax.naming.Context;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Paragraph" + p.getName() + " align left");
    }
}
