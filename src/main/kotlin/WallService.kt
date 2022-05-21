object WallService {
    var posts = emptyArray<Post>()
    private var id = 1L

    fun add(post: Post): Post {
        post.id = id++
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val (id, _, _, content) = post
        var status: Boolean = false
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(content = "Обновил")
                status = true
            }

        }
        return status
    }
    // Функция очистки массива
    fun clearPosts() {
        posts = emptyArray<Post>()
    }
}