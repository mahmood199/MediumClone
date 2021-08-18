package io.realworld.api

import com.example.api.ConduitClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertNotNull
import org.junit.Test

class ConduitClientTest {

    private val conduitCLlient = ConduitClient()

    @Test
    fun `get Articles`() {

        runBlocking{
            val articles = conduitCLlient.api.getArticles()
            assertNotNull(articles.body()?.articles)
        }

    }

}