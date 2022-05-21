import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val post1 = Post(0, 123, "Gleb", "Some content", "21.05.2041", 0, Views.views())
        WallService.add(post1)
        val result: Long = WallService.posts[0].id
        assertEquals(result, 1)
    }

    @Test
    fun updateFalse() {
        val post2 = Post(0, 123, "Gleb", "Some content", "21.05.2041", 0, Views.views())
        val result: Boolean = WallService.update(post2)
        assertEquals(result, false)
    }

    @Test
    fun updateTrue() {
        val post2 = Post(0, 123, "Gleb", "Some content", "21.05.2041", 0, Views.views())
        WallService.add(post2)
        val result: Boolean = WallService.update(post2)
        assertEquals(result, true)
    }
}