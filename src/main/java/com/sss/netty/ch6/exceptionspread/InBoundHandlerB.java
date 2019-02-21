package com.sss.netty.ch6.exceptionspread;

import com.sss.netty.ch6.BusinessException;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author
 */
public class InBoundHandlerB extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        throw new BusinessException("from InBoundHandlerB");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        System.out.println("InBoundHandlerB.exceptionCaught()");

        ctx.fireExceptionCaught(cause);
    }
}
