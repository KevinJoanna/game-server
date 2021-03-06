package com.jzy.game.engine.mina.code;

/**
 * 群发消息，带有id组的 length+ buff length+iobuffer(消息队列)+id数组
 *
 * @author wzyi
 * @QQ 156320312
 * @Te 18202020823
 */
public class MassProtocolCodecFactory extends ProtocolCodecFactoryImpl {

    public MassProtocolCodecFactory() {
        super(new MassProtocolDecoder(), new MassProtocolEncoder());
    }
}
