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
 * Time: 06.08
 */
@Description(value = "Delegate for validating PIN.")
public class CheckPINValidityDelegate implements JavaDelegate {
    private final Logger logger = LoggerFactory.getLogger(CheckPINValidityDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Long pinCode = (Long) delegateExecution.getVariable("pin_code");
        if (pinCode == null) {
            logger.error("PIN code is not provided");
            throw new Exception("Pin code is not provided!");
        }

        logger.info("User has entered the following PIN code: {}", pinCode);

        // set valid PIN variable.
        delegateExecution.setVariable("is_valid_pin", true);
    }
}
