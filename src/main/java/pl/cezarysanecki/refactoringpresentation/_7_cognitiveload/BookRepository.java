package pl.cezarysanecki.refactoringpresentation._7_cognitiveload;

interface BookRepository {

    Book findBy(BookId bookId);

    Book save(Book book);

}
