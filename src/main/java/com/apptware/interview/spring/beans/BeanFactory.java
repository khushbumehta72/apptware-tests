package com.apptware.interview.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BeanFactory {

  @Autowired private ApplicationContext context;

  public OnDemand getOnDemandBean(SomeEnum someEnum, String someString) {
    BaseOnDemand bean;

    if (someEnum == SomeEnum.SOME_ENUM_A) {
      bean = new OnDemandA(someString);
    } else {
      bean = new OnDemandB(someString);
    }

    return bean;
  }
}