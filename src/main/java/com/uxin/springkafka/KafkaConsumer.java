/**
 * Created by smartlv on 2016/11/2.
 */
package com.uxin.springkafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Service;

@Service("kafkaConsumer")
public class KafkaConsumer implements MessageListener<Integer, String>
{

    @Override
    public void onMessage(ConsumerRecord<Integer, String> record)
    {
        System.out.println("kafka -- consume..");
        System.out.println(record.value());
        System.out.println(record);
    }

}
