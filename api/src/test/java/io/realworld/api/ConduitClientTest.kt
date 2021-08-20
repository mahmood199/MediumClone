package io.realworld.api

import com.example.api.ConduitClient
import com.example.api.models.Request.RegisterUser.RegisterUserRequest
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertNotNull
import org.junit.Test

class ConduitClientTest {

    private val conduitCLlient = ConduitClient()

    @Test
    fun `get Articles`() {

        runBlocking {
            val articles = conduitCLlient.api.getArticles()
            assertNotNull(articles.body()?.articles)
        }

    }

    @Test
    fun `register user`(registerUserRequest: RegisterUserRequest) {
        runBlocking {
            val registerUserRequestin = RegisterUserRequest(
                com.example.api.models.Request.RegisterUser.User(
                    "x32@gmail.com",
                    "password332",
                    "testGaudenUser"
                )
            )

            val user = conduitCLlient.api.registerUser(registerUserRequestin)
            assertNotNull(user)

        }
    }

    @Test
    fun getSum(): Int {
        return 5
    }

}