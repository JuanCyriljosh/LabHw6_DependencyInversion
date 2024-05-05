public class Journals {
    private Student student;
    private BorrowJournal journal;

    public Journals(Student student, BorrowJournal journal) {
        this.student = student;
        this.journal = journal;
    }

    public void processJournal() {
        journal.borrow(student.getTitle());
    }
}