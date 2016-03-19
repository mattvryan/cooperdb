package org.mvryan.cooperdb.responder;

import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;

import com.zoomulus.servers.http.responder.HttpResponder;

public class CooperDBServerResponder extends HttpResponder
{

    @Override
    protected boolean haveMatchingResource(final HttpRequest request)
    {
        return true;
    }

    @Override
    protected boolean isSupportedMethod(final HttpRequest request)
    {
        final HttpMethod method = request.getMethod();
        return method == HttpMethod.GET || method == HttpMethod.POST;
    }

    @Override
    protected FullHttpResponse generateResponse(final HttpRequest request, final HttpHeaders headers)
    {
        final HttpMethod method = request.getMethod();
        if (method == HttpMethod.GET)
        {
            return createResponse(HttpResponseStatus.NOT_FOUND);
        }
        else if (method == HttpMethod.POST)
        {
            return createResponse(HttpResponseStatus.CREATED);
        }
        else
        {
            return createResponse(HttpResponseStatus.METHOD_NOT_ALLOWED);
        }
    }
}
