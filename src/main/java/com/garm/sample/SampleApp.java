
package com.garm.sample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@ComponentScan(value = "com.garm")
@SpringBootApplication
public class SampleApp {
}
