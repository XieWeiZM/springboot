package com.example.springboot.task;

import com.example.springboot.event.TestEvent;
import com.example.springboot.event.TestEventLister;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author Archer
 * @date 2019-09-02
 */
public class SampleJob extends QuartzJobBean {
    private String name;
    /**
     * 可以直接注入 spring 的bean
     */
    @Autowired
    private TestEventLister lister;

    public void setName(String name) {
        this.name = name;
    }
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Quartz ---->  Hello, " + this.name);
        lister.test(TestEvent.builder().age(1).name("sdss").build());
    }
}
