public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Семён";
        post.patronymic = "Семёныч";
        post.surname = "Горбунков";
        post.birthday = new FormDate();
        post.birthday.day = 28;
        post.birthday.month = 04;
        post.birthday.year = 1969;
        post.passport = "4815 № 162342";
        post.phone = "+7 (123) 456-78-90";
        post.subscription = true;
    }
}