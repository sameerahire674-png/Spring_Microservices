package com.sam;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
       //you can add the another package then you need to write this way({"com.subpack1","com.subpack2"})
      //it will scan the multiple sub packages but you need too declare as com.sam.---;
public class config {

}
