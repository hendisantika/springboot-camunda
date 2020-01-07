package com.hendisantika.springbootcamunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-camunda
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/01/20
 * Time: 06.10
 */
@Description(value = "Delegate responsible for making transaction.")
public class MakeTransactionDelegate implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(MakeTransactionDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.info("Making transaction...");
        logger.info("Picked amount: {}", delegateExecution.getVariable("amount"));
        logger.info("Processing! Please wait...");
        logger.info("Transaction has been successful!");
    }
}
