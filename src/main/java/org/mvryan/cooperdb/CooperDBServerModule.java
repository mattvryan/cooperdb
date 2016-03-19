package org.mvryan.cooperdb;

import org.mvryan.cooperdb.responder.CooperDBServerResponder;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.zoomulus.servers.http.HttpServer;
import com.zoomulus.servers.http.responder.HttpResponder;

public class CooperDBServerModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(HttpResponder.class).to(CooperDBServerResponder.class);
        bind(Integer.class).annotatedWith(Names.named(HttpServer.LISTEN_PORT_NAME))
        .toInstance(22305);
    }
}
