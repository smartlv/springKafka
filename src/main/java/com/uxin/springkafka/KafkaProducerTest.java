package com.uxin.springkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.stereotype.Service;

/**
 * kafka读写测试类
 */
@Service("kafkaProducerTest")
public class KafkaProducerTest
{
    @Autowired
    private KafkaTemplate<Integer, String> kafkaTemplate;

    /**
     * 向kafka里写数据.<br/>
     *
     * @author miaohongbin Date:2016年6月24日下午6:22:58
     */
    public void testTemplateSend()
    {
        kafkaTemplate.sendDefault("haha111");
    }

    public static void main(String[] args)
    {
        ApplicationContext c = new ClassPathXmlApplicationContext("spring-main.xml");

        c.getBean("kafkaProducerTest", KafkaProducerTest.class).testTemplateSend();

        System.out.println(c.getBean("messageListenerContainer", MessageListenerContainer.class));
    }
}
