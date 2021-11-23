package services;

import models.Book;

public class StatisticsCommand implements Command{
    @Override
    public void execute() throws Exception {
        Book book = DocumentManager.getInstance().getBook();
        RenderContentVisitor rdv = new RenderContentVisitor();
        book.accept(rdv);

        System.out.println();
        System.out.println();

        BookStatistics stats = new BookStatistics();
        book.accept(stats);
        stats.printStatistic();

    }
}
