package com.example.day0717;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExecutionTimeAspect {

    @Around("@annotation(LogExecutionTime)") // 메서드의 실행시간을 체크하기 위함
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis(); // 호출하는 시작시간을 체크하고

        Object result = joinPoint.proceed(); // 메서드를 호출해서 동작하게 한다.

        long endTime = System.currentTimeMillis(); // 그리고 끝나는시간을 체크해서

        long executionTime = endTime - startTime;

        String methodName = joinPoint.getSignature().getName();

        log.info("Execution time of {} is {} ms", methodName, executionTime);
        return result;
    }
}
