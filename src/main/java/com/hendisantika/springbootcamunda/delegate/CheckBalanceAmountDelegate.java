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
 * Time: 06.02
 */
@Description(value = "Delegate responsible for checking account balance.")
public class CheckBalanceAmountDelegate implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(CheckBalanceAmountDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception
    {
        // current balance on account...
        Double currentBalanceAmount = 1500.00;

        // get desired amount
        Double desiredAmount = Double.valueOf(delegateExecution.getVariable("amount").toString());
        logger.info("Desired amount: {}", desiredAmount);

        // check if there is enough funds...
        if (desiredAmount <= currentBalanceAmount)
        {
            delegateExecution.setVariable("enough_funds", true);
            logger.info("There is enough funds on account.");
            logger.info("You have left: {} funds.", currentBalanceAmount - desiredAmount);
        }
        else
        {
            logger.warn("There is not enough funds on account.");
            delegateExecution.setVariable("enough_funds", false);
        }
    }

}
