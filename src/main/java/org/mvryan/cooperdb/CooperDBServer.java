package org.mvryan.cooperdb;

import javax.inject.Inject;
import javax.inject.Named;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.zoomulus.servers.http.HttpServer;
import com.zoomulus.servers.http.HttpServerConnector;

public final class CooperDBServer extends HttpServer
{
    @Inject
    public CooperDBServer(final Injector injector, @Named(LISTEN_PORT_NAME) final Integer port)
    {
        super(HttpServerConnector.builder().port(port.intValue()).injector(injector).build());
    }
    
    public static void main(String[] args)
    {
        Guice.createInjector(new CooperDBServerModule()).getInstance(CooperDBServer.class).start();
    }
}
