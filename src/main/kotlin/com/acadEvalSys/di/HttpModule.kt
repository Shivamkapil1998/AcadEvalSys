package com.acadEvalSys.di

import com.acadEvalSys.HTTP_HOST
import com.acadEvalSys.HTTP_PORT
import dagger.Module
import dagger.Provides
import jakarta.ws.rs.core.UriBuilder
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI


@Module
class HttpModule {

    @Provides
    fun provideHttpServer(config : ResourceConfig) : HttpServer{
        val uri : URI = UriBuilder.fromUri(HTTP_HOST).port(HTTP_PORT).build()
        println(uri)
        return GrizzlyHttpServerFactory.createHttpServer(uri,config,false)
    }
}