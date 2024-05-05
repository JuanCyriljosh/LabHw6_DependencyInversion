public class TestProgram {
    public static void main(String[] args) {
        
        Student stud1 = new Student("101", "Juan", "Robert", "The Desolate Era");
        Processes asd1 = new Processes(stud1, new BorrowBook());
        asd1.processBook();
    
        Student stud2 = new Student("102", "Laroza", "Angel", "Reverend Insanity");
        Processes asd2 = new Processes(stud2, new BorrowBook());
        asd2.processBook();
    
        Student stud3 = new Student("103", "Dizon", "Cedric", "The Great Depression");
        Journals asd4 = new Journals(stud3, new BorrowJournal());
        asd4.processJournal();
    
        Student st4 = new Student("104", "Dela Cruz", "Bernie", "Adventures of the Sole-King Catastrophe");
        Journals asd5 = new Journals(st4, new BorrowJournal());
        asd5.processJournal();
    }
}