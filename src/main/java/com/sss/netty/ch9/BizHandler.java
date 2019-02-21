package com.sss.netty.ch9;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author sss
 */
public class BizHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //...

        User user = new User(19, "sss");

        ctx.channel().writeAndFlush(user);
    }
}