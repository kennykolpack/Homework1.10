public class Author {
    private final String firstName;
    private final String lastName;
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getAuthorName() {

        return firstName + lastName;
    }

    @Override
    public String toString() {
        return " Имя: " + firstName + "Фамилия: " + lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author sapkowski = (Author) other;
        return firstName.equals(sapkowski.firstName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }
}
