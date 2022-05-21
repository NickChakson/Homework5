fun main() {

    val post1 = Post(0, 123, "Gleb", "Some content", "21.05.2041", 0, Views.views())
    val post2 = Post(0, 321, "Anton", "Some content", "27.05.2041", 0, Views.views())
    val post3 = Post(0, 231, "Valera", "Some content", "22.05.2041", 0, Views.views())

    WallService.add(post1)
    WallService.add(post2)
    WallService.add(post3)
    WallService.update(post2)

    // Проверка Всех Постов
    println(WallService.posts[0])
    println(WallService.posts[1])
    println(WallService.posts[2])
    println(WallService.posts.size)

    // Очистка массива данных
    WallService.clearPosts()
    println(WallService.posts.size)
}