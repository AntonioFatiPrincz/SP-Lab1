import models.*;
import services.*;

public class Main3 {
    public static void main(String[] args) throws Exception {
            Command cmd1 = new OpenCommand("Titlu 1");
            cmd1.execute();
            Section section = new Section("Capitol 1");
            Paragraph paragraph = new Paragraph("Paragraph 1.1");
            section.add(paragraph);
            Command cmd3 = new SaveCommand(section);
            cmd3.execute();
            Command cmd2 = new StatisticsCommand();
            cmd2.execute();

    }
}
