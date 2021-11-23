package services;

import models.Section;

public class SaveCommand implements Command{
    private Section section;
    public SaveCommand(Section section){
        this.section = section;
    }
    @Override
    public void execute() throws Exception {
        DocumentManager.getInstance().getBook().addContent(section);

    }
}
