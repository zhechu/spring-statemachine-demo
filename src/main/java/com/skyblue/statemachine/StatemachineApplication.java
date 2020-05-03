package com.skyblue.statemachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://localhost:7771/statemachine/
 *
 * 最简单的运行一个订单状态机演示
 * http://localhost:7771/statemachine/testSingleOrderState
 *
 * 使用StateMachineBuilder创建的多个状态机演示
 * http://localhost:7771/statemachine/testOrderState?orderId=1111
 *
 * 多种状态机的演示（上面都是order的状态机，这个是form的状态机）
 * http://localhost:7771/statemachine/testFormState
 *
 * 在内存中持久化状态机的演示
 * http://localhost:7771/statemachine/testMemoryPersister?id=12345
 *
 * 从内存中取出状态机的演示，和上面是一对
 * http://localhost:7771/statemachine/testMemoryPersisterRestore?id=12345
 *
 * 使用redis作为状态机持久化的演示
 * http://localhost:7771/statemachine/testRedisPersister?id=123456
 *
 * 从redis取出状态机的演示，显然和上面是一对
 * http://localhost:7771/statemachine/testRedisPersisterRestore?id=123456
 *
 * 伪持久化和中间段状态机例子
 * http://localhost:7771/statemachine/testOrderRestore?id=1234567
 *
 * 复杂表单的流程例子
 * http://localhost:7771/statemachine/testComplexFormState
 *
 * @author lingyuwang
 * @date 2020-05-03 10:16
 * @since 1.0.9
 */
@SpringBootApplication
public class StatemachineApplication {
	public static void main(String[] args) {
		SpringApplication.run(StatemachineApplication.class, args);
	}
}
