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
 * Time: 06.02
 */
@Description(value = "Delegate responsible for checking account balance.")
public class CheckBalanceAmountDelegate implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(CheckBalanceAmountDelegate.class);

}
