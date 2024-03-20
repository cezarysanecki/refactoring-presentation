package pl.cezarysanecki.refactoringpresentation._7_cognitiveload;

interface BookRepository {

    Book findBy(BookId bookId);

    Book save(Book book);

    class BookRepositoryImpl implements BookRepository {

        @Override
        public Book findBy(final BookId bookId) {
            return null;
        }

        @Override
        public Book save(final Book book) {
            return null;
        }

    }

}
