package io.realworld.api

import com.example.api.ConduitClient
import org.junit.Assert.assertNotNull
import org.junit.Test

class ConduitClientTest {

    private val conduitCLlient = ConduitClient()

    @Test
    fun `get Articles`() {

        val articles = conduitCLlient.api.getArticles().execute()
        assertNotNull(articles.body()?.articles)

    }

}