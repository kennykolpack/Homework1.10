public class Author {
    String authorName;
    public Author(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public String toString() {
        return this.authorName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author sapkowski = (Author) other;
        return authorName.equals(sapkowski.authorName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName);
    }
}
