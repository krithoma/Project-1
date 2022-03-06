package project1;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WaxAspect {

    Logger logger = Logger.getLogger(WaxAspect.class);

    @Before("execution(* findAllPeople*(..))")
    public void BeforeGettingAlbum(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature());
    }

}
