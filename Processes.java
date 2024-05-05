public class Processes {
    private Student student;
    private BorrowBook book;

    public Processes(Student student, BorrowBook book) {
        this.student = student;
        this.book = book;
    }

    public void processBook() {
        book.borrow(student.getTitle());
    }
}