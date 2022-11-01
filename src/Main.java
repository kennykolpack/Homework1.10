public class Main {

    public static void main(String[] args) {
        Author sapkowski = new Author("Анджей Сапковский");
        Book witcher = new Book("Ведьмак",sapkowski, 1986);
        System.out.println("Книга " + witcher.getTitle() + ", автор: " +  sapkowski.getAuthorName() + ", год публикации: " + witcher.getYearPublishing());
        Author martin = new Author("Джордж Мартин");
        Book gameOfThrones = new Book("Игра престолов", martin, 1006);
        gameOfThrones.setYearPublishing(1996);
        System.out.println("Книга " + gameOfThrones.getTitle() + ", автор: " +  martin.getAuthorName() + ", год публикации: " + gameOfThrones.getYearPublishing());
        System.out.println(witcher);
        System.out.println(gameOfThrones);
    }
}