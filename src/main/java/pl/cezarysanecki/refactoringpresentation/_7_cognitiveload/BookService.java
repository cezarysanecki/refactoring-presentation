package pl.cezarysanecki.refactoringpresentation._7_cognitiveload;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class BookService {

    private final BookRepository bookRepository;

    public void reserve(BookId bookId, ClientId clientId) {
        Book book = bookRepository.findBy(bookId);

        book.reserve(clientId);

        bookRepository.save(book);
    }

    public void rent(BookId bookId) {
        Book book = bookRepository.findBy(bookId);

        book.rent();

        bookRepository.save(book);
    }

}
