public class Book {
    private String title;
    private final Author authorName;
    int yearPublishing;

    public Book(String title, Author authorName, int yearPublishing) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {

        return title;
    }

    public int getYearPublishing() {

        return yearPublishing;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setYearPublishing(int yearPublishing) {

        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return "Книга " + title + "," + authorName.toString() + ", год публикации: " + yearPublishing;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book witcher = (Book) other;
        return title.equals(witcher.title);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}
