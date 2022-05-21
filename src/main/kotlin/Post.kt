data class Post(
    var id: Long,
    val authorId: Long,
    val authorName: String,
    val content: String,
    val created: String,
    var likes: Int,
    val views: Int
) {}
