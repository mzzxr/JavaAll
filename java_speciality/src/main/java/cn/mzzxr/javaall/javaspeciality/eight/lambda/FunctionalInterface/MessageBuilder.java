package cn.mzzxr.javaall.javaspeciality.eight.lambda.FunctionalInterface;

/**
 * @Description TODO
 * @Author LG
 * @Date 2019/6/20 13:16
 **/
@FunctionalInterface
public interface MessageBuilder {
    // 定义一个拼接消息的抽象方法，返回被拼接的消息
    public abstract String builderMessage();

}
