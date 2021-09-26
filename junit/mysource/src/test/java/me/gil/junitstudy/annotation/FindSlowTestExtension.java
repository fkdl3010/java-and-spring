package me.gil.junitstudy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.springframework.test.context.event.annotation.BeforeTestExecution;

public class FindSlowTestExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private static final long THRESHOLD = 1000L;

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        Store store = getStore(extensionContext);
        store.put("START_TIME", System.currentTimeMillis());
    }



    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        Method requiredTestMethod = extensionContext.getRequiredTestMethod();
        SlowTag annotation = requiredTestMethod.getAnnotation(SlowTag.class);
        String testMethodName = extensionContext.getRequiredTestMethod().getName();
        Store store = getStore(extensionContext);
        Long start_time = store.get("START_TIME", long.class);
        long duration = System.currentTimeMillis() - start_time;
        if (duration > THRESHOLD && annotation == null){
            System.out.printf("Please consider mark method [%s] whith @SlowTest. \n", testMethodName);
        }
    }

    private Store getStore(ExtensionContext extensionContext) {
        String testClassName = extensionContext.getRequiredTestClass().getName();
        String testMethodName = extensionContext.getRequiredTestMethod().getName();
        Store store = extensionContext.getStore(Namespace.create(testClassName, testMethodName));
        return store;
    }

}
