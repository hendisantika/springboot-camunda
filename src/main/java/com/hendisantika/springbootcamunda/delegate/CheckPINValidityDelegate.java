package com.hendisantika.springbootcamunda.delegate;

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
}
